/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package author;

import cms.AdminLogin;
import homepage.HomePage;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Junayed
 */
public final class AuthorRegister extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegister
     */
    public AuthorRegister() {
        initComponents();
        ImageIcon image = new javax.swing.ImageIcon(getClass().getResource("/cms/images/cms.png"));

        Image img1 = image.getImage();
        Image img2 = img1.getScaledInstance(500, 350, 40);
        ImageIcon image1 = new javax.swing.ImageIcon(img2);

        BackgroundImage.setIcon(image1);

        ImageIcon closeImg = new javax.swing.ImageIcon(getClass().getResource("/cms/images/close.png"));
        Image cli1 = closeImg.getImage();
        Image cli2 = cli1.getScaledInstance(25, 25, 40);
        ImageIcon closeImage = new javax.swing.ImageIcon(cli2);

        close.setIcon(closeImage);

        ImageIcon backImg = new javax.swing.ImageIcon(getClass().getResource("/cms/images/back.png"));
        Image bki1 = backImg.getImage();
        Image bki2 = bki1.getScaledInstance(25, 25, 0);
        ImageIcon backimg = new javax.swing.ImageIcon(bki2);

        back.setIcon(backimg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeadingText = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        are_you = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        or_text = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        HeadingText.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        HeadingText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeadingText.setText("Hello would be author, Happy to see you");
        HeadingText.setAlignmentY(0.0F);
        HeadingText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BackgroundImage.setBackground(new java.awt.Color(255, 51, 255));
        BackgroundImage.setForeground(new java.awt.Color(51, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        are_you.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        are_you.setForeground(new java.awt.Color(102, 102, 255));
        are_you.setText("Are you not author?");
        are_you.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        are_you.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                are_youMouseClicked(evt);
            }
        });

        copyright.setText("All rights reserved @TeamNewbie 2022 (Sonargaon University)");

        register.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        register.setForeground(new java.awt.Color(51, 0, 204));
        register.setText("Already Registered?");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });

        or_text.setText("OR,");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(or_text))
                    .addComponent(copyright)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(register)
                            .addComponent(are_you))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(or_text)
                .addGap(2, 2, 2)
                .addComponent(are_you)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyright))
        );

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        back.setAlignmentY(0.0F);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Your Name:");

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setToolTipText("Enter your username");
        username.setAutoscrolls(false);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password:");

        Register.setBackground(new java.awt.Color(51, 51, 255));
        Register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("REGISTER");
        Register.setActionCommand("submit");
        Register.setBorder(new javax.swing.border.MatteBorder(null));
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.setName("register"); // NOI18N
        Register.setPreferredSize(new java.awt.Dimension(90, 30));
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Your email:");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setToolTipText("Enter your username");
        email.setAutoscrolls(false);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        email.setOpaque(false);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");

        confirmpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(HeadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(back))
                    .addComponent(HeadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(close)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        close.getAccessibleContext().setAccessibleName("closeBtn");
        back.getAccessibleContext().setAccessibleName("back");

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HomePage i = new HomePage();
        i.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void are_youMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_are_youMouseClicked
        // TODO add your handling code here:
        this.dispose();
        AdminLogin i = new AdminLogin();
        i.setVisible(true);
    }//GEN-LAST:event_are_youMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        this.dispose();
        AuthorLogin i = new AuthorLogin();
        i.setVisible(true);
    }//GEN-LAST:event_registerMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:

        String url = "jdbc:mariadb://127.0.0.1:3306/cms";
        String user = "root";
        String passw = "";

        String userName = username.getText();
        String emailAddress = email.getText();
        String passWord = new String(password.getPassword());
        String confirmPassWord = new String(confirmpassword.getPassword());

        try {

            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, passw);
            String insertingToDB = "INSERT INTO `cms`.`author` (`fullname`, `email`, `password`) VALUES(?, ?, ?)";
            String checkingDB = "Select * from `cms`.`author` where email=?";

            PreparedStatement checkStatement = con.prepareStatement(checkingDB);

            checkStatement.setString(1, emailAddress);

            ResultSet result = checkStatement.executeQuery(); // record added. 

            if (result.next()) {

                JOptionPane.showMessageDialog(this,"Author already register");

               
            }else{

            if ("".equals(userName)) {
                JOptionPane.showMessageDialog(this, "Please enter your name");
            } else if ("".equals(emailAddress)) {
                JOptionPane.showMessageDialog(this, "Pleass enter valid email");
            } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[g]{1}+[m]{1}+[a]{1}+[i]{1}+[l]{1}+[.]{1}+[c]{1}+[o]{1}+[m]{1}+$", emailAddress))) {
                JOptionPane.showMessageDialog(this, "Pleass enter valid email");
            } else if ("".equals(passWord)) {
                JOptionPane.showMessageDialog(this, "Please set a password");
            } else if ("".equals(confirmPassWord)) {
                JOptionPane.showMessageDialog(this, "Please confirm your password");
            } else {
                if (passWord.equals(confirmPassWord)) {

                    PreparedStatement st = con.prepareStatement(insertingToDB);

                    st.setString(1, userName);
                    st.setString(2, emailAddress);
                    st.setString(3, passWord);

                    st.executeUpdate(); // record added. 
                    con.close();
                    JOptionPane.showMessageDialog(this, "Registered successfully");

                    //Closing this window and setting new one
                    this.dispose();
                    AuthorLogin i = new AuthorLogin();
                    i.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Password don't matched!");
                }
            }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(AuthorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel HeadingText;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Register;
    private javax.swing.JLabel are_you;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JLabel copyright;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel or_text;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
