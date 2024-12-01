package DataAccessLayer;

import Connection.UConnection;
import JavaBean.Mesas;
import Utilities.Bitacora;
import java.sql.CallableStatement;
import java.sql.Connection;

public class MesasDAO {

    public void insertar(Mesas mesa) throws Exception {
        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_mesas_insertar(?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setInt(2, mesa.getCapacidad());
            cstm.setString(3, mesa.getEstado());

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                mesa.setId_mesa(cstm.getInt(1));
            } else {
                throw new Exception("Registro de nuevo usuario fallido");
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
    public void actualizar(Mesas mesa) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_mesas_actualizar(?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, mesa.getId_mesa());
            cstm.setInt(2, mesa.getCapacidad());
            cstm.setString(3, mesa.getEstado());

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
            sql = "call sp_mesas_eliminar(?)";
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
}
