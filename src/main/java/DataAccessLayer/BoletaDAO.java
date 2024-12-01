package DataAccessLayer;

import Connection.UConnection;
import JavaBean.Boleta;
import Utilities.Bitacora;
import java.sql.Connection;
import java.sql.CallableStatement;

public class BoletaDAO {

    public void insertar(Boleta boleta) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_boleta_insertar(?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);

            cstm.setDate(2, new java.sql.Date(boleta.getFecha().getTime()));

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                boleta.setId_boleta(cstm.getInt(1));
            } else {
                throw new Exception("No se pudo registrar la boleta");
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
}
