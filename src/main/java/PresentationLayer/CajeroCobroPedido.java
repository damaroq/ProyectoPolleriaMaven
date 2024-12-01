package PresentationLayer;

import javax.swing.JOptionPane;

public class CajeroCobroPedido extends javax.swing.JFrame {

    public CajeroCobroPedido() {
        initComponents();

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        panelRound1 = new componentes.PanelRound();
        jb0 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbPunto = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jlMoneda = new javax.swing.JLabel();
        jtxtMontoTotal = new javax.swing.JTextField();
        jlCobrar = new javax.swing.JLabel();
        jtxtCobrar = new javax.swing.JTextField();
        jlVuelto = new javax.swing.JLabel();
        jtxtVuelto = new javax.swing.JTextField();
        jbCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COBRO DE PEDIDO");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(680, 510));
        setMinimumSize(new java.awt.Dimension(680, 510));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 125, 14));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 0, 70, 40));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb0.setText("0");
        panelRound1.add(jb0, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 261, 160, 80));

        jb1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb1.setText("1");
        panelRound1.add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 181, 80, 80));

        jb2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb2.setText("2");
        panelRound1.add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 181, 80, 80));

        jb3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb3.setText("3");
        panelRound1.add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 181, 80, 80));

        jb4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb4.setText("4");
        panelRound1.add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 101, 80, 80));

        jb5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb5.setText("5");
        panelRound1.add(jb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 101, 80, 80));

        jb6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb6.setText("6");
        panelRound1.add(jb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 101, 80, 80));

        jb7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb7.setText("7");
        panelRound1.add(jb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 21, 80, 80));

        jb8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb8.setText("8");
        panelRound1.add(jb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 21, 80, 80));

        jb9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jb9.setText("9");
        panelRound1.add(jb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 21, 80, 80));

        jbPunto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbPunto.setText(".");
        panelRound1.add(jbPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 261, 80, 80));

        jbBorrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbBorrar.setText("C");
        panelRound1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 341, 240, 80));

        jlMoneda.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlMoneda.setText("S/.");
        panelRound1.add(jlMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, 100));

        jtxtMontoTotal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jtxtMontoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtMontoTotal.setText("200.00");
        panelRound1.add(jtxtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 210, 100));

        jlCobrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCobrar.setForeground(new java.awt.Color(209, 32, 31));
        jlCobrar.setText("POR COBRAR:");
        panelRound1.add(jlCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, 40));

        jtxtCobrar.setEditable(false);
        jtxtCobrar.setBackground(new java.awt.Color(229, 227, 227));
        jtxtCobrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxtCobrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCobrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound1.add(jtxtCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 110, 40));

        jlVuelto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlVuelto.setText("VUELTO:");
        panelRound1.add(jlVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 40));

        jtxtVuelto.setEditable(false);
        jtxtVuelto.setBackground(new java.awt.Color(229, 227, 227));
        jtxtVuelto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtxtVuelto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtVuelto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound1.add(jtxtVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 110, 40));

        jbCobrar.setBackground(new java.awt.Color(209, 32, 31));
        jbCobrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCobrar.setText("COBRAR");
        jbCobrar.setBorder(null);
        jbCobrar.setFocusPainted(false);
        jbCobrar.setFocusable(false);
        jbCobrar.setOpaque(true);
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });
        panelRound1.add(jbCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 180, 70));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 610, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed
        JOptionPane.showMessageDialog(null, "Cobro completado.");
        this.dispose();
    }//GEN-LAST:event_jbCobrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CajeroCobroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajeroCobroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajeroCobroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajeroCobroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CajeroCobroPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbPunto;
    private javax.swing.JLabel jlCobrar;
    private javax.swing.JLabel jlMoneda;
    private javax.swing.JLabel jlVuelto;
    private javax.swing.JTextField jtxtCobrar;
    private javax.swing.JTextField jtxtMontoTotal;
    private javax.swing.JTextField jtxtVuelto;
    private componentes.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
