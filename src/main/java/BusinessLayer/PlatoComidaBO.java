package BusinessLayer;

import DataAccessLayer.PlatoComidaDAO;
import JavaBean.PlatoComida;
import java.util.ArrayList;

public class PlatoComidaBO {

    public void insertar(PlatoComida plato) throws Exception {

        try {
            PlatoComidaDAO platoDAO = new PlatoComidaDAO();
            platoDAO.insertar(plato);
        } catch (Exception e) {
            throw e;
        }

    }

    public void actualizar(PlatoComida plato) throws Exception {

        try {
            PlatoComidaDAO platoDAO = new PlatoComidaDAO();
            platoDAO.actualizar(plato);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminar(int id) throws Exception {

        try {
            PlatoComidaDAO platoDAO = new PlatoComidaDAO();
            platoDAO.eliminar(id);
        } catch (Exception e) {
            throw e;
        }

    }

    public ArrayList<PlatoComida> buscarPorPlato(String cadena) throws Exception {

        try {
            PlatoComidaDAO platoDAO = new PlatoComidaDAO();
            return platoDAO.buscarPorPlato(cadena);
        } catch (Exception e) {
            throw e;
        }
    }

    public PlatoComida buscarPorId(int id) throws Exception {

        try {
            PlatoComidaDAO platoDAO = new PlatoComidaDAO();
            return platoDAO.buscarPorId(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
