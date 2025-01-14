/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menuPrincipal;

import niveles.niveles;
import premios.premios;
import personalizarPartida.PersonalizacionPartida;
import Login.Login;
import rankingInicial.rankingInicial;

/**
 *
 * @author unai
 */
public class menuPrincipal extends javax.swing.JFrame {
    private niveles selecNive = new niveles();

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
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
        rankingButton = new javax.swing.JPanel();
        rankingWord = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JPanel();
        cerrarWord = new javax.swing.JLabel();
        recuperarPartButton = new javax.swing.JPanel();
        recuWord = new javax.swing.JLabel();
        nuevaPartButton = new javax.swing.JPanel();
        nuevaWord = new javax.swing.JLabel();
        opcionesButton = new javax.swing.JPanel();
        opcionesWord = new javax.swing.JLabel();
        premiosButton = new javax.swing.JPanel();
        premiosWord = new javax.swing.JLabel();
        imagenTetris = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(204, 204, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rankingButton.setBackground(new java.awt.Color(30, 144, 255));
        rankingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rankingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rankingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingButtonMouseClicked(evt);
            }
        });
        rankingButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rankingWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        rankingWord.setForeground(new java.awt.Color(255, 255, 255));
        rankingWord.setText("VER RANKING");
        rankingWord.setName("NUEVA PARTIDA"); // NOI18N
        rankingButton.add(rankingWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        background.add(rankingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 310, 50));

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
        cerrarWord.setText("CERRAR SESIÓN");
        cerrarWord.setName("NUEVA PARTIDA"); // NOI18N
        cerrarButton.add(cerrarWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        background.add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 310, 50));

        recuperarPartButton.setBackground(new java.awt.Color(255, 153, 0));
        recuperarPartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recuperarPartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recuperarPartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recuperarPartButtonMouseClicked(evt);
            }
        });
        recuperarPartButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recuWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        recuWord.setForeground(new java.awt.Color(255, 255, 255));
        recuWord.setText("RECUPERAR PARTIDA");
        recuWord.setName("NUEVA PARTIDA"); // NOI18N
        recuperarPartButton.add(recuWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        background.add(recuperarPartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 310, 50));

        nuevaPartButton.setBackground(new java.awt.Color(204, 0, 51));
        nuevaPartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nuevaPartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevaPartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevaPartButtonMouseClicked(evt);
            }
        });
        nuevaPartButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevaWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        nuevaWord.setForeground(new java.awt.Color(255, 255, 255));
        nuevaWord.setText("NUEVA PARTIDA");
        nuevaWord.setName("NUEVA PARTIDA"); // NOI18N
        nuevaPartButton.add(nuevaWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        background.add(nuevaPartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 310, 50));

        opcionesButton.setBackground(new java.awt.Color(51, 153, 0));
        opcionesButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcionesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcionesButtonMouseClicked(evt);
            }
        });
        opcionesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcionesWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        opcionesWord.setForeground(new java.awt.Color(255, 255, 255));
        opcionesWord.setText("OPCIONES");
        opcionesWord.setName("NUEVA PARTIDA"); // NOI18N
        opcionesButton.add(opcionesWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        background.add(opcionesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 310, 50));

        premiosButton.setBackground(new java.awt.Color(255, 204, 0));
        premiosButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        premiosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        premiosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                premiosButtonMouseClicked(evt);
            }
        });
        premiosButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        premiosWord.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        premiosWord.setForeground(new java.awt.Color(255, 255, 255));
        premiosWord.setText("VER PREMIOS");
        premiosWord.setName("NUEVA PARTIDA"); // NOI18N
        premiosButton.add(premiosWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        background.add(premiosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 310, 50));

        imagenTetris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_tetris.png"))); // NOI18N
        background.add(imagenTetris, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -10, 580, 440));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarButtonMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarButtonMouseClicked

    private void recuperarPartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperarPartButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Redirección a IU de recuperar partida.");
    }//GEN-LAST:event_recuperarPartButtonMouseClicked

    private void nuevaPartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaPartButtonMouseClicked
        selecNive.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevaPartButtonMouseClicked

    private void premiosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_premiosButtonMouseClicked
        new premios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_premiosButtonMouseClicked

    private void rankingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingButtonMouseClicked
        new rankingInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rankingButtonMouseClicked

    private void opcionesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionesButtonMouseClicked
        new PersonalizacionPartida().setVisible(true);
    }//GEN-LAST:event_opcionesButtonMouseClicked

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cerrarButton;
    private javax.swing.JLabel cerrarWord;
    private javax.swing.JLabel imagenTetris;
    private javax.swing.JPanel nuevaPartButton;
    private javax.swing.JLabel nuevaWord;
    private javax.swing.JPanel opcionesButton;
    private javax.swing.JLabel opcionesWord;
    private javax.swing.JPanel premiosButton;
    private javax.swing.JLabel premiosWord;
    private javax.swing.JPanel rankingButton;
    private javax.swing.JLabel rankingWord;
    private javax.swing.JLabel recuWord;
    private javax.swing.JPanel recuperarPartButton;
    // End of variables declaration//GEN-END:variables

}