package PresentationLayer;
import Connection.UConnection;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.HashMap;
import java.util.Map;

public class MeseroPedido extends javax.swing.JFrame {

    private final String logo_reporte = "/icons/reporte.png";
    private final String logo_mesa = "/icons/mesa.png";
    private final String logo_mesa1 = "/icons/mesa1.png";
    private final String logo_salir = "/icons/cerrar-sesion.png";
    private Map<String, String> mapaTipos = new HashMap<>();

    public MeseroPedido() {
        initComponents();
        cargarDatosEnJtblCarta();
        setLocationRelativeTo(null);

        jtblCarta.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblCarta.getTableHeader().setOpaque(false);
        jtblCarta.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblCarta.getTableHeader().setForeground(Color.BLACK);
        jtblCarta.setRowHeight(20);

        jtblPedido.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jtblPedido.getTableHeader().setOpaque(false);
        jtblPedido.getTableHeader().setBackground(new Color(254, 233, 119));
        jtblPedido.getTableHeader().setForeground(Color.BLACK);
        jtblPedido.setRowHeight(20);
    }
    //para poder sumar el total del segundo apartado
    // Método para actualizar el precio total en jtxtPrecioTotal
private void actualizarPrecioTotal() {
    DefaultTableModel modelPedido = (DefaultTableModel) jtblPedido.getModel();
    double precioTotal = 0;
    
    // Sumar todos los precios de la tabla jtblPedido
    for (int i = 0; i < modelPedido.getRowCount(); i++) {
        precioTotal += (double) modelPedido.getValueAt(i, 4); // Suponiendo que la columna 4 es el precio total
    }

    // Mostrar el precio total en jtxtPrecioTotal
    jtxtPrecioTotal.setText(String.format("S/. %.2f", precioTotal)); // Puedes formatear el precio si lo deseas
}
 //para poder saber si es producto o comida
private boolean esProducto(String idProducto) {
    // Implementa lógica para determinar si el ID pertenece a productos
    // Por ejemplo, consulta la base de datos o usa un prefijo específico
    return idProducto.startsWith("P"); // Ejemplo: los productos tienen prefijo "P"
}


private boolean esPlato(int idProductoInt) {
    // Aquí deberías agregar la lógica que determina si el idProductoInt corresponde a un plato
    // Por ejemplo, verificando si el idProductoInt está en una tabla de platos en la base de datos.
    return idProductoInt > 1000; // Esto es solo un ejemplo, ajusta según tu lógica
}
    //para poder  dar click al panel y aparezaca en otro lado xd
    private void configurarEventos() {
    jtblCarta.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jtblCartaMouseClicked(evt);
        }
    });
}

    private Icon getIcono(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(45, 45, 0));
    }

    private Icon getMesa(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(150, 120, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNaranja = new javax.swing.JPanel();
        jpBeigeCarta = new componentes.PanelRound();
        jlFiltros = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jlBuscar = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jpPrecio = new componentes.PanelRound();
        jlPrecio = new javax.swing.JLabel();
        jpCategoria = new componentes.PanelRound();
        jlCategoria = new javax.swing.JLabel();
        jcbPrecio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCarta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        separador = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        jpBeigePedido = new componentes.PanelRound();
        jlPrecioTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPedido = new javax.swing.JTable();
        jlPedido = new javax.swing.JLabel();
        jtxtMesa = new javax.swing.JTextField();
        jbFinalizar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jtxtPrecioTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 545));
        setMinimumSize(new java.awt.Dimension(1054, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 545));
        setSize(new java.awt.Dimension(1050, 545));

        jpNaranja.setBackground(new java.awt.Color(255, 125, 14));
        jpNaranja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBeigeCarta.setBackground(new java.awt.Color(255, 253, 247));
        jpBeigeCarta.setRoundBottomLeft(30);
        jpBeigeCarta.setRoundBottomRight(30);
        jpBeigeCarta.setRoundTopLeft(30);
        jpBeigeCarta.setRoundTopRight(30);
        jpBeigeCarta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlFiltros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlFiltros.setText("FILTROS:");
        jpBeigeCarta.add(jlFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jtxtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarActionPerformed(evt);
            }
        });
        jpBeigeCarta.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 240, 30));

        jlBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBuscar.setText("BUSCAR:");
        jpBeigeCarta.add(jlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jcbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Plato de fondo", "Postres" }));
        jcbCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcbCategoria.setFocusable(false);
        jcbCategoria.setOpaque(true);
        jcbCategoria.setRequestFocusEnabled(false);
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });
        jpBeigeCarta.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 180, 30));

        jpPrecio.setBackground(new java.awt.Color(254, 233, 119));
        jpPrecio.setRoundBottomLeft(20);
        jpPrecio.setRoundBottomRight(20);
        jpPrecio.setRoundTopLeft(20);
        jpPrecio.setRoundTopRight(20);

        jlPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrecio.setText("PRECIO");

        javax.swing.GroupLayout jpPrecioLayout = new javax.swing.GroupLayout(jpPrecio);
        jpPrecio.setLayout(jpPrecioLayout);
        jpPrecioLayout.setHorizontalGroup(
            jpPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrecioLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jlPrecio)
                .addGap(35, 35, 35))
        );
        jpPrecioLayout.setVerticalGroup(
            jpPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrecioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBeigeCarta.add(jpPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        jpCategoria.setBackground(new java.awt.Color(254, 233, 119));
        jpCategoria.setRoundBottomLeft(20);
        jpCategoria.setRoundBottomRight(20);
        jpCategoria.setRoundTopLeft(20);
        jpCategoria.setRoundTopRight(20);

        jlCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCategoria.setText("CATEGORÍA");

        javax.swing.GroupLayout jpCategoriaLayout = new javax.swing.GroupLayout(jpCategoria);
        jpCategoria.setLayout(jpCategoriaLayout);
        jpCategoriaLayout.setHorizontalGroup(
            jpCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCategoriaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlCategoria)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpCategoriaLayout.setVerticalGroup(
            jpCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCategoriaLayout.createSequentialGroup()
                .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpBeigeCarta.add(jpCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 130, 30));

        jcbPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De menor a mayor", "De mayor a menor" }));
        jcbPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcbPrecio.setFocusable(false);
        jcbPrecio.setLightWeightPopupEnabled(false);
        jcbPrecio.setOpaque(true);
        jcbPrecio.setRequestFocusEnabled(false);
        jcbPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPrecioActionPerformed(evt);
            }
        });
        jpBeigeCarta.add(jcbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, 30));

        jtblCarta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtblCarta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtblCarta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "CATEGORÍA", "PRECIO UNITARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblCartaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblCarta);

        jpBeigeCarta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 460, 290));

        jButton1.setBackground(new java.awt.Color(254, 233, 119));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(62, 22));
        jButton1.setMinimumSize(new java.awt.Dimension(62, 22));
        jButton1.setPreferredSize(new java.awt.Dimension(62, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpBeigeCarta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 130, 30));

        jpNaranja.add(jpBeigeCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 500));

        separador.setBackground(new java.awt.Color(0, 0, 0));
        separador.setMaximumSize(new java.awt.Dimension(2, 545));
        separador.setMinimumSize(new java.awt.Dimension(2, 545));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jpNaranja.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 0, 2, 545));

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
        jpNaranja.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 0, 60, 40));

        jpBeigePedido.setBackground(new java.awt.Color(255, 253, 247));
        jpBeigePedido.setRoundBottomLeft(30);
        jpBeigePedido.setRoundBottomRight(30);
        jpBeigePedido.setRoundTopLeft(30);
        jpBeigePedido.setRoundTopRight(30);
        jpBeigePedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrecioTotal.setText("PRECIO TOTAL:");
        jpBeigePedido.add(jlPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 40));

        jtblPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "PRECIO U.", "CANTIDAD", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtblPedido);

        jpBeigePedido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 460, 320));

        jlPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPedido.setText("PEDIDO:");
        jpBeigePedido.add(jlPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jtxtMesa.setEditable(false);
        jtxtMesa.setBackground(new java.awt.Color(229, 227, 227));
        jtxtMesa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxtMesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtMesa.setText("MESA 20");
        jtxtMesa.setBorder(null);
        jtxtMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMesaActionPerformed(evt);
            }
        });
        jpBeigePedido.add(jtxtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, 30));

        jbFinalizar.setBackground(new java.awt.Color(209, 32, 31));
        jbFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jbFinalizar.setText("FINALIZAR PEDIDO");
        jbFinalizar.setBorder(null);
        jbFinalizar.setOpaque(true);
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });
        jpBeigePedido.add(jbFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 160, 40));

        jbQuitar.setBackground(new java.awt.Color(63, 92, 112));
        jbQuitar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbQuitar.setForeground(new java.awt.Color(255, 255, 255));
        jbQuitar.setText("QUITAR");
        jbQuitar.setBorder(null);
        jbQuitar.setFocusPainted(false);
        jbQuitar.setFocusable(false);
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });
        jpBeigePedido.add(jbQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 100, 40));

        jtxtPrecioTotal.setEditable(false);
        jtxtPrecioTotal.setBackground(new java.awt.Color(229, 227, 227));
        jtxtPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxtPrecioTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPrecioTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtxtPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPrecioTotalActionPerformed(evt);
            }
        });
        jpBeigePedido.add(jtxtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 40));

        jpNaranja.add(jpBeigePedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 480, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNaranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNaranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
        DefaultTableModel modelPedido = (DefaultTableModel) jtblPedido.getModel();

    if (modelPedido.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No hay pedidos para finalizar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String sqlInsert = "INSERT INTO pedido (id_producto, id_plato, cantidad, precio_total, fecha_hora, id_mesa, id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";
    boolean pedidoRealizado = false;

    try (Connection conn = UConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sqlInsert)) {

        // Obtener la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatter);

        // Iterar sobre cada fila en jtblPedido
        for (int i = 0; i < modelPedido.getRowCount(); i++) {
            try {
                // Obtener los valores de la fila
                String idProducto = (String) modelPedido.getValueAt(i, 0); // Columna 0: id_producto
                int cantidad = (int) modelPedido.getValueAt(i, 3); // Columna 3: cantidad
                double precioTotal = (double) modelPedido.getValueAt(i, 4); // Columna 4: precio total

                // Validar que idProducto sea un valor numérico
                int idProductoInt = 0;
                try {
                    idProductoInt = Integer.parseInt(idProducto); // Intentamos convertir a entero
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El id del producto en la fila " + (i + 1) + " no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue; // Si no es un número, pasamos a la siguiente fila
                }

                // Definir valores predeterminados para id_mesa e id_usuario
                int idMesa = 1; // Valor predeterminado para id_mesa
                int idUsuario = 1; // Valor predeterminado para id_usuario

                // Definir id_plato a 0 si es un producto y dejarlo nulo solo si es necesario
                int idPlato = 0; // Aquí asignamos 0 cuando no es un plato

                // Si el idProductoInt corresponde a un plato, asignamos su id a id_plato
                // (Suponiendo que si idProducto corresponde a un plato, puedes usar una lógica para obtener su id)
                if (esPlato(idProductoInt)) { // Método ficticio para verificar si es un plato
                    idPlato = idProductoInt; // Usamos idProducto como id_plato
                    stmt.setInt(2, idPlato); // Establecer id_plato
                } else {
                    stmt.setNull(2, java.sql.Types.INTEGER); // Dejar id_plato como NULL si no es un plato
                }

                stmt.setInt(1, idProductoInt); // id_producto (podría ser de productos o platos)
                stmt.setInt(3, cantidad); // cantidad
                stmt.setDouble(4, precioTotal); // precio_total
                stmt.setString(5, fechaHoraFormateada); // fecha_hora
                stmt.setInt(6, idMesa); // id_mesa
                stmt.setInt(7, idUsuario); // id_usuario

                stmt.addBatch();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error procesando fila " + (i + 1) + ": " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Ejecutar lote de inserciones
        int[] resultados = stmt.executeBatch();
        for (int resultado : resultados) {
            if (resultado > 0) {
                pedidoRealizado = true;
                break;
            }
        }

        if (pedidoRealizado) {
            JOptionPane.showMessageDialog(this, "Pedido realizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            modelPedido.setRowCount(0); // Limpiar la tabla de pedidos
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar el pedido. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al almacenar los pedidos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbFinalizarActionPerformed
  
//quitar productos seleccionados 
    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
          // Obtiene la fila seleccionada en jtblPedido
    int filaSeleccionada = jtblPedido.getSelectedRow();
    
    if (filaSeleccionada != -1) {
        // Confirma si realmente desea eliminar el producto
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este producto?", 
                                                      "Confirmar eliminación", JOptionPane.YES_NO_OPTION, 
                                                      JOptionPane.WARNING_MESSAGE);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            // Elimina la fila seleccionada de jtblPedido
            DefaultTableModel modelPedido = (DefaultTableModel) jtblPedido.getModel();
            modelPedido.removeRow(filaSeleccionada); // Elimina la fila de la tabla

            // Actualiza el precio total
            actualizarPrecioTotal();
        }
    } else {
        // Si no se seleccionó ningún producto, muestra un mensaje de advertencia
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para eliminar.", 
                                      "Advertencia", JOptionPane.WARNING_MESSAGE);
    }  
    }//GEN-LAST:event_jbQuitarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jtxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarActionPerformed
         
    }//GEN-LAST:event_jtxtBuscarActionPerformed
//darle click al producto y que apereza en la otra tabla 
    private void jtblCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblCartaMouseClicked

          int filaSeleccionada = jtblCarta.getSelectedRow();

    if (filaSeleccionada != -1) {
        // Obtén la información del producto seleccionado
        String idProducto = (String) jtblCarta.getValueAt(filaSeleccionada, 0); // id_producto
        String nombreProducto = (String) jtblCarta.getValueAt(filaSeleccionada, 1); // nombre
        double precioProducto = (Double) jtblCarta.getValueAt(filaSeleccionada, 3); // precio

        // Definir el tipo del producto: "producto" o "plato_comida"
        String tipoProducto = "producto"; // Asigna el tipo correcto, este es solo un ejemplo

        // Buscar si el producto ya está en la tabla de pedidos (jtblPedido) por nombre
        DefaultTableModel modelPedido = (DefaultTableModel) jtblPedido.getModel();
        boolean productoExistente = false;
        int filaExistente = -1;

        for (int i = 0; i < modelPedido.getRowCount(); i++) {
            if (modelPedido.getValueAt(i, 1).equals(nombreProducto)) { // Compara por nombre
                productoExistente = true;
                filaExistente = i;
                break;
            }
        }

        if (productoExistente) {
            // Si el producto ya existe en la tabla de pedidos, actualiza la cantidad y el total
            int cantidadActual = (int) modelPedido.getValueAt(filaExistente, 3); // columna 3 es la cantidad
            double totalActual = (double) modelPedido.getValueAt(filaExistente, 4); // columna 4 es el precio total

            // Actualiza la cantidad y el total
            int nuevaCantidad = cantidadActual + 1; // Se suma la cantidad
            double nuevoTotal = nuevaCantidad * precioProducto; // Recalcula el total

            // Actualiza la fila
            modelPedido.setValueAt(nuevaCantidad, filaExistente, 3); // Actualiza la cantidad
            modelPedido.setValueAt(nuevoTotal, filaExistente, 4); // Actualiza el precio total
        } else {
            // Si el producto no está en la tabla de pedidos, agrégalo
            Object[] nuevaFila = new Object[] {
                idProducto,          // id_producto (columna 0)
                nombreProducto,      // nombre (columna 1)
                precioProducto,      // precio unitario (columna 2)
                1,                   // cantidad inicial (columna 3)
                precioProducto,      // precio total (columna 4)
                tipoProducto         // Tipo de producto (columna 5)
            };
            modelPedido.addRow(nuevaFila);
        }

        // Mostrar alerta de que el producto se ha agregado
        JOptionPane.showMessageDialog(this, "Comida agregada al pedido", "Producto agregado", JOptionPane.INFORMATION_MESSAGE);

        // Actualiza el precio total (si tienes un método para eso)
        actualizarPrecioTotal();
    }   
    }//GEN-LAST:event_jtblCartaMouseClicked


