package DataAccessLayer;

import Connection.UConnection;
import JavaBean.Reserva;
import Utilities.Bitacora;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ReservaDAO {

    public void insertar(Reserva reserva) throws Exception {
        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_reserva_insertar(?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setDate(2, new java.sql.Date(reserva.getFechaHoraReserva().getTime()));
            cstm.setString(3, reserva.getEstado());

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                reserva.setId_reserva(cstm.getInt(1));
            } else {
                throw new Exception("Registro de nueva reserva fallido");
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
    public void actualizar(Reserva reserva) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_reserva_actualizar(?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, reserva.getId_reserva());
            cstm.setDate(2, new java.sql.Date(reserva.getFechaHoraReserva().getTime()));
            cstm.setString(3, reserva.getEstado());

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
            sql = "call sp_reserva_eliminar(?)";
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
    public Reserva buscarPorId(int id) throws Exception {

        Reserva reserva = null;

        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_reserva_buscar_por_id(?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, id);

            rs = cstm.executeQuery(); //se puede usar .execute() para todas las operaciones

            while (rs.next()) {
                reserva = new Reserva();
                reserva.setId_reserva(rs.getInt("id_reserva"));
                reserva.setFechaHoraReserva(rs.getDate("fecha_hora_reserva"));
                reserva.setEstado("estado");
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
        return reserva;
    }
}
