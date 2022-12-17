/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rankingPorNivelPersonal;

import com.zetcode.Tetris;

import java.awt.*;

import com.zetcode.Tetris;
import niveles.niveles;
import menuPrincipal.menuPrincipal;

/**
 *
 * @author andreea
 */
public class porNivelPersonal extends javax.swing.JFrame {

    /**
     * Creates new form porNivelPersonal
     */
    public porNivelPersonal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        background = new javax.swing.JPanel();
        cerrarButton = new javax.swing.JPanel();
        cerrarWord = new javax.swing.JLabel();
        ScrollPanel = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(204, 204, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarButton.setBackground(new java.awt.Color(222, 49, 99));
        cerrarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseClicked(evt);
            }
        });
        cerrarButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        cerrarWord.setForeground(new java.awt.Color(255, 255, 255));
        cerrarWord.setText("VOLVER");
        cerrarWord.setName("NUEVA PARTIDA"); // NOI18N
        cerrarButton.add(cerrarWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 30));

        background.add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 310, 50));

        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Fácil", null, null},
                        {"Medio", null, null},
                        {"Difícil", null, null},
                        {"Muy Difícil", null, null}
                },
                new String [] {
                        "Nivel", "Usuario", "Puntuación"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPanel.setViewportView(jTabla);

        background.add(ScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 730, 350));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        pack();
    }// </editor-fold>

    private void cerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {
        new menuPrincipal().setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(porNivelPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(porNivelPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(porNivelPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(porNivelPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new porNivelPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JPanel background;
    private javax.swing.JPanel cerrarButton;
    private javax.swing.JLabel cerrarWord;
    private javax.swing.JTable jTabla;
    // End of variables declaration

}
