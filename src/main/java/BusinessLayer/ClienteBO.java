package BusinessLayer;

import DataAccessLayer.ClienteDAO;
import JavaBean.Cliente;

public class ClienteBO {

    public void insertar(Cliente cliente) throws Exception {

        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.insertar(cliente);
        } catch (Exception e) {
            throw e;
        }

    }

}
