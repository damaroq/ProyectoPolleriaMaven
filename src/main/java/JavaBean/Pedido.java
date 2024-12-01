package JavaBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private int id_pedido;
    private Date fechaHora;
    private Usuario usuario;
    private List<PedidoPlato> pedidoPlatos = new ArrayList<>();
    private List<PedidoProducto> pedidoProductos = new ArrayList<>();

    /* ----- CONSTRUCTOR ----- */
    public Pedido() {
    }

    public Pedido(int id_pedido, int id_mesa, int id_usuario, Date fechaHora, Usuario usuario) {
        this.id_pedido = id_pedido;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<PedidoPlato> getPedidoPlatos() {
        return pedidoPlatos;
    }

    public void setPedidoPlatos(List<PedidoPlato> pedidoPlatos) {
        this.pedidoPlatos = pedidoPlatos;
    }

    public List<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(List<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }

}
