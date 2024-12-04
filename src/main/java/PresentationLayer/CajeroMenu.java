package PresentationLayer;

import Connection.UConnection;
import componentes.AnimatedButtonCajero;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CajeroMenu extends javax.swing.JFrame {

    // [0] - Mesas
    // [1] - Ventas del Día
    // [2] - Registro de Reservas
    // [3] - Pedido
    // [4] - Formulario de Reserva
    private final String logo_caja = "/icons/cajero.png";
    private final String logo_mesa = "/icons/mesa.png";
    private final String logo_mesa1 = "/icons/mesa1.png";
    private final String logo_registro = "/icons/reserva.png";
    private final String logo_salir = "/icons/cerrar-sesion.png";

    AnimatedButtonCajero ColorOP = new AnimatedButtonCajero();

    public CajeroMenu() {
        initComponents();
        inicializarColoresMesas();
        pestañas.setEnabledAt(0, false);
        pestañas.setEnabledAt(1, false);
        setLocationRelativeTo(null);
        ColorOP.AnimattMesas();

        jtblVentas.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblVentas.getTableHeader().setOpaque(false);
        jtblVentas.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblVentas.getTableHeader().setForeground(Color.BLACK);
        jtblVentas.setRowHeight(20);

        jtblPedido.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblPedido.getTableHeader().setOpaque(false);
        jtblPedido.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblPedido.getTableHeader().setForeground(Color.BLACK);
        jtblPedido.setRowHeight(20);

        jtblRegistroReservas.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblRegistroReservas.getTableHeader().setOpaque(false);
        jtblRegistroReservas.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblRegistroReservas.getTableHeader().setForeground(Color.BLACK);
        jtblRegistroReservas.setRowHeight(20);
    }

    private Icon getIcono(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(30, 30, 0));
    }

    private Icon getMesa(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(150, 120, 0));
    }

    // Método para actualizar el color de la mesa en la interfaz 
    private void actualizarColorMesa(String id_mesa, String estado) {
        if (id_mesa.equals("18") && estado.equals("reservado")) {
            mesa18.setBackground(Color.YELLOW);  // Cambia el color a amarillo para reservado
        } else if (id_mesa.equals("18") && estado.equals("ocupado")) {
            mesa18.setBackground(Color.RED);     // Cambia el color a rojo para ocupado
        } else {
            mesa18.setBackground(Color.GREEN);   // Cambia el color a verde para libre
        }
    }

    public void inicializarColoresMesas() {
        // Por ejemplo, para mesa 20
        String estadoMesa18 = UConnection.obtenerEstadoMesa(18);
        actualizarColorMesa("18", estadoMesa18);
    }

    /*  private void jbCargarReservaActionPerformed(java.awt.event.ActionEvent evt) {
    int id_mesa = Integer.parseInt(jtxtNumMesa.getText());
    
    try {
        ResultSet rs = UConnection.obtenerDatosReserva(id_mesa);
        if (rs != null && rs.next()) {
            jtxtCapacidad.setText(String.valueOf(rs.getInt("capacidad")));
            jtxtNombres.setText(rs.getString("nombres"));
            jtxtApellidos.setText(rs.getString("apellidos"));
            jtxtTelefono.setText(rs.getString("telefono"));

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró reserva para esta mesa.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener datos de la reserva.");
    }
}aca me quede otra vez gaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new componentes.PanelRound();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/logoPolleria2.png"));
        Image image = icon.getImage();
        logoPolleria = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        btnRegistroReserva = new componentes.PanelGradient();
        jlRegistroReserva = new javax.swing.JLabel();
        btnMesas = new componentes.PanelGradient();
        jlMesas = new javax.swing.JLabel();
        btnSalir = new componentes.PanelGradient();
        jlSalir = new javax.swing.JLabel();
        btnResumenCaja = new componentes.PanelGradient();
        jlResumenCaja = new javax.swing.JLabel();
        pestañas = new javax.swing.JTabbedPane();
        page_resumen = new javax.swing.JPanel();
        fondo_beige1 = new componentes.PanelRound();
        jlTotalVentas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblVentas = new javax.swing.JTable();
        jtxtTotalVentas = new javax.swing.JTextField();
        jpVentas = new componentes.PanelRound();
        jlVentasDia = new javax.swing.JLabel();
        page_registro = new javax.swing.JPanel();
        fondo_beige2 = new componentes.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblRegistroReservas = new javax.swing.JTable();
        jpRegistroReserva = new componentes.PanelRound();
        jlRegistro = new javax.swing.JLabel();
        jbRegistroEliminar = new javax.swing.JButton();
        jbRegistroActualizar = new javax.swing.JButton();
        page_pedido = new javax.swing.JPanel();
        fondo_beige3 = new componentes.PanelRound();
        jpPedido = new componentes.PanelRound();
        jlPedido = new javax.swing.JLabel();
        jlPrecioTotal = new javax.swing.JLabel();
        jtxtPrecioTotal = new javax.swing.JTextField();
        jbPedidoQuitar = new javax.swing.JButton();
        jbPedidoCobrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblPedido = new javax.swing.JTable();
        page_formularioReserva = new javax.swing.JPanel();
        fondo_beige4 = new componentes.PanelRound();
        jpFormulario = new componentes.PanelRound();
        jlFormulario = new javax.swing.JLabel();
        jlNumMesa = new javax.swing.JLabel();
        jtxtNumMesa = new javax.swing.JTextField();
        jlCapacidad = new javax.swing.JLabel();
        jtxtCapacidad = new javax.swing.JTextField();
        jlNombres = new javax.swing.JLabel();
        jtxtNombres = new javax.swing.JTextField();
        jlApellidos = new javax.swing.JLabel();
        jtxtApellidos = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        jlFechaHoraReserva = new javax.swing.JLabel();
        jtxtFechaHoraRes = new com.toedter.calendar.JDateChooser();
        jbFormularioReservar = new javax.swing.JButton();
        jbFormularioCancelar = new javax.swing.JButton();
        jbFormularioEliminar = new javax.swing.JButton();
        page_mesas = new javax.swing.JPanel();
        fondo_beige = new componentes.PanelRound();
        mesa1 = new componentes.PanelRound()
        ;
        iconMesa1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        aforo1 = new componentes.PanelRound();
        jlAforo1 = new javax.swing.JLabel();
        mesa2 = new componentes.PanelRound()
        ;
        iconMesa2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aforo2 = new componentes.PanelRound();
        jlAforo2 = new javax.swing.JLabel();
        mesa3 = new componentes.PanelRound()
        ;
        iconMesa3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aforo3 = new componentes.PanelRound();
        jlAforo3 = new javax.swing.JLabel();
        mesa4 = new componentes.PanelRound()
        ;
        iconMesa4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aforo4 = new componentes.PanelRound();
        jlAforo4 = new javax.swing.JLabel();
        mesa5 = new componentes.PanelRound();
        iconMesa5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aforo5 = new componentes.PanelRound();
        jlAforo5 = new javax.swing.JLabel();
        mesa6 = new componentes.PanelRound()
        ;
        iconMesa6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aforo6 = new componentes.PanelRound();
        jlAforo6 = new javax.swing.JLabel();
        mesa7 = new componentes.PanelRound()
        ;
        iconMesa7 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aforo7 = new componentes.PanelRound();
        jlAforo7 = new javax.swing.JLabel();
        mesa8 = new componentes.PanelRound()
        ;
        iconMesa8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aforo8 = new componentes.PanelRound();
        jlAforo8 = new javax.swing.JLabel();
        mesa9 = new componentes.PanelRound()
        ;
        iconMesa9 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aforo9 = new componentes.PanelRound();
        jlAforo9 = new javax.swing.JLabel();
        mesa10 = new componentes.PanelRound()
        ;
        iconMesa10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aforo10 = new componentes.PanelRound();
        jlAforo10 = new javax.swing.JLabel();
        mesa11 = new componentes.PanelRound()
        ;
        iconMesa11 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aforo11 = new componentes.PanelRound();
        jlAforo11 = new javax.swing.JLabel();
        mesa12 = new componentes.PanelRound()
        ;
        iconMesa12 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aforo12 = new componentes.PanelRound();
        jlAforo12 = new javax.swing.JLabel();
        mesa13 = new componentes.PanelRound()
        ;
        iconMesa13 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aforo13 = new componentes.PanelRound();
        jlAforo13 = new javax.swing.JLabel();
        mesa14 = new componentes.PanelRound()
        ;
        iconMesa14 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        aforo14 = new componentes.PanelRound();
        jlAforo14 = new javax.swing.JLabel();
        mesa15 = new componentes.PanelRound()
        ;
        iconMesa15 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        aforo15 = new componentes.PanelRound();
        jlAforo15 = new javax.swing.JLabel();
        mesa16 = new componentes.PanelRound()
        ;
        iconMesa16 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        aforo16 = new componentes.PanelRound();
        jlAforo16 = new javax.swing.JLabel();
        mesa17 = new componentes.PanelRound()
        ;
        iconMesa17 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aforo17 = new componentes.PanelRound();
        jlAforo17 = new javax.swing.JLabel();
        mesa18 = new componentes.PanelRound()
        ;
        iconMesa18 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        aforo18 = new componentes.PanelRound();
        jlAforo18 = new javax.swing.JLabel();
        mesa19 = new componentes.PanelRound()
        ;
        iconMesa19 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        aforo19 = new componentes.PanelRound();
        jlAforo19 = new javax.swing.JLabel();
        mesa20 = new componentes.PanelRound()
        ;
        iconMesa20 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        aforo20 = new componentes.PanelRound();
        jlAforo20 = new javax.swing.JLabel();
        color_ocupado = new javax.swing.JPanel();
        jlOcupado = new javax.swing.JLabel();
        color_reservado = new javax.swing.JPanel();
        jlReservado = new javax.swing.JLabel();
        color_libre = new javax.swing.JPanel();
        jlLibre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 545));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 545));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(209, 32, 31));
        menu.setMinimumSize(new java.awt.Dimension(167, 550));
        menu.setPreferredSize(new java.awt.Dimension(167, 550));
        menu.setRoundBottomRight(30);
        menu.setRoundTopRight(30);
        menu.setVerifyInputWhenFocusTarget(false);
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPolleria.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout logoPolleriaLayout = new javax.swing.GroupLayout(logoPolleria);
        logoPolleria.setLayout(logoPolleriaLayout);
        logoPolleriaLayout.setHorizontalGroup(
            logoPolleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        logoPolleriaLayout.setVerticalGroup(
            logoPolleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menu.add(logoPolleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 100));

        btnRegistroReserva.setRadius(10);
        btnRegistroReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistroReservaMousePressed(evt);
            }
        });
        btnRegistroReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlRegistroReserva.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlRegistroReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRegistroReserva.setIcon(getIcono(logo_registro));
        jlRegistroReserva.setText("<html>REGISTRO DE<br>RESERVAS");
        btnRegistroReserva.add(jlRegistroReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnRegistroReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 50));

        btnMesas.setRadius(10);
        btnMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMesasMousePressed(evt);
            }
        });
        btnMesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMesas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMesas.setIcon(getIcono(logo_mesa)
        );
        jlMesas.setText("MESAS");
        btnMesas.add(jlMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 50));

        btnSalir.setRadius(10);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSalirMouseReleased(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSalir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setIcon(getIcono(logo_salir));
        jlSalir.setText("<html>CERRAR<br>SESIÓN");
        jlSalir.setFocusable(false);
        jlSalir.setIconTextGap(3);
        btnSalir.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 130, 50));

        btnResumenCaja.setRadius(10);
        btnResumenCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResumenCajaMousePressed(evt);
            }
        });
        btnResumenCaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlResumenCaja.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlResumenCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlResumenCaja.setIcon(getIcono(logo_caja));
        jlResumenCaja.setText("<html>RESUMEN<br>DE CAJA");
        btnResumenCaja.add(jlResumenCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnResumenCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 50));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 550));

        pestañas.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        page_resumen.setBackground(new java.awt.Color(255, 125, 14));
        page_resumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige1.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige1.setRoundBottomLeft(50);
        fondo_beige1.setRoundBottomRight(50);
        fondo_beige1.setRoundTopLeft(50);
        fondo_beige1.setRoundTopRight(50);
        fondo_beige1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTotalVentas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTotalVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTotalVentas.setText("<html> TOTAL<br>VENTAS:");
        jlTotalVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo_beige1.add(jlTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 210, 80));

        jtblVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtblVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "MESA", "MESERO", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblVentas.setName(""); // NOI18N
        jtblVentas.setShowGrid(true);
        jScrollPane1.setViewportView(jtblVentas);

        fondo_beige1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 540, -1));

        jtxtTotalVentas.setEditable(false);
        jtxtTotalVentas.setBackground(new java.awt.Color(229, 227, 227));
        jtxtTotalVentas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxtTotalVentas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTotalVentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fondo_beige1.add(jtxtTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 150, 60));

        jpVentas.setBackground(new java.awt.Color(0, 0, 0));
        jpVentas.setRoundBottomLeft(30);
        jpVentas.setRoundBottomRight(30);
        jpVentas.setRoundTopLeft(30);
        jpVentas.setRoundTopRight(30);
        jpVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlVentasDia.setBackground(new java.awt.Color(255, 255, 255));
        jlVentasDia.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlVentasDia.setForeground(new java.awt.Color(255, 255, 255));
        jlVentasDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVentasDia.setText("VENTAS DEL DÍA");
        jlVentasDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpVentas.add(jlVentasDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 154, 20));

        fondo_beige1.add(jpVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 210, 40));

        page_resumen.add(fondo_beige1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_resumen);

        page_registro.setBackground(new java.awt.Color(255, 125, 14));
        page_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige2.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige2.setRoundBottomLeft(50);
        fondo_beige2.setRoundBottomRight(50);
        fondo_beige2.setRoundTopLeft(50);
        fondo_beige2.setRoundTopRight(50);
        fondo_beige2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblRegistroReservas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtblRegistroReservas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtblRegistroReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA Y HORA DE RESERVA", "APELLIDOS Y NOMBRES", "N° DE MESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistroReservas.setName(""); // NOI18N
        jtblRegistroReservas.setShowGrid(true);
        jtblRegistroReservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtblRegistroReservas);
        if (jtblRegistroReservas.getColumnModel().getColumnCount() > 0) {
            jtblRegistroReservas.getColumnModel().getColumn(0).setMinWidth(70);
            jtblRegistroReservas.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtblRegistroReservas.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblRegistroReservas.getColumnModel().getColumn(1).setResizable(false);
            jtblRegistroReservas.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtblRegistroReservas.getColumnModel().getColumn(2).setResizable(false);
            jtblRegistroReservas.getColumnModel().getColumn(2).setPreferredWidth(20);
            jtblRegistroReservas.getColumnModel().getColumn(3).setMinWidth(100);
            jtblRegistroReservas.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtblRegistroReservas.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        fondo_beige2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 640, -1));

        jpRegistroReserva.setBackground(new java.awt.Color(0, 0, 0));
        jpRegistroReserva.setRoundBottomLeft(30);
        jpRegistroReserva.setRoundBottomRight(30);
        jpRegistroReserva.setRoundTopLeft(30);
        jpRegistroReserva.setRoundTopRight(30);
        jpRegistroReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jlRegistro.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jlRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRegistro.setText("REGISTRO DE RESERVAS");
        jlRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpRegistroReserva.add(jlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        fondo_beige2.add(jpRegistroReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 230, 40));

        jbRegistroEliminar.setBackground(new java.awt.Color(63, 92, 112));
        jbRegistroEliminar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbRegistroEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistroEliminar.setText("ELIMINAR");
        jbRegistroEliminar.setBorder(null);
        jbRegistroEliminar.setFocusPainted(false);
        jbRegistroEliminar.setFocusable(false);
        jbRegistroEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistroEliminarActionPerformed(evt);
            }
        });
        fondo_beige2.add(jbRegistroEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 120, 40));

        jbRegistroActualizar.setBackground(new java.awt.Color(209, 32, 31));
        jbRegistroActualizar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbRegistroActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistroActualizar.setText("ACTUALIZAR");
        jbRegistroActualizar.setBorder(null);
        jbRegistroActualizar.setOpaque(true);
        jbRegistroActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistroActualizarActionPerformed(evt);
            }
        });
        fondo_beige2.add(jbRegistroActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 120, 40));

        page_registro.add(fondo_beige2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_registro);

        page_pedido.setBackground(new java.awt.Color(255, 125, 14));
        page_pedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige3.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige3.setRoundBottomLeft(50);
        fondo_beige3.setRoundBottomRight(50);
        fondo_beige3.setRoundTopLeft(50);
        fondo_beige3.setRoundTopRight(50);
        fondo_beige3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPedido.setBackground(new java.awt.Color(0, 0, 0));
        jpPedido.setRoundBottomLeft(25);
        jpPedido.setRoundBottomRight(25);
        jpPedido.setRoundTopLeft(25);
        jpPedido.setRoundTopRight(25);
        jpPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPedido.setBackground(new java.awt.Color(255, 255, 255));
        jlPedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlPedido.setForeground(new java.awt.Color(255, 255, 255));
        jlPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPedido.setText("PEDIDO");
        jlPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpPedido.add(jlPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 30));

        fondo_beige3.add(jpPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 150, 35));

        jlPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrecioTotal.setText("PRECIO TOTAL:");
        fondo_beige3.add(jlPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 40));

        jtxtPrecioTotal.setEditable(false);
        jtxtPrecioTotal.setBackground(new java.awt.Color(229, 227, 227));
        jtxtPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxtPrecioTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPrecioTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fondo_beige3.add(jtxtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 110, 40));

        jbPedidoQuitar.setBackground(new java.awt.Color(63, 92, 112));
        jbPedidoQuitar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPedidoQuitar.setForeground(new java.awt.Color(255, 255, 255));
        jbPedidoQuitar.setText("QUITAR");
        jbPedidoQuitar.setBorder(null);
        jbPedidoQuitar.setFocusPainted(false);
        jbPedidoQuitar.setFocusable(false);
        jbPedidoQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidoQuitarActionPerformed(evt);
            }
        });
        fondo_beige3.add(jbPedidoQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 100, 40));

        jbPedidoCobrar.setBackground(new java.awt.Color(209, 32, 31));
        jbPedidoCobrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPedidoCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jbPedidoCobrar.setText("COBRAR");
        jbPedidoCobrar.setBorder(null);
        jbPedidoCobrar.setFocusPainted(false);
        jbPedidoCobrar.setFocusable(false);
        jbPedidoCobrar.setOpaque(true);
        jbPedidoCobrar.setRequestFocusEnabled(false);
        jbPedidoCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidoCobrarActionPerformed(evt);
            }
        });
        fondo_beige3.add(jbPedidoCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 100, 40));

        jtblPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "PRECIO UNITARIO", "CANTIDAD", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtblPedido);
        if (jtblPedido.getColumnModel().getColumnCount() > 0) {
            jtblPedido.getColumnModel().getColumn(0).setResizable(false);
            jtblPedido.getColumnModel().getColumn(1).setResizable(false);
            jtblPedido.getColumnModel().getColumn(2).setResizable(false);
            jtblPedido.getColumnModel().getColumn(3).setResizable(false);
            jtblPedido.getColumnModel().getColumn(4).setResizable(false);
        }

        fondo_beige3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 740, 360));

        page_pedido.add(fondo_beige3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_pedido);

        page_formularioReserva.setBackground(new java.awt.Color(255, 125, 14));
        page_formularioReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige4.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige4.setRoundBottomLeft(50);
        fondo_beige4.setRoundBottomRight(50);
        fondo_beige4.setRoundTopLeft(50);
        fondo_beige4.setRoundTopRight(50);
        fondo_beige4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFormulario.setBackground(new java.awt.Color(0, 0, 0));
        jpFormulario.setRoundBottomLeft(25);
        jpFormulario.setRoundBottomRight(25);
        jpFormulario.setRoundTopLeft(25);
        jpFormulario.setRoundTopRight(25);
        jpFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jlFormulario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jlFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormulario.setText("FORMULARIO DE RESERVA");
        jlFormulario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFormulario.add(jlFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 30));

        fondo_beige4.add(jpFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 35));

        jlNumMesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNumMesa.setText("NÚMERO DE MESA:");
        fondo_beige4.add(jlNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 30));
        fondo_beige4.add(jtxtNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 280, 30));

        jlCapacidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCapacidad.setText("CAPACIDAD:");
        fondo_beige4.add(jlCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 30));
        fondo_beige4.add(jtxtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 280, 30));

        jlNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNombres.setText("NOMBRES:");
        fondo_beige4.add(jlNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 30));
        fondo_beige4.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 280, 30));

        jlApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlApellidos.setText("APELLIDOS:");
        fondo_beige4.add(jlApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 30));
        fondo_beige4.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 280, 30));

        jlTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlTelefono.setText("TELÉFONO:");
        fondo_beige4.add(jlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 30));
        fondo_beige4.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 280, 30));

        jlFechaHoraReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlFechaHoraReserva.setText("FECHA Y HORA DE RESERVA:");
        fondo_beige4.add(jlFechaHoraReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 30));
        fondo_beige4.add(jtxtFechaHoraRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 280, 30));

        jbFormularioReservar.setBackground(new java.awt.Color(209, 32, 31));
        jbFormularioReservar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbFormularioReservar.setForeground(new java.awt.Color(255, 255, 255));
        jbFormularioReservar.setText("RESERVAR");
        jbFormularioReservar.setBorder(null);
        jbFormularioReservar.setFocusable(false);
        jbFormularioReservar.setOpaque(true);
        jbFormularioReservar.setRequestFocusEnabled(false);
        jbFormularioReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFormularioReservarActionPerformed(evt);
            }
        });
        fondo_beige4.add(jbFormularioReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 100, 40));

        jbFormularioCancelar.setBackground(new java.awt.Color(63, 92, 112));
        jbFormularioCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbFormularioCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbFormularioCancelar.setText("CANCELAR");
        jbFormularioCancelar.setBorder(null);
        jbFormularioCancelar.setFocusPainted(false);
        jbFormularioCancelar.setFocusable(false);
        jbFormularioCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFormularioCancelarActionPerformed(evt);
            }
        });
        fondo_beige4.add(jbFormularioCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 100, 40));

        jbFormularioEliminar.setBackground(new java.awt.Color(117, 117, 117));
        jbFormularioEliminar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbFormularioEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbFormularioEliminar.setText("ELIMINAR");
        jbFormularioEliminar.setBorder(null);
        jbFormularioEliminar.setFocusPainted(false);
        jbFormularioEliminar.setFocusable(false);
        jbFormularioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFormularioEliminarActionPerformed(evt);
            }
        });
        fondo_beige4.add(jbFormularioEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 100, 40));

        page_formularioReserva.add(fondo_beige4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_formularioReserva);

        page_mesas.setBackground(new java.awt.Color(255, 125, 14));
        page_mesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige.setRoundBottomLeft(50);
        fondo_beige.setRoundBottomRight(50);
        fondo_beige.setRoundTopLeft(50);
        fondo_beige.setRoundTopRight(50);
        fondo_beige.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mesa1.setBackground(new java.awt.Color(155, 238, 124));
        mesa1.setDoubleBuffered(false);
        mesa1.setRoundTopLeft(30);
        mesa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa1.setIcon(getMesa(logo_mesa1)
        );
        iconMesa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa1.add(iconMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        mesa1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));
        jLabel1.getAccessibleContext().setAccessibleParent(iconMesa1);

        aforo1.setBackground(new java.awt.Color(0, 0, 0));
        aforo1.setForeground(new java.awt.Color(255, 255, 255));
        aforo1.setRoundBottomLeft(50);
        aforo1.setRoundBottomRight(50);
        aforo1.setRoundTopLeft(50);
        aforo1.setRoundTopRight(50);
        aforo1.setLayout(new java.awt.BorderLayout());

        jlAforo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo1.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo1.setText("4");
        aforo1.add(jlAforo1, java.awt.BorderLayout.CENTER);

        mesa1.add(aforo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 100));

        mesa2.setBackground(new java.awt.Color(155, 238, 124));
        mesa2.setDoubleBuffered(false);
        mesa2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa2.setIcon(getMesa(logo_mesa1)
        );
        mesa2.add(iconMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        mesa2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo2.setBackground(new java.awt.Color(0, 0, 0));
        aforo2.setForeground(new java.awt.Color(255, 255, 255));
        aforo2.setRoundBottomLeft(50);
        aforo2.setRoundBottomRight(50);
        aforo2.setRoundTopLeft(50);
        aforo2.setRoundTopRight(50);

        jlAforo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo2.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo2.setText("4");

        javax.swing.GroupLayout aforo2Layout = new javax.swing.GroupLayout(aforo2);
        aforo2.setLayout(aforo2Layout);
        aforo2Layout.setHorizontalGroup(
            aforo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo2Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo2)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo2Layout.setVerticalGroup(
            aforo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo2Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo2)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa2.add(aforo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 160, 100));

        mesa3.setBackground(new java.awt.Color(155, 238, 124));
        mesa3.setDoubleBuffered(false);
        mesa3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa3.setIcon(getMesa(logo_mesa1)
        );
        mesa3.add(iconMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        mesa3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo3.setBackground(new java.awt.Color(0, 0, 0));
        aforo3.setForeground(new java.awt.Color(255, 255, 255));
        aforo3.setRoundBottomLeft(50);
        aforo3.setRoundBottomRight(50);
        aforo3.setRoundTopLeft(50);
        aforo3.setRoundTopRight(50);

        jlAforo3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo3.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo3.setText("4");

        javax.swing.GroupLayout aforo3Layout = new javax.swing.GroupLayout(aforo3);
        aforo3.setLayout(aforo3Layout);
        aforo3Layout.setHorizontalGroup(
            aforo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jlAforo3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        aforo3Layout.setVerticalGroup(
            aforo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo3Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jlAforo3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        mesa3.add(aforo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 160, 100));

        mesa4.setBackground(new java.awt.Color(155, 238, 124));
        mesa4.setDoubleBuffered(false);
        mesa4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa4.setIcon(getMesa(logo_mesa1)
        );
        mesa4.add(iconMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        mesa4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo4.setBackground(new java.awt.Color(0, 0, 0));
        aforo4.setForeground(new java.awt.Color(255, 255, 255));
        aforo4.setRoundBottomLeft(50);
        aforo4.setRoundBottomRight(50);
        aforo4.setRoundTopLeft(50);
        aforo4.setRoundTopRight(50);

        jlAforo4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo4.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo4.setText("4");

        javax.swing.GroupLayout aforo4Layout = new javax.swing.GroupLayout(aforo4);
        aforo4.setLayout(aforo4Layout);
        aforo4Layout.setHorizontalGroup(
            aforo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo4Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo4)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo4Layout.setVerticalGroup(
            aforo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo4Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo4)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa4.add(aforo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 160, 100));

        mesa5.setBackground(new java.awt.Color(155, 238, 124));
        mesa5.setRoundTopRight(30);
        mesa5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa5.setIcon(getMesa(logo_mesa1)
        );
        mesa5.add(iconMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        mesa5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo5.setBackground(new java.awt.Color(0, 0, 0));
        aforo5.setForeground(new java.awt.Color(255, 255, 255));
        aforo5.setRoundBottomLeft(50);
        aforo5.setRoundBottomRight(50);
        aforo5.setRoundTopLeft(50);
        aforo5.setRoundTopRight(50);

        jlAforo5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo5.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo5.setText("4");

        javax.swing.GroupLayout aforo5Layout = new javax.swing.GroupLayout(aforo5);
        aforo5.setLayout(aforo5Layout);
        aforo5Layout.setHorizontalGroup(
            aforo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo5Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo5)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo5Layout.setVerticalGroup(
            aforo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo5Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo5)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa5.add(aforo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 160, 100));

        mesa6.setBackground(new java.awt.Color(155, 238, 124));
        mesa6.setDoubleBuffered(false);
        mesa6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa6.setIcon(getMesa(logo_mesa1)
        );
        mesa6.add(iconMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        mesa6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo6.setBackground(new java.awt.Color(0, 0, 0));
        aforo6.setForeground(new java.awt.Color(255, 255, 255));
        aforo6.setRoundBottomLeft(50);
        aforo6.setRoundBottomRight(50);
        aforo6.setRoundTopLeft(50);
        aforo6.setRoundTopRight(50);

        jlAforo6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo6.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo6.setText("4");

        javax.swing.GroupLayout aforo6Layout = new javax.swing.GroupLayout(aforo6);
        aforo6.setLayout(aforo6Layout);
        aforo6Layout.setHorizontalGroup(
            aforo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo6Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo6)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo6Layout.setVerticalGroup(
            aforo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo6Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo6)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa6.add(aforo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 100));

        mesa7.setBackground(new java.awt.Color(155, 238, 124));
        mesa7.setDoubleBuffered(false);
        mesa7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa7.setIcon(getMesa(logo_mesa1)
        );
        mesa7.add(iconMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        mesa7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo7.setBackground(new java.awt.Color(0, 0, 0));
        aforo7.setForeground(new java.awt.Color(255, 255, 255));
        aforo7.setRoundBottomLeft(50);
        aforo7.setRoundBottomRight(50);
        aforo7.setRoundTopLeft(50);
        aforo7.setRoundTopRight(50);

        jlAforo7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo7.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo7.setText("4");

        javax.swing.GroupLayout aforo7Layout = new javax.swing.GroupLayout(aforo7);
        aforo7.setLayout(aforo7Layout);
        aforo7Layout.setHorizontalGroup(
            aforo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo7Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo7)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo7Layout.setVerticalGroup(
            aforo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo7Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo7)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa7.add(aforo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 100));

        mesa8.setBackground(new java.awt.Color(155, 238, 124));
        mesa8.setDoubleBuffered(false);
        mesa8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa8.setIcon(getMesa(logo_mesa1)
        );
        mesa8.add(iconMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        mesa8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo8.setBackground(new java.awt.Color(0, 0, 0));
        aforo8.setForeground(new java.awt.Color(255, 255, 255));
        aforo8.setRoundBottomLeft(50);
        aforo8.setRoundBottomRight(50);
        aforo8.setRoundTopLeft(50);
        aforo8.setRoundTopRight(50);

        jlAforo8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo8.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo8.setText("4");

        javax.swing.GroupLayout aforo8Layout = new javax.swing.GroupLayout(aforo8);
        aforo8.setLayout(aforo8Layout);
        aforo8Layout.setHorizontalGroup(
            aforo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo8Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo8)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo8Layout.setVerticalGroup(
            aforo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo8Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo8)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa8.add(aforo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 160, 100));

        mesa9.setBackground(new java.awt.Color(155, 238, 124));
        mesa9.setDoubleBuffered(false);
        mesa9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa9.setIcon(getMesa(logo_mesa1)
        );
        mesa9.add(iconMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");
        mesa9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo9.setBackground(new java.awt.Color(0, 0, 0));
        aforo9.setForeground(new java.awt.Color(255, 255, 255));
        aforo9.setRoundBottomLeft(50);
        aforo9.setRoundBottomRight(50);
        aforo9.setRoundTopLeft(50);
        aforo9.setRoundTopRight(50);

        jlAforo9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo9.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo9.setText("4");

        javax.swing.GroupLayout aforo9Layout = new javax.swing.GroupLayout(aforo9);
        aforo9.setLayout(aforo9Layout);
        aforo9Layout.setHorizontalGroup(
            aforo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo9Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo9)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo9Layout.setVerticalGroup(
            aforo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo9Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo9)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa9.add(aforo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 160, 100));

        mesa10.setBackground(new java.awt.Color(155, 238, 124));
        mesa10.setDoubleBuffered(false);
        mesa10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa10.setIcon(getMesa(logo_mesa1)
        );
        mesa10.add(iconMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("10");
        mesa10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo10.setBackground(new java.awt.Color(0, 0, 0));
        aforo10.setForeground(new java.awt.Color(255, 255, 255));
        aforo10.setRoundBottomLeft(50);
        aforo10.setRoundBottomRight(50);
        aforo10.setRoundTopLeft(50);
        aforo10.setRoundTopRight(50);

        jlAforo10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo10.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo10.setText("4");

        javax.swing.GroupLayout aforo10Layout = new javax.swing.GroupLayout(aforo10);
        aforo10.setLayout(aforo10Layout);
        aforo10Layout.setHorizontalGroup(
            aforo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo10Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo10)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo10Layout.setVerticalGroup(
            aforo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo10Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo10)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa10.add(aforo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 160, 100));

        mesa11.setBackground(new java.awt.Color(155, 238, 124));
        mesa11.setDoubleBuffered(false);
        mesa11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa11.setIcon(getMesa(logo_mesa1)
        );
        mesa11.add(iconMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("11");
        mesa11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo11.setBackground(new java.awt.Color(0, 0, 0));
        aforo11.setForeground(new java.awt.Color(255, 255, 255));
        aforo11.setRoundBottomLeft(50);
        aforo11.setRoundBottomRight(50);
        aforo11.setRoundTopLeft(50);
        aforo11.setRoundTopRight(50);

        jlAforo11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo11.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo11.setText("4");

        javax.swing.GroupLayout aforo11Layout = new javax.swing.GroupLayout(aforo11);
        aforo11.setLayout(aforo11Layout);
        aforo11Layout.setHorizontalGroup(
            aforo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo11Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo11)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo11Layout.setVerticalGroup(
            aforo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo11Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo11)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa11.add(aforo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 100));

        mesa12.setBackground(new java.awt.Color(155, 238, 124));
        mesa12.setDoubleBuffered(false);
        mesa12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa12.setIcon(getMesa(logo_mesa1)
        );
        mesa12.add(iconMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("12");
        mesa12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo12.setBackground(new java.awt.Color(0, 0, 0));
        aforo12.setForeground(new java.awt.Color(255, 255, 255));
        aforo12.setRoundBottomLeft(50);
        aforo12.setRoundBottomRight(50);
        aforo12.setRoundTopLeft(50);
        aforo12.setRoundTopRight(50);

        jlAforo12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo12.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo12.setText("4");

        javax.swing.GroupLayout aforo12Layout = new javax.swing.GroupLayout(aforo12);
        aforo12.setLayout(aforo12Layout);
        aforo12Layout.setHorizontalGroup(
            aforo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo12Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo12)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo12Layout.setVerticalGroup(
            aforo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo12Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo12)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa12.add(aforo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 100));

        mesa13.setBackground(new java.awt.Color(155, 238, 124));
        mesa13.setDoubleBuffered(false);
        mesa13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa13.setIcon(getMesa(logo_mesa1)
        );
        mesa13.add(iconMesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("13");
        mesa13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo13.setBackground(new java.awt.Color(0, 0, 0));
        aforo13.setForeground(new java.awt.Color(255, 255, 255));
        aforo13.setRoundBottomLeft(50);
        aforo13.setRoundBottomRight(50);
        aforo13.setRoundTopLeft(50);
        aforo13.setRoundTopRight(50);

        jlAforo13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo13.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo13.setText("4");

        javax.swing.GroupLayout aforo13Layout = new javax.swing.GroupLayout(aforo13);
        aforo13.setLayout(aforo13Layout);
        aforo13Layout.setHorizontalGroup(
            aforo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo13Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo13)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo13Layout.setVerticalGroup(
            aforo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo13Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo13)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa13.add(aforo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 160, 100));

        mesa14.setBackground(new java.awt.Color(155, 238, 124));
        mesa14.setDoubleBuffered(false);
        mesa14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa14.setIcon(getMesa(logo_mesa1)
        );
        mesa14.add(iconMesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("14");
        mesa14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo14.setBackground(new java.awt.Color(0, 0, 0));
        aforo14.setForeground(new java.awt.Color(255, 255, 255));
        aforo14.setRoundBottomLeft(50);
        aforo14.setRoundBottomRight(50);
        aforo14.setRoundTopLeft(50);
        aforo14.setRoundTopRight(50);

        jlAforo14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo14.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo14.setText("4");

        javax.swing.GroupLayout aforo14Layout = new javax.swing.GroupLayout(aforo14);
        aforo14.setLayout(aforo14Layout);
        aforo14Layout.setHorizontalGroup(
            aforo14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo14Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo14)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo14Layout.setVerticalGroup(
            aforo14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo14Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo14)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa14.add(aforo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, 100));

        mesa15.setBackground(new java.awt.Color(155, 238, 124));
        mesa15.setDoubleBuffered(false);
        mesa15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa15.setIcon(getMesa(logo_mesa1)
        );
        mesa15.add(iconMesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("15");
        mesa15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo15.setBackground(new java.awt.Color(0, 0, 0));
        aforo15.setForeground(new java.awt.Color(255, 255, 255));
        aforo15.setRoundBottomLeft(50);
        aforo15.setRoundBottomRight(50);
        aforo15.setRoundTopLeft(50);
        aforo15.setRoundTopRight(50);

        jlAforo15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo15.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo15.setText("4");

        javax.swing.GroupLayout aforo15Layout = new javax.swing.GroupLayout(aforo15);
        aforo15.setLayout(aforo15Layout);
        aforo15Layout.setHorizontalGroup(
            aforo15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo15Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo15)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo15Layout.setVerticalGroup(
            aforo15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo15Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo15)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa15.add(aforo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 160, 100));

        mesa16.setBackground(new java.awt.Color(155, 238, 124));
        mesa16.setDoubleBuffered(false);
        mesa16.setRoundBottomLeft(30);
        mesa16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa16.setIcon(getMesa(logo_mesa1)
        );
        mesa16.add(iconMesa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("16");
        mesa16.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo16.setBackground(new java.awt.Color(0, 0, 0));
        aforo16.setForeground(new java.awt.Color(255, 255, 255));
        aforo16.setRoundBottomLeft(50);
        aforo16.setRoundBottomRight(50);
        aforo16.setRoundTopLeft(50);
        aforo16.setRoundTopRight(50);

        jlAforo16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo16.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo16.setText("4");

        javax.swing.GroupLayout aforo16Layout = new javax.swing.GroupLayout(aforo16);
        aforo16.setLayout(aforo16Layout);
        aforo16Layout.setHorizontalGroup(
            aforo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo16Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo16)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo16Layout.setVerticalGroup(
            aforo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo16Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo16)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa16.add(aforo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 100));

        mesa17.setBackground(new java.awt.Color(155, 238, 124));
        mesa17.setDoubleBuffered(false);
        mesa17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa17.setIcon(getMesa(logo_mesa1)
        );
        mesa17.add(iconMesa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("17");
        mesa17.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo17.setBackground(new java.awt.Color(0, 0, 0));
        aforo17.setForeground(new java.awt.Color(255, 255, 255));
        aforo17.setRoundBottomLeft(50);
        aforo17.setRoundBottomRight(50);
        aforo17.setRoundTopLeft(50);
        aforo17.setRoundTopRight(50);

        jlAforo17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo17.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo17.setText("4");

        javax.swing.GroupLayout aforo17Layout = new javax.swing.GroupLayout(aforo17);
        aforo17.setLayout(aforo17Layout);
        aforo17Layout.setHorizontalGroup(
            aforo17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo17Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo17)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo17Layout.setVerticalGroup(
            aforo17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo17Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo17)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa17.add(aforo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 160, 100));

        mesa18.setBackground(new java.awt.Color(155, 238, 124));
        mesa18.setDoubleBuffered(false);
        mesa18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mesa18MousePressed(evt);
            }
        });
        mesa18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa18.setIcon(getMesa(logo_mesa1)
        );
        mesa18.add(iconMesa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("18");
        mesa18.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo18.setBackground(new java.awt.Color(0, 0, 0));
        aforo18.setForeground(new java.awt.Color(255, 255, 255));
        aforo18.setRoundBottomLeft(50);
        aforo18.setRoundBottomRight(50);
        aforo18.setRoundTopLeft(50);
        aforo18.setRoundTopRight(50);

        jlAforo18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo18.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo18.setText("4");

        javax.swing.GroupLayout aforo18Layout = new javax.swing.GroupLayout(aforo18);
        aforo18.setLayout(aforo18Layout);
        aforo18Layout.setHorizontalGroup(
            aforo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo18Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo18)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo18Layout.setVerticalGroup(
            aforo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo18Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo18)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa18.add(aforo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 160, 100));

        mesa19.setBackground(new java.awt.Color(155, 238, 124));
        mesa19.setDoubleBuffered(false);
        mesa19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa19.setIcon(getMesa(logo_mesa1)
        );
        mesa19.add(iconMesa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("19");
        mesa19.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo19.setBackground(new java.awt.Color(0, 0, 0));
        aforo19.setForeground(new java.awt.Color(255, 255, 255));
        aforo19.setRoundBottomLeft(50);
        aforo19.setRoundBottomRight(50);
        aforo19.setRoundTopLeft(50);
        aforo19.setRoundTopRight(50);

        jlAforo19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo19.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo19.setText("4");

        javax.swing.GroupLayout aforo19Layout = new javax.swing.GroupLayout(aforo19);
        aforo19.setLayout(aforo19Layout);
        aforo19Layout.setHorizontalGroup(
            aforo19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo19Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo19)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo19Layout.setVerticalGroup(
            aforo19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo19Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo19)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa19.add(aforo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 160, 100));

        mesa20.setBackground(new java.awt.Color(155, 238, 124));
        mesa20.setDoubleBuffered(false);
        mesa20.setRoundBottomRight(30);
        mesa20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mesa20MousePressed(evt);
            }
        });
        mesa20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconMesa20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMesa20.setIcon(getMesa(logo_mesa1)
        );
        mesa20.add(iconMesa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 80));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("20");
        mesa20.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        aforo20.setBackground(new java.awt.Color(0, 0, 0));
        aforo20.setForeground(new java.awt.Color(255, 255, 255));
        aforo20.setRoundBottomLeft(50);
        aforo20.setRoundBottomRight(50);
        aforo20.setRoundTopLeft(50);
        aforo20.setRoundTopRight(50);

        jlAforo20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlAforo20.setForeground(new java.awt.Color(255, 255, 255));
        jlAforo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAforo20.setText("4");

        javax.swing.GroupLayout aforo20Layout = new javax.swing.GroupLayout(aforo20);
        aforo20.setLayout(aforo20Layout);
        aforo20Layout.setHorizontalGroup(
            aforo20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo20Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jlAforo20)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        aforo20Layout.setVerticalGroup(
            aforo20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(aforo20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aforo20Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jlAforo20)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        mesa20.add(aforo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 40, 40));

        fondo_beige.add(mesa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 160, 100));

        color_ocupado.setBackground(new java.awt.Color(238, 124, 124));

        javax.swing.GroupLayout color_ocupadoLayout = new javax.swing.GroupLayout(color_ocupado);
        color_ocupado.setLayout(color_ocupadoLayout);
        color_ocupadoLayout.setHorizontalGroup(
            color_ocupadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        color_ocupadoLayout.setVerticalGroup(
            color_ocupadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        fondo_beige.add(color_ocupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 40, 40));

        jlOcupado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlOcupado.setText("OCUPADO");
        fondo_beige.add(jlOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        color_reservado.setBackground(new java.awt.Color(254, 233, 119));

        javax.swing.GroupLayout color_reservadoLayout = new javax.swing.GroupLayout(color_reservado);
        color_reservado.setLayout(color_reservadoLayout);
        color_reservadoLayout.setHorizontalGroup(
            color_reservadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        color_reservadoLayout.setVerticalGroup(
            color_reservadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        fondo_beige.add(color_reservado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 40, 40));

        jlReservado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlReservado.setText("RESERVADO");
        fondo_beige.add(jlReservado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        color_libre.setBackground(new java.awt.Color(155, 238, 124));

        javax.swing.GroupLayout color_libreLayout = new javax.swing.GroupLayout(color_libre);
        color_libre.setLayout(color_libreLayout);
        color_libreLayout.setHorizontalGroup(
            color_libreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        color_libreLayout.setVerticalGroup(
            color_libreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        fondo_beige.add(color_libre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 40, 40));

        jlLibre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlLibre.setText("LIBRE");
        fondo_beige.add(jlLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        page_mesas.add(fondo_beige, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_mesas);

        getContentPane().add(pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesasMousePressed
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattMesas();
    }//GEN-LAST:event_btnMesasMousePressed

    private void btnResumenCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenCajaMousePressed
        pestañas.setSelectedIndex(1);
        ColorOP.AnimattResumenCaja();
    }//GEN-LAST:event_btnResumenCajaMousePressed

    private void btnRegistroReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroReservaMousePressed
        pestañas.setSelectedIndex(2);
        ColorOP.AnimattRegistroReserva();
    }//GEN-LAST:event_btnRegistroReservaMousePressed

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        ColorOP.AnimattSalir();
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
        PantallaInicioSesion login = new PantallaInicioSesion();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseReleased

    private void mesa20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa20MousePressed
        String id_mesa = "20";
        String estadoActual = "reservado";

        pestañas.setSelectedIndex(3);

        actualizarColorMesa(id_mesa, estadoActual);

        ColorOP.AnimattMesas();
    }//GEN-LAST:event_mesa20MousePressed

    private void jbRegistroEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistroEliminarActionPerformed
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
        ColorOP.AnimattRegistroReserva();
    }//GEN-LAST:event_jbRegistroEliminarActionPerformed

    private void jbRegistroActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistroActualizarActionPerformed
        pestañas.setSelectedIndex(4);
        ColorOP.AnimattRegistroReserva();
    }//GEN-LAST:event_jbRegistroActualizarActionPerformed

    private void jbPedidoQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidoQuitarActionPerformed
        JOptionPane.showMessageDialog(null, "Elemento quitado satisfactoriamente...");
        ColorOP.AnimattMesas();
    }//GEN-LAST:event_jbPedidoQuitarActionPerformed

    private void jbPedidoCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidoCobrarActionPerformed
        CajeroCobroPedido pantalla = new CajeroCobroPedido();
        pantalla.setVisible(true);
    }//GEN-LAST:event_jbPedidoCobrarActionPerformed

    private void jbFormularioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFormularioEliminarActionPerformed
        JOptionPane.showMessageDialog(null, "Reservada ELIMINADA.");
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattMesas();
    }//GEN-LAST:event_jbFormularioEliminarActionPerformed

    private void jbFormularioReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFormularioReservarActionPerformed
        int id_mesa = 18; // ID de la mesa que deseas reservar
        String nuevoEstado = "reservado"; // Nuevo estado

        try {
            // Actualizar estado en la base de datos
            UConnection.actualizarEstadoMesa(id_mesa, nuevoEstado);

            // Cambiar color en la interfaz gráfica
            actualizarColorMesa(String.valueOf(id_mesa), nuevoEstado);

            JOptionPane.showMessageDialog(null, "Reserva completada con éxito...");
            pestañas.setSelectedIndex(0); // Cambia a la pestaña deseada
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la traza del error en la consola
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva: " + e.getMessage());
        }
    }//GEN-LAST:event_jbFormularioReservarActionPerformed

    private void jbFormularioCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFormularioCancelarActionPerformed
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattMesas();
    }//GEN-LAST:event_jbFormularioCancelarActionPerformed

    private void mesa18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa18MousePressed
        String id_mesa = "18";
        String estadoActual = "reservado"; // Cambia esto según la lógica de tu aplicación

        // Cambiar a la pestaña correspondiente
        pestañas.setSelectedIndex(4);

        // Actualizar color si es necesario
        actualizarColorMesa(id_mesa, estadoActual);

        // Llama a ColorOP.AnimattMesas si necesitas que realice otras animaciones
        ColorOP.AnimattMesas();
    }//GEN-LAST:event_mesa18MousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CajeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CajeroMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.PanelRound aforo1;
    private componentes.PanelRound aforo10;
    private componentes.PanelRound aforo11;
    private componentes.PanelRound aforo12;
    private componentes.PanelRound aforo13;
    private componentes.PanelRound aforo14;
    private componentes.PanelRound aforo15;
    private componentes.PanelRound aforo16;
    private componentes.PanelRound aforo17;
    private componentes.PanelRound aforo18;
    private componentes.PanelRound aforo19;
    private componentes.PanelRound aforo2;
    private componentes.PanelRound aforo20;
    private componentes.PanelRound aforo3;
    private componentes.PanelRound aforo4;
    private componentes.PanelRound aforo5;
    private componentes.PanelRound aforo6;
    private componentes.PanelRound aforo7;
    private componentes.PanelRound aforo8;
    private componentes.PanelRound aforo9;
    public static componentes.PanelGradient btnMesas;
    public static componentes.PanelGradient btnRegistroReserva;
    public static componentes.PanelGradient btnResumenCaja;
    public static componentes.PanelGradient btnSalir;
    private javax.swing.JPanel color_libre;
    private javax.swing.JPanel color_ocupado;
    private javax.swing.JPanel color_reservado;
    private componentes.PanelRound fondo_beige;
    private componentes.PanelRound fondo_beige1;
    private componentes.PanelRound fondo_beige2;
    private componentes.PanelRound fondo_beige3;
    private componentes.PanelRound fondo_beige4;
    public static javax.swing.JLabel iconMesa1;
    public static javax.swing.JLabel iconMesa10;
    public static javax.swing.JLabel iconMesa11;
    public static javax.swing.JLabel iconMesa12;
    public static javax.swing.JLabel iconMesa13;
    public static javax.swing.JLabel iconMesa14;
    public static javax.swing.JLabel iconMesa15;
    public static javax.swing.JLabel iconMesa16;
    public static javax.swing.JLabel iconMesa17;
    public static javax.swing.JLabel iconMesa18;
    public static javax.swing.JLabel iconMesa19;
    public static javax.swing.JLabel iconMesa2;
    public static javax.swing.JLabel iconMesa20;
    public static javax.swing.JLabel iconMesa3;
    public static javax.swing.JLabel iconMesa4;
    public static javax.swing.JLabel iconMesa5;
    public static javax.swing.JLabel iconMesa6;
    public static javax.swing.JLabel iconMesa7;
    public static javax.swing.JLabel iconMesa8;
    public static javax.swing.JLabel iconMesa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbFormularioCancelar;
    private javax.swing.JButton jbFormularioEliminar;
    private javax.swing.JButton jbFormularioReservar;
    private javax.swing.JButton jbPedidoCobrar;
    private javax.swing.JButton jbPedidoQuitar;
    private javax.swing.JButton jbRegistroActualizar;
    private javax.swing.JButton jbRegistroEliminar;
    private javax.swing.JLabel jlAforo1;
    private javax.swing.JLabel jlAforo10;
    private javax.swing.JLabel jlAforo11;
    private javax.swing.JLabel jlAforo12;
    private javax.swing.JLabel jlAforo13;
    private javax.swing.JLabel jlAforo14;
    private javax.swing.JLabel jlAforo15;
    private javax.swing.JLabel jlAforo16;
    private javax.swing.JLabel jlAforo17;
    private javax.swing.JLabel jlAforo18;
    private javax.swing.JLabel jlAforo19;
    private javax.swing.JLabel jlAforo2;
    private javax.swing.JLabel jlAforo20;
    private javax.swing.JLabel jlAforo3;
    private javax.swing.JLabel jlAforo4;
    private javax.swing.JLabel jlAforo5;
    private javax.swing.JLabel jlAforo6;
    private javax.swing.JLabel jlAforo7;
    private javax.swing.JLabel jlAforo8;
    private javax.swing.JLabel jlAforo9;
    private javax.swing.JLabel jlApellidos;
    private javax.swing.JLabel jlCapacidad;
    private javax.swing.JLabel jlFechaHoraReserva;
    private javax.swing.JLabel jlFormulario;
    private javax.swing.JLabel jlLibre;
    public static javax.swing.JLabel jlMesas;
    private javax.swing.JLabel jlNombres;
    private javax.swing.JLabel jlNumMesa;
    private javax.swing.JLabel jlOcupado;
    private javax.swing.JLabel jlPedido;
    private javax.swing.JLabel jlPrecioTotal;
    private javax.swing.JLabel jlRegistro;
    public static javax.swing.JLabel jlRegistroReserva;
    private javax.swing.JLabel jlReservado;
    public static javax.swing.JLabel jlResumenCaja;
    public static javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTotalVentas;
    private javax.swing.JLabel jlVentasDia;
    private componentes.PanelRound jpFormulario;
    private componentes.PanelRound jpPedido;
    private componentes.PanelRound jpRegistroReserva;
    private componentes.PanelRound jpVentas;
    private javax.swing.JTable jtblPedido;
    private javax.swing.JTable jtblRegistroReservas;
    private javax.swing.JTable jtblVentas;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtCapacidad;
    private com.toedter.calendar.JDateChooser jtxtFechaHoraRes;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtNumMesa;
    private javax.swing.JTextField jtxtPrecioTotal;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextField jtxtTotalVentas;
    private javax.swing.JPanel logoPolleria;
    private componentes.PanelRound menu;
    private componentes.PanelRound mesa1;
    private componentes.PanelRound mesa10;
    private componentes.PanelRound mesa11;
    private componentes.PanelRound mesa12;
    private componentes.PanelRound mesa13;
    private componentes.PanelRound mesa14;
    private componentes.PanelRound mesa15;
    private componentes.PanelRound mesa16;
    private componentes.PanelRound mesa17;
    private componentes.PanelRound mesa18;
    private componentes.PanelRound mesa19;
    private componentes.PanelRound mesa2;
    private componentes.PanelRound mesa20;
    private componentes.PanelRound mesa3;
    private componentes.PanelRound mesa4;
    private componentes.PanelRound mesa5;
    private componentes.PanelRound mesa6;
    private componentes.PanelRound mesa7;
    private componentes.PanelRound mesa8;
    private componentes.PanelRound mesa9;
    private javax.swing.JPanel page_formularioReserva;
    private javax.swing.JPanel page_mesas;
    private javax.swing.JPanel page_pedido;
    private javax.swing.JPanel page_registro;
    private javax.swing.JPanel page_resumen;
    private javax.swing.JTabbedPane pestañas;
    // End of variables declaration//GEN-END:variables
}
