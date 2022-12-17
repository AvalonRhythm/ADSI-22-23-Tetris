/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rankingPorNivel;

import com.zetcode.Tetris;

import java.awt.*;

import com.zetcode.Tetris;
import rankingPorNivelPersonal.porNivelPersonal;
import rankingPorNivelGlobal.porNivelGlobal;

/**
 *
 * @author andreea
 */
public class rankingPorNivel extends javax.swing.JFrame {

    private porNivelPersonal personal = new porNivelPersonal();
    private porNivelGlobal global = new porNivelGlobal();

    /**
     * Creates new form rankingPorNivel
     */
    public rankingPorNivel() {
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
        globalButton = new javax.swing.JPanel();
        globalWord = new javax.swing.JLabel();
        personalButton = new javax.swing.JPanel();
        personalWord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(204, 204, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        globalButton.setBackground(new java.awt.Color(30, 144, 255));
        globalButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        globalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        globalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                globalButtonMouseClicked(evt);
            }
        });
        globalButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        globalWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        globalWord.setForeground(new java.awt.Color(255, 255, 255));
        globalWord.setText("RANKING GLOBAL");
        globalWord.setName("NUEVA PARTIDA"); // NOI18N
        globalButton.add(globalWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        background.add(globalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 310, 50));

        personalButton.setBackground(new java.awt.Color(204, 0, 51));
        personalButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        personalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        personalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalButtonMouseClicked(evt);
            }
        });
        personalButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personalWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        personalWord.setForeground(new java.awt.Color(255, 255, 255));
        personalWord.setText("RANKING PERSONAL");
        personalWord.setName("NUEVA PARTIDA"); // NOI18N
        personalButton.add(personalWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        background.add(personalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 310, 50));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 120));

        pack();
    }// </editor-fold>

    private void personalButtonMouseClicked(java.awt.event.MouseEvent evt) {
        //javax.swing.JOptionPane.showMessageDialog(this, "Redirección a IU Ranking Por Nivel Personal.");
        personal.setVisible(true);
        this.dispose();
    }

    private void globalButtonMouseClicked(java.awt.event.MouseEvent evt) {
        //javax.swing.JOptionPane.showMessageDialog(this, "Redirección a IU Ranking Por Nivel Global.");
        global.setVisible(true);
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
            java.util.logging.Logger.getLogger(rankingPorNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rankingPorNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rankingPorNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rankingPorNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rankingPorNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel globalButton;
    private javax.swing.JLabel globalWord;
    private javax.swing.JPanel background;
    private javax.swing.JPanel personalButton;
    private javax.swing.JLabel personalWord;
    // End of variables declaration

}
