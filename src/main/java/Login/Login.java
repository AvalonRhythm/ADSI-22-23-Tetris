/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.awt.Color;

/**
 *
 * @author unai
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        nomUsuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JPanel();
        entrarWord = new javax.swing.JLabel();
        BotonRegistro = new javax.swing.JPanel();
        registrarseWord = new javax.swing.JLabel();
        botonRecuperarPass = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(204, 204, 255));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setName(""); // NOI18N
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomUsuario.setForeground(new java.awt.Color(204, 204, 204));
        nomUsuario.setText("Introduzca su usuario");
        nomUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nomUsuarioMousePressed(evt);
            }
        });
        nomUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUsuarioActionPerformed(evt);
            }
        });
        Background.add(nomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 350, -1));

        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("********");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        Background.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 350, -1));

        botonEntrar.setBackground(new java.awt.Color(51, 102, 255));
        botonEntrar.setToolTipText("");
        botonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEntrar.setName(""); // NOI18N
        botonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEntrarMouseEntered(evt);
            }
        });
        botonEntrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrarWord.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        entrarWord.setForeground(new java.awt.Color(255, 255, 255));
        entrarWord.setText("ENTRAR");
        botonEntrar.add(entrarWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Background.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 40));
        botonEntrar.getAccessibleContext().setAccessibleName("");

        BotonRegistro.setBackground(new java.awt.Color(204, 204, 255));
        BotonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseClicked(evt);
            }
        });

        registrarseWord.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        registrarseWord.setForeground(new java.awt.Color(102, 102, 102));
        registrarseWord.setText("REGISTRARSE");

        javax.swing.GroupLayout BotonRegistroLayout = new javax.swing.GroupLayout(BotonRegistro);
        BotonRegistro.setLayout(BotonRegistroLayout);
        BotonRegistroLayout.setHorizontalGroup(
            BotonRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonRegistroLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(registrarseWord)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        BotonRegistroLayout.setVerticalGroup(
            BotonRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonRegistroLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(registrarseWord))
        );

        Background.add(BotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, 20));

        botonRecuperarPass.setBackground(new java.awt.Color(204, 204, 255));
        botonRecuperarPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRecuperarPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRecuperarPassMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¿Has olvidado tu contraseña?");

        javax.swing.GroupLayout botonRecuperarPassLayout = new javax.swing.GroupLayout(botonRecuperarPass);
        botonRecuperarPass.setLayout(botonRecuperarPassLayout);
        botonRecuperarPassLayout.setHorizontalGroup(
            botonRecuperarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonRecuperarPassLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        botonRecuperarPassLayout.setVerticalGroup(
            botonRecuperarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonRecuperarPassLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(botonRecuperarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 240, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 140, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomUsuarioActionPerformed

    private void botonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEntrarMouseEntered

    private void nomUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomUsuarioMousePressed
        if (nomUsuario.getText().equals("Introduzca su usuario")){
            nomUsuario.setText("");
            nomUsuario.setForeground(Color.black);
        }
        
        if (String.valueOf(password.getPassword()).isEmpty()){
            password.setText("********");
            password.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_nomUsuarioMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        if (nomUsuario.getText().isEmpty()){
            nomUsuario.setText("Introduzca su usuario");
            nomUsuario.setForeground(Color.gray);
        }
        
        if(String.valueOf(password.getPassword()).equals("********")){
            password.setText("");
            password.setForeground(Color.black);
        }

    }//GEN-LAST:event_passwordMousePressed

    private void botonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + nomUsuario.getText() + "\nContraseña: " + String.valueOf(password.getPassword()) , "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonEntrarMouseClicked

    private void BotonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Redirección a la IU de Registro");
    }//GEN-LAST:event_BotonRegistroMouseClicked

    private void botonRecuperarPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRecuperarPassMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Redirección a la IU de Recuperar Contraseña");
    }//GEN-LAST:event_botonRecuperarPassMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BotonRegistro;
    private javax.swing.JPanel botonEntrar;
    private javax.swing.JPanel botonRecuperarPass;
    private javax.swing.JLabel entrarWord;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomUsuario;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel registrarseWord;
    // End of variables declaration//GEN-END:variables
}