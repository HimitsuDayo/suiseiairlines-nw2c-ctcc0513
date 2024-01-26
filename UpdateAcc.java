package SuiseiAirlines;

import java.awt.Component;
import java.awt.Font;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class UpdateAcc extends javax.swing.JFrame {
        
public UpdateAcc() {
        initComponents();
        
           
        
        setCustomCellRenderer(jTable1, 20); 
        
        setHeaderFont(jTable1.getTableHeader(), 18);
    }

    private void setCustomCellRenderer(JTable table, int fontSize) {
        // Create custom cell renderer for setting font size
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setFont(new Font("Segoe UI Historic", Font.PLAIN, fontSize));
                return c;
            }
        };

        // Apply custom cell renderer to desired columns
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
    }
    
    private void setHeaderFont(JTableHeader header, int fontSize) {
        Font font = new Font("Segoe UI Historic", Font.PLAIN, fontSize);
        header.setFont(font);
    }
    
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        age = new javax.swing.JTextField();
        returnbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clearbutton = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        updatebutton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        passfield = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        conpassfield = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Update");

        age.setBackground(new java.awt.Color(222, 254, 255));
        age.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 204));
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        returnbutton.setBackground(new java.awt.Color(222, 254, 255));
        returnbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        returnbutton.setForeground(new java.awt.Color(0, 0, 204));
        returnbutton.setText("RETURN");
        returnbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("SUISEI'S ACCOUNT DETAILS CHANGER");

        address.setBackground(new java.awt.Color(222, 254, 255));
        address.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 204));
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nationality.setBackground(new java.awt.Color(222, 254, 255));
        nationality.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        nationality.setForeground(new java.awt.Color(0, 0, 204));
        nationality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("AGE");

        jLabel9.setBackground(new java.awt.Color(123, 141, 191));
        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("FIRST NAME");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("GENDER");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("OCCUPATION");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("ADDRESS");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("NATIONALITY");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("NUMBER");

        clearbutton.setBackground(new java.awt.Color(222, 254, 255));
        clearbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        clearbutton.setForeground(new java.awt.Color(0, 0, 204));
        clearbutton.setText("CLEAR");
        clearbutton.setToolTipText("");
        clearbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        fname.setBackground(new java.awt.Color(222, 254, 255));
        fname.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 204));
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        updatebutton.setBackground(new java.awt.Color(222, 254, 255));
        updatebutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(0, 0, 204));
        updatebutton.setText("UPDATE");
        updatebutton.setToolTipText("");
        updatebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(123, 141, 191));
        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("LAST NAME");

        lname.setBackground(new java.awt.Color(222, 254, 255));
        lname.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 204));
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        genderbox.setBackground(new java.awt.Color(222, 254, 255));
        genderbox.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        genderbox.setForeground(new java.awt.Color(0, 0, 204));
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "Male", "Female" }));
        genderbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("USERNAME");

        userfield.setBackground(new java.awt.Color(222, 254, 255));
        userfield.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        userfield.setForeground(new java.awt.Color(0, 0, 204));
        userfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("PASSWORD");

        passfield.setBackground(new java.awt.Color(222, 254, 255));
        passfield.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        passfield.setForeground(new java.awt.Color(0, 0, 204));
        passfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("CONFIRM PASSWORD");

        conpassfield.setBackground(new java.awt.Color(222, 254, 255));
        conpassfield.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        conpassfield.setForeground(new java.awt.Color(0, 0, 204));
        conpassfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        conpassfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassfieldActionPerformed(evt);
            }
        });

        occupation.setBackground(new java.awt.Color(222, 254, 255));
        occupation.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        occupation.setForeground(new java.awt.Color(0, 0, 204));
        occupation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        number.setBackground(new java.awt.Color(222, 254, 255));
        number.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        number.setForeground(new java.awt.Color(0, 0, 204));
        number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable1.setBackground(new java.awt.Color(222, 254, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Address", "Gender", "Nationality", "Occupation", "Number", "Username", "Password", "Confirm Passowrd"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age)
                            .addComponent(occupation))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conpassfield, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(conpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
  
    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed

        Travelmenu travel = new Travelmenu();    // Sets travelmenu frame as target destination
        travel.show();
        dispose();     // Disposes current frame then replace with target destination
        
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        
        
        if (passfield.getText().equals(conpassfield.getText())) {
        try {
        String firstn = fname.getText();
        String lastn = lname.getText();
        String old = age.getText();
        String home = address.getText();
        String gend = genderbox.getSelectedItem().toString();
        String national = nationality.getText();
        String occup = occupation.getText();
        String num = number.getText();
        String user = userfield.getText();
        String pass = passfield.getText();
        String conpass = conpassfield.getText();
        
        Class.forName("com.mysql.cj.jdbc.Driver");        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");    // Connection driver to phpadmin sql via xampp 
        
        // Statement to update user account details that is stored in database 
        String sql = "UPDATE `registration` SET `fname`=?, `lname`=?, `age`=?, `address`=?, `gender`=?, `nationality`=?, `occupation`=?, `number`=?, `uname`=?, `password`=?, `conpassword`=? WHERE `fname`=?";
        
        // Updates the user data stored in registration record
        
        PreparedStatement update = con.prepareStatement(sql);
        update.setString(1, firstn);         // Updates first name from account data
        update.setString(2, lastn);          // Updates last name from account data
        update.setString(3, old);            // Updates age from account data
        update.setString(4, home);           // Updates address from account data
        update.setString(5, gend);           // Updates gender from account data
        update.setString(6, national);       // Updates nationality from account data
        update.setString(7, occup);          // Updates occupation from account data
        update.setString(8, num);            // Updates number from account data
        update.setString(9, user);           // Updates username from account data
        update.setString(10, pass);          // Updates password from account data
        update.setString(11, conpass);       // Updates confirm password from account data
        update.setString(12, firstn);        // Updates first name from account data
        
        int rowsAffected = update.executeUpdate();    // Executes the query
        
        // This statement functions to update also the username and password of user stored in the login record
        String loginupdateSQL = "UPDATE `login` SET `username`=?, `password`=? WHERE `username`=?";
        PreparedStatement loginUpdate = con.prepareStatement(loginupdateSQL);
        loginUpdate.setString(1, user);
        loginUpdate.setString(2, pass);
        loginUpdate.setString(3, user);
        
        int rowsAffectedLogin = loginUpdate.executeUpdate();   // Executes the query
        
        JOptionPane.showMessageDialog(this, "User details has been updated!");    // Show message that the account update has been sucessfull and data is altered.
        con.close();
        
        } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "User details has encountered an error updating. Please try again");  // Error message if updating user details has failed.
        }
        } else {
        JOptionPane.showMessageDialog(this, "Passwords do not match.");    // Checks password and confirm password input and stops user from updating if both input dont match.
        }
        
 
        
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    private void genderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderboxActionPerformed

    private void conpassfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassfieldActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed

        // If clicked, clear the textfields details and the table display.

        fname.setText("");
        lname.setText("");
        age.setText("");
        address.setText("");
        genderbox.setSelectedIndex(0);
        nationality.setText("");
        occupation.setText("");
        number.setText("");
        userfield.setText("");
        passfield.setText("");
        conpassfield.setText("");
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);

    }//GEN-LAST:event_clearbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton clearbutton;
    private javax.swing.JTextField conpassfield;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField number;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField passfield;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton updatebutton;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
