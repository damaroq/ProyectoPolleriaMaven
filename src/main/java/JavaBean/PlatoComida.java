package JavaBean;

import java.util.ArrayList;
import java.util.List;

public class PlatoComida {

    private int id_plato;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    private List<PedidoPlato> pedidoPlatos = new ArrayList<>();

    /* ----- CONSTRUCTOR ----- */
    public PlatoComida() {
    }

    public PlatoComida(int id_plato, String nombre, String descripcion, double precio, String categoria) {
        this.id_plato = id_plato;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<PedidoPlato> getPedidoPlatos() {
        return pedidoPlatos;
    }

    public void setPedidoPlatos(List<PedidoPlato> pedidoPlatos) {
        this.pedidoPlatos = pedidoPlatos;
    }

}
