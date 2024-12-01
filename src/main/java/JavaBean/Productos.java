package JavaBean;

import java.util.ArrayList;
import java.util.List;

public class Productos {

    private Integer id_producto;
    private String nombre;
    private String categoria;
    private String detalle;
    private int cantidad;
    private double precio;
    private List<PedidoProducto> pedidoProductos = new ArrayList<>();

    /* ----- CONSTRUCTOR ----- */
    public Productos() {
    }

    public Productos(Integer id_producto, String nombre, String categoria, String detalle, int cantidad, double precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(List<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }

}
