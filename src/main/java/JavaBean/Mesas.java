package JavaBean;

public class Mesas {

    private int id_mesa;
    private int capacidad;
    private String estado;
    private int id_reserva;

    /* ----- CONSTRUCTOR ----- */
    public Mesas() {
    }

    public Mesas(int id_mesa, int capacidad, String estado, int id_reserva) {
        this.id_mesa = id_mesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.id_reserva = id_reserva;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

}
