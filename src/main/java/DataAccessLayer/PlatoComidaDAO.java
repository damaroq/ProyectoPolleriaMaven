package DataAccessLayer;

import Connection.UConnection;
import JavaBean.PlatoComida;
import Utilities.Bitacora;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PlatoComidaDAO {

    public void insertar(PlatoComida plato) throws Exception {
        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_platos_insertar(?,?,?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setString(2, plato.getNombre());
            cstm.setString(3, plato.getDescripcion());
            cstm.setDouble(4, plato.getPrecio());
            cstm.setString(5, plato.getDescripcion());

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                plato.setId_plato(cstm.getInt(1));
            } else {
                throw new Exception("Registro de nuevo plato de comida fallido");
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
    public void actualizar(PlatoComida plato) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_platos_actualizar(?,?,?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, plato.getId_plato());
            cstm.setString(2, plato.getNombre());
            cstm.setString(3, plato.getDescripcion());
            cstm.setDouble(4, plato.getPrecio());
            cstm.setString(5, plato.getCategoria());

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
            sql = "call sp_platos_eliminar(?)";
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
    public ArrayList<PlatoComida> buscarPorPlato(String cadena) throws Exception {

        ArrayList<PlatoComida> platos = new ArrayList<>();
        PlatoComida plato = null;

        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_platos_buscar_por_plato(?)";
            cstm = con.prepareCall(sql);
            cstm.setString(1, cadena);

            rs = cstm.executeQuery(); //se puede usar .execute() para todas las operaciones         

            while (rs.next()) {
                plato = new PlatoComida();
                plato.setId_plato(rs.getInt("id_plato"));
                plato.setNombre(rs.getString("nombre"));
                plato.setDescripcion(rs.getString("descripcion"));
                plato.setPrecio(rs.getDouble("precio"));
                plato.setCategoria(rs.getString("categoria"));

                platos.add(plato);
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
        return platos;
    }

    //-------------------------------------------------------------------------------------     
    public PlatoComida buscarPorId(int id) throws Exception {

        PlatoComida plato = null;

        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_platos_buscar_por_id(?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, id);

            rs = cstm.executeQuery(); //se puede usar .execute() para todas las operaciones

            while (rs.next()) {

                plato = new PlatoComida();
                plato.setId_plato(rs.getInt("id_plato"));
                plato.setNombre(rs.getString("nombre"));
                plato.setDescripcion("descripcion");
                plato.setPrecio(rs.getDouble("precio"));
                plato.setCategoria(rs.getString("categoria"));
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
        return plato;
    }
}
