
package GUI.Vistas;

public class DlgCreadorAutomatico extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DlgCreadorAutomatico.class.getName());
    private int cantidadCartones = -1;
    public DlgCreadorAutomatico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public int obtenerCantidadCartones() {
        return cantidadCartones;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCarton = new javax.swing.JPanel();
        pnlLetras = new javax.swing.JPanel();
        lbl_B1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlManual1 = new javax.swing.JPanel();
        pnlManual2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlManual3 = new javax.swing.JPanel();
        spinnerCantidad = new javax.swing.JSpinner();
        pnlAutomatico2 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCarton.setBackground(new java.awt.Color(238, 195, 154));
        pnlCarton.setForeground(new java.awt.Color(238, 195, 154));

        pnlLetras.setBackground(new java.awt.Color(217, 160, 102));
        pnlLetras.setForeground(new java.awt.Color(217, 160, 102));

        lbl_B1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_B1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Cuantos cartones deseas generar?");

        javax.swing.GroupLayout pnlManual2Layout = new javax.swing.GroupLayout(pnlManual2);
        pnlManual2.setLayout(pnlManual2Layout);
        pnlManual2Layout.setHorizontalGroup(
            pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
        );
        pnlManual2Layout.setVerticalGroup(
            pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        pnlManual3.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual3.setForeground(new java.awt.Color(51, 51, 51));
        pnlManual3.setPreferredSize(new java.awt.Dimension(176, 53));

        spinnerCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        spinnerCantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout pnlManual3Layout = new javax.swing.GroupLayout(pnlManual3);
        pnlManual3.setLayout(pnlManual3Layout);
        pnlManual3Layout.setHorizontalGroup(
            pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinnerCantidad)
                .addContainerGap())
        );
        pnlManual3Layout.setVerticalGroup(
            pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAutomatico2.setBackground(new java.awt.Color(217, 160, 102));
        pnlAutomatico2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlAutomatico2.setForeground(new java.awt.Color(51, 51, 51));
        pnlAutomatico2.setPreferredSize(new java.awt.Dimension(176, 48));

        btnConfirmar.setBackground(new java.awt.Color(0, 153, 51));
        btnConfirmar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Generar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnlManual1Layout = new javax.swing.GroupLayout(pnlManual1);
        pnlManual1.setLayout(pnlManual1Layout);
        pnlManual1Layout.setHorizontalGroup(
            pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlManual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlManual3, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(pnlAutomatico2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlManual1Layout.setVerticalGroup(
            pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlManual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlManual3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAutomatico2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(pnlManual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(pnlCarton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        cantidadCartones = (Integer) spinnerCantidad.getValue();
        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public static void main(String args[]) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_B1;
    private javax.swing.JPanel pnlAutomatico2;
    private javax.swing.JPanel pnlCarton;
    private javax.swing.JPanel pnlLetras;
    private javax.swing.JPanel pnlManual1;
    private javax.swing.JPanel pnlManual2;
    private javax.swing.JPanel pnlManual3;
    private javax.swing.JSpinner spinnerCantidad;
    // End of variables declaration//GEN-END:variables
}
