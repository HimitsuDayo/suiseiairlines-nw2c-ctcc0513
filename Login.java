package SuiseiAirlines;

import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        
        
    }
    
    private ResultSet getUserDetails(String username) throws SQLException {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration", "root", "");
    Statement st = con.createStatement();
    String sql = "SELECT * FROM login WHERE username = '" + username + "'";
    return st.executeQuery(sql);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        showbutton = new javax.swing.JRadioButton();
        signinbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        signupbutton = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei3.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("USERNAME:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("PASSWORD:");

        user.setBackground(new java.awt.Color(222, 254, 255));
        user.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 204));
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        showbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        showbutton.setForeground(new java.awt.Color(0, 0, 204));
        showbutton.setText("SHOW");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });

        signinbutton.setBackground(new java.awt.Color(222, 254, 255));
        signinbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        signinbutton.setForeground(new java.awt.Color(0, 0, 204));
        signinbutton.setText("SIGN IN");
        signinbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        signinbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbuttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("NO ACCOUNT YET?");

        signupbutton.setBackground(new java.awt.Color(222, 254, 255));
        signupbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        signupbutton.setForeground(new java.awt.Color(0, 0, 204));
        signupbutton.setText("SIGN UP");
        signupbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(222, 254, 255));
        pass.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 204));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 54)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("SUISEI");

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 54)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("AIRLINES");

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei1.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(signinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(showbutton)))
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel13))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showbutton)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(signinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbuttonActionPerformed
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String un = user.getText();      // Captures user username input
        String pw = pass.getText();        // Captures user password input
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration", "root", "");
        Statement st = con.createStatement();
        String sql = "SELECT * FROM login";        // After capturing user input, selects and matches username and password with the ones stored on database 
        ResultSet rs = st.executeQuery(sql);
        
        boolean isAdmin = false;       // Detects if input is admin credentials
        boolean isUser = false;       // Detects is input is user credentials
        
        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            
            if (un.equals("admin") && pw.equals("admin123")) {  
                isAdmin = true;       // Checks if input equals admin details
                break;  
            } else if (un.equals(username) && pw.equals(password)) {   
                isUser = true;       // Checks if input equals user details
                break;  
            }
        }
        
        if (isAdmin) {
            new AdminMenu().setVisible(true);   // If input is admin and matches database credentials, show adminmenu frame
            dispose();        // Disposes current login frame and replaces with target destination frame
            
        } else if (isUser) {                      // If input is user and matches database credentials, show travelmenu frame
            new Travelmenu().setVisible(true);
            dispose();       // Disposes current login frame and replaces with target destination frame
            
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.");   // Shows error if input is incorrect or credentials was not found in database.
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);


    }                                           
    }//GEN-LAST:event_signinbuttonActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        
        Registration frame2 = new Registration();  // Sets registration frame as target destination
        frame2.show();         // Opens the registration form frame
        dispose();   // Disposes current frame then replace with target destination
        
    }//GEN-LAST:event_signupbuttonActionPerformed

    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed
        
        if (showbutton.isSelected()) {      // Reveals the password so user can check if correct
            pass.setEchoChar((char)0);  // Turns * into character 
        }
        else {
            pass.setEchoChar('*');  // Returns character to * form
        }
        
    }//GEN-LAST:event_showbuttonActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pass;
    private javax.swing.JRadioButton showbutton;
    private javax.swing.JButton signinbutton;
    private javax.swing.JButton signupbutton;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}
