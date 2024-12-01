package JavaBean;

import java.util.Date;

public class Boleta {

    private int id_boleta;
    private int id_pedido;
    private Date fecha;

    /* ----- CONSTRUCTOR ----- */
    public Boleta() {
    }

    public Boleta(int id_boleta, int id_pedido, Date fecha) {
        this.id_boleta = id_boleta;
        this.id_pedido = id_pedido;
        this.fecha = fecha;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
