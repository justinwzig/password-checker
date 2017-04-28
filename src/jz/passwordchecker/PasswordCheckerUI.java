/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jz.passwordchecker;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author student
 */
public class PasswordCheckerUI extends javax.swing.JFrame {

    /**
     * Creates new form PasswordCheckerUI
     */
    public PasswordCheckerUI() {
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

        PasswordFeild = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameFeild = new javax.swing.JTextField();
        RegisterLabel = new javax.swing.JLabel();
        PasswordStrength = new javax.swing.JProgressBar();
        RegisterButton = new javax.swing.JButton();
        ErrorTitle = new javax.swing.JLabel();
        Error1 = new javax.swing.JLabel();
        Error2 = new javax.swing.JLabel();
        Error3 = new javax.swing.JLabel();
        Error4 = new javax.swing.JLabel();
        Error5 = new javax.swing.JLabel();
        Error6 = new javax.swing.JLabel();
        Error7 = new javax.swing.JLabel();
        UsernameErrorTitle = new javax.swing.JLabel();
        UsernameError1 = new javax.swing.JLabel();
        UsernameError2 = new javax.swing.JLabel();
        UsernameError3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PasswordFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFeildActionPerformed(evt);
            }
        });
        PasswordFeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PasswordFeildKeyReleased(evt);
            }
        });

        PasswordLabel.setText("Password");

        UsernameLabel.setText("Username");

        UsernameFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFeildActionPerformed(evt);
            }
        });
        UsernameFeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsernameFeildKeyReleased(evt);
            }
        });

        RegisterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegisterLabel.setText("Register");

        PasswordStrength.setForeground(new java.awt.Color(51, 255, 0));
        PasswordStrength.setToolTipText("Password Strength\n");
        PasswordStrength.setValue(50);
        PasswordStrength.setBorderPainted(false);

        RegisterButton.setText("Go!");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        Error1.setText(" ");

        Error2.setText(" ");

        Error3.setText(" ");

        Error4.setText(" ");

        Error5.setText(" ");

        Error6.setText(" ");

        Error7.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UsernameFeild)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameLabel)
                                    .addComponent(RegisterButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UsernameError1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Error6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Error5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(Error1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Error2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Error3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Error4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Error7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameErrorTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UsernameError2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameError3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PasswordStrength, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordFeild, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordStrength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegisterButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsernameErrorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(UsernameError1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameError2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameError3)
                        .addGap(68, 68, 68)
                        .addComponent(ErrorTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error7)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFeildActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void PasswordFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFeildActionPerformed

    private void PasswordFeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFeildKeyReleased
        // TODO add your handling code here:
        String pWord = PasswordFeild.getText();
        System.out.println(pWord);
        Password1 GUIPassCheck = new Password1 (pWord);
        int str = 0;
        //Your processing code
        
        
        if(GUIPassCheck.isLength()==true){
            Error1.setText(" ");
            str = str + 14;
        } else {
            Error1.setText("Password must be 8 characters.");
        }
        
        if(GUIPassCheck.hasDigit()==true){
            Error2.setText(" ");
            str = str + 14;
        } else {
            Error2.setText("Password must include a digit.");
        }
        
        if(GUIPassCheck.hasUpper()==true){
            Error3.setText(" ");
            str = str + 14;
        } else {
            Error3.setText("Password must include an uppercase character.");
        }
        
        if(GUIPassCheck.hasLower()==true){
            Error4.setText(" ");
            str = str + 14;
        } else {
            Error4.setText("Password must include a lowercase character.");
        }
        
        if(GUIPassCheck.hasSymbol()==true){
            Error5.setText(" ");
            str = str + 14;
        } else {
            Error5.setText("Password must include a symbol.");
        }
        
        if(GUIPassCheck.hasThreeChars()==true){
            Error6.setText(" ");
            
        } else {
            Error6.setText("Password must not have 3 repeated characters.");
            str = str - 14;
        }
        
        if(GUIPassCheck.hasCommonWord()==true){
            Error7.setText(" ");
            
        } else {
            Error7.setText("Password must not include a common word.");
            str = str - 14;
        }
        
        if(GUIPassCheck.isLength()==false || GUIPassCheck.hasDigit()==false || GUIPassCheck.hasUpper()==false || GUIPassCheck.hasLower()==false || GUIPassCheck.hasSymbol()==false || GUIPassCheck.hasThreeChars()==false || GUIPassCheck.hasCommonWord()==false){
            ErrorTitle.setText("You have password errors:");
        } else {
            ErrorTitle.setText(" ");
            str = 100;
        }
        PasswordStrength.setValue(str);
        if(str<20){
            PasswordStrength.setForeground(new java.awt.Color(255, 51, 51));
        }
        if(str>20 && str<80){
            PasswordStrength.setForeground(new java.awt.Color(255, 255, 0));
        }
        if(str>80){   
            PasswordStrength.setForeground(new java.awt.Color(51, 255, 51));
        }
    }//GEN-LAST:event_PasswordFeildKeyReleased

    private void UsernameFeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFeildKeyReleased
        // TODO add your handling code here:
        String user = UsernameFeild.getText();
        System.out.println(user);
        Username1 GUIUserCheck = new Username1 (user);
        int str = 0;
        //Your processing code
        
        
        if(GUIUserCheck.atSign()==true){
            UsernameError1.setText(" ");
            str = str + 10;
        } else {
            UsernameError1.setText("Username must include an @ sign.");
        }
        
        if(GUIUserCheck.period()==true){
            UsernameError2.setText(" ");
            str = str + 10;
        } else {
            UsernameError2.setText("Username must include a period. (Period must come after @ sign)");
        }
        
        if(GUIUserCheck.length()==true){
            UsernameError3.setText(" ");
            str = str + 10;
        } else {
            UsernameError3.setText("Username is too long or too short.");
        }
        
        if(str<0){
            UsernameErrorTitle.setText("You Have Username Errors");
        } else {
            UsernameErrorTitle.setText(" ");
        }
        
        
    }//GEN-LAST:event_UsernameFeildKeyReleased
                                    
        
    
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
            java.util.logging.Logger.getLogger(PasswordCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordCheckerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Error1;
    private javax.swing.JLabel Error2;
    private javax.swing.JLabel Error3;
    private javax.swing.JLabel Error4;
    private javax.swing.JLabel Error5;
    private javax.swing.JLabel Error6;
    private javax.swing.JLabel Error7;
    private javax.swing.JLabel ErrorTitle;
    private javax.swing.JTextField PasswordFeild;
    private javax.swing.JLabel PasswordLabel;
    public javax.swing.JProgressBar PasswordStrength;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JLabel UsernameError1;
    private javax.swing.JLabel UsernameError2;
    private javax.swing.JLabel UsernameError3;
    private javax.swing.JLabel UsernameErrorTitle;
    private javax.swing.JTextField UsernameFeild;
    private javax.swing.JLabel UsernameLabel;
    // End of variables declaration//GEN-END:variables
}