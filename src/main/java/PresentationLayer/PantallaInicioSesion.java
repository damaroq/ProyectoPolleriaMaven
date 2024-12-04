package PresentationLayer;

import Connection.UConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PantallaInicioSesion extends javax.swing.JFrame {

    public PantallaInicioSesion() {
        initComponents();

        setLocationRelativeTo(null);
    }
    // Conexion directa

//Autenticacion del usuario y la contraseña
    private boolean authenticateUser(String nom_usuario, String contrasena) {
        try {
            Connection con = UConnection.getConnection(); // Llamada a la conexión
            
            String sql = "SELECT * FROM usuario WHERE nom_usuario = ? AND contrasena = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom_usuario);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();   
            return rs.next(); // Retorna true si encuentra un usuario que coincida
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/logoPolleria2.png"));
        Image image = icon.getImage();
        logoPolleria = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jb_ingresar = new componentes.PanelRound();
        jlbIniciarSesion = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(851, 485));
        setMinimumSize(new java.awt.Dimension(851, 485));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(209, 32, 31));

        jPanel2.setBackground(new java.awt.Color(255, 125, 14));

        logoPolleria.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout logoPolleriaLayout = new javax.swing.GroupLayout(logoPolleria);
        logoPolleria.setLayout(logoPolleriaLayout);
        logoPolleriaLayout.setHorizontalGroup(
            logoPolleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        logoPolleriaLayout.setVerticalGroup(
            logoPolleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel2.setText("Contraseña:");

        jtxtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jb_ingresar.setBackground(new java.awt.Color(209, 32, 31));
        jb_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jb_ingresar.setRoundBottomLeft(50);
        jb_ingresar.setRoundBottomRight(50);
        jb_ingresar.setRoundTopLeft(50);
        jb_ingresar.setRoundTopRight(50);
        jb_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jb_ingresarMousePressed(evt);
            }
        });

        jlbIniciarSesion.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jlbIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jlbIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbIniciarSesion.setText("Iniciar Sesión");

        javax.swing.GroupLayout jb_ingresarLayout = new javax.swing.GroupLayout(jb_ingresar);
        jb_ingresar.setLayout(jb_ingresarLayout);
        jb_ingresarLayout.setHorizontalGroup(
            jb_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jb_ingresarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jlbIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jb_ingresarLayout.setVerticalGroup(
            jb_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jb_ingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(logoPolleria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logoPolleria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jb_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        btn_salir.setBackground(new java.awt.Color(0, 0, 0));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("X");
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ingresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarMousePressed
        String nom_usuario = jtxtUsuario.getText();
        String contrasena = new String(jpassword.getPassword());

        // Verificar la conexión a la base de datos
        if (!UConnection.testConnection()) {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos.",
            "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String rol = UConnection.getUserRole(nom_usuario, contrasena);

        if (rol != null) {
            // Redirigir según el rol
            switch (rol) {
                case "administrador" -> {
                    // Abre el menú de administrador
                    
                    AdministradorMenu administradorMenu = new AdministradorMenu();
                    administradorMenu.setVisible(true);
                }
                case "mesero" -> {
                    // Abre el menú de mesero
                    MeseroMenu meseroMenu = new MeseroMenu();
                    meseroMenu.setVisible(true);
                }
                case "cajero" -> {
                    // Abre el menú de cocinero
                    CajeroMenu cajeroMenu = new CajeroMenu();
                    cajeroMenu.setVisible(true);
                }
                default -> JOptionPane.showMessageDialog(this, "Rol no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose(); // Cierra la ventana de inicio de sesión
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_ingresarMousePressed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private componentes.PanelRound jb_ingresar;
    private javax.swing.JLabel jlbIniciarSesion;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JPanel logoPolleria;
    // End of variables declaration//GEN-END:variables
}
