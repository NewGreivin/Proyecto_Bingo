
package GUI.Vistas;

import Controladores.ControladorCarton;
import Modelo.Cartones.CartonBingo;
import Modelo.Facate.ServiciosFacate;
import Modelo.Tombolas.TombolaObserver;
import java.awt.Container;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class PnlCarton extends javax.swing.JPanel  implements TombolaObserver{
    
    private CartonBingo cartonActual;
    private ControladorCarton carton;
    private JToggleButton[][] botones;

    public PnlCarton() {
        initComponents();
        botones = new JToggleButton[][] {
        {btn_1, btn_6,  btn_11, btn_16, btn_21},
        {btn_2, btn_7,  btn_12, btn_17, btn_22},
        {btn_3, btn_8,  btn_13, btn_18, btn_23},
        {btn_4, btn_9,  btn_14, btn_19, btn_24},
        {btn_5, btn_10, btn_15, btn_20, btn_25}
        };
        ServiciosFacate.getInstancia().getServicioTombola().agregarObserver(this);
    }

    public void mostrarCarton(CartonBingo carton) {
    this.cartonActual = carton;
    int[][] numeros = carton.getNumero();
    boolean[][] marcados = carton.getMarcados();

    lbl_NumCarton.setText(carton.getId());

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {

                JToggleButton btn = botones[fila][col];

                // Centro libre
                if (fila == 2 && col == 2) {
                    btn.setText("X");
                    btn.setSelected(true);  // siempre marcado
                    continue;
                }

                btn.setText(String.valueOf(numeros[fila][col]));

                // Si está marcado → seleccionado
                btn.setSelected(marcados[fila][col]);
            }
        }
    MarcarDesmarcar(carton);
    }
    
    private void MarcarDesmarcar(CartonBingo carton) {
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {

                final int f = fila;
                final int c = col;

                botones[f][c].addActionListener(e -> {

                if (f == 2 && c == 2) return; // centro libre NO cambia

                int numero = carton.getNumero()[f][c];

                if (botones[f][c].isSelected())
                    carton.marcarNumero(numero);
                else
                    carton.desmarcarNumero(numero);
                });
            }
        }
    }
    
    public void mostrarGanador(CartonBingo carton, String nombreRegla) {
        Container parent = this.getTopLevelAncestor();
        Frame frameParent = null;
        
        if (parent instanceof java.awt.Frame) { frameParent = (java.awt.Frame) parent; }

        DlgResultados dlg = new DlgResultados(frameParent, true);
        dlg.setCartonGanador(carton.getId());
        dlg.setTipoVictoria(nombreRegla);
        dlg.setVisible(true);
    }

        public void refrescarCarton() {
        if (cartonActual != null) {
            mostrarCarton(cartonActual);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCarton = new javax.swing.JPanel();
        pnlNumeros = new javax.swing.JPanel();
        btn_2 = new javax.swing.JToggleButton();
        btn_1 = new javax.swing.JToggleButton();
        btn_3 = new javax.swing.JToggleButton();
        btn_4 = new javax.swing.JToggleButton();
        btn_6 = new javax.swing.JToggleButton();
        btn_7 = new javax.swing.JToggleButton();
        btn_8 = new javax.swing.JToggleButton();
        btn_9 = new javax.swing.JToggleButton();
        btn_10 = new javax.swing.JToggleButton();
        btn_11 = new javax.swing.JToggleButton();
        btn_12 = new javax.swing.JToggleButton();
        btn_13 = new javax.swing.JToggleButton();
        btn_14 = new javax.swing.JToggleButton();
        btn_15 = new javax.swing.JToggleButton();
        btn_16 = new javax.swing.JToggleButton();
        btn_17 = new javax.swing.JToggleButton();
        btn_18 = new javax.swing.JToggleButton();
        btn_19 = new javax.swing.JToggleButton();
        btn_20 = new javax.swing.JToggleButton();
        btn_21 = new javax.swing.JToggleButton();
        btn_22 = new javax.swing.JToggleButton();
        btn_23 = new javax.swing.JToggleButton();
        btn_24 = new javax.swing.JToggleButton();
        btn_25 = new javax.swing.JToggleButton();
        btn_5 = new javax.swing.JToggleButton();
        pnlLetras = new javax.swing.JPanel();
        lbl_I = new javax.swing.JLabel();
        lbl_N = new javax.swing.JLabel();
        lbl_G = new javax.swing.JLabel();
        lbl_O = new javax.swing.JLabel();
        lbl_B1 = new javax.swing.JLabel();
        lbl_B = new javax.swing.JLabel();
        lbl_NumCarton = new javax.swing.JLabel();
        btnCantar = new javax.swing.JButton();

        pnlCarton.setBackground(new java.awt.Color(238, 195, 154));
        pnlCarton.setForeground(new java.awt.Color(238, 195, 154));

        pnlNumeros.setBackground(new java.awt.Color(217, 160, 102));
        pnlNumeros.setForeground(new java.awt.Color(217, 160, 102));
        pnlNumeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_2.setBorderPainted(false);
        btn_2.setContentAreaFilled(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 60));

        btn_1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_1.setBorderPainted(false);
        btn_1.setContentAreaFilled(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        pnlNumeros.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        btn_3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_3.setBorderPainted(false);
        btn_3.setContentAreaFilled(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 60));

        btn_4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_4.setBorderPainted(false);
        btn_4.setContentAreaFilled(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 60));

        btn_6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_6.setBorderPainted(false);
        btn_6.setContentAreaFilled(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 60, 60));

        btn_7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_7.setBorderPainted(false);
        btn_7.setContentAreaFilled(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 60, 60));

        btn_8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_8.setBorderPainted(false);
        btn_8.setContentAreaFilled(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, 60));

        btn_9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_9.setBorderPainted(false);
        btn_9.setContentAreaFilled(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 60));

        btn_10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_10.setForeground(new java.awt.Color(255, 255, 255));
        btn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_10.setBorderPainted(false);
        btn_10.setContentAreaFilled(false);
        btn_10.setFocusPainted(false);
        btn_10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 60));

        btn_11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_11.setForeground(new java.awt.Color(255, 255, 255));
        btn_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_11.setBorderPainted(false);
        btn_11.setContentAreaFilled(false);
        btn_11.setFocusPainted(false);
        btn_11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, 60));

        btn_12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_12.setForeground(new java.awt.Color(255, 255, 255));
        btn_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_12.setBorderPainted(false);
        btn_12.setContentAreaFilled(false);
        btn_12.setFocusPainted(false);
        btn_12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 60, 60));

        btn_13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btn_13.setForeground(new java.awt.Color(255, 255, 255));
        btn_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_13.setText("X");
        btn_13.setBorderPainted(false);
        btn_13.setContentAreaFilled(false);
        btn_13.setFocusPainted(false);
        btn_13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 60, 60));

        btn_14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_14.setForeground(new java.awt.Color(255, 255, 255));
        btn_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_14.setBorderPainted(false);
        btn_14.setContentAreaFilled(false);
        btn_14.setFocusPainted(false);
        btn_14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 60, 60));

        btn_15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_15.setForeground(new java.awt.Color(255, 255, 255));
        btn_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_15.setBorderPainted(false);
        btn_15.setContentAreaFilled(false);
        btn_15.setFocusPainted(false);
        btn_15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_15.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 60));

        btn_16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_16.setForeground(new java.awt.Color(255, 255, 255));
        btn_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_16.setBorderPainted(false);
        btn_16.setContentAreaFilled(false);
        btn_16.setFocusPainted(false);
        btn_16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_16.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, 60));

        btn_17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_17.setForeground(new java.awt.Color(255, 255, 255));
        btn_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_17.setBorderPainted(false);
        btn_17.setContentAreaFilled(false);
        btn_17.setFocusPainted(false);
        btn_17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_17.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, 60));

        btn_18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_18.setForeground(new java.awt.Color(255, 255, 255));
        btn_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_18.setBorderPainted(false);
        btn_18.setContentAreaFilled(false);
        btn_18.setFocusPainted(false);
        btn_18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_18.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 60, 60));

        btn_19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_19.setForeground(new java.awt.Color(255, 255, 255));
        btn_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_19.setBorderPainted(false);
        btn_19.setContentAreaFilled(false);
        btn_19.setFocusPainted(false);
        btn_19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_19.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        btn_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_19ActionPerformed(evt);
            }
        });
        pnlNumeros.add(btn_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 60));

        btn_20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_20.setForeground(new java.awt.Color(255, 255, 255));
        btn_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_20.setBorderPainted(false);
        btn_20.setContentAreaFilled(false);
        btn_20.setFocusPainted(false);
        btn_20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_20.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 60, 60));

        btn_21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_21.setForeground(new java.awt.Color(255, 255, 255));
        btn_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_21.setBorderPainted(false);
        btn_21.setContentAreaFilled(false);
        btn_21.setFocusPainted(false);
        btn_21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_21.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 60, 60));

        btn_22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_22.setForeground(new java.awt.Color(255, 255, 255));
        btn_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_22.setBorderPainted(false);
        btn_22.setContentAreaFilled(false);
        btn_22.setFocusPainted(false);
        btn_22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_22.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 60, 60));

        btn_23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_23.setForeground(new java.awt.Color(255, 255, 255));
        btn_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_23.setBorderPainted(false);
        btn_23.setContentAreaFilled(false);
        btn_23.setFocusPainted(false);
        btn_23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_23.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 60, 60));

        btn_24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_24.setForeground(new java.awt.Color(255, 255, 255));
        btn_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_24.setBorderPainted(false);
        btn_24.setContentAreaFilled(false);
        btn_24.setFocusPainted(false);
        btn_24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_24.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 60, 60));

        btn_25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_25.setForeground(new java.awt.Color(255, 255, 255));
        btn_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_25.setBorderPainted(false);
        btn_25.setContentAreaFilled(false);
        btn_25.setFocusPainted(false);
        btn_25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_25.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 60, 60));

        btn_5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        btn_5.setBorderPainted(false);
        btn_5.setContentAreaFilled(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_Transcicion.png"))); // NOI18N
        btn_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo_positivo.png"))); // NOI18N
        pnlNumeros.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 60));

        pnlLetras.setBackground(new java.awt.Color(217, 160, 102));
        pnlLetras.setForeground(new java.awt.Color(217, 160, 102));

        lbl_I.setBackground(new java.awt.Color(0, 0, 0));
        lbl_I.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_I.setText("I");

        lbl_N.setBackground(new java.awt.Color(0, 0, 0));
        lbl_N.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_N.setText("N");

        lbl_G.setBackground(new java.awt.Color(0, 0, 0));
        lbl_G.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_G.setText("G");

        lbl_O.setBackground(new java.awt.Color(0, 0, 0));
        lbl_O.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_O.setText("O");

        lbl_B1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_B1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_B1.setText("B");

        javax.swing.GroupLayout pnlLetrasLayout = new javax.swing.GroupLayout(pnlLetras);
        pnlLetras.setLayout(pnlLetrasLayout);
        pnlLetrasLayout.setHorizontalGroup(
            pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLetrasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_B1)
                .addGap(43, 43, 43)
                .addComponent(lbl_I)
                .addGap(54, 54, 54)
                .addComponent(lbl_N)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lbl_G)
                .addGap(37, 37, 37)
                .addComponent(lbl_O)
                .addGap(25, 25, 25))
        );
        pnlLetrasLayout.setVerticalGroup(
            pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLetrasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLetrasLayout.createSequentialGroup()
                        .addGroup(pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_I)
                            .addComponent(lbl_B1))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(pnlLetrasLayout.createSequentialGroup()
                        .addGroup(pnlLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_N)
                            .addComponent(lbl_O)
                            .addComponent(lbl_G))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        lbl_B.setBackground(new java.awt.Color(0, 0, 0));
        lbl_B.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_B.setText("Carton #:");

        lbl_NumCarton.setBackground(new java.awt.Color(0, 0, 0));
        lbl_NumCarton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_NumCarton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumCarton.setText("1");

        btnCantar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnCantar.setForeground(new java.awt.Color(255, 255, 255));
        btnCantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar.png"))); // NOI18N
        btnCantar.setText("Cerrar Carton");
        btnCantar.setBorderPainted(false);
        btnCantar.setContentAreaFilled(false);
        btnCantar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCantar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_precionado.png"))); // NOI18N
        btnCantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCartonLayout = new javax.swing.GroupLayout(pnlCarton);
        pnlCarton.setLayout(pnlCartonLayout);
        pnlCartonLayout.setHorizontalGroup(
            pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCartonLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCantar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lbl_B)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_NumCarton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCartonLayout.setVerticalGroup(
            pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_B, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NumCarton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCantar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_19ActionPerformed

    private void btnCantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantarActionPerformed
            int opcion = JOptionPane.showConfirmDialog(
            this, "¿Deseas cerrar el carton?", "Carton Cerrado",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
        );
        
        if (opcion == JOptionPane.YES_OPTION) {
            if (cartonActual != null) {

        // eliminar del almacenamiento
        ServiciosFacate.getInstancia()
            .getServicioCarton()
            .eliminarCarton(cartonActual.getId());

        Container parent = this.getParent();
        parent.remove(this);
        parent.revalidate();
        parent.repaint();
        }
    }
    }//GEN-LAST:event_btnCantarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCantar;
    private javax.swing.JToggleButton btn_1;
    private javax.swing.JToggleButton btn_10;
    private javax.swing.JToggleButton btn_11;
    private javax.swing.JToggleButton btn_12;
    private javax.swing.JToggleButton btn_13;
    private javax.swing.JToggleButton btn_14;
    private javax.swing.JToggleButton btn_15;
    private javax.swing.JToggleButton btn_16;
    private javax.swing.JToggleButton btn_17;
    private javax.swing.JToggleButton btn_18;
    private javax.swing.JToggleButton btn_19;
    private javax.swing.JToggleButton btn_2;
    private javax.swing.JToggleButton btn_20;
    private javax.swing.JToggleButton btn_21;
    private javax.swing.JToggleButton btn_22;
    private javax.swing.JToggleButton btn_23;
    private javax.swing.JToggleButton btn_24;
    private javax.swing.JToggleButton btn_25;
    private javax.swing.JToggleButton btn_3;
    private javax.swing.JToggleButton btn_4;
    private javax.swing.JToggleButton btn_5;
    private javax.swing.JToggleButton btn_6;
    private javax.swing.JToggleButton btn_7;
    private javax.swing.JToggleButton btn_8;
    private javax.swing.JToggleButton btn_9;
    private javax.swing.JLabel lbl_B;
    private javax.swing.JLabel lbl_B1;
    private javax.swing.JLabel lbl_G;
    private javax.swing.JLabel lbl_I;
    private javax.swing.JLabel lbl_N;
    private javax.swing.JLabel lbl_NumCarton;
    private javax.swing.JLabel lbl_O;
    private javax.swing.JPanel pnlCarton;
    private javax.swing.JPanel pnlLetras;
    private javax.swing.JPanel pnlNumeros;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarNumero(int numero) {
        // Actualizar la visualización del cartón cuando se marque un número
        if (cartonActual != null && cartonActual.contieneNumero(numero)) {
            for (int fila = 0; fila < 5; fila++) {
                for (int col = 0; col < 5; col++) {
                    if (cartonActual.getNumero()[fila][col] == numero) {
                        botones[fila][col].setSelected(cartonActual.getMarcados()[fila][col]);
                    }
                }
            }
        }
    }
}
