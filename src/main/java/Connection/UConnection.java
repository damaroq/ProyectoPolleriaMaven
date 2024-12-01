package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UConnection {

    private static final String URL = "jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd";
    private static final String USER = "ulyfwrg1vfpqzj0x";
    private static final String PASSWORD = "84YlnLU1hjjP2sJdHtn7";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Método para verificar la conexión
    public static boolean testConnection() {
        try (Connection conn = getConnection()) {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para obtener el rol del usuario al iniciar sesión
    public static String getUserRole(String nom_usuario, String contrasena) {
        String rol = null;
        String query = "SELECT rol FROM usuario WHERE nom_usuario = ? AND contrasena = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nom_usuario);
            pstmt.setString(2, contrasena);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                rol = rs.getString("rol");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rol;
    }

    //Método para obtener estado en las mesas
    public static void actualizarEstadoMesa(int id_mesa, String nuevoEstado) throws SQLException {
        String sql = "UPDATE mesas SET estado = ? WHERE id_mesa = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, nuevoEstado);
            stmt.setInt(2, id_mesa);
            stmt.executeUpdate();
        }
    }

    //Metodo para obtener estado de la mesa 
    public static String obtenerEstadoMesa(int id_mesa) {
        String estado = "libre"; // Estado predeterminado en caso de que no haya coincidencia
        String sql = "SELECT estado FROM mesas WHERE id_mesa = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_mesa);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                estado = rs.getString("estado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estado;
    }
    // Método para obtener datos de reserva de una mesa

    public static ResultSet obtenerDatosReserva(int id_mesa) {
        String sql = "SELECT capacidad, nombres, apellidos, telefono, fecha, hora FROM reservas WHERE id_mesa = ?";
        ResultSet rs = null;
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setInt(1, id_mesa);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    // Método para eliminar una reserva de la base de datos
    public static boolean eliminarReserva(int id_mesa) {
        String sql = "DELETE FROM reservas WHERE id_mesa = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setInt(1, id_mesa);
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0; // Devuelve verdadero si se eliminó una fila
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
