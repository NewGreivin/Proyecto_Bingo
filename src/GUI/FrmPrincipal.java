
package GUI;

import GUI.Vistas.DlgSelectorModo;
import GUI.Vistas.PnlTablero;
import GUI.Vistas.PnlTombola;
import GUI.Vistas.PnlVisualizacionCartones;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class FrmPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmPrincipal.class.getName());
    
    private PnlTombola pnlTombola;
    private PnlTablero pnlTablero;
    private PnlVisualizacionCartones pnlVisualizacionCartones;
    private Controladores.ControladorTombola controladorTombola;

    public FrmPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/mini_logo.png")).getImage());
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.controladorTombola = new Controladores.ControladorTombola();
        mostrarDlgSelectorModo();
        crearInternalFrames();
    }
    
    private void crearInternalFrames() {
        // Crear el panel Tombola
        pnlTombola = new PnlTombola(controladorTombola);
        JInternalFrame frameTombola = new JInternalFrame("Tombola", false, false, false, false);
        frameTombola.add(pnlTombola);
        frameTombola.setSize(398, 363);
        frameTombola.setLocation(10, 10);
        frameTombola.setVisible(true);
        desktopPanel.add(frameTombola);
        
        // Crear el panel Tablero
        pnlTablero = new PnlTablero();
        JInternalFrame frameTablero = new JInternalFrame("Tablero", false, false, false, false);
        frameTablero.add(pnlTablero);
        frameTablero.setSize(1000, 348);
        frameTablero.setLocation(420, 10);
        frameTablero.setVisible(true);
        desktopPanel.add(frameTablero);
        
        // Crear el panel Visualización de Cartones
        pnlVisualizacionCartones = new PnlVisualizacionCartones();
        javax.swing.JInternalFrame frameCartones = new javax.swing.JInternalFrame("Cartones", true, false, false, false);
        frameCartones.add(pnlVisualizacionCartones);
        frameCartones.setSize(1360, 200);
        frameCartones.setLocation(10, 360);
        frameCartones.setVisible(true);
        desktopPanel.add(frameCartones);
    }
    
    private void mostrarDlgSelectorModo() {
        DlgSelectorModo dialog = new DlgSelectorModo(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }
    
    private void initComponents() {

        PnlInformación = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        desktopPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo TECH");

        PnlInformación.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblNombre.setText("Estado: ");

        lblEstado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        btnReiniciar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnReiniciar.setText("Reiniciar Juego");
        btnReiniciar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        javax.swing.GroupLayout PnlInformaciónLayout = new javax.swing.GroupLayout(PnlInformación);
        PnlInformación.setLayout(PnlInformaciónLayout);
        PnlInformaciónLayout.setHorizontalGroup(
            PnlInformaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInformaciónLayout.createSequentialGroup()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlInformaciónLayout.setVerticalGroup(
            PnlInformaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReiniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        desktopPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlInformación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlInformación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

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
        java.awt.EventQueue.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlInformación;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
