/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package niveles;

import com.zetcode.Tetris;

import java.awt.*;

/**
 *
 * @author unai
 */
public class niveles extends javax.swing.JFrame {

    /**
     * Creates new form niveles
     */
    public niveles() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        backgroundEleccion = new javax.swing.JPanel();
        dificilButton = new javax.swing.JPanel();
        dificilWords = new javax.swing.JLabel();
        facilButton = new javax.swing.JPanel();
        facilWords = new javax.swing.JLabel();
        normalButton = new javax.swing.JPanel();
        normalWords = new javax.swing.JLabel();
        muyDificilButton = new javax.swing.JPanel();
        muyDificilWords = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new Color(204, 204, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new Font("Liberation Sans", 1, 36)); // NOI18N
        titulo.setText("ESCOGE EL NIVEL DE DIFICULTAD");
        background.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        backgroundEleccion.setBackground(new Color(204, 204, 255));
        backgroundEleccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 102, 255)));
        backgroundEleccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dificilButton.setBackground(new Color(204, 0, 51));
        dificilButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        dificilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dificilButtonMouseClicked(evt);
            }
        });
        dificilButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dificilWords.setFont(new Font("Liberation Sans", 1, 24)); // NOI18N
        dificilWords.setForeground(new Color(255, 255, 255));
        dificilWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dificilWords.setText("DIFÍCIL");
        dificilButton.add(dificilWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        backgroundEleccion.add(dificilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 350, 50));

        facilButton.setBackground(new Color(51, 204, 0));
        facilButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        facilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facilButtonMouseClicked(evt);
            }
        });
        facilButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facilWords.setFont(new Font("Liberation Sans", 1, 24)); // NOI18N
        facilWords.setForeground(new Color(255, 255, 255));
        facilWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facilWords.setText("FÁCIL");
        facilButton.add(facilWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        backgroundEleccion.add(facilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 350, 50));

        normalButton.setBackground(new Color(255, 102, 0));
        normalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        normalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                normalButtonMouseClicked(evt);
            }
        });
        normalButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        normalWords.setFont(new Font("Liberation Sans", 1, 24)); // NOI18N
        normalWords.setForeground(new Color(255, 255, 255));
        normalWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalWords.setText("NORMAL");
        normalButton.add(normalWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        backgroundEleccion.add(normalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 350, 50));

        muyDificilButton.setBackground(new Color(0, 0, 0));
        muyDificilButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        muyDificilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muyDificilButtonMouseClicked(evt);
            }
        });
        muyDificilButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        muyDificilWords.setFont(new Font("Liberation Sans", 1, 24)); // NOI18N
        muyDificilWords.setForeground(new Color(255, 255, 255));
        muyDificilWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muyDificilWords.setText("MUY DIFÍCIL");
        muyDificilButton.add(muyDificilWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        backgroundEleccion.add(muyDificilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 350, 50));

        background.add(backgroundEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 650, 350));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facilButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Ha seleccionado la dificultad FACIL");
        EventQueue.invokeLater(() -> {
            Tetris game = new Tetris();
            game.setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_facilButtonMouseClicked

    private void normalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Ha seleccionado la dificultad NORMAL");
        EventQueue.invokeLater(() -> {
            Tetris game = new Tetris();
            game.setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_normalButtonMouseClicked

    private void dificilButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dificilButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Ha seleccionado la dificultad DIFICIL");
        EventQueue.invokeLater(() -> {
            Tetris game = new Tetris();
            game.setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_dificilButtonMouseClicked

    private void muyDificilButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muyDificilButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Ha seleccionado la dificultad MUY DIFICIL");
        EventQueue.invokeLater(() -> {
            Tetris game = new Tetris();
            game.setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_muyDificilButtonMouseClicked

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
            java.util.logging.Logger.getLogger(niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new niveles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel backgroundEleccion;
    private javax.swing.JPanel dificilButton;
    private javax.swing.JLabel dificilWords;
    private javax.swing.JPanel facilButton;
    private javax.swing.JLabel facilWords;
    private javax.swing.JPanel muyDificilButton;
    private javax.swing.JLabel muyDificilWords;
    private javax.swing.JPanel normalButton;
    private javax.swing.JLabel normalWords;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}