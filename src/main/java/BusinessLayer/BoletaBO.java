package BusinessLayer;

import DataAccessLayer.BoletaDAO;
import JavaBean.Boleta;

public class BoletaBO {

    public void insertar(Boleta boleta) throws Exception {

        try {
            BoletaDAO boletaDAO = new BoletaDAO();
            boletaDAO.insertar(boleta);
        } catch (Exception e) {
            throw e;
        }

    }
}
