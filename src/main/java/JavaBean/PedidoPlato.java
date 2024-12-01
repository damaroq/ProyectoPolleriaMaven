package JavaBean;

public class PedidoPlato {

    private int id_p_plato;
    private Pedido pedido;
    private PlatoComida plato;

    /* ----- CONSTRUCTORES ----- */
    public PedidoPlato() {

    }

    public PedidoPlato(int id_p_plato, Pedido pedido, PlatoComida plato) {
        this.id_p_plato = id_p_plato;
        this.pedido = pedido;
        this.plato = plato;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_p_plato() {
        return id_p_plato;
    }

    public void setId_p_plato(int id_p_plato) {
        this.id_p_plato = id_p_plato;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public PlatoComida getPlato() {
        return plato;
    }

    public void setPlato(PlatoComida plato) {
        this.plato = plato;
    }

}
