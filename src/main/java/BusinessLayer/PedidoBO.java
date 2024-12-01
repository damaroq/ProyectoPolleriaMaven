package BusinessLayer;

import DataAccessLayer.PedidoDAO;
import JavaBean.Pedido;

public class PedidoBO {

    public void insertar(Pedido pedido) throws Exception {

        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            pedidoDAO.insertar(pedido);
        } catch (Exception e) {
            throw e;
        }

    }

    public void actualizar(Pedido pedido) throws Exception {

        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            pedidoDAO.actualizar(pedido);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminar(int id) throws Exception {

        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            pedidoDAO.eliminar(id);
        } catch (Exception e) {
            throw e;
        }

    }

    public Pedido buscarPorId(int id) throws Exception {

        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            return pedidoDAO.buscarPorId(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
