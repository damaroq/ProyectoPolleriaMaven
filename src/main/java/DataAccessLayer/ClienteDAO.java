package DataAccessLayer;

import Connection.UConnection;
import JavaBean.Cliente;
import Utilities.Bitacora;
import java.sql.Connection;
import java.sql.CallableStatement;

public class ClienteDAO {

    public void insertar(Cliente cliente) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_pasajero_insertar(?,?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);

            cstm.setString(2, cliente.getNombres());
            cstm.setString(3, cliente.getApellidos());
            cstm.setString(4, cliente.getTelefono());

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                cliente.setId_cliente(cstm.getInt(1));
            } else {
                throw new Exception("No se pudo registrar al pasajero");
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
