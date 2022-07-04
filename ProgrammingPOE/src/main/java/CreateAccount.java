import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;




public class CreateAccount extends javax.swing.JFrame {
    
    
    protected static String name;
    protected static String surname;

    public CreateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameSU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameSU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        surnameSU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        passwordSU = new javax.swing.JPasswordField();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Please enter your Name: ");

        jLabel2.setText("Please enter a password:");

        usernameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameSUActionPerformed(evt);
            }
        });

        jLabel3.setText("Please enter a username:");

        nameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSUActionPerformed(evt);
            }
        });

        jLabel4.setText("Please enter your Surname:");

        surnameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameSUActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Creating an account");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        passwordSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordSUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(signupButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(surnameSU, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameSU, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel4)))
                                    .addComponent(usernameSU, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordSU, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(surnameSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupButton)
                    .addComponent(passwordSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void nameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSUActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nameSUActionPerformed

    private void usernameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameSUActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_usernameSUActionPerformed

    private void surnameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameSUActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_surnameSUActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        
       name = nameSU.getText();
        
       surname = surnameSU.getText();
       
       String username = usernameSU.getText();
       
       String password = passwordSU.getText();
       
       
        boolean usernameCheck = false;
        
        boolean passwordCheck = false;
        
        if (username.length()<=6 && username.contains("_") )
        {
            JOptionPane.showMessageDialog(null,"Username successfully captured");
            
            //System.out.println("Username successfully captured")
            
            usernameCheck = true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
            
            //System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .");
            
            usernameCheck = false;
        
        }
            
        if (password.length() >=8 && password.matches(".*[0-9]*.") && password.matches(".*[A-Z].*") && !password.matches("[a-zA-Z0-9]*"))
        {
            
            JOptionPane.showMessageDialog(null, "Password successfully captured");
            
            //System.out.println("Password successfully captured");
            
            passwordCheck = true;
        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            
            //System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            
            passwordCheck = false;
             
        }
        
        if(passwordCheck == true && usernameCheck == true)
        {
            
            File myFile = new File("AccDetails.txt");
            
            
            try
            {
              FileWriter Writer = new FileWriter ("AccDetails.txt", true); //creates and reads txt 
              BufferedWriter writeDetails = new BufferedWriter(Writer);
              writeDetails.write(username + " " + nameSU.getText() + " " + surnameSU.getText() + " "+password + "\n" ); // adds varaiables
              writeDetails.close();
              
              JOptionPane.showMessageDialog(null,"Account has been successfully created");
             
            }
            catch(HeadlessException | IOException e) // message dialog for error 
            {
             JOptionPane.showMessageDialog(null,"Error");
            }

            
        }
        
        System.exit(0);
       
        
       
    }//GEN-LAST:event_signupButtonActionPerformed

    
    
    public static void setFirstName(String name)
    {
    
        nameSU.setText(name);
    
    
    }
    
    public static void setSecondName(String surname)
    {
    
        surnameSU.setText(surname);
    
    
    }
    
    private void passwordSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordSUActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new CreateAccount().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    protected static javax.swing.JTextField nameSU;
    protected static javax.swing.JPasswordField passwordSU;
    public javax.swing.JButton signupButton;
    protected static javax.swing.JTextField surnameSU;
    protected static javax.swing.JTextField usernameSU;
    // End of variables declaration//GEN-END:variables

    private static class jToggleButton1 extends JToggleButton {

        public jToggleButton1(String finished) {
        }
    }

   
}
