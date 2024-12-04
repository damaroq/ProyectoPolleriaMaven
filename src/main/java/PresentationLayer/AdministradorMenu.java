package PresentationLayer;

import BusinessLayer.PlatoComidaBO;
import BusinessLayer.ProductosBO;
import BusinessLayer.UsuarioBO;
import JavaBean.PlatoComida;
import JavaBean.Productos;
import JavaBean.RellenarCombos;
import JavaBean.Usuario;
import componentes.AnimatedButtonAdmin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AdministradorMenu extends javax.swing.JFrame {

    // [0] - Lista de Usuarios
    // [1] - Formulario Usuarios
    // [2] - Lista Plato de Comida
    // [3] - Formulario Platos
    // [4] - Lista de Productos
    // [5] - Formulario Productos
    // [6] - Asignación Meseros
    // [7] - Reporte de Ventas
    RellenarCombos re = new RellenarCombos();

    private final String logo_usuario = "/icons/users.png";
    private final String logo_platos = "/icons/platos.png";
    private final String logo_productos = "/icons/productos.png";
    private final String logo_asignacion = "/icons/asignacion.png";
    private final String logo_ventas = "/icons/reporte.png";
    private final String logo_salir = "/icons/cerrar-sesion.png";

    AnimatedButtonAdmin ColorOP = new AnimatedButtonAdmin();

    public AdministradorMenu() {
        initComponents();

        pestañas.setEnabledAt(0, false);
        setLocationRelativeTo(null);
        ColorOP.AnimattUsuarios();

        re.RellenarComboBox("mesas", "id_mesa", jcbNumMesa);
        re.RellenarComboBox("usuario", "nombres", jcbNombreMesero);
        re.RellenarComboBox("plato_comida", "categoria", jcbPlatosFormCat);
        re.RellenarComboBoxMeseros("usuario", "nombres", jcbReporteMesero, "mesero");
        re.RellenarComboBox("usuario", "nombres", jcbFiltroAsignacion);
        re.RellenarComboBox("plato_comida", "categoria", jcbPlatosCat);

        jtblUsuarios.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblUsuarios.getTableHeader().setForeground(Color.BLACK);
        jtblUsuarios.setRowHeight(20);

        jtblPlatosComida.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblPlatosComida.getTableHeader().setOpaque(false);
        jtblPlatosComida.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblPlatosComida.getTableHeader().setForeground(Color.BLACK);
        jtblPlatosComida.setRowHeight(20);

        jtblProductos.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblProductos.getTableHeader().setForeground(Color.BLACK);
        jtblProductos.setRowHeight(20);

        jtblAsignacion.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblAsignacion.getTableHeader().setOpaque(false);
        jtblAsignacion.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblAsignacion.getTableHeader().setForeground(Color.BLACK);
        jtblAsignacion.setRowHeight(20);

        jtblReporteVentas.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblReporteVentas.getTableHeader().setOpaque(false);
        jtblReporteVentas.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblReporteVentas.getTableHeader().setForeground(Color.BLACK);
        jtblReporteVentas.setRowHeight(20);
    }

    private Icon getIcono(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(30, 30, 0));
    }

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
        btnVentas = new componentes.PanelGradient();
        jlVentas = new javax.swing.JLabel();
        btnUsuarios = new componentes.PanelGradient();
        jlUsuarios = new javax.swing.JLabel();
        btnSalir = new componentes.PanelGradient();
        jlSalir = new javax.swing.JLabel();
        btnPlatosComida = new componentes.PanelGradient();
        jlPlatosComida = new javax.swing.JLabel();
        btnProductos = new componentes.PanelGradient();
        jlProductos = new javax.swing.JLabel();
        pestañas = new javax.swing.JTabbedPane();
        page_usuarios = new javax.swing.JPanel();
        fondo_beige = new componentes.PanelRound();
        jpTituloListaUsuarios = new componentes.PanelRound();
        jlTituloListaUsuarios = new javax.swing.JLabel();
        jlBuscarPor = new javax.swing.JLabel();
        jcbUsuarioBuscarCat = new javax.swing.JComboBox<>();
        jtxtUsuarioBuscar = new javax.swing.JTextField();
        jbUsuarioBuscar = new javax.swing.JButton();
        jlFiltros = new javax.swing.JLabel();
        jpRol = new componentes.PanelRound();
        jlRol = new javax.swing.JLabel();
        jcbUsuarioRol = new javax.swing.JComboBox<>();
        jbUsuarioCrear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtblUsuarios = new javax.swing.JTable();
        jbUsuarioMostrarLista = new javax.swing.JButton();
        jbUsuarioLimpiarLista = new javax.swing.JButton();
        page_usuariosFormulario = new javax.swing.JPanel();
        fondo_beige4 = new componentes.PanelRound();
        jpFormularioActu = new componentes.PanelRound();
        jlFormularioActu = new javax.swing.JLabel();
        jlNombres = new javax.swing.JLabel();
        jtxtNombres = new javax.swing.JTextField();
        jlApellidosActu = new javax.swing.JLabel();
        jtxtApellidos = new javax.swing.JTextField();
        jlDNIActu = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        jlTelefonoActu = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        jlNomUsuarioActu = new javax.swing.JLabel();
        jtxtNomUsuario = new javax.swing.JTextField();
        jlFormularioRolActu = new javax.swing.JLabel();
        jcbFormularioRol = new javax.swing.JComboBox<>();
        jbUsuarioGuardar = new javax.swing.JButton();
        jbUsuarioCancelar = new javax.swing.JButton();
        jlNombresActu = new javax.swing.JLabel();
        jtxtUsuarioID = new javax.swing.JTextField();
        jlContra2 = new javax.swing.JLabel();
        jtxtContra = new javax.swing.JPasswordField();
        page_platosComida = new javax.swing.JPanel();
        fondo_beige5 = new componentes.PanelRound();
        jpTituloListaPlatos = new componentes.PanelRound();
        jlTituloListaPlatos = new javax.swing.JLabel();
        jlPlatosBuscarPor = new javax.swing.JLabel();
        jcbPlatosBuscarCat = new javax.swing.JComboBox<>();
        jtxtPlatosBuscar = new javax.swing.JTextField();
        jbPlatosBuscar = new javax.swing.JButton();
        jlFiltros1 = new javax.swing.JLabel();
        jpPlatosCat = new componentes.PanelRound();
        jlPlatosCat = new javax.swing.JLabel();
        jcbPlatosCat = new javax.swing.JComboBox<>();
        jbPlatosCrear = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtblPlatosComida = new javax.swing.JTable();
        jbPlatosMostrarLista = new javax.swing.JButton();
        jbPlatosListaLimpiar = new javax.swing.JButton();
        page_platosComidaFormulario = new javax.swing.JPanel();
        fondo_beige6 = new componentes.PanelRound();
        jpFormPlatos = new componentes.PanelRound();
        jlFormPlatos = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jtxtPlatoNombre = new javax.swing.JTextField();
        jlDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtPlatoDescripcion = new javax.swing.JTextArea();
        jlPrecio = new javax.swing.JLabel();
        jtxtPlatoPrecio = new javax.swing.JTextField();
        jlCategoria = new javax.swing.JLabel();
        jcbPlatosFormCat = new javax.swing.JComboBox<>();
        jbPlatosGuardar = new javax.swing.JButton();
        jbPlatosCancelar = new javax.swing.JButton();
        jlPlatoID = new javax.swing.JLabel();
        jtxtPlatoID = new javax.swing.JTextField();
        page_productos = new javax.swing.JPanel();
        fondo_beige1 = new componentes.PanelRound();
        jpTituloListaProductos = new componentes.PanelRound();
        jlTituloListaProductos = new javax.swing.JLabel();
        jlProductosBuscarPor = new javax.swing.JLabel();
        jcbProductosBuscarCat = new javax.swing.JComboBox<>();
        jtxtProductosBuscar = new javax.swing.JTextField();
        jbProductosBuscar = new javax.swing.JButton();
        jlFiltros2 = new javax.swing.JLabel();
        jpProductosCat = new componentes.PanelRound();
        jlProductosCat = new javax.swing.JLabel();
        jcbProductosCat = new javax.swing.JComboBox<>();
        jbProductoCrear = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        jbProductosMostrarLista = new javax.swing.JButton();
        jbProductosLimpiar = new javax.swing.JButton();
        page_productosFormulario = new javax.swing.JPanel();
        fondo_beige7 = new componentes.PanelRound();
        jpProductoFormulario = new componentes.PanelRound();
        jlProductoFormulario = new javax.swing.JLabel();
        jlProductoNombre = new javax.swing.JLabel();
        jtxtProductoNombre = new javax.swing.JTextField();
        jlProductoDetalle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtProductoDetalle = new javax.swing.JTextArea();
        jlProductoCategoria = new javax.swing.JLabel();
        jcbProductoFormCat = new javax.swing.JComboBox<>();
        jlProductoCantidad = new javax.swing.JLabel();
        jtxtProductoCantidad = new javax.swing.JSpinner();
        jlProductoPrecio = new javax.swing.JLabel();
        jtxtProductoPrecio = new javax.swing.JTextField();
        jbProductoGuardar = new javax.swing.JButton();
        jbProductoCancelar = new javax.swing.JButton();
        jtxtProductoID = new javax.swing.JTextField();
        jlProductoID = new javax.swing.JLabel();
        page_asignacion = new javax.swing.JPanel();
        fondo_beige3 = new componentes.PanelRound();
        jpTituloAsignacion1 = new componentes.PanelRound();
        jlTituloAsignacion1 = new javax.swing.JLabel();
        jlNumMesa = new javax.swing.JLabel();
        jcbNumMesa = new javax.swing.JComboBox<>();
        jlNombreMesero = new javax.swing.JLabel();
        jcbNombreMesero = new javax.swing.JComboBox<>();
        jbAsignarMesero = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jlFiltros4 = new javax.swing.JLabel();
        jpMesero = new componentes.PanelRound();
        jlMesero = new javax.swing.JLabel();
        jcbFiltroAsignacion = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtblAsignacion = new javax.swing.JTable();
        jbEliminarAsignacion = new javax.swing.JButton();
        jbAsignaciónMostrarLista = new javax.swing.JButton();
        page_reporteVentas = new javax.swing.JPanel();
        fondo_beige2 = new componentes.PanelRound();
        jpTituloReporte = new componentes.PanelRound();
        jlTituloReporte = new javax.swing.JLabel();
        jlFiltros3 = new javax.swing.JLabel();
        jpReporteFecha = new componentes.PanelRound();
        jlReporteFecha = new javax.swing.JLabel();
        jcbReporteFecha = new javax.swing.JComboBox<>();
        jpReporteMesero = new componentes.PanelRound();
        jlReporteMesero = new javax.swing.JLabel();
        jcbReporteMesero = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtblReporteVentas = new javax.swing.JTable();
        jlReporteTotal = new javax.swing.JLabel();
        jtxtReporteTotal = new javax.swing.JTextField();
        page_usuariosFormularioActu = new javax.swing.JPanel();
        fondo_beige8 = new componentes.PanelRound();
        jpFormulario1 = new componentes.PanelRound();
        jlFormulario1 = new javax.swing.JLabel();
        jlNombres2 = new javax.swing.JLabel();
        jtxtNombresActu = new javax.swing.JTextField();
        jlApellidos1 = new javax.swing.JLabel();
        jtxtApellidosActu = new javax.swing.JTextField();
        jlDNI1 = new javax.swing.JLabel();
        jtxtDNIActu = new javax.swing.JTextField();
        jlTelefono1 = new javax.swing.JLabel();
        jtxtTelefonoActu = new javax.swing.JTextField();
        jlNomUsuario1 = new javax.swing.JLabel();
        jtxtNomUsuarioActu = new javax.swing.JTextField();
        jlFormularioRol1 = new javax.swing.JLabel();
        jcbFormularioRolActu = new javax.swing.JComboBox<>();
        jbUsuarioGuardarActu = new javax.swing.JButton();
        jbUsuarioCancelarActu = new javax.swing.JButton();
        jlNombres3 = new javax.swing.JLabel();
        jtxtUsuarioIDActu = new javax.swing.JTextField();
        jbUsuarioEliminar = new javax.swing.JButton();
        page_platosComidaFormularioActu = new javax.swing.JPanel();
        fondo_beige9 = new componentes.PanelRound();
        jpFormPlatos1 = new componentes.PanelRound();
        jlFormPlatos1 = new javax.swing.JLabel();
        jlNombre1 = new javax.swing.JLabel();
        jtxtPlatoNombreActu = new javax.swing.JTextField();
        jlDescripcion1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtPlatoDescripcionActu = new javax.swing.JTextArea();
        jlPrecio1 = new javax.swing.JLabel();
        jtxtPlatoPrecioActu = new javax.swing.JTextField();
        jlCategoria1 = new javax.swing.JLabel();
        jcbPlatosFormCatActu = new javax.swing.JComboBox<>();
        jbPlatosGuardarActu = new javax.swing.JButton();
        jbPlatosCancelarActu = new javax.swing.JButton();
        jlPlatoID1 = new javax.swing.JLabel();
        jtxtPlatoIDActu = new javax.swing.JTextField();
        jbPlatosEliminar = new javax.swing.JButton();
        page_productosFormularioActu = new javax.swing.JPanel();
        fondo_beige10 = new componentes.PanelRound();
        jpProductoFormulario1 = new componentes.PanelRound();
        jlProductoFormulario1 = new javax.swing.JLabel();
        jlProductoNombre1 = new javax.swing.JLabel();
        jtxtProductoNombreActu = new javax.swing.JTextField();
        jlProductoDetalle1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtxtProductoDetalleActu = new javax.swing.JTextArea();
        jlProductoCategoria1 = new javax.swing.JLabel();
        jcbProductoFormCatActu = new javax.swing.JComboBox<>();
        jlProductoCantidad1 = new javax.swing.JLabel();
        jtxtProductoCantidadActu = new javax.swing.JSpinner();
        jlProductoPrecio1 = new javax.swing.JLabel();
        jtxtProductoPrecioActu = new javax.swing.JTextField();
        jbProductoGuardarActu = new javax.swing.JButton();
        jbProductoCancelarActu = new javax.swing.JButton();
        jtxtProductoIDActu = new javax.swing.JTextField();
        jlProductoID1 = new javax.swing.JLabel();
        jbProductoEliminar = new javax.swing.JButton();

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

        btnVentas.setRadius(10);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVentasMousePressed(evt);
            }
        });
        btnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlVentas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVentas.setIcon(getIcono(logo_ventas));
        jlVentas.setText("VENTAS");
        btnVentas.add(jlVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, 50));

        btnUsuarios.setRadius(10);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUsuariosMousePressed(evt);
            }
        });
        btnUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuarios.setIcon(getIcono(logo_usuario)
        );
        jlUsuarios.setText("USUARIOS");
        btnUsuarios.add(jlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 50));

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

        btnPlatosComida.setRadius(10);
        btnPlatosComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPlatosComidaMousePressed(evt);
            }
        });
        btnPlatosComida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPlatosComida.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlPlatosComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPlatosComida.setIcon(getIcono(logo_platos));
        jlPlatosComida.setText("<html>PLATOS DE<br>COMIDA");
        btnPlatosComida.add(jlPlatosComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnPlatosComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 50));

        btnProductos.setRadius(10);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductosMousePressed(evt);
            }
        });
        btnProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlProductos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlProductos.setIcon(getIcono(logo_productos));
        jlProductos.setText("PRODUCTOS");
        btnProductos.add(jlProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        menu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 50));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 550));

        pestañas.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        page_usuarios.setBackground(new java.awt.Color(255, 125, 14));
        page_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige.setRoundBottomLeft(50);
        fondo_beige.setRoundBottomRight(50);
        fondo_beige.setRoundTopLeft(50);
        fondo_beige.setRoundTopRight(50);
        fondo_beige.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloListaUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        jpTituloListaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jpTituloListaUsuarios.setRoundBottomLeft(50);
        jpTituloListaUsuarios.setRoundBottomRight(50);
        jpTituloListaUsuarios.setRoundTopLeft(50);
        jpTituloListaUsuarios.setRoundTopRight(50);

        jlTituloListaUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlTituloListaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloListaUsuarios.setText("LISTA DE USUARIOS");

        javax.swing.GroupLayout jpTituloListaUsuariosLayout = new javax.swing.GroupLayout(jpTituloListaUsuarios);
        jpTituloListaUsuarios.setLayout(jpTituloListaUsuariosLayout);
        jpTituloListaUsuariosLayout.setHorizontalGroup(
            jpTituloListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloListaUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTituloListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jpTituloListaUsuariosLayout.setVerticalGroup(
            jpTituloListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloListaUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo_beige.add(jpTituloListaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        jlBuscarPor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlBuscarPor.setText("BUSCAR POR:");
        fondo_beige.add(jlBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jcbUsuarioBuscarCat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbUsuarioBuscarCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombres" }));
        jcbUsuarioBuscarCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige.add(jcbUsuarioBuscarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, 30));

        jtxtUsuarioBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtUsuarioBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige.add(jtxtUsuarioBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 330, 30));

        jbUsuarioBuscar.setBackground(new java.awt.Color(254, 233, 119));
        jbUsuarioBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbUsuarioBuscar.setText("BUSCAR");
        jbUsuarioBuscar.setBorder(null);
        jbUsuarioBuscar.setFocusPainted(false);
        jbUsuarioBuscar.setFocusable(false);
        jbUsuarioBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioBuscarActionPerformed(evt);
            }
        });
        fondo_beige.add(jbUsuarioBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 130, 30));

        jlFiltros.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFiltros.setText("FILTROS:");
        fondo_beige.add(jlFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jpRol.setBackground(new java.awt.Color(254, 233, 119));
        jpRol.setRoundBottomLeft(30);
        jpRol.setRoundBottomRight(30);
        jpRol.setRoundTopLeft(30);
        jpRol.setRoundTopRight(30);

        jlRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlRol.setText("ROL");
        jlRol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpRolLayout = new javax.swing.GroupLayout(jpRol);
        jpRol.setLayout(jpRolLayout);
        jpRolLayout.setHorizontalGroup(
            jpRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRolLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jlRol)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jpRolLayout.setVerticalGroup(
            jpRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlRol, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo_beige.add(jpRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 120, 30));

        jcbUsuarioRol.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbUsuarioRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "cajero", "mesero" }));
        jcbUsuarioRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbUsuarioRol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbUsuarioRolItemStateChanged(evt);
            }
        });
        jcbUsuarioRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUsuarioRolActionPerformed(evt);
            }
        });
        fondo_beige.add(jcbUsuarioRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, 30));

        jbUsuarioCrear.setBackground(new java.awt.Color(209, 32, 31));
        jbUsuarioCrear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbUsuarioCrear.setForeground(new java.awt.Color(255, 255, 255));
        jbUsuarioCrear.setText("CREAR NUEVO USUARIO");
        jbUsuarioCrear.setBorder(null);
        jbUsuarioCrear.setFocusPainted(false);
        jbUsuarioCrear.setFocusable(false);
        jbUsuarioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioCrearActionPerformed(evt);
            }
        });
        fondo_beige.add(jbUsuarioCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 210, 30));

        jtblUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "APELLIDOS", "DNI", "TELÉFONO", "USUARIO", "ROL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtblUsuarios);
        if (jtblUsuarios.getColumnModel().getColumnCount() > 0) {
            jtblUsuarios.getColumnModel().getColumn(3).setHeaderValue("DNI");
            jtblUsuarios.getColumnModel().getColumn(4).setHeaderValue("TELÉFONO");
            jtblUsuarios.getColumnModel().getColumn(5).setHeaderValue("USUARIO");
            jtblUsuarios.getColumnModel().getColumn(6).setHeaderValue("ROL");
        }

        fondo_beige.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 790, 260));

        jbUsuarioMostrarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbUsuarioMostrarLista.setText("Mostrar");
        jbUsuarioMostrarLista.setFocusable(false);
        jbUsuarioMostrarLista.setRequestFocusEnabled(false);
        jbUsuarioMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioMostrarListaActionPerformed(evt);
            }
        });
        fondo_beige.add(jbUsuarioMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jbUsuarioLimpiarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbUsuarioLimpiarLista.setText("Limpiar");
        jbUsuarioLimpiarLista.setFocusable(false);
        jbUsuarioLimpiarLista.setRequestFocusEnabled(false);
        jbUsuarioLimpiarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioLimpiarListaActionPerformed(evt);
            }
        });
        fondo_beige.add(jbUsuarioLimpiarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        page_usuarios.add(fondo_beige, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_usuarios);

        page_usuariosFormulario.setBackground(new java.awt.Color(255, 125, 14));
        page_usuariosFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige4.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige4.setRoundBottomLeft(50);
        fondo_beige4.setRoundBottomRight(50);
        fondo_beige4.setRoundTopLeft(50);
        fondo_beige4.setRoundTopRight(50);
        fondo_beige4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFormularioActu.setBackground(new java.awt.Color(0, 0, 0));
        jpFormularioActu.setRoundBottomLeft(50);
        jpFormularioActu.setRoundBottomRight(50);
        jpFormularioActu.setRoundTopLeft(50);
        jpFormularioActu.setRoundTopRight(50);

        jlFormularioActu.setBackground(new java.awt.Color(255, 255, 255));
        jlFormularioActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFormularioActu.setForeground(new java.awt.Color(255, 255, 255));
        jlFormularioActu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormularioActu.setText("FORMULARIO DE USUARIO");
        jlFormularioActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpFormularioActuLayout = new javax.swing.GroupLayout(jpFormularioActu);
        jpFormularioActu.setLayout(jpFormularioActuLayout);
        jpFormularioActuLayout.setHorizontalGroup(
            jpFormularioActuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioActuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlFormularioActu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFormularioActuLayout.setVerticalGroup(
            jpFormularioActuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlFormularioActu, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        fondo_beige4.add(jpFormularioActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 35));

        jlNombres.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNombres.setText("NOMBRES:");
        fondo_beige4.add(jlNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 30));

        jtxtNombres.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige4.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 280, 30));

        jlApellidosActu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlApellidosActu.setText("APELLIDOS:");
        fondo_beige4.add(jlApellidosActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 30));

        jtxtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige4.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 280, 30));

        jlDNIActu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlDNIActu.setText("DNI:");
        fondo_beige4.add(jlDNIActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 30));

        jtxtDNI.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige4.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 280, 30));

        jlTelefonoActu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlTelefonoActu.setText("TELÉFONO:");
        fondo_beige4.add(jlTelefonoActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 30));

        jtxtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige4.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 280, 30));

        jlNomUsuarioActu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNomUsuarioActu.setText("NOMBRE DE USUARIO:");
        fondo_beige4.add(jlNomUsuarioActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));

        jtxtNomUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige4.add(jtxtNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, 30));

        jlFormularioRolActu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlFormularioRolActu.setText("ROL:");
        fondo_beige4.add(jlFormularioRolActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, 30));

        jcbFormularioRol.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jcbFormularioRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "cajero", "mesero" }));
        fondo_beige4.add(jcbFormularioRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 280, 30));

        jbUsuarioGuardar.setBackground(new java.awt.Color(209, 32, 31));
        jbUsuarioGuardar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbUsuarioGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbUsuarioGuardar.setText("GUARDAR");
        jbUsuarioGuardar.setBorder(null);
        jbUsuarioGuardar.setFocusPainted(false);
        jbUsuarioGuardar.setFocusable(false);
        jbUsuarioGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUsuarioGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioGuardarActionPerformed(evt);
            }
        });
        fondo_beige4.add(jbUsuarioGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 40));

        jbUsuarioCancelar.setBackground(new java.awt.Color(63, 92, 112));
        jbUsuarioCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbUsuarioCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbUsuarioCancelar.setText("CANCELAR");
        jbUsuarioCancelar.setBorder(null);
        jbUsuarioCancelar.setFocusPainted(false);
        jbUsuarioCancelar.setFocusable(false);
        jbUsuarioCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUsuarioCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioCancelarActionPerformed(evt);
            }
        });
        fondo_beige4.add(jbUsuarioCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, 40));

        jlNombresActu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNombresActu.setText("ID:");
        fondo_beige4.add(jlNombresActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 30));

        jtxtUsuarioID.setEditable(false);
        jtxtUsuarioID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo_beige4.add(jtxtUsuarioID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 280, 30));

        jlContra2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlContra2.setText("CONTRASEÑA:");
        fondo_beige4.add(jlContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, 30));

        jtxtContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fondo_beige4.add(jtxtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 280, 30));

        page_usuariosFormulario.add(fondo_beige4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_usuariosFormulario);

        page_platosComida.setBackground(new java.awt.Color(255, 125, 14));
        page_platosComida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige5.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige5.setRoundBottomLeft(50);
        fondo_beige5.setRoundBottomRight(50);
        fondo_beige5.setRoundTopLeft(50);
        fondo_beige5.setRoundTopRight(50);
        fondo_beige5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloListaPlatos.setBackground(new java.awt.Color(0, 0, 0));
        jpTituloListaPlatos.setForeground(new java.awt.Color(255, 255, 255));
        jpTituloListaPlatos.setRoundBottomLeft(50);
        jpTituloListaPlatos.setRoundBottomRight(50);
        jpTituloListaPlatos.setRoundTopLeft(50);
        jpTituloListaPlatos.setRoundTopRight(50);

        jlTituloListaPlatos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlTituloListaPlatos.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloListaPlatos.setText("LISTA DE PLATOS DE COMIDA");

        javax.swing.GroupLayout jpTituloListaPlatosLayout = new javax.swing.GroupLayout(jpTituloListaPlatos);
        jpTituloListaPlatos.setLayout(jpTituloListaPlatosLayout);
        jpTituloListaPlatosLayout.setHorizontalGroup(
            jpTituloListaPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloListaPlatosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jlTituloListaPlatos)
                .addGap(17, 17, 17))
        );
        jpTituloListaPlatosLayout.setVerticalGroup(
            jpTituloListaPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloListaPlatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo_beige5.add(jpTituloListaPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        jlPlatosBuscarPor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlPlatosBuscarPor.setText("BUSCAR POR:");
        fondo_beige5.add(jlPlatosBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jcbPlatosBuscarCat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbPlatosBuscarCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombres" }));
        jcbPlatosBuscarCat.setFocusable(false);
        jcbPlatosBuscarCat.setOpaque(true);
        fondo_beige5.add(jcbPlatosBuscarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, 30));

        jtxtPlatosBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtPlatosBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige5.add(jtxtPlatosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 330, 30));

        jbPlatosBuscar.setBackground(new java.awt.Color(254, 233, 119));
        jbPlatosBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPlatosBuscar.setText("BUSCAR");
        jbPlatosBuscar.setBorder(null);
        jbPlatosBuscar.setFocusPainted(false);
        jbPlatosBuscar.setFocusable(false);
        jbPlatosBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPlatosBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosBuscarActionPerformed(evt);
            }
        });
        fondo_beige5.add(jbPlatosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 130, 30));

        jlFiltros1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFiltros1.setText("FILTROS:");
        fondo_beige5.add(jlFiltros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jpPlatosCat.setBackground(new java.awt.Color(254, 233, 119));
        jpPlatosCat.setRoundBottomLeft(30);
        jpPlatosCat.setRoundBottomRight(30);
        jpPlatosCat.setRoundTopLeft(30);
        jpPlatosCat.setRoundTopRight(30);

        jlPlatosCat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPlatosCat.setText("CATEGORÍA");
        jlPlatosCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpPlatosCatLayout = new javax.swing.GroupLayout(jpPlatosCat);
        jpPlatosCat.setLayout(jpPlatosCatLayout);
        jpPlatosCatLayout.setHorizontalGroup(
            jpPlatosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlatosCatLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlPlatosCat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPlatosCatLayout.setVerticalGroup(
            jpPlatosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlPlatosCat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo_beige5.add(jpPlatosCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 120, 30));

        jcbPlatosCat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbPlatosCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Parrillas", "Postres" }));
        jcbPlatosCat.setToolTipText("");
        jcbPlatosCat.setFocusable(false);
        jcbPlatosCat.setOpaque(true);
        jcbPlatosCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPlatosCatItemStateChanged(evt);
            }
        });
        fondo_beige5.add(jcbPlatosCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, 30));

        jbPlatosCrear.setBackground(new java.awt.Color(209, 32, 31));
        jbPlatosCrear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbPlatosCrear.setForeground(new java.awt.Color(255, 255, 255));
        jbPlatosCrear.setText("CREAR NUEVO PLATO DE COMIDA");
        jbPlatosCrear.setBorder(null);
        jbPlatosCrear.setFocusPainted(false);
        jbPlatosCrear.setFocusable(false);
        jbPlatosCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosCrearActionPerformed(evt);
            }
        });
        fondo_beige5.add(jbPlatosCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 260, 30));

        jtblPlatosComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "PRECIO", "CATEGORÍA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblPlatosComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPlatosComidaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtblPlatosComida);

        fondo_beige5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 790, 260));

        jbPlatosMostrarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbPlatosMostrarLista.setText("Mostrar");
        jbPlatosMostrarLista.setFocusable(false);
        jbPlatosMostrarLista.setRequestFocusEnabled(false);
        jbPlatosMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosMostrarListaActionPerformed(evt);
            }
        });
        fondo_beige5.add(jbPlatosMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jbPlatosListaLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbPlatosListaLimpiar.setText("Limpiar");
        jbPlatosListaLimpiar.setFocusable(false);
        jbPlatosListaLimpiar.setRequestFocusEnabled(false);
        jbPlatosListaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosListaLimpiarActionPerformed(evt);
            }
        });
        fondo_beige5.add(jbPlatosListaLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        page_platosComida.add(fondo_beige5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_platosComida);

        page_platosComidaFormulario.setBackground(new java.awt.Color(255, 125, 14));
        page_platosComidaFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige6.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige6.setRoundBottomLeft(50);
        fondo_beige6.setRoundBottomRight(50);
        fondo_beige6.setRoundTopLeft(50);
        fondo_beige6.setRoundTopRight(50);
        fondo_beige6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFormPlatos.setBackground(new java.awt.Color(0, 0, 0));
        jpFormPlatos.setRoundBottomLeft(50);
        jpFormPlatos.setRoundBottomRight(50);
        jpFormPlatos.setRoundTopLeft(50);
        jpFormPlatos.setRoundTopRight(50);

        jlFormPlatos.setBackground(new java.awt.Color(255, 255, 255));
        jlFormPlatos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFormPlatos.setForeground(new java.awt.Color(255, 255, 255));
        jlFormPlatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormPlatos.setText("FORMULARIO DE PLATOS DE COMIDA");
        jlFormPlatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpFormPlatosLayout = new javax.swing.GroupLayout(jpFormPlatos);
        jpFormPlatos.setLayout(jpFormPlatosLayout);
        jpFormPlatosLayout.setHorizontalGroup(
            jpFormPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormPlatosLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlFormPlatos)
                .addGap(20, 20, 20))
        );
        jpFormPlatosLayout.setVerticalGroup(
            jpFormPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlFormPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        fondo_beige6.add(jpFormPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 35));

        jlNombre.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNombre.setText("NOMBRE:");
        fondo_beige6.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 30));

        jtxtPlatoNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige6.add(jtxtPlatoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 280, 30));

        jlDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlDescripcion.setText("DESCRIPCIÓN:");
        fondo_beige6.add(jlDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 30));

        jtxtPlatoDescripcion.setColumns(20);
        jtxtPlatoDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtxtPlatoDescripcion);

        fondo_beige6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, 120));

        jlPrecio.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlPrecio.setText("PRECIO:");
        fondo_beige6.add(jlPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, 30));

        jtxtPlatoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige6.add(jtxtPlatoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 280, 30));

        jlCategoria.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlCategoria.setText("CATEGORÍA:");
        fondo_beige6.add(jlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 30));

        jcbPlatosFormCat.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jcbPlatosFormCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Parrillas", "Postres" }));
        fondo_beige6.add(jcbPlatosFormCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 280, 30));

        jbPlatosGuardar.setBackground(new java.awt.Color(209, 32, 31));
        jbPlatosGuardar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPlatosGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbPlatosGuardar.setText("GUARDAR");
        jbPlatosGuardar.setBorder(null);
        jbPlatosGuardar.setFocusPainted(false);
        jbPlatosGuardar.setFocusable(false);
        jbPlatosGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPlatosGuardar.setOpaque(true);
        jbPlatosGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosGuardarActionPerformed(evt);
            }
        });
        fondo_beige6.add(jbPlatosGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 40));

        jbPlatosCancelar.setBackground(new java.awt.Color(63, 92, 112));
        jbPlatosCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPlatosCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbPlatosCancelar.setText("CANCELAR");
        jbPlatosCancelar.setBorder(null);
        jbPlatosCancelar.setFocusPainted(false);
        jbPlatosCancelar.setFocusable(false);
        jbPlatosCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPlatosCancelar.setOpaque(true);
        jbPlatosCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosCancelarActionPerformed(evt);
            }
        });
        fondo_beige6.add(jbPlatosCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, 40));

        jlPlatoID.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlPlatoID.setText("ID:");
        fondo_beige6.add(jlPlatoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 30));

        jtxtPlatoID.setEditable(false);
        jtxtPlatoID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo_beige6.add(jtxtPlatoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 280, 30));

        page_platosComidaFormulario.add(fondo_beige6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_platosComidaFormulario);

        page_productos.setBackground(new java.awt.Color(255, 125, 14));
        page_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige1.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige1.setRoundBottomLeft(50);
        fondo_beige1.setRoundBottomRight(50);
        fondo_beige1.setRoundTopLeft(50);
        fondo_beige1.setRoundTopRight(50);
        fondo_beige1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloListaProductos.setBackground(new java.awt.Color(0, 0, 0));
        jpTituloListaProductos.setForeground(new java.awt.Color(255, 255, 255));
        jpTituloListaProductos.setRoundBottomLeft(50);
        jpTituloListaProductos.setRoundBottomRight(50);
        jpTituloListaProductos.setRoundTopLeft(50);
        jpTituloListaProductos.setRoundTopRight(50);

        jlTituloListaProductos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlTituloListaProductos.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloListaProductos.setText("LISTA DE PRODUCTOS");

        javax.swing.GroupLayout jpTituloListaProductosLayout = new javax.swing.GroupLayout(jpTituloListaProductos);
        jpTituloListaProductos.setLayout(jpTituloListaProductosLayout);
        jpTituloListaProductosLayout.setHorizontalGroup(
            jpTituloListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloListaProductosLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jlTituloListaProductos)
                .addGap(43, 43, 43))
        );
        jpTituloListaProductosLayout.setVerticalGroup(
            jpTituloListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloListaProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo_beige1.add(jpTituloListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        jlProductosBuscarPor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlProductosBuscarPor.setText("BUSCAR POR:");
        fondo_beige1.add(jlProductosBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jcbProductosBuscarCat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbProductosBuscarCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombres" }));
        jcbProductosBuscarCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige1.add(jcbProductosBuscarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, 30));

        jtxtProductosBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtProductosBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige1.add(jtxtProductosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 330, 30));

        jbProductosBuscar.setBackground(new java.awt.Color(254, 233, 119));
        jbProductosBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbProductosBuscar.setText("BUSCAR");
        jbProductosBuscar.setBorder(null);
        jbProductosBuscar.setFocusPainted(false);
        jbProductosBuscar.setFocusable(false);
        jbProductosBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProductosBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosBuscarActionPerformed(evt);
            }
        });
        fondo_beige1.add(jbProductosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 130, 30));

        jlFiltros2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFiltros2.setText("FILTROS:");
        fondo_beige1.add(jlFiltros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jpProductosCat.setBackground(new java.awt.Color(254, 233, 119));
        jpProductosCat.setRoundBottomLeft(30);
        jpProductosCat.setRoundBottomRight(30);
        jpProductosCat.setRoundTopLeft(30);
        jpProductosCat.setRoundTopRight(30);

        jlProductosCat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlProductosCat.setText("CATEGORÍA");
        jlProductosCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpProductosCatLayout = new javax.swing.GroupLayout(jpProductosCat);
        jpProductosCat.setLayout(jpProductosCatLayout);
        jpProductosCatLayout.setHorizontalGroup(
            jpProductosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductosCatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlProductosCat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpProductosCatLayout.setVerticalGroup(
            jpProductosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlProductosCat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo_beige1.add(jpProductosCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 120, 30));

        jcbProductosCat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbProductosCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Snack" }));
        jcbProductosCat.setToolTipText("");
        jcbProductosCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbProductosCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProductosCatItemStateChanged(evt);
            }
        });
        fondo_beige1.add(jcbProductosCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, 30));

        jbProductoCrear.setBackground(new java.awt.Color(209, 32, 31));
        jbProductoCrear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbProductoCrear.setForeground(new java.awt.Color(255, 255, 255));
        jbProductoCrear.setText("CREAR NUEVO PRODUCTO");
        jbProductoCrear.setBorder(null);
        jbProductoCrear.setFocusPainted(false);
        jbProductoCrear.setFocusable(false);
        jbProductoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoCrearActionPerformed(evt);
            }
        });
        fondo_beige1.add(jbProductoCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 210, 30));

        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CATEGORÍA", "DETALLE", "CANTIDAD", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtblProductos);

        fondo_beige1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 800, 260));

        jbProductosMostrarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbProductosMostrarLista.setText("Mostrar");
        jbProductosMostrarLista.setFocusable(false);
        jbProductosMostrarLista.setRequestFocusEnabled(false);
        jbProductosMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosMostrarListaActionPerformed(evt);
            }
        });
        fondo_beige1.add(jbProductosMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jbProductosLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbProductosLimpiar.setText("Limpiar");
        jbProductosLimpiar.setFocusable(false);
        jbProductosLimpiar.setRequestFocusEnabled(false);
        jbProductosLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosLimpiarActionPerformed(evt);
            }
        });
        fondo_beige1.add(jbProductosLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        page_productos.add(fondo_beige1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_productos);

        page_productosFormulario.setBackground(new java.awt.Color(255, 125, 14));
        page_productosFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige7.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige7.setRoundBottomLeft(50);
        fondo_beige7.setRoundBottomRight(50);
        fondo_beige7.setRoundTopLeft(50);
        fondo_beige7.setRoundTopRight(50);
        fondo_beige7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpProductoFormulario.setBackground(new java.awt.Color(0, 0, 0));
        jpProductoFormulario.setRoundBottomLeft(50);
        jpProductoFormulario.setRoundBottomRight(50);
        jpProductoFormulario.setRoundTopLeft(50);
        jpProductoFormulario.setRoundTopRight(50);

        jlProductoFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jlProductoFormulario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlProductoFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jlProductoFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlProductoFormulario.setText("FORMULARIO DE PRODUCTO");
        jlProductoFormulario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpProductoFormularioLayout = new javax.swing.GroupLayout(jpProductoFormulario);
        jpProductoFormulario.setLayout(jpProductoFormularioLayout);
        jpProductoFormularioLayout.setHorizontalGroup(
            jpProductoFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoFormularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlProductoFormulario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpProductoFormularioLayout.setVerticalGroup(
            jpProductoFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlProductoFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        fondo_beige7.add(jpProductoFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 35));

        jlProductoNombre.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoNombre.setText("NOMBRE:");
        fondo_beige7.add(jlProductoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 30));

        jtxtProductoNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige7.add(jtxtProductoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 280, 30));

        jlProductoDetalle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoDetalle.setText("DETALLE:");
        fondo_beige7.add(jlProductoDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, 30));

        jtxtProductoDetalle.setColumns(20);
        jtxtProductoDetalle.setRows(5);
        jScrollPane2.setViewportView(jtxtProductoDetalle);

        fondo_beige7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, 100));

        jlProductoCategoria.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoCategoria.setText("CATEGORÍA:");
        fondo_beige7.add(jlProductoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 30));

        jcbProductoFormCat.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jcbProductoFormCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Snacks" }));
        fondo_beige7.add(jcbProductoFormCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, 30));

        jlProductoCantidad.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoCantidad.setText("CANTIDAD:");
        fondo_beige7.add(jlProductoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 30));

        jtxtProductoCantidad.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige7.add(jtxtProductoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 160, 30));

        jlProductoPrecio.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoPrecio.setText("PRECIO:");
        fondo_beige7.add(jlProductoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 30));

        jtxtProductoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige7.add(jtxtProductoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 280, 30));

        jbProductoGuardar.setBackground(new java.awt.Color(209, 32, 31));
        jbProductoGuardar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbProductoGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbProductoGuardar.setText("GUARDAR");
        jbProductoGuardar.setBorder(null);
        jbProductoGuardar.setFocusPainted(false);
        jbProductoGuardar.setFocusable(false);
        jbProductoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProductoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoGuardarActionPerformed(evt);
            }
        });
        fondo_beige7.add(jbProductoGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 40));

        jbProductoCancelar.setBackground(new java.awt.Color(63, 92, 112));
        jbProductoCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbProductoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbProductoCancelar.setText("CANCELAR");
        jbProductoCancelar.setBorder(null);
        jbProductoCancelar.setFocusPainted(false);
        jbProductoCancelar.setFocusable(false);
        jbProductoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProductoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoCancelarActionPerformed(evt);
            }
        });
        fondo_beige7.add(jbProductoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, 40));

        jtxtProductoID.setEditable(false);
        jtxtProductoID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo_beige7.add(jtxtProductoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 280, 30));

        jlProductoID.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoID.setText("ID:");
        fondo_beige7.add(jlProductoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 30));

        page_productosFormulario.add(fondo_beige7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_productosFormulario);

        page_asignacion.setBackground(new java.awt.Color(255, 125, 14));
        page_asignacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige3.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige3.setRoundBottomLeft(50);
        fondo_beige3.setRoundBottomRight(50);
        fondo_beige3.setRoundTopLeft(50);
        fondo_beige3.setRoundTopRight(50);
        fondo_beige3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloAsignacion1.setBackground(new java.awt.Color(0, 0, 0));
        jpTituloAsignacion1.setForeground(new java.awt.Color(255, 255, 255));
        jpTituloAsignacion1.setRoundBottomLeft(50);
        jpTituloAsignacion1.setRoundBottomRight(50);
        jpTituloAsignacion1.setRoundTopLeft(50);
        jpTituloAsignacion1.setRoundTopRight(50);

        jlTituloAsignacion1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlTituloAsignacion1.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloAsignacion1.setText("ASIGNACIÓN DE MESAS");

        javax.swing.GroupLayout jpTituloAsignacion1Layout = new javax.swing.GroupLayout(jpTituloAsignacion1);
        jpTituloAsignacion1.setLayout(jpTituloAsignacion1Layout);
        jpTituloAsignacion1Layout.setHorizontalGroup(
            jpTituloAsignacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloAsignacion1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlTituloAsignacion1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTituloAsignacion1Layout.setVerticalGroup(
            jpTituloAsignacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloAsignacion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo_beige3.add(jpTituloAsignacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 260, 40));

        jlNumMesa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlNumMesa.setText("N° DE MESA:");
        fondo_beige3.add(jlNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jcbNumMesa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbNumMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jcbNumMesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige3.add(jcbNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, 30));

        jlNombreMesero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlNombreMesero.setText("NOMBRE DE MESERO:");
        fondo_beige3.add(jlNombreMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 30));

        jcbNombreMesero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbNombreMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juan", "Maria", "Santiago", "Axeel" }));
        jcbNombreMesero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_beige3.add(jcbNombreMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 280, 30));

        jbAsignarMesero.setBackground(new java.awt.Color(63, 92, 112));
        jbAsignarMesero.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbAsignarMesero.setForeground(new java.awt.Color(255, 255, 255));
        jbAsignarMesero.setText("ASIGNAR");
        jbAsignarMesero.setBorder(null);
        jbAsignarMesero.setFocusPainted(false);
        jbAsignarMesero.setFocusable(false);
        jbAsignarMesero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAsignarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignarMeseroActionPerformed(evt);
            }
        });
        fondo_beige3.add(jbAsignarMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 180, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        fondo_beige3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 840, -1));

        jlFiltros4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFiltros4.setText("FILTROS:");
        fondo_beige3.add(jlFiltros4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 30));

        jpMesero.setBackground(new java.awt.Color(254, 233, 119));
        jpMesero.setRoundBottomLeft(30);
        jpMesero.setRoundBottomRight(30);
        jpMesero.setRoundTopLeft(30);
        jpMesero.setRoundTopRight(30);

        jlMesero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlMesero.setText("MESERO");
        jlMesero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpMeseroLayout = new javax.swing.GroupLayout(jpMesero);
        jpMesero.setLayout(jpMeseroLayout);
        jpMeseroLayout.setHorizontalGroup(
            jpMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMeseroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlMesero)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jpMeseroLayout.setVerticalGroup(
            jpMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo_beige3.add(jpMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, 30));

        jcbFiltroAsignacion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbFiltroAsignacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero", "Mesero" }));
        jcbFiltroAsignacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbFiltroAsignacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFiltroAsignacionItemStateChanged(evt);
            }
        });
        fondo_beige3.add(jcbFiltroAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 30));

        jtblAsignacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE DEL MESERO", "N° DE MESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jtblAsignacion);

        fondo_beige3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 790, 260));

        jbEliminarAsignacion.setBackground(new java.awt.Color(209, 32, 31));
        jbEliminarAsignacion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbEliminarAsignacion.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminarAsignacion.setText("ELIMINAR");
        jbEliminarAsignacion.setBorder(null);
        jbEliminarAsignacion.setFocusPainted(false);
        jbEliminarAsignacion.setFocusable(false);
        jbEliminarAsignacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEliminarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAsignacionActionPerformed(evt);
            }
        });
        fondo_beige3.add(jbEliminarAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 180, 30));

        jbAsignaciónMostrarLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbAsignaciónMostrarLista.setText("Mostrar");
        jbAsignaciónMostrarLista.setFocusable(false);
        jbAsignaciónMostrarLista.setRequestFocusEnabled(false);
        jbAsignaciónMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignaciónMostrarListaActionPerformed(evt);
            }
        });
        fondo_beige3.add(jbAsignaciónMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        page_asignacion.add(fondo_beige3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_asignacion);

        page_reporteVentas.setBackground(new java.awt.Color(255, 125, 14));
        page_reporteVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige2.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige2.setRoundBottomLeft(50);
        fondo_beige2.setRoundBottomRight(50);
        fondo_beige2.setRoundTopLeft(50);
        fondo_beige2.setRoundTopRight(50);
        fondo_beige2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloReporte.setBackground(new java.awt.Color(0, 0, 0));
        jpTituloReporte.setForeground(new java.awt.Color(255, 255, 255));
        jpTituloReporte.setRoundBottomLeft(50);
        jpTituloReporte.setRoundBottomRight(50);
        jpTituloReporte.setRoundTopLeft(50);
        jpTituloReporte.setRoundTopRight(50);

        jlTituloReporte.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlTituloReporte.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloReporte.setText("REPORTE DE VENTAS");

        javax.swing.GroupLayout jpTituloReporteLayout = new javax.swing.GroupLayout(jpTituloReporte);
        jpTituloReporte.setLayout(jpTituloReporteLayout);
        jpTituloReporteLayout.setHorizontalGroup(
            jpTituloReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloReporteLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jlTituloReporte)
                .addGap(49, 49, 49))
        );
        jpTituloReporteLayout.setVerticalGroup(
            jpTituloReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo_beige2.add(jpTituloReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 260, 40));

        jlFiltros3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFiltros3.setText("FILTROS:");
        fondo_beige2.add(jlFiltros3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jpReporteFecha.setBackground(new java.awt.Color(254, 233, 119));
        jpReporteFecha.setRoundBottomLeft(30);
        jpReporteFecha.setRoundBottomRight(30);
        jpReporteFecha.setRoundTopLeft(30);
        jpReporteFecha.setRoundTopRight(30);

        jlReporteFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlReporteFecha.setText("FECHA");
        jlReporteFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpReporteFechaLayout = new javax.swing.GroupLayout(jpReporteFecha);
        jpReporteFecha.setLayout(jpReporteFechaLayout);
        jpReporteFechaLayout.setHorizontalGroup(
            jpReporteFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReporteFechaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlReporteFecha)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jpReporteFechaLayout.setVerticalGroup(
            jpReporteFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlReporteFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo_beige2.add(jpReporteFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 30));

        jcbReporteFecha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbReporteFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Más reciente", "Menos reciente" }));
        jcbReporteFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbReporteFecha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbReporteFechaItemStateChanged(evt);
            }
        });
        fondo_beige2.add(jcbReporteFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, 30));

        jpReporteMesero.setBackground(new java.awt.Color(254, 233, 119));
        jpReporteMesero.setRoundBottomLeft(30);
        jpReporteMesero.setRoundBottomRight(30);
        jpReporteMesero.setRoundTopLeft(30);
        jpReporteMesero.setRoundTopRight(30);

        jlReporteMesero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlReporteMesero.setText("MESERO");
        jlReporteMesero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpReporteMeseroLayout = new javax.swing.GroupLayout(jpReporteMesero);
        jpReporteMesero.setLayout(jpReporteMeseroLayout);
        jpReporteMeseroLayout.setHorizontalGroup(
            jpReporteMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReporteMeseroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlReporteMesero)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpReporteMeseroLayout.setVerticalGroup(
            jpReporteMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlReporteMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo_beige2.add(jpReporteMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 120, 30));

        jcbReporteMesero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbReporteMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evan", "Juan", "Maria", "Axeel" }));
        jcbReporteMesero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbReporteMesero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbReporteMeseroItemStateChanged(evt);
            }
        });
        fondo_beige2.add(jcbReporteMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 240, 30));

        jtblReporteVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "MESERO", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jtblReporteVentas);

        fondo_beige2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 610, 320));

        jlReporteTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlReporteTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlReporteTotal.setText("<html>TOTAL<br>VENTAS");
        jlReporteTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo_beige2.add(jlReporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        jtxtReporteTotal.setEditable(false);
        jtxtReporteTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtReporteTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fondo_beige2.add(jtxtReporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 170, 70));

        page_reporteVentas.add(fondo_beige2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_reporteVentas);

        page_usuariosFormularioActu.setBackground(new java.awt.Color(255, 125, 14));
        page_usuariosFormularioActu.setMaximumSize(new java.awt.Dimension(1050, 545));
        page_usuariosFormularioActu.setMinimumSize(new java.awt.Dimension(1050, 545));
        page_usuariosFormularioActu.setPreferredSize(new java.awt.Dimension(1050, 545));
        page_usuariosFormularioActu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige8.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige8.setRoundBottomLeft(50);
        fondo_beige8.setRoundBottomRight(50);
        fondo_beige8.setRoundTopLeft(50);
        fondo_beige8.setRoundTopRight(50);
        fondo_beige8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFormulario1.setBackground(new java.awt.Color(0, 0, 0));
        jpFormulario1.setRoundBottomLeft(50);
        jpFormulario1.setRoundBottomRight(50);
        jpFormulario1.setRoundTopLeft(50);
        jpFormulario1.setRoundTopRight(50);

        jlFormulario1.setBackground(new java.awt.Color(255, 255, 255));
        jlFormulario1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFormulario1.setForeground(new java.awt.Color(255, 255, 255));
        jlFormulario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormulario1.setText("FORMULARIO DE USUARIO");
        jlFormulario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpFormulario1Layout = new javax.swing.GroupLayout(jpFormulario1);
        jpFormulario1.setLayout(jpFormulario1Layout);
        jpFormulario1Layout.setHorizontalGroup(
            jpFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormulario1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlFormulario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFormulario1Layout.setVerticalGroup(
            jpFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        fondo_beige8.add(jpFormulario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 35));

        jlNombres2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNombres2.setText("NOMBRES:");
        fondo_beige8.add(jlNombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 30));

        jtxtNombresActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige8.add(jtxtNombresActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 280, 30));

        jlApellidos1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlApellidos1.setText("APELLIDOS:");
        fondo_beige8.add(jlApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, 30));

        jtxtApellidosActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige8.add(jtxtApellidosActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 280, 30));

        jlDNI1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlDNI1.setText("DNI:");
        fondo_beige8.add(jlDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 30));

        jtxtDNIActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige8.add(jtxtDNIActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 280, 30));

        jlTelefono1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlTelefono1.setText("TELÉFONO:");
        fondo_beige8.add(jlTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, 30));

        jtxtTelefonoActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige8.add(jtxtTelefonoActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 280, 30));

        jlNomUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNomUsuario1.setText("NOMBRE DE USUARIO:");
        fondo_beige8.add(jlNomUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 30));

        jtxtNomUsuarioActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige8.add(jtxtNomUsuarioActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 280, 30));

        jlFormularioRol1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlFormularioRol1.setText("ROL:");
        fondo_beige8.add(jlFormularioRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 30));

        jcbFormularioRolActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jcbFormularioRolActu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "cajero", "mesero" }));
        fondo_beige8.add(jcbFormularioRolActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 280, 30));

        jbUsuarioGuardarActu.setBackground(new java.awt.Color(209, 32, 31));
        jbUsuarioGuardarActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbUsuarioGuardarActu.setForeground(new java.awt.Color(255, 255, 255));
        jbUsuarioGuardarActu.setText("GUARDAR");
        jbUsuarioGuardarActu.setBorder(null);
        jbUsuarioGuardarActu.setFocusPainted(false);
        jbUsuarioGuardarActu.setFocusable(false);
        jbUsuarioGuardarActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUsuarioGuardarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioGuardarActuActionPerformed(evt);
            }
        });
        fondo_beige8.add(jbUsuarioGuardarActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 40));

        jbUsuarioCancelarActu.setBackground(new java.awt.Color(63, 92, 112));
        jbUsuarioCancelarActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbUsuarioCancelarActu.setForeground(new java.awt.Color(255, 255, 255));
        jbUsuarioCancelarActu.setText("CANCELAR");
        jbUsuarioCancelarActu.setBorder(null);
        jbUsuarioCancelarActu.setFocusPainted(false);
        jbUsuarioCancelarActu.setFocusable(false);
        jbUsuarioCancelarActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUsuarioCancelarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioCancelarActuActionPerformed(evt);
            }
        });
        fondo_beige8.add(jbUsuarioCancelarActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 150, 40));

        jlNombres3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNombres3.setText("ID:");
        fondo_beige8.add(jlNombres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 30));

        jtxtUsuarioIDActu.setEditable(false);
        jtxtUsuarioIDActu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo_beige8.add(jtxtUsuarioIDActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 280, 30));

        jbUsuarioEliminar.setBackground(new java.awt.Color(63, 92, 112));
        jbUsuarioEliminar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbUsuarioEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbUsuarioEliminar.setText("ELIMINAR");
        jbUsuarioEliminar.setBorder(null);
        jbUsuarioEliminar.setFocusPainted(false);
        jbUsuarioEliminar.setFocusable(false);
        jbUsuarioEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioEliminarActionPerformed(evt);
            }
        });
        fondo_beige8.add(jbUsuarioEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 150, 40));

        page_usuariosFormularioActu.add(fondo_beige8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_usuariosFormularioActu);

        page_platosComidaFormularioActu.setBackground(new java.awt.Color(255, 125, 14));
        page_platosComidaFormularioActu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige9.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige9.setRoundBottomLeft(50);
        fondo_beige9.setRoundBottomRight(50);
        fondo_beige9.setRoundTopLeft(50);
        fondo_beige9.setRoundTopRight(50);
        fondo_beige9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFormPlatos1.setBackground(new java.awt.Color(0, 0, 0));
        jpFormPlatos1.setRoundBottomLeft(50);
        jpFormPlatos1.setRoundBottomRight(50);
        jpFormPlatos1.setRoundTopLeft(50);
        jpFormPlatos1.setRoundTopRight(50);

        jlFormPlatos1.setBackground(new java.awt.Color(255, 255, 255));
        jlFormPlatos1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlFormPlatos1.setForeground(new java.awt.Color(255, 255, 255));
        jlFormPlatos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormPlatos1.setText("FORMULARIO DE PLATOS DE COMIDA");
        jlFormPlatos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpFormPlatos1Layout = new javax.swing.GroupLayout(jpFormPlatos1);
        jpFormPlatos1.setLayout(jpFormPlatos1Layout);
        jpFormPlatos1Layout.setHorizontalGroup(
            jpFormPlatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormPlatos1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlFormPlatos1)
                .addGap(20, 20, 20))
        );
        jpFormPlatos1Layout.setVerticalGroup(
            jpFormPlatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlFormPlatos1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        fondo_beige9.add(jpFormPlatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 35));

        jlNombre1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlNombre1.setText("NOMBRE:");
        fondo_beige9.add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 30));

        jtxtPlatoNombreActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige9.add(jtxtPlatoNombreActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 280, 30));

        jlDescripcion1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlDescripcion1.setText("DESCRIPCIÓN:");
        fondo_beige9.add(jlDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 30));

        jtxtPlatoDescripcionActu.setColumns(20);
        jtxtPlatoDescripcionActu.setRows(5);
        jScrollPane3.setViewportView(jtxtPlatoDescripcionActu);

        fondo_beige9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, 120));

        jlPrecio1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlPrecio1.setText("PRECIO:");
        fondo_beige9.add(jlPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, 30));

        jtxtPlatoPrecioActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige9.add(jtxtPlatoPrecioActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 280, 30));

        jlCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlCategoria1.setText("CATEGORÍA:");
        fondo_beige9.add(jlCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 30));

        jcbPlatosFormCatActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jcbPlatosFormCatActu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Parrillas", "Postres" }));
        fondo_beige9.add(jcbPlatosFormCatActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 280, 30));

        jbPlatosGuardarActu.setBackground(new java.awt.Color(209, 32, 31));
        jbPlatosGuardarActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPlatosGuardarActu.setForeground(new java.awt.Color(255, 255, 255));
        jbPlatosGuardarActu.setText("GUARDAR");
        jbPlatosGuardarActu.setBorder(null);
        jbPlatosGuardarActu.setFocusPainted(false);
        jbPlatosGuardarActu.setFocusable(false);
        jbPlatosGuardarActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPlatosGuardarActu.setOpaque(true);
        jbPlatosGuardarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosGuardarActuActionPerformed(evt);
            }
        });
        fondo_beige9.add(jbPlatosGuardarActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 40));

        jbPlatosCancelarActu.setBackground(new java.awt.Color(63, 92, 112));
        jbPlatosCancelarActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbPlatosCancelarActu.setForeground(new java.awt.Color(255, 255, 255));
        jbPlatosCancelarActu.setText("CANCELAR");
        jbPlatosCancelarActu.setBorder(null);
        jbPlatosCancelarActu.setFocusPainted(false);
        jbPlatosCancelarActu.setFocusable(false);
        jbPlatosCancelarActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPlatosCancelarActu.setOpaque(true);
        jbPlatosCancelarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosCancelarActuActionPerformed(evt);
            }
        });
        fondo_beige9.add(jbPlatosCancelarActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 150, 40));

        jlPlatoID1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlPlatoID1.setText("ID:");
        fondo_beige9.add(jlPlatoID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 30));

        jtxtPlatoIDActu.setEditable(false);
        jtxtPlatoIDActu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo_beige9.add(jtxtPlatoIDActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 280, 30));

        jbPlatosEliminar.setBackground(new java.awt.Color(63, 92, 112));
        jbPlatosEliminar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbPlatosEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbPlatosEliminar.setText("ELIMINAR");
        jbPlatosEliminar.setBorder(null);
        jbPlatosEliminar.setFocusPainted(false);
        jbPlatosEliminar.setFocusable(false);
        jbPlatosEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPlatosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatosEliminarActionPerformed(evt);
            }
        });
        fondo_beige9.add(jbPlatosEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, 40));

        page_platosComidaFormularioActu.add(fondo_beige9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_platosComidaFormularioActu);

        page_productosFormularioActu.setBackground(new java.awt.Color(255, 125, 14));
        page_productosFormularioActu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_beige10.setBackground(new java.awt.Color(255, 253, 247));
        fondo_beige10.setRoundBottomLeft(50);
        fondo_beige10.setRoundBottomRight(50);
        fondo_beige10.setRoundTopLeft(50);
        fondo_beige10.setRoundTopRight(50);
        fondo_beige10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpProductoFormulario1.setBackground(new java.awt.Color(0, 0, 0));
        jpProductoFormulario1.setRoundBottomLeft(50);
        jpProductoFormulario1.setRoundBottomRight(50);
        jpProductoFormulario1.setRoundTopLeft(50);
        jpProductoFormulario1.setRoundTopRight(50);

        jlProductoFormulario1.setBackground(new java.awt.Color(255, 255, 255));
        jlProductoFormulario1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlProductoFormulario1.setForeground(new java.awt.Color(255, 255, 255));
        jlProductoFormulario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlProductoFormulario1.setText("FORMULARIO DE PRODUCTO");
        jlProductoFormulario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpProductoFormulario1Layout = new javax.swing.GroupLayout(jpProductoFormulario1);
        jpProductoFormulario1.setLayout(jpProductoFormulario1Layout);
        jpProductoFormulario1Layout.setHorizontalGroup(
            jpProductoFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoFormulario1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlProductoFormulario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpProductoFormulario1Layout.setVerticalGroup(
            jpProductoFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlProductoFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        fondo_beige10.add(jpProductoFormulario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 35));

        jlProductoNombre1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoNombre1.setText("NOMBRE:");
        fondo_beige10.add(jlProductoNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 30));

        jtxtProductoNombreActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige10.add(jtxtProductoNombreActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 280, 30));

        jlProductoDetalle1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoDetalle1.setText("DETALLE:");
        fondo_beige10.add(jlProductoDetalle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, 30));

        jtxtProductoDetalleActu.setColumns(20);
        jtxtProductoDetalleActu.setRows(5);
        jScrollPane9.setViewportView(jtxtProductoDetalleActu);

        fondo_beige10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, 100));

        jlProductoCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoCategoria1.setText("CATEGORÍA:");
        fondo_beige10.add(jlProductoCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 30));

        jcbProductoFormCatActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jcbProductoFormCatActu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Snacks" }));
        fondo_beige10.add(jcbProductoFormCatActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, 30));

        jlProductoCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoCantidad1.setText("CANTIDAD:");
        fondo_beige10.add(jlProductoCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 30));

        jtxtProductoCantidadActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige10.add(jtxtProductoCantidadActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 160, 30));

        jlProductoPrecio1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoPrecio1.setText("PRECIO:");
        fondo_beige10.add(jlProductoPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 30));

        jtxtProductoPrecioActu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fondo_beige10.add(jtxtProductoPrecioActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 280, 30));

        jbProductoGuardarActu.setBackground(new java.awt.Color(209, 32, 31));
        jbProductoGuardarActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbProductoGuardarActu.setForeground(new java.awt.Color(255, 255, 255));
        jbProductoGuardarActu.setText("GUARDAR");
        jbProductoGuardarActu.setBorder(null);
        jbProductoGuardarActu.setFocusPainted(false);
        jbProductoGuardarActu.setFocusable(false);
        jbProductoGuardarActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProductoGuardarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoGuardarActuActionPerformed(evt);
            }
        });
        fondo_beige10.add(jbProductoGuardarActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 40));

        jbProductoCancelarActu.setBackground(new java.awt.Color(63, 92, 112));
        jbProductoCancelarActu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbProductoCancelarActu.setForeground(new java.awt.Color(255, 255, 255));
        jbProductoCancelarActu.setText("CANCELAR");
        jbProductoCancelarActu.setBorder(null);
        jbProductoCancelarActu.setFocusPainted(false);
        jbProductoCancelarActu.setFocusable(false);
        jbProductoCancelarActu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProductoCancelarActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoCancelarActuActionPerformed(evt);
            }
        });
        fondo_beige10.add(jbProductoCancelarActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 150, 40));

        jtxtProductoIDActu.setEditable(false);
        jtxtProductoIDActu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo_beige10.add(jtxtProductoIDActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 280, 30));

        jlProductoID1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jlProductoID1.setText("ID:");
        fondo_beige10.add(jlProductoID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 30));

        jbProductoEliminar.setBackground(new java.awt.Color(63, 92, 112));
        jbProductoEliminar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbProductoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbProductoEliminar.setText("ELIMINAR");
        jbProductoEliminar.setBorder(null);
        jbProductoEliminar.setFocusPainted(false);
        jbProductoEliminar.setFocusable(false);
        jbProductoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProductoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoEliminarActionPerformed(evt);
            }
        });
        fondo_beige10.add(jbProductoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, 40));

        page_productosFormularioActu.add(fondo_beige10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 840, 490));

        pestañas.addTab("", page_productosFormularioActu);

        getContentPane().add(pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // MENU
    private void btnUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMousePressed
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattUsuarios();
    }//GEN-LAST:event_btnUsuariosMousePressed

    private void limpiarFormUsuarioUsuarios() {
        // Establecer el texto de los labels a vacío
        jtxtUsuarioID.setText("");
        jtxtNombres.setText("");
        jtxtApellidos.setText("");
        jtxtDNI.setText("");
        jtxtTelefono.setText("");
        jtxtNomUsuario.setText("");
        jtxtContra.setText("");
    }

    private void limpiarFormUsuarioPlato() {
        // Establecer el texto de los labels a vacío
        jtxtPlatoID.setText("");
        jtxtPlatoNombre.setText("");
        jtxtPlatoDescripcion.setText("");
        jtxtPlatoPrecio.setText("");
    }

    private void limpiarFormProducto() {
        // Establecer el texto de los labels a vacío
        jtxtProductoID.setText("");
        jtxtProductoNombre.setText("");
        jtxtProductoDetalle.setText("");
        jtxtProductoPrecio.setText("");
    }

    private void limpiarFormUsuariosActu() {
        // Establecer el texto de los labels a vacío
        jtxtUsuarioIDActu.setText("");
        jtxtNombresActu.setText("");
        jtxtApellidosActu.setText("");
        jtxtDNIActu.setText("");
        jtxtTelefonoActu.setText("");
        jtxtNomUsuarioActu.setText("");
    }

    private void limpiarFormPlatosActu() {
        // Establecer el texto de los labels a vacío
        jtxtPlatoIDActu.setText("");
        jtxtPlatoNombreActu.setText("");
        jtxtPlatoDescripcionActu.setText("");
        jtxtPlatoPrecioActu.setText("");
    }

    private void limpiarFormProductoActu() {
        // Establecer el texto de los labels a vacío
        jtxtProductoIDActu.setText("");
        jtxtProductoNombreActu.setText("");
        jtxtProductoDetalleActu.setText("");
        jtxtProductoPrecioActu.setText("");
    }

    private void refreshTablaUsuarios() {
        DefaultTableModel tblModel = (DefaultTableModel) jtblUsuarios.getModel();
        tblModel.setRowCount(0);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT id_usuario, nombres, apellidos, dni, telefono, nom_usuario, rol FROM usuario";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_usuario"));
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String nomUsuario = rs.getString("nom_usuario");
                String rol = rs.getString("rol");

                String tbData[] = {id, nombres, apellidos, dni, telefono, nomUsuario, rol};

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }

    private void refreshTablaPlatos() {
        DefaultTableModel tblModel = (DefaultTableModel) jtblPlatosComida.getModel();
        tblModel.setRowCount(0);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM plato_comida";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_plato"));
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String precio = String.valueOf(rs.getDouble("precio"));
                String categoria = rs.getString("categoria");

                String tbData[] = {id, nombre, descripcion, precio, categoria};

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }

    private void refreshTablaProductos() {
        DefaultTableModel tblModel = (DefaultTableModel) jtblProductos.getModel();
        tblModel.setRowCount(0);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM productos";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_producto"));
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                String detalle = rs.getString("detalle");
                String cantidad = String.valueOf(rs.getInt("cantidad"));
                String precio = String.valueOf(rs.getDouble("precio"));

                String tbData[] = {id, nombre, categoria, detalle, cantidad, precio};

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }

    private void btnPlatosComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlatosComidaMousePressed
        pestañas.setSelectedIndex(2);
        ColorOP.AnimattPlatosComida();
    }//GEN-LAST:event_btnPlatosComidaMousePressed

    private void btnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMousePressed
        pestañas.setSelectedIndex(4);
        ColorOP.AnimattProductos();
    }//GEN-LAST:event_btnProductosMousePressed

    private void btnVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMousePressed
        pestañas.setSelectedIndex(7);
        ColorOP.AnimattVentas();
    }//GEN-LAST:event_btnVentasMousePressed

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        ColorOP.AnimattSalir();
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
        PantallaInicioSesion login = new PantallaInicioSesion();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseReleased
    // ------------USUARIOS
    private void jbUsuarioCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioCancelarActionPerformed
        pestañas.setSelectedIndex(0);
        limpiarFormUsuarioUsuarios();
        refreshTablaUsuarios();
        ColorOP.AnimattUsuarios();
    }//GEN-LAST:event_jbUsuarioCancelarActionPerformed

    private void jbUsuarioGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioGuardarActionPerformed
        try {
            // Obtener los valores de los campos
            String nombres = jtxtNombres.getText();
            String apellidos = jtxtApellidos.getText();
            String dni = jtxtDNI.getText();
            String telefono = jtxtTelefono.getText();
            String nomUsuario = jtxtNomUsuario.getText();
            String contrasena = jtxtContra.getText(); // Asegúrate de tener un campo para la contraseña
            String idUsuario = jtxtUsuarioID.getText();

            // Validaciones
            if (nombres.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los nombres no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!nombres.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Los nombres deben contener solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombres.length() > 100) {
                JOptionPane.showMessageDialog(null, "Los nombres deben tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (apellidos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los apellidos no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!apellidos.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Los apellidos deben contener solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (apellidos.length() > 100) {
                JOptionPane.showMessageDialog(null, "Los apellidos deben tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El DNI no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(null, "El DNI debe contener exactamente 8 dígitos numéricos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El teléfono no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!telefono.matches("\\d{9}")) {
                JOptionPane.showMessageDialog(null, "El teléfono debe contener exactamente 9 dígitos numéricos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (nomUsuario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nomUsuario.length() > 100) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (contrasena.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La contraseña no debe estar vacía.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (contrasena.length() > 100) {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto Usuario y asignar valores
            UsuarioBO usuarioBO = new UsuarioBO();
            Usuario usuario = new Usuario();

            usuario.setNombres(nombres);
            usuario.setApellidos(apellidos);
            usuario.setDni(dni);
            usuario.setTelefono(telefono);
            usuario.setNomUsuario(nomUsuario);
            usuario.setContrasena(contrasena); // Asegúrate de que el objeto Usuario tenga este método
            usuario.setRol((String) jcbFormularioRol.getSelectedItem());

            // Guardar o actualizar el usuario
            if (idUsuario.isEmpty()) {
                usuarioBO.insertar(usuario);
                jtxtUsuarioID.setText(String.valueOf(usuario.getId_usuario()));
            } else {
                usuario.setId_usuario(Integer.parseInt(idUsuario));
                usuarioBO.actualizar(usuario);
            }

            JOptionPane.showMessageDialog(null, "El USUARIO se registró correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            pestañas.setSelectedIndex(0);
            limpiarFormUsuarioUsuarios();
            refreshTablaUsuarios();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbUsuarioGuardarActionPerformed

    private void jbUsuarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioCrearActionPerformed
        pestañas.setSelectedIndex(1); //te lleva a la pestaña 1
        ColorOP.AnimattUsuarios();
    }//GEN-LAST:event_jbUsuarioCrearActionPerformed
    // -----------------PLATOS DE COMIDA
    private void jbPlatosCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosCrearActionPerformed
        pestañas.setSelectedIndex(3);
        ColorOP.AnimattPlatosComida();
    }//GEN-LAST:event_jbPlatosCrearActionPerformed

    private void jbPlatosGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosGuardarActionPerformed

        try {
            // Obtener los valores de los campos
            String nombre = jtxtPlatoNombre.getText();
            String descripción = jtxtPlatoDescripcion.getText();
            String precio = jtxtPlatoPrecio.getText();
            String idPlato = jtxtPlatoID.getText();

            // Validaciones
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los nombres de los platos no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombre.length() > 100) {
                JOptionPane.showMessageDialog(null, "Los nombres de los platos deben tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (descripción.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La descripción no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (precio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El precio no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!precio.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número válido", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto Usuario y asignar valores
            PlatoComidaBO platoBO = new PlatoComidaBO();
            PlatoComida plato = new PlatoComida();

            plato.setNombre(nombre);
            plato.setDescripcion(descripción);
            plato.setPrecio(Double.parseDouble(precio));
            plato.setCategoria((String) jcbPlatosFormCat.getSelectedItem());

            // Guardar o actualizar el usuario
            if (idPlato.isEmpty()) {
                platoBO.insertar(plato);
                jtxtPlatoID.setText(String.valueOf(plato.getId_plato()));
            } else {
                plato.setId_plato(Integer.parseInt(idPlato));
                platoBO.actualizar(plato);
            }

            JOptionPane.showMessageDialog(null, "El PLATO se registró correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            pestañas.setSelectedIndex(2);
            limpiarFormUsuarioPlato();
            refreshTablaPlatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbPlatosGuardarActionPerformed

    private void jbPlatosCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosCancelarActionPerformed
        pestañas.setSelectedIndex(2);
        limpiarFormUsuarioPlato();
        refreshTablaPlatos();
        ColorOP.AnimattPlatosComida();
    }//GEN-LAST:event_jbPlatosCancelarActionPerformed
    //---------------PRODUCTOS
    private void jbProductoCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoCrearActionPerformed
        pestañas.setSelectedIndex(5);
        ColorOP.AnimattProductos();
    }//GEN-LAST:event_jbProductoCrearActionPerformed

    private void jbProductoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoGuardarActionPerformed

        try {
            // Obtener los valores de los campos
            String nombres = jtxtProductoNombre.getText();
            String detalle = jtxtProductoDetalle.getText();
            String precio = jtxtProductoPrecio.getText();
            String idProducto = jtxtProductoID.getText();

            // Validaciones
            if (nombres.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre del producto no debe estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombres.length() > 100) {
                JOptionPane.showMessageDialog(null, "El nombre del producto debe tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (detalle.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los detalles no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (precio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El precio no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!precio.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número válido", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto Usuario y asignar valores
            ProductosBO productoBO = new ProductosBO();
            Productos producto = new Productos();

            producto.setNombre(nombres);
            producto.setDetalle(detalle);
            producto.setCategoria((String) jcbProductoFormCat.getSelectedItem());
            producto.setCantidad((int) jtxtProductoCantidad.getValue());
            producto.setPrecio(Double.parseDouble(precio));

            // Guardar o actualizar el usuario
            if (idProducto.isEmpty()) {
                productoBO.insertar(producto);
                jtxtProductoID.setText(String.valueOf(producto.getId_producto()));
            } else {
                producto.setId_producto(Integer.valueOf(idProducto));
                productoBO.actualizar(producto);
            }

            JOptionPane.showMessageDialog(null, "El PRODUCTO se registró correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            pestañas.setSelectedIndex(4);
            limpiarFormProducto();
            refreshTablaProductos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbProductoGuardarActionPerformed

    private void jbProductoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoCancelarActionPerformed
        pestañas.setSelectedIndex(4);
        limpiarFormProducto();
        refreshTablaProductos();
        ColorOP.AnimattProductos();
    }//GEN-LAST:event_jbProductoCancelarActionPerformed

    private void jbAsignarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignarMeseroActionPerformed
        /*int contador = 1;
        DefaultTableModel tblModel = (DefaultTableModel) jtblAsignacion.getModel();
        String mesaSeleccionada = (String) jcbNumMesa.getSelectedItem();
        String meseroSeleccionado = (String) jcbNombreMesero.getSelectedItem();

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String SUrl, SUser, SPass;
            SUrl = "jdbc:mysql://bfsytg3rbkdzoanfa8sa-mysql.services.clever-cloud.com:3306/bfsytg3rbkdzoanfa8sa";
            SUser = "ulyfwrg1vfpqzj0x";
            SPass = "84YlnLU1hjjP2sJdHtn7";

            con = DriverManager.getConnection(SUrl, SUser, SPass);
            st = con.createStatement();

            // Obtener información del conductor
            String sqlMesero = "SELECT m.id_mesa AS conductor_id, c.apellido, c.nombre, v.id AS vehiculo_id, v.placa "
                    + "FROM conductor c "
                    + "JOIN vehiculo v ON c.vehiculo_id = v.id "
                    + "WHERE CONCAT(c.apellido, ', ', c.nombre) = '" + mesaSeleccionada + "'";
            rs = st.executeQuery(sqlMesero);

            if (rs.next()) {
                int mesaId = rs.getInt("id_mesa");
                String nombreMesero = rs.getString("apellido") + ", " + rs.getString("nombre");
                int meseroId = rs.getInt("id_mesero");

                // Insertar los datos en la tabla salida_vehiculos
                String sqlInsert = "INSERT INTO mesero (id_mesero, id_mesa) VALUES ("
                        + meseroId + ", " + mesaId + "')";
                st.executeUpdate(sqlInsert);

                // Insertar los datos en la tabla del JInternalFrame
                tblModel.addRow(new Object[]{
                    contador++,
                    nombreMesero,
                    mesaId
                });

                JOptionPane.showMessageDialog(this, "Asignación exitosa.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el mesero seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
         */
    }//GEN-LAST:event_jbAsignarMeseroActionPerformed

    private void jbEliminarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAsignacionActionPerformed
        /*// Obtiene la fila seleccionada
        int fila = jtblProductos.getSelectedRow();

        if (fila != -1) { // -1 significa que no hay fila seleccionada
            // Obtiene el ID del usuario de la columna correspondiente (asumiendo que la columna 0 es el ID)
            String id = jtblProductos.getValueAt(fila, 0).toString();

            // Confirma la eliminación
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el producto seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                try {
                    // Llama al método de eliminación en la capa de negocio o directamente en la base de datos
                    ProductosBO productoBO = new ProductosBO();
                    productoBO.eliminar(Integer.parseInt(id));

                    // Elimina la fila de la tabla
                    DefaultTableModel tblModel = (DefaultTableModel) jtblProductos.getModel();
                    tblModel.removeRow(fila);

                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar.");
        }
         */
    }//GEN-LAST:event_jbEliminarAsignacionActionPerformed
    /* ----- USUARIOS ----- */
    private void jbUsuarioMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioMostrarListaActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT id_usuario, nombres, apellidos, dni, telefono, nom_usuario, rol FROM usuario";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_usuario"));
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String nomUsuario = rs.getString("nom_usuario");
                String rol = rs.getString("rol");

                String tbData[] = {id, nombres, apellidos, dni, telefono, nomUsuario, rol};
                DefaultTableModel tblModel = (DefaultTableModel) jtblUsuarios.getModel();

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }//GEN-LAST:event_jbUsuarioMostrarListaActionPerformed

    private void jbUsuarioLimpiarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioLimpiarListaActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jtblUsuarios.getModel();
        tblModel.setRowCount(0);
    }//GEN-LAST:event_jbUsuarioLimpiarListaActionPerformed

    private void jbUsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioBuscarActionPerformed
        try {
            ArrayList<Usuario> usuarios = null;
            Usuario usuario = null;
            String cadena = jtxtUsuarioBuscar.getText().trim(); // Eliminar espacios en blanco
            DefaultTableModel modelo = (DefaultTableModel) jtblUsuarios.getModel();
            modelo.setRowCount(0); // Limpiar la tabla antes de buscar

            int op = jcbUsuarioBuscarCat.getSelectedIndex();

            UsuarioBO usuarioBO = new UsuarioBO();
            if (op == 0) { // Buscar por ID
                if (cadena.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int id = Integer.parseInt(cadena);
                    usuario = usuarioBO.buscarPorId(id);
                    if (usuario != null) {
                        Object[] registro = {
                            usuario.getId_usuario(),
                            usuario.getNombres(),
                            usuario.getApellidos(),
                            usuario.getDni(),
                            usuario.getTelefono(),
                            usuario.getNomUsuario(),
                            usuario.getRol()
                        };
                        modelo.addRow(registro);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con ese ID.", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El ID debe ser un número válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else { // Buscar por Nombres
                if (cadena.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                usuarios = usuarioBO.buscarPorUsuario(cadena); // Asegúrate de que este método esté implementado correctamente

                if (usuarios.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron usuarios con ese nombre.", "INFO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    for (Usuario u : usuarios) {
                        Object[] registro = {
                            u.getId_usuario(),
                            u.getNombres(),
                            u.getApellidos(),
                            u.getDni(),
                            u.getTelefono(),
                            u.getNomUsuario(),
                            u.getRol()
                        };
                        modelo.addRow(registro);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbUsuarioBuscarActionPerformed

    private void llenarFormularioUsuario(String[] usuarioData) {
        jtxtUsuarioIDActu.setText(usuarioData[0]); // ID
        jtxtNombresActu.setText(usuarioData[1]); // NOMBRES
        jtxtApellidosActu.setText(usuarioData[2]); // APELLIDOS
        jtxtDNIActu.setText(usuarioData[3]); // DNI
        jtxtTelefonoActu.setText(usuarioData[4]); // TELEFONO
        jtxtNomUsuarioActu.setText(usuarioData[5]); // USUARIO
        // Establecer el rol en el JComboBox
        jcbFormularioRolActu.setSelectedItem(usuarioData[6]); // ROL
    }

    private void llenarFormularioPlato(String[] platoData) {
        jtxtPlatoIDActu.setText(platoData[0]); // ID
        jtxtPlatoNombreActu.setText(platoData[1]); // NOMBRE
        jtxtPlatoDescripcionActu.setText(platoData[2]); // DESCRIPCIÓN
        jtxtPlatoPrecioActu.setText(platoData[3]); // PRECIO
        // Establecer el rol en el JComboBox
        jcbPlatosFormCatActu.setSelectedItem(platoData[6]); // CATEGORÍA
    }

    private void llenarFormularioProducto(String[] productoData) {
        jtxtProductoIDActu.setText(productoData[0]); // ID
        jtxtProductoNombreActu.setText(productoData[1]); // NOMBRES
        jtxtProductoDetalleActu.setText(productoData[2]); // APELLIDOS
        jcbProductoFormCatActu.setSelectedItem(productoData[3]); // ROL
        jtxtProductoCantidadActu.setValue(Integer.parseInt(productoData[4])); // CANTIDAD
        jtxtProductoPrecioActu.setText(productoData[5]); // DNI
    }

    private void jcbUsuarioRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbUsuarioRolItemStateChanged
        // Solo realiza la acción cuando el estado del item cambia a seleccionado
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtiene el rol seleccionado en el ComboBox
            String rolSeleccionado = jcbUsuarioRol.getSelectedItem().toString();

            // Limpia la tabla antes de agregar nuevas filas
            DefaultTableModel tblModel = (DefaultTableModel) jtblUsuarios.getModel();
            tblModel.setRowCount(0); // Esto elimina todas las filas existentes

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
                Statement st = con.createStatement();

                // Agrega una condición WHERE para filtrar según el rol seleccionado
                String sql = "SELECT id_usuario, nombres, apellidos, dni, telefono, nom_usuario, rol FROM usuario";
                if (!rolSeleccionado.equals("Todos")) { // Asume que "Todos" muestra todos los roles
                    sql += " WHERE rol = '" + rolSeleccionado + "'";
                }

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    String id = String.valueOf(rs.getInt("id_usuario"));
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    String dni = rs.getString("dni");
                    String telefono = rs.getString("telefono");
                    String nomUsuario = rs.getString("nom_usuario");
                    String rol = rs.getString("rol");

                    String tbData[] = {id, nombres, apellidos, dni, telefono, nomUsuario, rol};

                    // Agrega los datos a la tabla
                    tblModel.addRow(tbData);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jcbUsuarioRolItemStateChanged
    /* ----- PLATOS DE COMIDA ----- */
    private void jbPlatosMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosMostrarListaActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM plato_comida";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_plato"));
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String precio = String.valueOf(rs.getDouble("precio"));
                String categoria = rs.getString("categoria");

                String tbData[] = {id, nombre, descripcion, precio, categoria};
                DefaultTableModel tblModel = (DefaultTableModel) jtblPlatosComida.getModel();

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbPlatosMostrarListaActionPerformed

    private void jbPlatosListaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosListaLimpiarActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jtblPlatosComida.getModel();
        tblModel.setRowCount(0);
    }//GEN-LAST:event_jbPlatosListaLimpiarActionPerformed

    private void jbPlatosBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosBuscarActionPerformed
        try {
            ArrayList<PlatoComida> platos = null;
            PlatoComida plato = null;
            String cadena = jtxtPlatosBuscar.getText();
            DefaultTableModel modelo = (DefaultTableModel) jtblPlatosComida.getModel();
            modelo.setRowCount(0);

            int op = jcbPlatosBuscarCat.getSelectedIndex();

            PlatoComidaBO platoBO = new PlatoComidaBO();
            if (op == 0) {
                plato = new PlatoComida();
                plato = platoBO.buscarPorId(Integer.parseInt(cadena));
                if (plato == null) {
                    return;
                }

                Object[] registro = {
                    plato.getId_plato(),
                    plato.getNombre(),
                    plato.getDescripcion(),
                    plato.getPrecio(),
                    plato.getCategoria()
                };
                modelo.addRow(registro);
            } else {
                platos = new ArrayList<PlatoComida>();
                platos = platoBO.buscarPorPlato(cadena);

                for (PlatoComida p : platos) {
                    Object[] registro = {
                        p.getId_plato(),
                        p.getNombre(),
                        p.getDescripcion(),
                        p.getPrecio(),
                        p.getCategoria()
                    };
                    modelo.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbPlatosBuscarActionPerformed

    private void jcbPlatosCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPlatosCatItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String catSeleccionada = jcbPlatosCat.getSelectedItem().toString();

            DefaultTableModel tblModel = (DefaultTableModel) jtblPlatosComida.getModel();
            tblModel.setRowCount(0); // Esto elimina todas las filas existentes

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
                Statement st = con.createStatement();

                String sql = "SELECT * FROM plato_comida";
                if (!catSeleccionada.equals("Todos")) { // Asume que "Todos" muestra todos los roles
                    sql += " WHERE categoria = '" + catSeleccionada + "'";
                }

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    String id = String.valueOf(rs.getInt("id_plato"));
                    String nombre = rs.getString("nombre");
                    String descripcion = rs.getString("descripcion");
                    String precio = String.valueOf(rs.getDouble("precio"));
                    String categoria = rs.getString("categoria");

                    String tbData[] = {id, nombre, descripcion, precio, categoria};

                    // Agrega los datos a la tabla
                    tblModel.addRow(tbData);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jcbPlatosCatItemStateChanged
    /* ----- PRODUCTOS ----- */
    private void jbProductosMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosMostrarListaActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM productos";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_producto"));
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                String detalle = rs.getString("detalle");
                String cantidad = String.valueOf(rs.getInt("cantidad"));
                String precio = String.valueOf(rs.getDouble("precio"));

                String tbData[] = {id, nombre, categoria, detalle, cantidad, precio};
                DefaultTableModel tblModel = (DefaultTableModel) jtblProductos.getModel();

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbProductosMostrarListaActionPerformed

    private void jbProductosLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosLimpiarActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jtblProductos.getModel();
        tblModel.setRowCount(0);
    }//GEN-LAST:event_jbProductosLimpiarActionPerformed

    private void jbProductosBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosBuscarActionPerformed
        try {
            ArrayList<Productos> productos = null;
            Productos producto = null;
            String cadena = jtxtProductosBuscar.getText();
            DefaultTableModel modelo = (DefaultTableModel) jtblProductos.getModel();
            modelo.setRowCount(0);

            int op = jcbProductosBuscarCat.getSelectedIndex();

            ProductosBO productoBO = new ProductosBO();
            if (op == 0) {
                producto = new Productos();
                producto = productoBO.buscarPorId(Integer.parseInt(cadena));
                if (producto == null) {
                    return;
                }

                Object[] registro = {
                    producto.getId_producto(),
                    producto.getNombre(),
                    producto.getCategoria(),
                    producto.getDetalle(),
                    producto.getCantidad(),
                    producto.getPrecio()
                };
                modelo.addRow(registro);
            } else {
                productos = new ArrayList<Productos>();
                productos = productoBO.buscarPorProducto(cadena);

                for (Productos p : productos) {
                    Object[] registro = {
                        p.getId_producto(),
                        p.getNombre(),
                        p.getCategoria(),
                        p.getDetalle(),
                        p.getCantidad(),
                        p.getPrecio()
                    };
                    modelo.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbProductosBuscarActionPerformed

    private void jcbProductosCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductosCatItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String catSeleccionada = jcbProductosCat.getSelectedItem().toString();

            DefaultTableModel tblModel = (DefaultTableModel) jtblProductos.getModel();
            tblModel.setRowCount(0); // Esto elimina todas las filas existentes

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
                Statement st = con.createStatement();

                String sql = "SELECT * FROM productos";
                if (!catSeleccionada.equals("Todos")) { // Asume que "Todos" muestra todos los roles
                    sql += " WHERE categoria = '" + catSeleccionada + "'";
                }

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    String id = String.valueOf(rs.getInt("id_producto"));
                    String nombre = rs.getString("nombre");
                    String categoria = rs.getString("categoria");
                    String detalle = rs.getString("detalle");
                    String cantidad = String.valueOf(rs.getInt("cantidad"));
                    String precio = String.valueOf(rs.getDouble("precio"));

                    String tbData[] = {id, nombre, categoria, detalle, cantidad, precio};

                    // Agrega los datos a la tabla
                    tblModel.addRow(tbData);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jcbProductosCatItemStateChanged

    private void jcbFiltroAsignacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFiltroAsignacionItemStateChanged
        /*if (evt.getStateChange() == ItemEvent.SELECTED) {
            String filtro = jcbFiltroAsignacion.getSelectedItem().toString();

            DefaultTableModel tblModel = (DefaultTableModel) jtblAsignacion.getModel();
            tblModel.setRowCount(0); // Esto elimina todas las filas existentes

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://bfsytg3rbkdzoanfa8sa-mysql.services.clever-cloud.com:3306/bfsytg3rbkdzoanfa8sa", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
                Statement st = con.createStatement();

                String sql = "SELECT * FROM usuario";
                if (!filtro.equals("Todos")) { // Asume que "Todos" muestra todos los roles
                    sql += " WHERE nombres = '" + filtro + "'";
                }

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    String nombres = rs.getString("nombres");
                    String id_mesa = String.valueOf(rs.getInt("id_mesa"));

                    String tbData[] = {nombres, id_mesa};

                    // Agrega los datos a la tabla
                    tblModel.addRow(tbData);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
         */
    }//GEN-LAST:event_jcbFiltroAsignacionItemStateChanged

    private void jbUsuarioGuardarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioGuardarActuActionPerformed

        try {
            // Obtener los valores de los campos
            String nombresActu = jtxtNombresActu.getText();
            String apellidosActu = jtxtApellidosActu.getText();
            String dniActu = jtxtDNIActu.getText();
            String telefonoActu = jtxtTelefonoActu.getText();
            String nomUsuarioActu = jtxtNomUsuarioActu.getText();
            String idUsuarioActu = jtxtUsuarioIDActu.getText();

            // Validaciones
            if (nombresActu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los nombres no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!nombresActu.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Los nombres deben contener solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombresActu.length() > 100) {
                JOptionPane.showMessageDialog(null, "Los nombres deben tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (apellidosActu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los apellidos no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!apellidosActu.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Los apellidos deben contener solo letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (apellidosActu.length() > 100) {
                JOptionPane.showMessageDialog(null, "Los apellidos deben tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dniActu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El DNI no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!dniActu.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(null, "El DNI debe contener exactamente 8 dígitos numéricos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (telefonoActu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El teléfono no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!telefonoActu.matches("\\d{9}")) {
                JOptionPane.showMessageDialog(null, "El teléfono debe contener exactamente 9 dígitos numéricos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (nomUsuarioActu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nomUsuarioActu.length() > 100) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto Usuario y asignar valores
            UsuarioBO usuarioBO = new UsuarioBO();
            Usuario usuario = new Usuario();

            usuario.setNombres(nombresActu);
            usuario.setApellidos(apellidosActu);
            usuario.setDni(dniActu);
            usuario.setTelefono(telefonoActu);
            usuario.setNomUsuario(nomUsuarioActu);
            usuario.setRol((String) jcbFormularioRol.getSelectedItem());

            if (!(idUsuarioActu.isEmpty())) {
                usuario.setId_usuario(Integer.parseInt(idUsuarioActu));
                usuarioBO.actualizar(usuario);
            }

            JOptionPane.showMessageDialog(null, "El USUARIO se actualizó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            pestañas.setSelectedIndex(0);
            refreshTablaUsuarios();
            limpiarFormUsuarioUsuarios();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbUsuarioGuardarActuActionPerformed

    private void jbUsuarioCancelarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioCancelarActuActionPerformed
        pestañas.setSelectedIndex(0);
        ColorOP.AnimattUsuarios();
        limpiarFormUsuariosActu();
        refreshTablaUsuarios();
    }//GEN-LAST:event_jbUsuarioCancelarActuActionPerformed

    private void jcbUsuarioRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUsuarioRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUsuarioRolActionPerformed

    private void jtblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblUsuariosMouseClicked

        int selectedRow = jtblUsuarios.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            String[] usuarioData = new String[7];
            for (int i = 0; i < usuarioData.length; i++) {
                usuarioData[i] = jtblUsuarios.getValueAt(selectedRow, i).toString();
            }

            // Cambiar a la pestaña del formulario
            pestañas.setSelectedIndex(8);

            // Llenar el formulario con los datos del usuario seleccionado
            llenarFormularioUsuario(usuarioData);

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtblUsuariosMouseClicked

    private void jbUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioEliminarActionPerformed
        // Obtener el ID del usuario desde el label
        String id = jtxtUsuarioIDActu.getText(); // Asegúrate de que este label contenga el ID correcto

        // Verificar que el ID no esté vacío
        if (id != null && !id.isEmpty()) {
            // Confirmar la eliminación
            int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este usuario?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Crear una instancia de UsuarioBO
                    UsuarioBO usuarioBO = new UsuarioBO();
                    // Llamar al método eliminar
                    usuarioBO.eliminar(Integer.parseInt(id));
                    // Mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    pestañas.setSelectedIndex(0);
                    limpiarFormUsuariosActu();
                    refreshTablaUsuarios();
                } catch (NumberFormatException e) {
                    // Manejar el caso donde el ID no es un número válido
                    JOptionPane.showMessageDialog(this, "ID de usuario no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    // Manejar cualquier otra excepción que pueda ocurrir
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al eliminar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Manejar el caso donde el ID está vacío
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbUsuarioEliminarActionPerformed

    private void jbPlatosGuardarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosGuardarActuActionPerformed
        try {
            // Obtener los valores de los campos
            String nombre = jtxtPlatoNombre.getText();
            String descripción = jtxtPlatoDescripcion.getText();
            String precio = jtxtPlatoPrecio.getText();
            String idPlato = jtxtPlatoID.getText();

            // Validaciones
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los nombres de los platos no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombre.length() > 100) {
                JOptionPane.showMessageDialog(null, "Los nombres de los platos deben tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (descripción.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La descripción no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (precio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El precio no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto Usuario y asignar valores
            PlatoComidaBO platoBO = new PlatoComidaBO();
            PlatoComida plato = new PlatoComida();

            plato.setNombre(nombre);
            plato.setDescripcion(descripción);
            plato.setPrecio(Double.parseDouble(precio));
            plato.setCategoria((String) jcbPlatosFormCat.getSelectedItem());

            // Guardar o actualizar el usuario
            if (!(idPlato.isEmpty())) {
                plato.setId_plato(Integer.parseInt(idPlato));
                platoBO.actualizar(plato);
            }

            JOptionPane.showMessageDialog(null, "El PLATO se registró correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            pestañas.setSelectedIndex(2);
            limpiarFormUsuarioPlato();
            refreshTablaPlatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbPlatosGuardarActuActionPerformed

    private void jbPlatosCancelarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosCancelarActuActionPerformed
        pestañas.setSelectedIndex(2);
        ColorOP.AnimattPlatosComida();
        limpiarFormPlatosActu();
        refreshTablaPlatos();
    }//GEN-LAST:event_jbPlatosCancelarActuActionPerformed

    private void jtblPlatosComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPlatosComidaMouseClicked
        int selectedRow = jtblPlatosComida.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            String[] platoData = new String[5];
            for (int i = 0; i < platoData.length; i++) {
                platoData[i] = jtblPlatosComida.getValueAt(selectedRow, i).toString();
            }

            // Cambiar a la pestaña del formulario
            pestañas.setSelectedIndex(9);

            // Llenar el formulario con los datos del usuario seleccionado
            llenarFormularioPlato(platoData);

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un plato para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtblPlatosComidaMouseClicked

    private void jbPlatosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatosEliminarActionPerformed
        // Obtener el ID del usuario desde el label
        String id = jtxtPlatoIDActu.getText(); // Asegúrate de que este label contenga el ID correcto

        // Verificar que el ID no esté vacío
        if (id != null && !id.isEmpty()) {
            // Confirmar la eliminación
            int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este plato?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Crear una instancia de UsuarioBO
                    PlatoComidaBO platoBO = new PlatoComidaBO();
                    // Llamar al método eliminar
                    platoBO.eliminar(Integer.parseInt(id));
                    // Mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Plato de comida eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    pestañas.setSelectedIndex(2);
                    limpiarFormPlatosActu();
                    refreshTablaPlatos();
                } catch (NumberFormatException e) {
                    // Manejar el caso donde el ID no es un número válido
                    JOptionPane.showMessageDialog(this, "ID del plato no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    // Manejar cualquier otra excepción que pueda ocurrir
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al eliminar el plato de comida.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Manejar el caso donde el ID está vacío
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un plato para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbPlatosEliminarActionPerformed

    private void jbProductoGuardarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoGuardarActuActionPerformed
        try {
            // Obtener los valores de los campos
            String nombres = jtxtProductoNombre.getText();
            String detalle = jtxtProductoDetalle.getText();
            String precio = jtxtProductoPrecio.getText();
            String idProducto = jtxtProductoID.getText();

            // Validaciones
            if (nombres.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre del producto no debe estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombres.length() > 100) {
                JOptionPane.showMessageDialog(null, "El nombre del producto debe tener un máximo de 100 caracteres.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (detalle.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los detalles no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (precio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El precio no debe estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!precio.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "El precio debe ser un número válido", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto Usuario y asignar valores
            ProductosBO productoBO = new ProductosBO();
            Productos producto = new Productos();

            producto.setNombre(nombres);
            producto.setDetalle(detalle);
            producto.setCategoria((String) jcbProductoFormCat.getSelectedItem());
            producto.setCantidad((int) jtxtProductoCantidad.getValue());
            producto.setPrecio(Double.parseDouble(precio));

            // Guardar o actualizar el usuario
            if (!(idProducto.isEmpty())) {
                producto.setId_producto(Integer.valueOf(idProducto));
                productoBO.actualizar(producto);
            }

            JOptionPane.showMessageDialog(null, "El PRODUCTO se actualizó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            pestañas.setSelectedIndex(4);
            limpiarFormProductoActu();
            refreshTablaProductos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbProductoGuardarActuActionPerformed

    private void jbProductoCancelarActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoCancelarActuActionPerformed
        pestañas.setSelectedIndex(4);
        ColorOP.AnimattProductos();
        limpiarFormProductoActu();
        refreshTablaProductos();
    }//GEN-LAST:event_jbProductoCancelarActuActionPerformed

    private void jtblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosMouseClicked
        int selectedRow = jtblProductos.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            String[] productoData = new String[6];
            for (int i = 0; i < productoData.length; i++) {
                productoData[i] = jtblProductos.getValueAt(selectedRow, i).toString();
            }

            // Cambiar a la pestaña del formulario
            pestañas.setSelectedIndex(10);

            // Llenar el formulario con los datos del usuario seleccionado
            llenarFormularioProducto(productoData);

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtblProductosMouseClicked

    private void jbProductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoEliminarActionPerformed
        // Obtener el ID del usuario desde el label
        String id = jtxtProductoIDActu.getText(); // Asegúrate de que este label contenga el ID correcto

        // Verificar que el ID no esté vacío
        if (id != null && !id.isEmpty()) {
            // Confirmar la eliminación
            int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Crear una instancia de UsuarioBO
                    ProductosBO productoBO = new ProductosBO();
                    // Llamar al método eliminar
                    productoBO.eliminar(Integer.parseInt(id));
                    // Mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    pestañas.setSelectedIndex(4);
                    limpiarFormProductoActu();
                    refreshTablaProductos();
                } catch (NumberFormatException e) {
                    // Manejar el caso donde el ID no es un número válido
                    JOptionPane.showMessageDialog(this, "ID del producto no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    // Manejar cualquier otra excepción que pueda ocurrir
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al eliminar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Manejar el caso donde el ID está vacío
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbProductoEliminarActionPerformed

    private void jbAsignaciónMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignaciónMostrarListaActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
            Statement st = con.createStatement();

            String sql = "SELECT id_usuario, nombres, apellidos, dni, telefono, nom_usuario, rol FROM usuario";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id_usuario"));
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String nomUsuario = rs.getString("nom_usuario");
                String rol = rs.getString("rol");

                String tbData[] = {id, nombres, apellidos, dni, telefono, nomUsuario, rol};
                DefaultTableModel tblModel = (DefaultTableModel) jtblUsuarios.getModel();

                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }//GEN-LAST:event_jbAsignaciónMostrarListaActionPerformed

    private void jcbReporteFechaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbReporteFechaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String ordenSeleccionado = jcbReporteFecha.getSelectedItem().toString();
            DefaultTableModel tblModel = (DefaultTableModel) jtblReporteVentas.getModel();
            tblModel.setRowCount(0); // Limpiar la tabla

            // Conexión a la base de datos
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
                Statement st = con.createStatement();

                // Construcción de la consulta SQL
                String sql = "SELECT b.fecha, u.nombres, COALESCE(SUM(p.precio), 0) + COALESCE(SUM(pc.precio), 0) AS precio_total "
                        + "FROM boleta b "
                        + "JOIN pedido pd ON b.id_pedido = pd.id_pedido "
                        + "JOIN usuario u ON pd.id_usuario = u.id_usuario "
                        + "LEFT JOIN productos p ON pd.id_producto = p.id_producto "
                        + "LEFT JOIN plato_comida pc ON pd.id_plato = pc.id_plato "
                        + "GROUP BY b.fecha, u.nombres ";

                // Ordenar según la selección del ComboBox
                if (ordenSeleccionado.equals("Más reciente")) {
                    sql += "ORDER BY b.fecha DESC"; // Ordenar de más reciente a menos reciente
                } else if (ordenSeleccionado.equals("Menos reciente")) {
                    sql += "ORDER BY b.fecha ASC"; // Ordenar de menos reciente a más reciente
                }

                ResultSet rs = st.executeQuery(sql);

                // Procesar los resultados
                while (rs.next()) {
                    String fecha = rs.getString("fecha");
                    String nombreUsuario = rs.getString("nombres");
                    String precioTotal = String.valueOf(rs.getDouble("precio_total"));

                    String tbData[] = {fecha, nombreUsuario, precioTotal};

                    // Agrega los datos a la tabla
                    tblModel.addRow(tbData);
                }
                
                // Actualizar el JTextField con el número de filas
                jtxtReporteTotal.setText(String.valueOf(tblModel.getRowCount()));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jcbReporteFechaItemStateChanged

    private void jcbReporteMeseroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbReporteMeseroItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String nombreUsuarioSeleccionado = jcbReporteMesero.getSelectedItem().toString();
            DefaultTableModel tblModel = (DefaultTableModel) jtblReporteVentas.getModel();
            tblModel.setRowCount(0); // Limpiar la tabla

            // Conexión a la base de datos
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://ulyfwrg1vfpqzj0x:84YlnLU1hjjP2sJdHtn7@hv-par8-022.clvrcld.net:13867/b7n2pybqwwnmmvd4p8wd", "ulyfwrg1vfpqzj0x", "84YlnLU1hjjP2sJdHtn7");
                Statement st = con.createStatement();

                // Construcción de la consulta SQL
                String sql = "SELECT b.fecha, u.nombres, COALESCE(SUM(p.precio), 0) + COALESCE(SUM(pc.precio), 0) AS precio_total "
                        + "FROM boleta b "
                        + "JOIN pedido pd ON b.id_pedido = pd.id_pedido "
                        + "JOIN usuario u ON pd.id_usuario = u.id_usuario "
                        + "LEFT JOIN productos p ON pd.id_producto = p.id_producto "
                        + "LEFT JOIN plato_comida pc ON pd.id_plato = pc.id_plato "
                        + "WHERE u.nombres = ? " // Filtrar por nombre de usuario
                        + "GROUP BY b.fecha, u.nombres";

                // Usar PreparedStatement para evitar inyecciones SQL
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nombreUsuarioSeleccionado); // Establecer el nombre de usuario seleccionado

                ResultSet rs = pst.executeQuery();

                // Procesar los resultados
                while (rs.next()) {
                    String fecha = rs.getString("fecha");
                    String nombreUsuario = rs.getString("nombres");
                    String precioTotal = String.valueOf(rs.getDouble("precio_total"));

                    String tbData[] = {fecha, nombreUsuario, precioTotal};

                    // Agrega los datos a la tabla
                    tblModel.addRow(tbData);
                }

                // Actualizar el JTextField con el número de filas
                jtxtReporteTotal.setText(String.valueOf(tblModel.getRowCount()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jcbReporteMeseroItemStateChanged

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
            java.util.logging.Logger.getLogger(AdministradorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdministradorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static componentes.PanelGradient btnPlatosComida;
    public static componentes.PanelGradient btnProductos;
    public static componentes.PanelGradient btnSalir;
    public static componentes.PanelGradient btnUsuarios;
    public static componentes.PanelGradient btnVentas;
    private componentes.PanelRound fondo_beige;
    private componentes.PanelRound fondo_beige1;
    private componentes.PanelRound fondo_beige10;
    private componentes.PanelRound fondo_beige2;
    private componentes.PanelRound fondo_beige3;
    private componentes.PanelRound fondo_beige4;
    private componentes.PanelRound fondo_beige5;
    private componentes.PanelRound fondo_beige6;
    private componentes.PanelRound fondo_beige7;
    private componentes.PanelRound fondo_beige8;
    private componentes.PanelRound fondo_beige9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAsignaciónMostrarLista;
    private javax.swing.JButton jbAsignarMesero;
    private javax.swing.JButton jbEliminarAsignacion;
    private javax.swing.JButton jbPlatosBuscar;
    private javax.swing.JButton jbPlatosCancelar;
    private javax.swing.JButton jbPlatosCancelarActu;
    private javax.swing.JButton jbPlatosCrear;
    private javax.swing.JButton jbPlatosEliminar;
    private javax.swing.JButton jbPlatosGuardar;
    private javax.swing.JButton jbPlatosGuardarActu;
    private javax.swing.JButton jbPlatosListaLimpiar;
    private javax.swing.JButton jbPlatosMostrarLista;
    private javax.swing.JButton jbProductoCancelar;
    private javax.swing.JButton jbProductoCancelarActu;
    private javax.swing.JButton jbProductoCrear;
    private javax.swing.JButton jbProductoEliminar;
    private javax.swing.JButton jbProductoGuardar;
    private javax.swing.JButton jbProductoGuardarActu;
    private javax.swing.JButton jbProductosBuscar;
    private javax.swing.JButton jbProductosLimpiar;
    private javax.swing.JButton jbProductosMostrarLista;
    private javax.swing.JButton jbUsuarioBuscar;
    private javax.swing.JButton jbUsuarioCancelar;
    private javax.swing.JButton jbUsuarioCancelarActu;
    private javax.swing.JButton jbUsuarioCrear;
    private javax.swing.JButton jbUsuarioEliminar;
    private javax.swing.JButton jbUsuarioGuardar;
    private javax.swing.JButton jbUsuarioGuardarActu;
    private javax.swing.JButton jbUsuarioLimpiarLista;
    private javax.swing.JButton jbUsuarioMostrarLista;
    private javax.swing.JComboBox<String> jcbFiltroAsignacion;
    private javax.swing.JComboBox<String> jcbFormularioRol;
    private javax.swing.JComboBox<String> jcbFormularioRolActu;
    private javax.swing.JComboBox<String> jcbNombreMesero;
    private javax.swing.JComboBox<String> jcbNumMesa;
    private javax.swing.JComboBox<String> jcbPlatosBuscarCat;
    private javax.swing.JComboBox<String> jcbPlatosCat;
    private javax.swing.JComboBox<String> jcbPlatosFormCat;
    private javax.swing.JComboBox<String> jcbPlatosFormCatActu;
    private javax.swing.JComboBox<String> jcbProductoFormCat;
    private javax.swing.JComboBox<String> jcbProductoFormCatActu;
    private javax.swing.JComboBox<String> jcbProductosBuscarCat;
    private javax.swing.JComboBox<String> jcbProductosCat;
    private javax.swing.JComboBox<String> jcbReporteFecha;
    private javax.swing.JComboBox<String> jcbReporteMesero;
    private javax.swing.JComboBox<String> jcbUsuarioBuscarCat;
    private javax.swing.JComboBox<String> jcbUsuarioRol;
    private javax.swing.JLabel jlApellidos1;
    private javax.swing.JLabel jlApellidosActu;
    private javax.swing.JLabel jlBuscarPor;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCategoria1;
    private javax.swing.JLabel jlContra2;
    private javax.swing.JLabel jlDNI1;
    private javax.swing.JLabel jlDNIActu;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlDescripcion1;
    private javax.swing.JLabel jlFiltros;
    private javax.swing.JLabel jlFiltros1;
    private javax.swing.JLabel jlFiltros2;
    private javax.swing.JLabel jlFiltros3;
    private javax.swing.JLabel jlFiltros4;
    private javax.swing.JLabel jlFormPlatos;
    private javax.swing.JLabel jlFormPlatos1;
    private javax.swing.JLabel jlFormulario1;
    private javax.swing.JLabel jlFormularioActu;
    private javax.swing.JLabel jlFormularioRol1;
    private javax.swing.JLabel jlFormularioRolActu;
    private javax.swing.JLabel jlMesero;
    private javax.swing.JLabel jlNomUsuario1;
    private javax.swing.JLabel jlNomUsuarioActu;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombreMesero;
    private javax.swing.JLabel jlNombres;
    private javax.swing.JLabel jlNombres2;
    private javax.swing.JLabel jlNombres3;
    private javax.swing.JLabel jlNombresActu;
    private javax.swing.JLabel jlNumMesa;
    private javax.swing.JLabel jlPlatoID;
    private javax.swing.JLabel jlPlatoID1;
    private javax.swing.JLabel jlPlatosBuscarPor;
    private javax.swing.JLabel jlPlatosCat;
    public static javax.swing.JLabel jlPlatosComida;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlPrecio1;
    private javax.swing.JLabel jlProductoCantidad;
    private javax.swing.JLabel jlProductoCantidad1;
    private javax.swing.JLabel jlProductoCategoria;
    private javax.swing.JLabel jlProductoCategoria1;
    private javax.swing.JLabel jlProductoDetalle;
    private javax.swing.JLabel jlProductoDetalle1;
    private javax.swing.JLabel jlProductoFormulario;
    private javax.swing.JLabel jlProductoFormulario1;
    private javax.swing.JLabel jlProductoID;
    private javax.swing.JLabel jlProductoID1;
    private javax.swing.JLabel jlProductoNombre;
    private javax.swing.JLabel jlProductoNombre1;
    private javax.swing.JLabel jlProductoPrecio;
    private javax.swing.JLabel jlProductoPrecio1;
    public static javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProductosBuscarPor;
    private javax.swing.JLabel jlProductosCat;
    private javax.swing.JLabel jlReporteFecha;
    private javax.swing.JLabel jlReporteMesero;
    private javax.swing.JLabel jlReporteTotal;
    private javax.swing.JLabel jlRol;
    public static javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jlTelefono1;
    private javax.swing.JLabel jlTelefonoActu;
    private javax.swing.JLabel jlTituloAsignacion1;
    private javax.swing.JLabel jlTituloListaPlatos;
    private javax.swing.JLabel jlTituloListaProductos;
    private javax.swing.JLabel jlTituloListaUsuarios;
    private javax.swing.JLabel jlTituloReporte;
    public static javax.swing.JLabel jlUsuarios;
    public static javax.swing.JLabel jlVentas;
    private componentes.PanelRound jpFormPlatos;
    private componentes.PanelRound jpFormPlatos1;
    private componentes.PanelRound jpFormulario1;
    private componentes.PanelRound jpFormularioActu;
    private componentes.PanelRound jpMesero;
    private componentes.PanelRound jpPlatosCat;
    private componentes.PanelRound jpProductoFormulario;
    private componentes.PanelRound jpProductoFormulario1;
    private componentes.PanelRound jpProductosCat;
    private componentes.PanelRound jpReporteFecha;
    private componentes.PanelRound jpReporteMesero;
    private componentes.PanelRound jpRol;
    private componentes.PanelRound jpTituloAsignacion1;
    private componentes.PanelRound jpTituloListaPlatos;
    private componentes.PanelRound jpTituloListaProductos;
    private componentes.PanelRound jpTituloListaUsuarios;
    private componentes.PanelRound jpTituloReporte;
    private javax.swing.JTable jtblAsignacion;
    private javax.swing.JTable jtblPlatosComida;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JTable jtblReporteVentas;
    private javax.swing.JTable jtblUsuarios;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtApellidosActu;
    private javax.swing.JPasswordField jtxtContra;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtDNIActu;
    private javax.swing.JTextField jtxtNomUsuario;
    private javax.swing.JTextField jtxtNomUsuarioActu;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtNombresActu;
    private javax.swing.JTextArea jtxtPlatoDescripcion;
    private javax.swing.JTextArea jtxtPlatoDescripcionActu;
    private javax.swing.JTextField jtxtPlatoID;
    private javax.swing.JTextField jtxtPlatoIDActu;
    private javax.swing.JTextField jtxtPlatoNombre;
    private javax.swing.JTextField jtxtPlatoNombreActu;
    private javax.swing.JTextField jtxtPlatoPrecio;
    private javax.swing.JTextField jtxtPlatoPrecioActu;
    private javax.swing.JTextField jtxtPlatosBuscar;
    private javax.swing.JSpinner jtxtProductoCantidad;
    private javax.swing.JSpinner jtxtProductoCantidadActu;
    private javax.swing.JTextArea jtxtProductoDetalle;
    private javax.swing.JTextArea jtxtProductoDetalleActu;
    private javax.swing.JTextField jtxtProductoID;
    private javax.swing.JTextField jtxtProductoIDActu;
    private javax.swing.JTextField jtxtProductoNombre;
    private javax.swing.JTextField jtxtProductoNombreActu;
    private javax.swing.JTextField jtxtProductoPrecio;
    private javax.swing.JTextField jtxtProductoPrecioActu;
    private javax.swing.JTextField jtxtProductosBuscar;
    private javax.swing.JTextField jtxtReporteTotal;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextField jtxtTelefonoActu;
    private javax.swing.JTextField jtxtUsuarioBuscar;
    private javax.swing.JTextField jtxtUsuarioID;
    private javax.swing.JTextField jtxtUsuarioIDActu;
    private javax.swing.JPanel logoPolleria;
    private componentes.PanelRound menu;
    private javax.swing.JPanel page_asignacion;
    private javax.swing.JPanel page_platosComida;
    private javax.swing.JPanel page_platosComidaFormulario;
    private javax.swing.JPanel page_platosComidaFormularioActu;
    private javax.swing.JPanel page_productos;
    private javax.swing.JPanel page_productosFormulario;
    private javax.swing.JPanel page_productosFormularioActu;
    private javax.swing.JPanel page_reporteVentas;
    private javax.swing.JPanel page_usuarios;
    private javax.swing.JPanel page_usuariosFormulario;
    private javax.swing.JPanel page_usuariosFormularioActu;
    private javax.swing.JTabbedPane pestañas;
    // End of variables declaration//GEN-END:variables
}
