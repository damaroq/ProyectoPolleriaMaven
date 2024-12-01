package BusinessLayer;

import DataAccessLayer.ProductosDAO;
import JavaBean.Productos;
import java.util.ArrayList;

public class ProductosBO {

    public void insertar(Productos producto) throws Exception {

        try {
            ProductosDAO productosDAO = new ProductosDAO();
            productosDAO.insertar(producto);
        } catch (Exception e) {
            throw e;
        }

    }

    public void actualizar(Productos producto) throws Exception {

        try {
            ProductosDAO productosDAO = new ProductosDAO();
            productosDAO.actualizar(producto);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminar(int id) throws Exception {

        try {
            ProductosDAO productosDAO = new ProductosDAO();
            productosDAO.eliminar(id);
        } catch (Exception e) {
            throw e;
        }

    }

    public ArrayList<Productos> buscarPorProducto(String cadena) throws Exception {

        try {
            ProductosDAO productosDAO = new ProductosDAO();
            return productosDAO.buscarPorProducto(cadena);
        } catch (Exception e) {
            throw e;
        }
    }

    public Productos buscarPorId(int id) throws Exception {

        try {
            ProductosDAO productosDAO = new ProductosDAO();
            return productosDAO.buscarPorId(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
