/**
 * @author Greivin
 */
package GUI.Vistas;

public class FrmTombola extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmTombola.class.getName());
    
    public FrmTombola() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCarton = new javax.swing.JPanel();
        pnlLetras = new javax.swing.JPanel();
        lbl_B1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlAutomatico1 = new javax.swing.JPanel();
        txtIngresarNumero = new javax.swing.JTextField();
        pnlManual1 = new javax.swing.JPanel();
        pnlManual2 = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        pnlManual3 = new javax.swing.JPanel();
        btnCantar = new javax.swing.JButton();
        pnlAutomatico2 = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        pnlManual4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlCarton.setBackground(new java.awt.Color(238, 195, 154));
        pnlCarton.setForeground(new java.awt.Color(238, 195, 154));

        pnlLetras.setBackground(new java.awt.Color(217, 160, 102));
        pnlLetras.setForeground(new java.awt.Color(217, 160, 102));

        lbl_B1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_B1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_B1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_B1.setText("TOMBOLA");

        javax.swing.GroupLayout pnlLetrasLayout = new javax.swing.GroupLayout(pnlLetras);
        pnlLetras.setLayout(pnlLetrasLayout);
        pnlLetrasLayout.setHorizontalGroup(
            pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLetrasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_B1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlLetrasLayout.setVerticalGroup(
            pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLetrasLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbl_B1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(217, 160, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        pnlAutomatico1.setBackground(new java.awt.Color(217, 160, 102));
        pnlAutomatico1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlAutomatico1.setForeground(new java.awt.Color(51, 51, 51));
        pnlAutomatico1.setPreferredSize(new java.awt.Dimension(176, 48));

        txtIngresarNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtIngresarNumero.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        txtIngresarNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtIngresarNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIngresarNumero.setText("75");
        txtIngresarNumero.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlAutomatico1Layout = new javax.swing.GroupLayout(pnlAutomatico1);
        pnlAutomatico1.setLayout(pnlAutomatico1Layout);
        pnlAutomatico1Layout.setHorizontalGroup(
            pnlAutomatico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
            .addGroup(pnlAutomatico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAutomatico1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtIngresarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlAutomatico1Layout.setVerticalGroup(
            pnlAutomatico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
            .addGroup(pnlAutomatico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAutomatico1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtIngresarNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlManual1.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual1.setForeground(new java.awt.Color(51, 51, 51));

        pnlManual2.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual2.setForeground(new java.awt.Color(51, 51, 51));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_NO_precionado.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_precionado.png"))); // NOI18N

        javax.swing.GroupLayout pnlManual2Layout = new javax.swing.GroupLayout(pnlManual2);
        pnlManual2.setLayout(pnlManual2Layout);
        pnlManual2Layout.setHorizontalGroup(
            pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnGenerar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlManual2Layout.setVerticalGroup(
            pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(pnlManual2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual2Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(btnGenerar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlManual3.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual3.setForeground(new java.awt.Color(51, 51, 51));
        pnlManual3.setPreferredSize(new java.awt.Dimension(176, 53));

        btnCantar.setBackground(new java.awt.Color(255, 255, 255));
        btnCantar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnCantar.setForeground(new java.awt.Color(255, 255, 255));
        btnCantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_NO_precionado.png"))); // NOI18N
        btnCantar.setText("Cantar");
        btnCantar.setBorderPainted(false);
        btnCantar.setContentAreaFilled(false);
        btnCantar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCantar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_precionado.png"))); // NOI18N

        javax.swing.GroupLayout pnlManual3Layout = new javax.swing.GroupLayout(pnlManual3);
        pnlManual3.setLayout(pnlManual3Layout);
        pnlManual3Layout.setHorizontalGroup(
            pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCantar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlManual3Layout.setVerticalGroup(
            pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlManual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlManual3Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(btnCantar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlManual1Layout = new javax.swing.GroupLayout(pnlManual1);
        pnlManual1.setLayout(pnlManual1Layout);
        pnlManual1Layout.setHorizontalGroup(
            pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlManual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlManual3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        pnlManual1Layout.setVerticalGroup(
            pnlManual1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlManual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlManual3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAutomatico2.setBackground(new java.awt.Color(217, 160, 102));
        pnlAutomatico2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlAutomatico2.setForeground(new java.awt.Color(51, 51, 51));
        pnlAutomatico2.setPreferredSize(new java.awt.Dimension(176, 48));

        lblInfo.setBackground(new java.awt.Color(0, 0, 0));
        lblInfo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 0));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("Ultimo número cantado:");
        lblInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlManual4.setBackground(new java.awt.Color(217, 160, 102));
        pnlManual4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 195, 154), 3, true));
        pnlManual4.setForeground(new java.awt.Color(51, 51, 51));
        pnlManual4.setPreferredSize(new java.awt.Dimension(176, 53));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("11");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlManual4Layout = new javax.swing.GroupLayout(pnlManual4);
        pnlManual4.setLayout(pnlManual4Layout);
        pnlManual4Layout.setHorizontalGroup(
            pnlManual4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlManual4Layout.setVerticalGroup(
            pnlManual4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManual4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAutomatico2Layout = new javax.swing.GroupLayout(pnlAutomatico2);
        pnlAutomatico2.setLayout(pnlAutomatico2Layout);
        pnlAutomatico2Layout.setHorizontalGroup(
            pnlAutomatico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAutomatico2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlManual4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlAutomatico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAutomatico2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblInfo)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );
        pnlAutomatico2Layout.setVerticalGroup(
            pnlAutomatico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutomatico2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlManual4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlAutomatico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAutomatico2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAutomatico2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlAutomatico1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlManual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlManual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAutomatico1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAutomatico2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(pnlCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(() -> new FrmTombola().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCantar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lbl_B1;
    private javax.swing.JPanel pnlAutomatico1;
    private javax.swing.JPanel pnlAutomatico2;
    private javax.swing.JPanel pnlCarton;
    private javax.swing.JPanel pnlLetras;
    private javax.swing.JPanel pnlManual1;
    private javax.swing.JPanel pnlManual2;
    private javax.swing.JPanel pnlManual3;
    private javax.swing.JPanel pnlManual4;
    private javax.swing.JTextField txtIngresarNumero;
    // End of variables declaration//GEN-END:variables
}
