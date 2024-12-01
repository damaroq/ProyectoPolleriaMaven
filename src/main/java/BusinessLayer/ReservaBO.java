package BusinessLayer;

import DataAccessLayer.ReservaDAO;
import JavaBean.Reserva;

public class ReservaBO {

    public void insertar(Reserva reserva) throws Exception {

        try {
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.insertar(reserva);
        } catch (Exception e) {
            throw e;
        }

    }

    public void actualizar(Reserva reserva) throws Exception {

        try {
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizar(reserva);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminar(int id) throws Exception {

        try {
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.eliminar(id);
        } catch (Exception e) {
            throw e;
        }

    }

    public Reserva buscarPorId(int id) throws Exception {

        try {
            ReservaDAO reservaDAO = new ReservaDAO();
            return reservaDAO.buscarPorId(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
