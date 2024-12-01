package JavaBean;

import java.util.Date;

public class Reserva {

    private int id_reserva;
    private int id_cliente;
    private Date fechaHoraReserva;
    private String estado;

    /* ----- CONSTRUCTOR ----- */
    public Reserva() {
    }

    public Reserva(int id_reserva, int id_cliente, Date fechaHoraReserva, String estado) {
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
        this.fechaHoraReserva = fechaHoraReserva;
        this.estado = estado;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(Date fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
