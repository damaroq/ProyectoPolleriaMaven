package JavaBean;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id_usuario;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String nomUsuario;
    private String contrasena;
    private String rol;
    private List<Pedido> pedidos = new ArrayList<>();

    /* ----- CONSTRUCTOR ----- */
    public Usuario() {
    }

    public Usuario(int id_usuario, String nombres, String apellidos, String dni, String telefono, String nomUsuario, String contrasena, String rol) {
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.nomUsuario = nomUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    /* ----- GETTERS AND SETTERS ----- */
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
