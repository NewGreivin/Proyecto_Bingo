/**
 * @author Greivin
 */
package GUI.Vistas;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PnlTablero extends javax.swing.JPanel {
    private JLabel[] labels = new JLabel[76];
    private final ImageIcon iconSinMarcar = cargarIcono("/img/Campo_Bingo.png");
    private final ImageIcon iconMarcado = cargarIcono("/img/Campo_Bingo_positivo.png");
    
    public PnlTablero() {
        initComponents();
        mapearLabels();
    }

    private void mapearLabels() {
        for (Component comp : pnlNumeros.getComponents()) {
            if (comp instanceof JLabel lbl) {
                String txt = lbl.getText().trim();

                if (txt.matches("\\d+")) {
                    int numero = Integer.parseInt(txt);
                    if (numero >= 1 && numero <= 75) {
                        labels[numero] = lbl;
                    }
                }
            }
        }
    }
    private ImageIcon cargarIcono(String icono) {
        java.net.URL url = getClass().getResource(icono);
        return (url != null) ? new ImageIcon(url) : null;
    }
    
    public void marcarNumero(int numero) {
        if (numero < 1 || numero > 75) return;
        JLabel lbl = labels[numero];
        if (lbl != null) {
            establecerComoMarcado(lbl);
        }
    }
   public void desmarcarNumero(int numero) {
        if (numero < 1 || numero > 75) return;
        JLabel lbl = labels[numero];
        if (lbl != null) {
            establecerComoDesmarcado(lbl);
        }
    }
   
       public void limpiarTablero() {
        for (int i = 1; i <= 75; i++) {
            if (labels[i] != null) establecerComoDesmarcado(labels[i]);
        }
    }
   
    private void establecerComoMarcado(JLabel lbl) {
        if (iconMarcado != null) {
            lbl.setIcon(iconMarcado);
        } 
        lbl.putClientProperty("marcado", Boolean.TRUE);
    }

    private void establecerComoDesmarcado(JLabel lbl) {
        if (iconSinMarcar != null) {
            lbl.setIcon(iconSinMarcar);
        } 
        lbl.putClientProperty("marcado", Boolean.FALSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTablero = new javax.swing.JPanel();
        pnlLetras = new javax.swing.JPanel();
        lbl_B = new javax.swing.JLabel();
        lbl_I = new javax.swing.JLabel();
        lbl_N = new javax.swing.JLabel();
        lbl_G = new javax.swing.JLabel();
        lbl_O = new javax.swing.JLabel();
        pnlNumeros = new javax.swing.JPanel();
        lbl_16 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_61 = new javax.swing.JLabel();
        lbl_31 = new javax.swing.JLabel();
        lbl_46 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_17 = new javax.swing.JLabel();
        lbl_32 = new javax.swing.JLabel();
        lbl_47 = new javax.swing.JLabel();
        lbl_62 = new javax.swing.JLabel();
        lbl_34 = new javax.swing.JLabel();
        lbl_64 = new javax.swing.JLabel();
        lbl_49 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_19 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_18 = new javax.swing.JLabel();
        lbl_33 = new javax.swing.JLabel();
        lbl_48 = new javax.swing.JLabel();
        lbl_63 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_8 = new javax.swing.JLabel();
        lbl_67 = new javax.swing.JLabel();
        lbl_38 = new javax.swing.JLabel();
        lbl_22 = new javax.swing.JLabel();
        lbl_23 = new javax.swing.JLabel();
        lbl_52 = new javax.swing.JLabel();
        lbl_68 = new javax.swing.JLabel();
        lbl_53 = new javax.swing.JLabel();
        lbl_37 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        lbl_21 = new javax.swing.JLabel();
        lbl_20 = new javax.swing.JLabel();
        lbl_35 = new javax.swing.JLabel();
        lbl_36 = new javax.swing.JLabel();
        lbl_50 = new javax.swing.JLabel();
        lbl_51 = new javax.swing.JLabel();
        lbl_65 = new javax.swing.JLabel();
        lbl_66 = new javax.swing.JLabel();
        lbl_58 = new javax.swing.JLabel();
        lbl_54 = new javax.swing.JLabel();
        lbl_39 = new javax.swing.JLabel();
        lbl_24 = new javax.swing.JLabel();
        lbl_9 = new javax.swing.JLabel();
        lbl_10 = new javax.swing.JLabel();
        lbl_25 = new javax.swing.JLabel();
        lbl_40 = new javax.swing.JLabel();
        lbl_55 = new javax.swing.JLabel();
        lbl_69 = new javax.swing.JLabel();
        lbl_70 = new javax.swing.JLabel();
        lbl_11 = new javax.swing.JLabel();
        lbl_12 = new javax.swing.JLabel();
        lbl_13 = new javax.swing.JLabel();
        lbl_28 = new javax.swing.JLabel();
        lbl_26 = new javax.swing.JLabel();
        lbl_27 = new javax.swing.JLabel();
        lbl_41 = new javax.swing.JLabel();
        lbl_42 = new javax.swing.JLabel();
        lbl_43 = new javax.swing.JLabel();
        lbl_56 = new javax.swing.JLabel();
        lbl_57 = new javax.swing.JLabel();
        lbl_71 = new javax.swing.JLabel();
        lbl_72 = new javax.swing.JLabel();
        lbl_73 = new javax.swing.JLabel();
        lbl_14 = new javax.swing.JLabel();
        lbl_29 = new javax.swing.JLabel();
        lbl_44 = new javax.swing.JLabel();
        lbl_59 = new javax.swing.JLabel();
        lbl_74 = new javax.swing.JLabel();
        lbl_15 = new javax.swing.JLabel();
        lbl_30 = new javax.swing.JLabel();
        lbl_45 = new javax.swing.JLabel();
        lbl_60 = new javax.swing.JLabel();
        lbl_75 = new javax.swing.JLabel();

        pnlTablero.setBackground(new java.awt.Color(238, 195, 154));
        pnlTablero.setForeground(new java.awt.Color(238, 195, 154));

        pnlLetras.setBackground(new java.awt.Color(217, 160, 102));
        pnlLetras.setForeground(new java.awt.Color(217, 160, 102));
        pnlLetras.setMinimumSize(new java.awt.Dimension(56, 300));
        pnlLetras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_B.setBackground(new java.awt.Color(0, 0, 0));
        lbl_B.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_B.setForeground(new java.awt.Color(0, 0, 0));
        lbl_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_B.setText("B");
        pnlLetras.add(lbl_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lbl_I.setBackground(new java.awt.Color(0, 0, 0));
        lbl_I.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_I.setForeground(new java.awt.Color(0, 0, 0));
        lbl_I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_I.setText("I");
        pnlLetras.add(lbl_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lbl_N.setBackground(new java.awt.Color(0, 0, 0));
        lbl_N.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_N.setForeground(new java.awt.Color(0, 0, 0));
        lbl_N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_N.setText("N");
        pnlLetras.add(lbl_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lbl_G.setBackground(new java.awt.Color(0, 0, 0));
        lbl_G.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_G.setForeground(new java.awt.Color(0, 0, 0));
        lbl_G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_G.setText("G");
        pnlLetras.add(lbl_G, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_O.setBackground(new java.awt.Color(0, 0, 0));
        lbl_O.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 55)); // NOI18N
        lbl_O.setForeground(new java.awt.Color(0, 0, 0));
        lbl_O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_O.setText("O");
        pnlLetras.add(lbl_O, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        pnlNumeros.setBackground(new java.awt.Color(217, 160, 102));
        pnlNumeros.setForeground(new java.awt.Color(217, 160, 102));
        pnlNumeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_16.setBackground(new java.awt.Color(255, 255, 255));
        lbl_16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_16.setForeground(new java.awt.Color(255, 255, 255));
        lbl_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_16.setText("16");
        lbl_16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 60));

        lbl_1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_1.setText("1");
        lbl_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        lbl_61.setBackground(new java.awt.Color(255, 255, 255));
        lbl_61.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_61.setForeground(new java.awt.Color(255, 255, 255));
        lbl_61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_61.setText("61");
        lbl_61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 60));

        lbl_31.setBackground(new java.awt.Color(255, 255, 255));
        lbl_31.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_31.setForeground(new java.awt.Color(255, 255, 255));
        lbl_31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_31.setText("31");
        lbl_31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, 60));

        lbl_46.setBackground(new java.awt.Color(255, 255, 255));
        lbl_46.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_46.setForeground(new java.awt.Color(255, 255, 255));
        lbl_46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_46.setText("46");
        lbl_46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 60));

        lbl_2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_2.setText("2");
        lbl_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 60));

        lbl_17.setBackground(new java.awt.Color(255, 255, 255));
        lbl_17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_17.setForeground(new java.awt.Color(255, 255, 255));
        lbl_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_17.setText("17");
        lbl_17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 60, 60));

        lbl_32.setBackground(new java.awt.Color(255, 255, 255));
        lbl_32.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_32.setForeground(new java.awt.Color(255, 255, 255));
        lbl_32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_32.setText("32");
        lbl_32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, 60));

        lbl_47.setBackground(new java.awt.Color(255, 255, 255));
        lbl_47.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_47.setForeground(new java.awt.Color(255, 255, 255));
        lbl_47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_47.setText("47");
        lbl_47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, 60));

        lbl_62.setBackground(new java.awt.Color(255, 255, 255));
        lbl_62.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_62.setForeground(new java.awt.Color(255, 255, 255));
        lbl_62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_62.setText("62");
        lbl_62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_62, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 60));

        lbl_34.setBackground(new java.awt.Color(255, 255, 255));
        lbl_34.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_34.setForeground(new java.awt.Color(255, 255, 255));
        lbl_34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_34.setText("34");
        lbl_34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_34, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 60, 60));

        lbl_64.setBackground(new java.awt.Color(255, 255, 255));
        lbl_64.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_64.setForeground(new java.awt.Color(255, 255, 255));
        lbl_64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_64.setText("64");
        lbl_64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_64, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 60, 60));

        lbl_49.setBackground(new java.awt.Color(255, 255, 255));
        lbl_49.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_49.setForeground(new java.awt.Color(255, 255, 255));
        lbl_49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_49.setText("49");
        lbl_49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_49, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 60, 60));

        lbl_4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_4.setText("4");
        lbl_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 60));

        lbl_19.setBackground(new java.awt.Color(255, 255, 255));
        lbl_19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_19.setForeground(new java.awt.Color(255, 255, 255));
        lbl_19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_19.setText("19");
        lbl_19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 60, 60));

        lbl_3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_3.setText("3");
        lbl_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 60, 60));

        lbl_18.setBackground(new java.awt.Color(255, 255, 255));
        lbl_18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_18.setForeground(new java.awt.Color(255, 255, 255));
        lbl_18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_18.setText("18");
        lbl_18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 60, 60));

        lbl_33.setBackground(new java.awt.Color(255, 255, 255));
        lbl_33.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_33.setForeground(new java.awt.Color(255, 255, 255));
        lbl_33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_33.setText("33");
        lbl_33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 60));

        lbl_48.setBackground(new java.awt.Color(255, 255, 255));
        lbl_48.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_48.setForeground(new java.awt.Color(255, 255, 255));
        lbl_48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_48.setText("48");
        lbl_48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_48, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 60));

        lbl_63.setBackground(new java.awt.Color(255, 255, 255));
        lbl_63.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_63.setForeground(new java.awt.Color(255, 255, 255));
        lbl_63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_63.setText("63");
        lbl_63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_63, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 60));

        lbl_7.setBackground(new java.awt.Color(255, 255, 255));
        lbl_7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_7.setText("7");
        lbl_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 60, 60));

        lbl_8.setBackground(new java.awt.Color(255, 255, 255));
        lbl_8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_8.setText("8");
        lbl_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 60, 60));

        lbl_67.setBackground(new java.awt.Color(255, 255, 255));
        lbl_67.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_67.setForeground(new java.awt.Color(255, 255, 255));
        lbl_67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_67.setText("67");
        lbl_67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_67, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 60, 60));

        lbl_38.setBackground(new java.awt.Color(255, 255, 255));
        lbl_38.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_38.setForeground(new java.awt.Color(255, 255, 255));
        lbl_38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_38.setText("38");
        lbl_38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_38, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 60, 60));

        lbl_22.setBackground(new java.awt.Color(255, 255, 255));
        lbl_22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_22.setForeground(new java.awt.Color(255, 255, 255));
        lbl_22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_22.setText("22");
        lbl_22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 60, 60));

        lbl_23.setBackground(new java.awt.Color(255, 255, 255));
        lbl_23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_23.setForeground(new java.awt.Color(255, 255, 255));
        lbl_23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_23.setText("23");
        lbl_23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 60, 60));

        lbl_52.setBackground(new java.awt.Color(255, 255, 255));
        lbl_52.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_52.setForeground(new java.awt.Color(255, 255, 255));
        lbl_52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_52.setText("52");
        lbl_52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 60, 60));

        lbl_68.setBackground(new java.awt.Color(255, 255, 255));
        lbl_68.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_68.setForeground(new java.awt.Color(255, 255, 255));
        lbl_68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_68.setText("68");
        lbl_68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_68, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 60, 60));

        lbl_53.setBackground(new java.awt.Color(255, 255, 255));
        lbl_53.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_53.setForeground(new java.awt.Color(255, 255, 255));
        lbl_53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_53.setText("53");
        lbl_53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_53, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 60, 60));

        lbl_37.setBackground(new java.awt.Color(255, 255, 255));
        lbl_37.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_37.setForeground(new java.awt.Color(255, 255, 255));
        lbl_37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_37.setText("37");
        lbl_37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_37, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, 60));

        lbl_5.setBackground(new java.awt.Color(255, 255, 255));
        lbl_5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_5.setText("5");
        lbl_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 60, 60));

        lbl_6.setBackground(new java.awt.Color(255, 255, 255));
        lbl_6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_6.setText("6");
        lbl_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 60, 60));

        lbl_21.setBackground(new java.awt.Color(255, 255, 255));
        lbl_21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_21.setForeground(new java.awt.Color(255, 255, 255));
        lbl_21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_21.setText("21");
        lbl_21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 60, 60));

        lbl_20.setBackground(new java.awt.Color(255, 255, 255));
        lbl_20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_20.setForeground(new java.awt.Color(255, 255, 255));
        lbl_20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_20.setText("20");
        lbl_20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, 60));

        lbl_35.setBackground(new java.awt.Color(255, 255, 255));
        lbl_35.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_35.setForeground(new java.awt.Color(255, 255, 255));
        lbl_35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_35.setText("35");
        lbl_35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_35, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 60, 60));

        lbl_36.setBackground(new java.awt.Color(255, 255, 255));
        lbl_36.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_36.setForeground(new java.awt.Color(255, 255, 255));
        lbl_36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_36.setText("36");
        lbl_36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, 60));

        lbl_50.setBackground(new java.awt.Color(255, 255, 255));
        lbl_50.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_50.setForeground(new java.awt.Color(255, 255, 255));
        lbl_50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_50.setText("50");
        lbl_50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_50, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 60, 60));

        lbl_51.setBackground(new java.awt.Color(255, 255, 255));
        lbl_51.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_51.setForeground(new java.awt.Color(255, 255, 255));
        lbl_51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_51.setText("51");
        lbl_51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_51, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 60, 60));

        lbl_65.setBackground(new java.awt.Color(255, 255, 255));
        lbl_65.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_65.setForeground(new java.awt.Color(255, 255, 255));
        lbl_65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_65.setText("65");
        lbl_65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_65, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 60, 60));

        lbl_66.setBackground(new java.awt.Color(255, 255, 255));
        lbl_66.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_66.setForeground(new java.awt.Color(255, 255, 255));
        lbl_66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_66.setText("66");
        lbl_66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_66, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 60));

        lbl_58.setBackground(new java.awt.Color(255, 255, 255));
        lbl_58.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_58.setForeground(new java.awt.Color(255, 255, 255));
        lbl_58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_58.setText("58");
        lbl_58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_58, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 60, 60));

        lbl_54.setBackground(new java.awt.Color(255, 255, 255));
        lbl_54.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_54.setForeground(new java.awt.Color(255, 255, 255));
        lbl_54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_54.setText("54");
        lbl_54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_54, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 60, 60));

        lbl_39.setBackground(new java.awt.Color(255, 255, 255));
        lbl_39.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_39.setForeground(new java.awt.Color(255, 255, 255));
        lbl_39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_39.setText("39");
        lbl_39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_39, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 60, 60));

        lbl_24.setBackground(new java.awt.Color(255, 255, 255));
        lbl_24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_24.setForeground(new java.awt.Color(255, 255, 255));
        lbl_24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_24.setText("24");
        lbl_24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 60, 60));

        lbl_9.setBackground(new java.awt.Color(255, 255, 255));
        lbl_9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_9.setForeground(new java.awt.Color(255, 255, 255));
        lbl_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_9.setText("9");
        lbl_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 60, 60));

        lbl_10.setBackground(new java.awt.Color(255, 255, 255));
        lbl_10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_10.setText("10");
        lbl_10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 60, 60));

        lbl_25.setBackground(new java.awt.Color(255, 255, 255));
        lbl_25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_25.setForeground(new java.awt.Color(255, 255, 255));
        lbl_25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_25.setText("25");
        lbl_25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 60, 60));

        lbl_40.setBackground(new java.awt.Color(255, 255, 255));
        lbl_40.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_40.setForeground(new java.awt.Color(255, 255, 255));
        lbl_40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_40.setText("40");
        lbl_40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 60, 60));

        lbl_55.setBackground(new java.awt.Color(255, 255, 255));
        lbl_55.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_55.setForeground(new java.awt.Color(255, 255, 255));
        lbl_55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_55.setText("55");
        lbl_55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_55, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 60, 60));

        lbl_69.setBackground(new java.awt.Color(255, 255, 255));
        lbl_69.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_69.setForeground(new java.awt.Color(255, 255, 255));
        lbl_69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_69.setText("69");
        lbl_69.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_69, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 60, 60));

        lbl_70.setBackground(new java.awt.Color(255, 255, 255));
        lbl_70.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_70.setForeground(new java.awt.Color(255, 255, 255));
        lbl_70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_70.setText("70");
        lbl_70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_70, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 60, 60));

        lbl_11.setBackground(new java.awt.Color(255, 255, 255));
        lbl_11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_11.setText("11");
        lbl_11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 60, 60));

        lbl_12.setBackground(new java.awt.Color(255, 255, 255));
        lbl_12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_12.setForeground(new java.awt.Color(255, 255, 255));
        lbl_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_12.setText("12");
        lbl_12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 60, 60));

        lbl_13.setBackground(new java.awt.Color(255, 255, 255));
        lbl_13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_13.setForeground(new java.awt.Color(255, 255, 255));
        lbl_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_13.setText("13");
        lbl_13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 60, 60));

        lbl_28.setBackground(new java.awt.Color(255, 255, 255));
        lbl_28.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_28.setForeground(new java.awt.Color(255, 255, 255));
        lbl_28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_28.setText("28");
        lbl_28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 60, 60));

        lbl_26.setBackground(new java.awt.Color(255, 255, 255));
        lbl_26.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_26.setForeground(new java.awt.Color(255, 255, 255));
        lbl_26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_26.setText("26");
        lbl_26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 60, 60));

        lbl_27.setBackground(new java.awt.Color(255, 255, 255));
        lbl_27.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_27.setForeground(new java.awt.Color(255, 255, 255));
        lbl_27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_27.setText("27");
        lbl_27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 60, 60));

        lbl_41.setBackground(new java.awt.Color(255, 255, 255));
        lbl_41.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_41.setForeground(new java.awt.Color(255, 255, 255));
        lbl_41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_41.setText("41");
        lbl_41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_41, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 60, 60));

        lbl_42.setBackground(new java.awt.Color(255, 255, 255));
        lbl_42.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_42.setForeground(new java.awt.Color(255, 255, 255));
        lbl_42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_42.setText("42");
        lbl_42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_42, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 60, 60));

        lbl_43.setBackground(new java.awt.Color(255, 255, 255));
        lbl_43.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_43.setForeground(new java.awt.Color(255, 255, 255));
        lbl_43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_43.setText("43");
        lbl_43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_43, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 60, 60));

        lbl_56.setBackground(new java.awt.Color(255, 255, 255));
        lbl_56.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_56.setForeground(new java.awt.Color(255, 255, 255));
        lbl_56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_56.setText("56");
        lbl_56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_56, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 60, 60));

        lbl_57.setBackground(new java.awt.Color(255, 255, 255));
        lbl_57.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_57.setForeground(new java.awt.Color(255, 255, 255));
        lbl_57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_57.setText("57");
        lbl_57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_57, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 60, 60));

        lbl_71.setBackground(new java.awt.Color(255, 255, 255));
        lbl_71.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_71.setForeground(new java.awt.Color(255, 255, 255));
        lbl_71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_71.setText("71");
        lbl_71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_71, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 60, 60));

        lbl_72.setBackground(new java.awt.Color(255, 255, 255));
        lbl_72.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_72.setForeground(new java.awt.Color(255, 255, 255));
        lbl_72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_72.setText("72");
        lbl_72.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_72, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 60, 60));

        lbl_73.setBackground(new java.awt.Color(255, 255, 255));
        lbl_73.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_73.setForeground(new java.awt.Color(255, 255, 255));
        lbl_73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_73.setText("73");
        lbl_73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_73, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 60, 60));

        lbl_14.setBackground(new java.awt.Color(255, 255, 255));
        lbl_14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_14.setForeground(new java.awt.Color(255, 255, 255));
        lbl_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_14.setText("14");
        lbl_14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 60));

        lbl_29.setBackground(new java.awt.Color(255, 255, 255));
        lbl_29.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_29.setForeground(new java.awt.Color(255, 255, 255));
        lbl_29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_29.setText("29");
        lbl_29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 60, 60));

        lbl_44.setBackground(new java.awt.Color(255, 255, 255));
        lbl_44.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_44.setForeground(new java.awt.Color(255, 255, 255));
        lbl_44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_44.setText("44");
        lbl_44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_44, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 60, 60));

        lbl_59.setBackground(new java.awt.Color(255, 255, 255));
        lbl_59.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_59.setForeground(new java.awt.Color(255, 255, 255));
        lbl_59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_59.setText("59");
        lbl_59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_59, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 60, 60));

        lbl_74.setBackground(new java.awt.Color(255, 255, 255));
        lbl_74.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_74.setForeground(new java.awt.Color(255, 255, 255));
        lbl_74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_74.setText("74");
        lbl_74.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_74, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 60, 60));

        lbl_15.setBackground(new java.awt.Color(255, 255, 255));
        lbl_15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_15.setForeground(new java.awt.Color(255, 255, 255));
        lbl_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_15.setText("15");
        lbl_15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 60, 60));

        lbl_30.setBackground(new java.awt.Color(255, 255, 255));
        lbl_30.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_30.setForeground(new java.awt.Color(255, 255, 255));
        lbl_30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_30.setText("30");
        lbl_30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 60, 60));

        lbl_45.setBackground(new java.awt.Color(255, 255, 255));
        lbl_45.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_45.setForeground(new java.awt.Color(255, 255, 255));
        lbl_45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_45.setText("45");
        lbl_45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_45, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 60, 60));

        lbl_60.setBackground(new java.awt.Color(255, 255, 255));
        lbl_60.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_60.setForeground(new java.awt.Color(255, 255, 255));
        lbl_60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_60.setText("60");
        lbl_60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_60, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 60, 60));

        lbl_75.setBackground(new java.awt.Color(255, 255, 255));
        lbl_75.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lbl_75.setForeground(new java.awt.Color(255, 255, 255));
        lbl_75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo_Bingo.png"))); // NOI18N
        lbl_75.setText("75");
        lbl_75.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlNumeros.add(lbl_75, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 60, 60));

        javax.swing.GroupLayout pnlTableroLayout = new javax.swing.GroupLayout(pnlTablero);
        pnlTablero.setLayout(pnlTableroLayout);
        pnlTableroLayout.setHorizontalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTableroLayout.setVerticalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_10;
    private javax.swing.JLabel lbl_11;
    private javax.swing.JLabel lbl_12;
    private javax.swing.JLabel lbl_13;
    private javax.swing.JLabel lbl_14;
    private javax.swing.JLabel lbl_15;
    private javax.swing.JLabel lbl_16;
    private javax.swing.JLabel lbl_17;
    private javax.swing.JLabel lbl_18;
    private javax.swing.JLabel lbl_19;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_20;
    private javax.swing.JLabel lbl_21;
    private javax.swing.JLabel lbl_22;
    private javax.swing.JLabel lbl_23;
    private javax.swing.JLabel lbl_24;
    private javax.swing.JLabel lbl_25;
    private javax.swing.JLabel lbl_26;
    private javax.swing.JLabel lbl_27;
    private javax.swing.JLabel lbl_28;
    private javax.swing.JLabel lbl_29;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_30;
    private javax.swing.JLabel lbl_31;
    private javax.swing.JLabel lbl_32;
    private javax.swing.JLabel lbl_33;
    private javax.swing.JLabel lbl_34;
    private javax.swing.JLabel lbl_35;
    private javax.swing.JLabel lbl_36;
    private javax.swing.JLabel lbl_37;
    private javax.swing.JLabel lbl_38;
    private javax.swing.JLabel lbl_39;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_40;
    private javax.swing.JLabel lbl_41;
    private javax.swing.JLabel lbl_42;
    private javax.swing.JLabel lbl_43;
    private javax.swing.JLabel lbl_44;
    private javax.swing.JLabel lbl_45;
    private javax.swing.JLabel lbl_46;
    private javax.swing.JLabel lbl_47;
    private javax.swing.JLabel lbl_48;
    private javax.swing.JLabel lbl_49;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_50;
    private javax.swing.JLabel lbl_51;
    private javax.swing.JLabel lbl_52;
    private javax.swing.JLabel lbl_53;
    private javax.swing.JLabel lbl_54;
    private javax.swing.JLabel lbl_55;
    private javax.swing.JLabel lbl_56;
    private javax.swing.JLabel lbl_57;
    private javax.swing.JLabel lbl_58;
    private javax.swing.JLabel lbl_59;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_60;
    private javax.swing.JLabel lbl_61;
    private javax.swing.JLabel lbl_62;
    private javax.swing.JLabel lbl_63;
    private javax.swing.JLabel lbl_64;
    private javax.swing.JLabel lbl_65;
    private javax.swing.JLabel lbl_66;
    private javax.swing.JLabel lbl_67;
    private javax.swing.JLabel lbl_68;
    private javax.swing.JLabel lbl_69;
    private javax.swing.JLabel lbl_7;
    private javax.swing.JLabel lbl_70;
    private javax.swing.JLabel lbl_71;
    private javax.swing.JLabel lbl_72;
    private javax.swing.JLabel lbl_73;
    private javax.swing.JLabel lbl_74;
    private javax.swing.JLabel lbl_75;
    private javax.swing.JLabel lbl_8;
    private javax.swing.JLabel lbl_9;
    private javax.swing.JLabel lbl_B;
    private javax.swing.JLabel lbl_G;
    private javax.swing.JLabel lbl_I;
    private javax.swing.JLabel lbl_N;
    private javax.swing.JLabel lbl_O;
    private javax.swing.JPanel pnlLetras;
    private javax.swing.JPanel pnlNumeros;
    private javax.swing.JPanel pnlTablero;
    // End of variables declaration//GEN-END:variables
}
