package JavaBean;

public class Cliente {

    private int id_cliente;
    private String nombres;
    private String apellidos;
    private String telefono;

    /* ----- CONSTRUCTOR ----- */
    public Cliente() {
    }

    public Cliente(int id_cliente, String nombres, String apellidos, String telefono) {
        this.id_cliente = id_cliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
