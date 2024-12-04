package JavaBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RellenarCombos {

    public void RellenarComboBox(String tabla, String valor, JComboBox combo) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String SUrl, SUser, SPass;
            SUrl = "jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd";
            SUser = "ulyfwrg1vfpqzj0x";
            SPass = "84YlnLU1hjjP2sJdHtn7";

            String sql;
            if (tabla.equals("usuario")) {
                sql = "SELECT id_usuario, CONCAT(apellidos, ', ', nombres) AS nombre_completo FROM " + tabla;
            } else {
                sql = "SELECT * FROM " + tabla;
            }

            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            rs = st.executeQuery(sql);

            combo.removeAllItems();
            while (rs.next()) {
                if (tabla.equals("usuario")) {
                    combo.addItem(rs.getString("nombre_completo"));
                } else {
                    combo.addItem(rs.getString(valor));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void RellenarComboBoxMeseros(String tabla, String valor, JComboBox combo, String rol) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String SUrl, SUser, SPass;
            SUrl = "jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd";
            SUser = "ulyfwrg1vfpqzj0x";
            SPass = "84YlnLU1hjjP2sJdHtn7";

            String sql;
            if (tabla.equals("usuario")) {
                // Modificar la consulta para filtrar por rol
                sql = "SELECT CONCAT(apellidos, ', ', nombres) AS nombre_completo FROM " + tabla + " WHERE rol = '" + rol + "'";
            } else {
                sql = "SELECT * FROM " + tabla;
            }

            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();
            rs = st.executeQuery(sql);

            combo.removeAllItems();
            while (rs.next()) {
                if (tabla.equals("usuario")) {
                    combo.addItem(rs.getString("nombre_completo"));
                } else {
                    combo.addItem(rs.getString(valor));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
