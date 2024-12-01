package PresentationLayer;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MeseroPedido extends javax.swing.JFrame {

    private final String logo_reporte = "/icons/reporte.png";
    private final String logo_mesa = "/icons/mesa.png";
    private final String logo_mesa1 = "/icons/mesa1.png";
    private final String logo_salir = "/icons/cerrar-sesion.png";

    public MeseroPedido() {
        initComponents();
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
        jpBeigeCarta.add(jlFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jtxtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpBeigeCarta.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 370, 30));

        jlBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBuscar.setText("BUSCAR:");
        jpBeigeCarta.add(jlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jcbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Plato de fondo", "Postres" }));
        jcbCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcbCategoria.setFocusable(false);
        jcbCategoria.setOpaque(true);
        jcbCategoria.setRequestFocusEnabled(false);
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

        jpBeigeCarta.add(jpPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, 30));

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
                .addGap(26, 26, 26)
                .addComponent(jlCategoria)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpCategoriaLayout.setVerticalGroup(
            jpCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCategoriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBeigeCarta.add(jpCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 130, 30));

        jcbPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De menor a mayor", "De mayor a menor" }));
        jcbPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcbPrecio.setFocusable(false);
        jcbPrecio.setLightWeightPopupEnabled(false);
        jcbPrecio.setOpaque(true);
        jcbPrecio.setRequestFocusEnabled(false);
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
        jScrollPane1.setViewportView(jtblCarta);

        jpBeigeCarta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, 460, 310));

        jpNaranja.add(jpBeigeCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 500));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jbFinalizarActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbQuitarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
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