//CARGAR DATOS A LA TABLA
    private List<Object[]> obtenerTodosLosProductosYPlatos() {
    List<Object[]> lista = new ArrayList<>();
    String sqlProductos = "SELECT id_producto AS id, nombre, categoria, precio FROM productos";
    String sqlPlatos = "SELECT id_plato AS id, nombre, categoria, precio FROM plato_comida";

    try (Connection conn = UConnection.getConnection();
         PreparedStatement stmtProductos = conn.prepareStatement(sqlProductos);
         PreparedStatement stmtPlatos = conn.prepareStatement(sqlPlatos)) {

        // Consultar todos los productos
        try (ResultSet rsProductos = stmtProductos.executeQuery()) {
            while (rsProductos.next()) {
                Object[] fila = new Object[]{
                    rsProductos.getString("id"),
                    rsProductos.getString("nombre"),
                    rsProductos.getString("categoria"),
                    rsProductos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

        // Consultar todos los platos
        try (ResultSet rsPlatos = stmtPlatos.executeQuery()) {
            while (rsPlatos.next()) {
                Object[] fila = new Object[]{
                    rsPlatos.getString("id"),
                    rsPlatos.getString("nombre"),
                    rsPlatos.getString("categoria"),
                    rsPlatos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return lista;
}
    //2DOPASO
    private void cargarDatosEnJtblCarta() {
    // Llama al método para obtener todos los datos
    List<Object[]> datos = obtenerTodosLosProductosYPlatos();

    // Obtiene el modelo de la tabla y la limpia
    DefaultTableModel model = (DefaultTableModel) jtblCarta.getModel();
    model.setRowCount(0); // Limpia cualquier dato existente en la tabla

    // Agrega los datos a la tabla
    for (Object[] fila : datos) {
        model.addRow(fila);
    }
}

//buscar productos y comida
    private List<Object[]> buscarProductosYPlatos(String textoBusqueda) {
    List<Object[]> lista = new ArrayList<>();
    String sqlProductos = "SELECT id_producto AS id, nombre, categoria, precio " +
                          "FROM productos " +
                          "WHERE id_producto LIKE ? OR nombre LIKE ? OR categoria LIKE ? OR precio LIKE ?";
    String sqlPlatos = "SELECT id_plato AS id, nombre, categoria, precio " +
                       "FROM plato_comida " +
                       "WHERE id_plato LIKE ? OR nombre LIKE ? OR categoria LIKE ? OR precio LIKE ?";

    try (Connection conn = UConnection.getConnection();
         PreparedStatement stmtProductos = conn.prepareStatement(sqlProductos);
         PreparedStatement stmtPlatos = conn.prepareStatement(sqlPlatos)) {

        // Parámetros para la búsqueda en ambas tablas
        String parametroBusqueda = "%" + textoBusqueda + "%";
        stmtProductos.setString(1, parametroBusqueda);
        stmtProductos.setString(2, parametroBusqueda);
        stmtProductos.setString(3, parametroBusqueda);
        stmtProductos.setString(4, parametroBusqueda);

        stmtPlatos.setString(1, parametroBusqueda);
        stmtPlatos.setString(2, parametroBusqueda);
        stmtPlatos.setString(3, parametroBusqueda);
        stmtPlatos.setString(4, parametroBusqueda);

        // Ejecutar consulta para productos
        try (ResultSet rsProductos = stmtProductos.executeQuery()) {
            while (rsProductos.next()) {
                Object[] fila = new Object[]{
                    rsProductos.getString("id"),
                    rsProductos.getString("nombre"),
                    rsProductos.getString("categoria"),
                    rsProductos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

        // Ejecutar consulta para platos
        try (ResultSet rsPlatos = stmtPlatos.executeQuery()) {
            while (rsPlatos.next()) {
                Object[] fila = new Object[]{
                    rsPlatos.getString("id"),
                    rsPlatos.getString("nombre"),
                    rsPlatos.getString("categoria"),
                    rsPlatos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al buscar productos y platos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return lista;
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String textoBusqueda = jtxtBuscar.getText().trim(); // Obtiene el texto de búsqueda

    if (textoBusqueda.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un texto para buscar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Llama a la función para obtener los resultados desde ambas tablas
    List<Object[]> resultados = buscarProductosYPlatos(textoBusqueda);

    // Cargar los resultados en la tabla
    DefaultTableModel model = (DefaultTableModel) jtblCarta.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de mostrar resultados

    if (resultados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron productos o platos con los criterios de búsqueda.", "Aviso", JOptionPane.WARNING_MESSAGE);
    } else {
        for (Object[] fila : resultados) {
            model.addRow(fila); // Agrega cada fila de datos al modelo
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    //Ordenar de mayor a menor
   private List<Object[]> buscarProductosYPlatosOrdenados(String textoBusqueda, String orden) {
    List<Object[]> lista = new ArrayList<>();
    String sqlProductos = "SELECT id_producto AS id, nombre, categoria, precio " +
                          "FROM productos " +
                          "WHERE id_producto LIKE ? OR nombre LIKE ? OR categoria LIKE ? OR precio LIKE ? " +
                          "ORDER BY precio " + orden;  // Orden dinámico (ASC o DESC)
    String sqlPlatos = "SELECT id_plato AS id, nombre, categoria, precio " +
                       "FROM plato_comida " +
                       "WHERE id_plato LIKE ? OR nombre LIKE ? OR categoria LIKE ? OR precio LIKE ? " +
                       "ORDER BY precio " + orden;  // Orden dinámico (ASC o DESC)

    try (Connection conn = UConnection.getConnection();
         PreparedStatement stmtProductos = conn.prepareStatement(sqlProductos);
         PreparedStatement stmtPlatos = conn.prepareStatement(sqlPlatos)) {

        // Parámetros para la búsqueda en ambas tablas
        String parametroBusqueda = "%" + textoBusqueda + "%";
        stmtProductos.setString(1, parametroBusqueda);
        stmtProductos.setString(2, parametroBusqueda);
        stmtProductos.setString(3, parametroBusqueda);
        stmtProductos.setString(4, parametroBusqueda);

        stmtPlatos.setString(1, parametroBusqueda);
        stmtPlatos.setString(2, parametroBusqueda);
        stmtPlatos.setString(3, parametroBusqueda);
        stmtPlatos.setString(4, parametroBusqueda);

        // Ejecutar consulta para productos
        try (ResultSet rsProductos = stmtProductos.executeQuery()) {
            while (rsProductos.next()) {
                Object[] fila = new Object[]{
                    rsProductos.getString("id"),
                    rsProductos.getString("nombre"),
                    rsProductos.getString("categoria"),
                    rsProductos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

        // Ejecutar consulta para platos
        try (ResultSet rsPlatos = stmtPlatos.executeQuery()) {
            while (rsPlatos.next()) {
                Object[] fila = new Object[]{
                    rsPlatos.getString("id"),
                    rsPlatos.getString("nombre"),
                    rsPlatos.getString("categoria"),
                    rsPlatos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al buscar productos y platos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return lista;
}

    private void jcbPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPrecioActionPerformed
        String textoBusqueda = jtxtBuscar.getText().trim(); // Obtiene el texto de búsqueda

    if (textoBusqueda.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un texto para buscar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Determina el orden basado en la selección del JComboBox
    String orden = "ASC"; // Por defecto, ordena de menor a mayor
    if (jcbPrecio.getSelectedItem().equals("De mayor a menor")) {
        orden = "DESC"; // Si selecciona "De mayor a menor", orden descendente
    }

    // Llama al método para buscar productos y platos ordenados
    List<Object[]> resultados = buscarProductosYPlatosOrdenados(textoBusqueda, orden);

    // Cargar los resultados en la tabla
    DefaultTableModel model = (DefaultTableModel) jtblCarta.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de mostrar resultados

    if (resultados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron productos o platos con los criterios de búsqueda.", "Aviso", JOptionPane.WARNING_MESSAGE);
    } else {
        for (Object[] fila : resultados) {
            model.addRow(fila); // Agrega cada fila de datos al modelo
        }
    }
    
    }//GEN-LAST:event_jcbPrecioActionPerformed
//ordenar a travez de categoria
   private List<Object[]> buscarProductosYPlatosPorCategoria(String textoBusqueda, String categoria) {
    List<Object[]> lista = new ArrayList<>();
    String sqlProductos = "SELECT id_producto AS id, nombre, categoria, precio " +
                          "FROM productos " +
                          "WHERE (id_producto LIKE ? OR nombre LIKE ? OR categoria LIKE ? OR precio LIKE ?) " +
                          (categoria.isEmpty() ? "" : "AND categoria = ? ");
    String sqlPlatos = "SELECT id_plato AS id, nombre, categoria, precio " +
                       "FROM plato_comida " +
                       "WHERE (id_plato LIKE ? OR nombre LIKE ? OR categoria LIKE ? OR precio LIKE ?) " +
                       (categoria.isEmpty() ? "" : "AND categoria = ? ");

    try (Connection conn = UConnection.getConnection();
         PreparedStatement stmtProductos = conn.prepareStatement(sqlProductos);
         PreparedStatement stmtPlatos = conn.prepareStatement(sqlPlatos)) {

        // Parámetros para la búsqueda
        String parametroBusqueda = "%" + textoBusqueda + "%";
        stmtProductos.setString(1, parametroBusqueda);
        stmtProductos.setString(2, parametroBusqueda);
        stmtProductos.setString(3, parametroBusqueda);
        stmtProductos.setString(4, parametroBusqueda);

        stmtPlatos.setString(1, parametroBusqueda);
        stmtPlatos.setString(2, parametroBusqueda);
        stmtPlatos.setString(3, parametroBusqueda);
        stmtPlatos.setString(4, parametroBusqueda);

        // Si una categoría está seleccionada, añade el filtro
        if (!categoria.isEmpty()) {
            stmtProductos.setString(5, categoria);
            stmtPlatos.setString(5, categoria);
        }

        // Ejecutar consultas y agregar resultados
        try (ResultSet rsProductos = stmtProductos.executeQuery()) {
            while (rsProductos.next()) {
                Object[] fila = new Object[]{
                    rsProductos.getString("id"),
                    rsProductos.getString("nombre"),
                    rsProductos.getString("categoria"),
                    rsProductos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

        try (ResultSet rsPlatos = stmtPlatos.executeQuery()) {
            while (rsPlatos.next()) {
                Object[] fila = new Object[]{
                    rsPlatos.getString("id"),
                    rsPlatos.getString("nombre"),
                    rsPlatos.getString("categoria"),
                    rsPlatos.getDouble("precio")
                };
                lista.add(fila);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al buscar productos y platos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return lista;
}


    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        String textoBusqueda = jtxtBuscar.getText().trim(); // Obtiene el texto de búsqueda
    String categoria = jcbCategoria.getSelectedItem().toString(); // Obtiene la categoría seleccionada

    // Llama al método para buscar productos y platos por categoría
    List<Object[]> resultados = buscarProductosYPlatosPorCategoria(textoBusqueda, categoria);

    // Cargar los resultados en la tabla
    DefaultTableModel model = (DefaultTableModel) jtblCarta.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de mostrar resultados

    if (resultados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron productos o platos con los criterios de búsqueda.", "Aviso", JOptionPane.WARNING_MESSAGE);
    } else {
        for (Object[] fila : resultados) {
            model.addRow(fila); // Agrega cada fila de datos al modelo
        }
    }
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jtxtPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPrecioTotalActionPerformed

    private void jtxtMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMesaActionPerformed

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
            java.util.logging.Logger.getLogger(MeseroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeseroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeseroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeseroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MeseroPedido().setVisible(true);
            }
        });
    }
    //apartado segundo donde se ara la suma de los productos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbPrecio;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlFiltros;
    private javax.swing.JLabel jlPedido;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlPrecioTotal;
    private componentes.PanelRound jpBeigeCarta;
    private componentes.PanelRound jpBeigePedido;
    private componentes.PanelRound jpCategoria;
    private javax.swing.JPanel jpNaranja;
    private componentes.PanelRound jpPrecio;
    private javax.swing.JTable jtblCarta;
    private javax.swing.JTable jtblPedido;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtMesa;
    private javax.swing.JTextField jtxtPrecioTotal;
    private javax.swing.JPanel separador;
    // End of variables declaration//GEN-END:variables
}
