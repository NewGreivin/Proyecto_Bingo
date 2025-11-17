
package GUI.Vistas;

import Modelo.Cartones.CartonBingo;
import java.util.Collection;

public class PnlVisualizacionCartones extends javax.swing.JPanel {

    public PnlVisualizacionCartones() {
        initComponents();
    }

    public void agregarCarton(PnlCarton pnl) {
        contenedorCartones.add(pnl);
        contenedorCartones.revalidate();
        contenedorCartones.repaint();
    }

    public void mostrarTodosLosCartones(Collection<CartonBingo> lista) {
    contenedorCartones.removeAll(); // Limpia los cartones anteriores

    for (CartonBingo carton : lista) {
        PnlCarton pnl = new PnlCarton();
        pnl.mostrarCarton(carton);
        this.agregarCarton(pnl);
    }

    contenedorCartones.revalidate();
    contenedorCartones.repaint();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollCartones = new javax.swing.JScrollPane();
        contenedorCartones = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        scrollCartones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contenedorCartones.setLayout(new java.awt.GridLayout(0, 2, 10, 10));
        scrollCartones.setViewportView(contenedorCartones);

        add(scrollCartones, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorCartones;
    private javax.swing.JScrollPane scrollCartones;
    // End of variables declaration//GEN-END:variables
}
