package DataAccessLayer;

import Connection.UConnection;
import JavaBean.Pedido;
import Utilities.Bitacora;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class PedidoDAO {

    public void insertar(Pedido pedido) throws Exception {
        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_pedido_insertar(?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setDate(2, new java.sql.Date(pedido.getFechaHora().getTime()));

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                pedido.setId_pedido(cstm.getInt(1));
            } else {
                throw new Exception("Registro de pedido fallido");
            }
        } catch (Exception e) {
            Bitacora.registrar(e);
            throw new Exception("Error crítico: Comunicarse con el administrador del sistema");
        } finally {
            try {
                if (cstm != null) {
                    cstm.close();
                }
            } catch (Exception e) {
                Bitacora.registrar(e);
            }
        }
    }

    //-------------------------------------------------------------------------------------
    public void actualizar(Pedido pedido) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_pedido_actualizar(?,?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, pedido.getId_pedido());
            cstm.setDate(2, new java.sql.Date(pedido.getFechaHora().getTime()));

            cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones
        } catch (Exception e) {
            Bitacora.registrar(e);
            throw new Exception("Error crítico: Comunicarse con el administrador del sistema");
        } finally {
            try {
                if (cstm != null) {
                    cstm.close();
                }
            } catch (Exception e) {
                Bitacora.registrar(e);
            }
        }
    }

    //-------------------------------------------------------------------------------------
    public void eliminar(int id) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_pedido_eliminar(?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, id);

            cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones
        } catch (Exception e) {
            Bitacora.registrar(e);
            throw new Exception("Error crítico: Comunicarse con el administrador del sistema");
        } finally {
            try {
                if (cstm != null) {
                    cstm.close();
                }
            } catch (Exception e) {
                Bitacora.registrar(e);
            }
        }
    }

    //-------------------------------------------------------------------------------------     
    public Pedido buscarPorId(int id) throws Exception {

        Pedido pedido = null;

        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_pedido_buscar_por_id(?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, id);

            rs = cstm.executeQuery(); //se puede usar .execute() para todas las operaciones

            while (rs.next()) {
                pedido = new Pedido();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setFechaHora(rs.getDate("fecha_hora"));
            }

        } catch (Exception e) {
            Bitacora.registrar(e);
            throw new Exception("Error crítico: Comunicarse con el administrador del sistema");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cstm != null) {
                    cstm.close();
                }
            } catch (Exception e) {
                Bitacora.registrar(e);
            }
        }
        return pedido;
    }
}
