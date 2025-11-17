
package GUI.Vistas;

public class DlgCreadorAutomatico extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DlgCreadorAutomatico.class.getName());

    public DlgCreadorAutomatico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCarton = new javax.swing.JPanel();
        pnlLetras = new javax.swing.JPanel();
        lbl_B1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlManual1 = new javax.swing.JPanel();
        pnlManual2 = new javax.swing.JPanel();
        btnAutomatico = new javax.swing.JToggleButton();
        pnlManual3 = new javax.swing.JPanel();
        btnManual = new javax.swing.JToggleButton();
        pnlAutomatico2 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        pnlManual4 = new javax.swing.JPanel();
        pnlManual5 = new javax.swing.JPanel();
        txtVictoriaJuego = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCarton.setBackground(new java.awt.Color(238, 195, 154));
        pnlCarton.setForeground(new java.awt.Color(238, 195, 154));

        pnlLetras.setBackground(new java.awt.Color(217, 160, 102));
        pnlLetras.setForeground(new java.awt.Color(217, 160, 102));

        lbl_B1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_B1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_B1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_B1.setText("Modo de Juego");

        javax.swing.GroupLayout pnlLetrasLayout = new javax.swing.GroupLayout(pnlLetras);
        pnlLetras.setLayout(pnlLetrasLayout);
        pnlLetrasLayout.setHorizontalGroup(
            pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLetrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLetrasLayout.setVerticalGroup(
            pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLetrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_B1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(217, 160, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        pnlManual1.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual1.setForeground(new java.awt.Color(51, 51, 51));

        pnlManual2.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual2.setForeground(new java.awt.Color(51, 51, 51));

        btnAutomatico.setBackground(new java.awt.Color(255, 255, 255));
        btnAutomatico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        btnAutomatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_NO_precionado.png"))); // NOI18N
        btnAutomatico.setText("Automatico");
        btnAutomatico.setBorderPainted(false);
        btnAutomatico.setContentAreaFilled(false);
        btnAutomatico.setFocusPainted(false);
        btnAutomatico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutomatico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_Focus_precionado.png"))); // NOI18N
        btnAutomatico.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_precionado.png"))); // NOI18N

        javax.swing.GroupLayout pnlManual2Layout = new javax.swing.GroupLayout(pnlManual2);
        pnlManual2.setLayout(pnlManual2Layout);
        pnlManual2Layout.setHorizontalGroup(
            pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAutomatico, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlManual2Layout.setVerticalGroup(
            pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAutomatico, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlManual3.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual3.setForeground(new java.awt.Color(51, 51, 51));
        pnlManual3.setPreferredSize(new java.awt.Dimension(176, 53));

        btnManual.setBackground(new java.awt.Color(255, 255, 255));
        btnManual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnManual.setForeground(new java.awt.Color(255, 255, 255));
        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_NO_precionado.png"))); // NOI18N
        btnManual.setText("Manual");
        btnManual.setBorderPainted(false);
        btnManual.setContentAreaFilled(false);
        btnManual.setFocusPainted(false);
        btnManual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_Focus_precionado.png"))); // NOI18N
        btnManual.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_precionado.png"))); // NOI18N

        javax.swing.GroupLayout pnlManual3Layout = new javax.swing.GroupLayout(pnlManual3);
        pnlManual3.setLayout(pnlManual3Layout);
        pnlManual3Layout.setHorizontalGroup(
            pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnManual, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlManual3Layout.setVerticalGroup(
            pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnManual)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        pnlAutomatico2.setBackground(new java.awt.Color(217, 160, 102));
        pnlAutomatico2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlAutomatico2.setForeground(new java.awt.Color(51, 51, 51));
        pnlAutomatico2.setPreferredSize(new java.awt.Dimension(176, 48));

        btnConfirmar.setBackground(new java.awt.Color(0, 153, 51));
        btnConfirmar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlAutomatico2Layout = new javax.swing.GroupLayout(pnlAutomatico2);
        pnlAutomatico2.setLayout(pnlAutomatico2Layout);
        pnlAutomatico2Layout.setHorizontalGroup(
            pnlAutomatico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutomatico2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAutomatico2Layout.setVerticalGroup(
            pnlAutomatico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutomatico2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlManual4.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual4.setForeground(new java.awt.Color(51, 51, 51));
        pnlManual4.setPreferredSize(new java.awt.Dimension(176, 53));

        pnlManual5.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual5.setForeground(new java.awt.Color(51, 51, 51));
        pnlManual5.setPreferredSize(new java.awt.Dimension(176, 53));

        txtVictoriaJuego.setBackground(new java.awt.Color(204, 204, 204));
        txtVictoriaJuego.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtVictoriaJuego.setForeground(new java.awt.Color(0, 0, 0));
        txtVictoriaJuego.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlManual5Layout = new javax.swing.GroupLayout(pnlManual5);
        pnlManual5.setLayout(pnlManual5Layout);
        pnlManual5Layout.setHorizontalGroup(
            pnlManual5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlManual5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtVictoriaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlManual5Layout.setVerticalGroup(
            pnlManual5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlManual5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual5Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(txtVictoriaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Victoria de Juego:");

        javax.swing.GroupLayout pnlManual4Layout = new javax.swing.GroupLayout(pnlManual4);
        pnlManual4.setLayout(pnlManual4Layout);
        pnlManual4Layout.setHorizontalGroup(
            pnlManual4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManual4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlManual5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlManual4Layout.setVerticalGroup(
            pnlManual4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManual4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlManual5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlManual1Layout = new javax.swing.GroupLayout(pnlManual1);
        pnlManual1.setLayout(pnlManual1Layout);
        pnlManual1Layout.setHorizontalGroup(
            pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlManual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlManual3, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(pnlAutomatico2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(pnlManual4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlManual1Layout.setVerticalGroup(
            pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlManual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlManual3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlManual4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAutomatico2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlManual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlManual1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCartonLayout = new javax.swing.GroupLayout(pnlCarton);
        pnlCarton.setLayout(pnlCartonLayout);
        pnlCartonLayout.setHorizontalGroup(
            pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCartonLayout.setVerticalGroup(
            pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCarton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DlgCreadorAutomatico dialog = new DlgCreadorAutomatico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAutomatico;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JToggleButton btnManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_B1;
    private javax.swing.JPanel pnlAutomatico2;
    private javax.swing.JPanel pnlCarton;
    private javax.swing.JPanel pnlLetras;
    private javax.swing.JPanel pnlManual1;
    private javax.swing.JPanel pnlManual2;
    private javax.swing.JPanel pnlManual3;
    private javax.swing.JPanel pnlManual4;
    private javax.swing.JPanel pnlManual5;
    private javax.swing.JComboBox<String> txtVictoriaJuego;
    // End of variables declaration//GEN-END:variables
}
