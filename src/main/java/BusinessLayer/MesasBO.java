package BusinessLayer;

import DataAccessLayer.MesasDAO;
import JavaBean.Mesas;

public class MesasBO {

    public void insertar(Mesas mesa) throws Exception {

        try {
            MesasDAO mesaDAO = new MesasDAO();
            mesaDAO.insertar(mesa);
        } catch (Exception e) {
            throw e;
        }

    }

    public void actualizar(Mesas mesa) throws Exception {

        try {
            MesasDAO mesaDAO = new MesasDAO();
            mesaDAO.actualizar(mesa);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminar(int id) throws Exception {

        try {
            MesasDAO mesaDAO = new MesasDAO();
            mesaDAO.eliminar(id);
        } catch (Exception e) {
            throw e;
        }

    }
}
