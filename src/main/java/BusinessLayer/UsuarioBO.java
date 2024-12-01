package BusinessLayer;

import DataAccessLayer.UsuarioDAO;
import JavaBean.Usuario;
import java.util.ArrayList;

public class UsuarioBO {

    public void insertar(Usuario usuario) throws Exception {

        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.insertar(usuario);
        } catch (Exception e) {
            throw e;
        }

    }

    public void actualizar(Usuario usuario) throws Exception {

        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.actualizar(usuario);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminar(int id) throws Exception {

        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.eliminar(id);
        } catch (Exception e) {
            throw e;
        }

    }

    public ArrayList<Usuario> buscarPorUsuario(String cadena) throws Exception {

        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            return usuarioDAO.buscarPorUsuario(cadena);
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarPorId(int id) throws Exception {

        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            return usuarioDAO.buscarPorId(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
