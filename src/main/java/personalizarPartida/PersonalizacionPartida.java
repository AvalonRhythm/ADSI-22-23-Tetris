/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package personalizarPartida;

import javax.swing.*;
import java.awt.*;
import com.zetcode.Board;

/**
 *
 * @author lucas
 */
public class PersonalizacionPartida extends javax.swing.JFrame {

    /**
     * Creates new form PersonalizacionPartida
     */
    public PersonalizacionPartida() {
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

        Background = new javax.swing.JPanel();
        ColorFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ColorLadrillo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Guardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CFondo = new javax.swing.JLabel();
        CLadrillo = new javax.swing.JLabel();
        SClásicos = new javax.swing.JRadioButton();
        SExplosiones = new javax.swing.JRadioButton();
        SAcciones = new javax.swing.JLabel();
        Volumen = new javax.swing.JSlider();
        CVolumen = new javax.swing.JLabel();
        LimpiarLadrillos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LimpiarFondo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 204, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColorFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(""); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorFondoButtonMouseClicked(evt);
            }
        });
        ColorFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 240, 150));

        Background.add(ColorFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, 150));

        ColorLadrillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText(""); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorLadrillosButtonMouseClicked(evt);
            }
        });
        ColorLadrillo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 260, 150));

        Background.add(ColorLadrillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 190, 150));

        Cancelar.setBackground(new java.awt.Color(51, 102, 255));
        Cancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("         CANCELAR");
        Cancelar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        Background.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 150, 40));

        Guardar.setBackground(new java.awt.Color(51, 102, 255));
        Guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtonMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 102, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("          GUARDAR");
        Guardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        Background.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 150, 40));

        CFondo.setText("        Color de Fondo");
        Background.add(CFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, -1));

        CLadrillo.setText("       Color de Ladrillos");
        Background.add(CLadrillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 170, -1));

        SClásicos.setText("Clásicos");

        Background.add(SClásicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        SExplosiones.setText("Explosiones");
        Background.add(SExplosiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        SAcciones.setText("Sonidos de acciones:");
        Background.add(SAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));
        Background.add(Volumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 160, -1));

        CVolumen.setText("Volúmen:");
        Background.add(CVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        LimpiarLadrillos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LimpiarLadrillos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LimpiarLadrillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarLadrillosButtonMouseClicked(evt);
            }
        });
        LimpiarLadrillos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Background.add(LimpiarLadrillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 30, 30));

        LimpiarFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LimpiarFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LimpiarFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarFondoButtonMouseClicked(evt);
            }
        });
        LimpiarFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 29, 30));

        Background.add(LimpiarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Se han guardado los cambios");
        this.dispose();
    }//GEN-LAST:event_guardarButtonMouseClicked

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Se han cancelado los cambios");
        this.dispose();
    }//GEN-LAST:event_guardarButtonMouseClicked

    private void colorFondoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Selecciona el color de fondo");
        JColorChooser colFondo = new JColorChooser();
        Color cF = JColorChooser.showDialog(null, "Elige un color para el fondo", Color.black);
        ColorFondo.setBackground(cF);
    }//GEN-LAST:event_guardarButtonMouseClicked

    private void colorLadrillosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Selecciona el color de los ladrillos");
        JColorChooser colLadrillos = new JColorChooser();
        Color cL = JColorChooser.showDialog(null, "Elige un color para los ladrillos", Color.black);
        ColorLadrillo.setBackground(cL);
    }

    private void limpiarFondoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Se ha limpiado el color de Fondo");
        Color inic = new Color(255,255,255);
        ColorFondo.setBackground(inic);
    }

    private void limpiarLadrillosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Se ha limpiado el color de los ladrillos");
        Color inic2 = new Color(255,255,255);
        ColorLadrillo.setBackground(inic2);
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
            java.util.logging.Logger.getLogger(PersonalizacionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalizacionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalizacionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalizacionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalizacionPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel CFondo;
    private javax.swing.JLabel CLadrillo;
    private javax.swing.JLabel CVolumen;
    private javax.swing.JPanel Cancelar;
    private javax.swing.JPanel ColorFondo;
    private javax.swing.JPanel ColorLadrillo;
    private javax.swing.JPanel Guardar;
    private javax.swing.JPanel LimpiarFondo;
    private javax.swing.JPanel LimpiarLadrillos;
    private javax.swing.JLabel SAcciones;
    private javax.swing.JRadioButton SClásicos;
    private javax.swing.JRadioButton SExplosiones;
    private javax.swing.JSlider Volumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
