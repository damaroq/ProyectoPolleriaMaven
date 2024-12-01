package JavaBean;

public class PedidoProducto {

    private int id_p_producto;
    private Pedido pedido;
    private Productos producto;

    /* ----- CONSTRUCTORES ----- */
    public PedidoProducto() {

    }

    public PedidoProducto(int id_p_producto, Pedido pedido, Productos producto) {
        this.id_p_producto = id_p_producto;
        this.pedido = pedido;
        this.producto = producto;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_p_producto() {
        return id_p_producto;
    }

    public void setId_p_producto(int id_p_producto) {
        this.id_p_producto = id_p_producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

}
