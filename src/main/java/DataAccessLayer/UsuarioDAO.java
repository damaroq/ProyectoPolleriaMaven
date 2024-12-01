package DataAccessLayer;

import Connection.UConnection;
import JavaBean.Usuario;
import Utilities.Bitacora;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {

    public void insertar(Usuario usuario) throws Exception {
        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_usuario_insertar(?,?,?,?,?,?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setString(2, usuario.getNombres());
            cstm.setString(3, usuario.getApellidos());
            cstm.setString(4, usuario.getDni());
            cstm.setString(5, usuario.getTelefono());
            cstm.setString(6, usuario.getNomUsuario());
            cstm.setString(7, usuario.getContrasena());
            cstm.setString(8, usuario.getRol());

            int numeroFilasAfectadas = cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones 
            if (numeroFilasAfectadas > 0) {
                usuario.setId_usuario(cstm.getInt(1));
            } else {
                throw new Exception("Registro de nuevo usuario fallido");
            }
        } catch (Exception e) {
            if (e.getMessage().contains("idx_usuario_dni")) {
                throw new Exception("El DNI ingresado ya existe en la base de datos");
            }
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
    public void actualizar(Usuario usuario) throws Exception {

        Connection con = null;
        CallableStatement cstm = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_usuario_actualizar(?,?,?,?,?,?,?,?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, usuario.getId_usuario());
            cstm.setString(2, usuario.getNombres());
            cstm.setString(3, usuario.getApellidos());
            cstm.setString(4, usuario.getDni());
            cstm.setString(5, usuario.getTelefono());
            cstm.setString(6, usuario.getNomUsuario());
            cstm.setString(7, usuario.getContrasena());
            cstm.setString(8, usuario.getRol());

            cstm.executeUpdate(); //se puede usar .execute() para todas las operaciones
        } catch (Exception e) {
            if (e.getMessage().contains("idx_usuario_dni")) {
                throw new Exception("El DNI ingresado ya existe en la base de datos");
            }
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
            sql = "call sp_usuario_eliminar(?)";
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
    public ArrayList<Usuario> buscarPorUsuario(String cadena) throws Exception {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = null;

        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_usuario_buscar_por_usuario(?)";
            cstm = con.prepareCall(sql);
            cstm.setString(1, cadena);

            rs = cstm.executeQuery(); //se puede usar .execute() para todas las operaciones         

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setDni(rs.getString("dni"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setNomUsuario(rs.getString("nom_usuario"));
                usuario.setRol(rs.getString("rol"));

                usuarios.add(usuario);
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
        return usuarios;
    }

    //-------------------------------------------------------------------------------------     
    public Usuario buscarPorId(int id) throws Exception {

        Usuario usuario = null;

        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;

        try {
            con = UConnection.getConnection();
            String sql = "";
            sql = "call sp_usuario_buscar_por_id(?)";
            cstm = con.prepareCall(sql);
            cstm.setInt(1, id);

            rs = cstm.executeQuery(); //se puede usar .execute() para todas las operaciones

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos("apellidos");
                usuario.setDni(rs.getString("dni"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setNomUsuario(rs.getString("nom_usuario"));
                usuario.setRol(rs.getString("rol"));
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
        return usuario;
    }
}
