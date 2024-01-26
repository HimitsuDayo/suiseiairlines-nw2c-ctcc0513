package SuiseiAirlines;

import java.awt.Component;
import java.awt.Font;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AdminFlightUpdate extends javax.swing.JFrame {

    public AdminFlightUpdate() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flightcode = new javax.swing.JTextField();
        flyfrom = new javax.swing.JTextField();
        departure = new javax.swing.JTextField();
        flyto = new javax.swing.JTextField();
        classcombobox = new javax.swing.JComboBox<>();
        seatcombobox = new javax.swing.JComboBox<>();
        arrival = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchbutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        returnbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Flight Update");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("FLIGHT FROM");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("FLIGHT CODE");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("DATE OF DEPARTURE");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("SEAT CLASS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("FLIGHT TO");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("DATE OF ARRIVAL");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("SEAT NUMBER");

        flightcode.setBackground(new java.awt.Color(222, 254, 255));
        flightcode.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        flightcode.setForeground(new java.awt.Color(0, 0, 204));
        flightcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        flyfrom.setBackground(new java.awt.Color(222, 254, 255));
        flyfrom.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        flyfrom.setForeground(new java.awt.Color(0, 0, 204));
        flyfrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        departure.setBackground(new java.awt.Color(222, 254, 255));
        departure.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        departure.setForeground(new java.awt.Color(0, 0, 204));
        departure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        flyto.setBackground(new java.awt.Color(222, 254, 255));
        flyto.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        flyto.setForeground(new java.awt.Color(0, 0, 204));
        flyto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        classcombobox.setBackground(new java.awt.Color(222, 254, 255));
        classcombobox.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        classcombobox.setForeground(new java.awt.Color(0, 0, 204));
        classcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "First-Class", "Second-Class" }));

        seatcombobox.setBackground(new java.awt.Color(222, 254, 255));
        seatcombobox.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        seatcombobox.setForeground(new java.awt.Color(0, 0, 204));
        seatcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        arrival.setBackground(new java.awt.Color(222, 254, 255));
        arrival.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        arrival.setForeground(new java.awt.Color(0, 0, 204));
        arrival.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable1.setBackground(new java.awt.Color(222, 254, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(222, 254, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight Code", "Fly From", "Fly To", "Departure", "Arrival", "Seat Class", "Seat Code"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        searchbutton.setBackground(new java.awt.Color(222, 254, 255));
        searchbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        searchbutton.setForeground(new java.awt.Color(0, 0, 204));
        searchbutton.setText("SEARCH");
        searchbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("SUISEI'S FLIGHT MANAGEMENT");

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei3.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flyfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(classcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flyto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(flightcode, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(flightcode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(flyfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(flyto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(classcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed

        String inputFlightCode = flightcode.getText();        // Captures flight code and matches with one stored in database

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");       // Connection driver to phpadmin sql via xampp 
            Statement st = con.createStatement();
            String sql = "SELECT * from travelbook WHERE flightcode = ?";     // Selects and display flight details that matches same flightcode
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, inputFlightCode);

            ResultSet rs = ptst.executeQuery();
            DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
            dt.setRowCount(0);

            while(rs.next()){        // Displays the whole flight details inside the table
                Object o[] = {rs.getString("flightcode"),rs.getString("source"),rs.getString("destination"),rs.getString("departdate"),rs.getString("departarrival"),rs.getString("seatclass"),rs.getString("seatcode")};
                dt.addRow(o);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e);           // Shows an error if flight isnt found or searching wrong flight code
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        
        // If clicked, clear the textfields details and the table display.
        
        flightcode.setText("");
        flyfrom.setText("");
        flyto.setText("");
        departure.setText("");
        arrival.setText("");
        classcombobox.setSelectedIndex(0);
        seatcombobox.setSelectedIndex(0);
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);

    }//GEN-LAST:event_clearbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        
        // Captures input from textfields for each flight detail
        
        try {
        String code = flightcode.getText();
        String from = flyfrom.getText();
        String to = flyto.getText();
        String depart = departure.getText();
        String arrive = arrival.getText();
        String seatclass = classcombobox.getSelectedItem().toString();
        String seatcode = seatcombobox.getSelectedItem().toString();
        
        Class.forName("com.mysql.cj.jdbc.Driver");        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");  // Connection driver to phpadmin sql via xampp 
        
        // Statement to update flight details that is stored in database 
        String sql = "UPDATE `travelbook` SET `source`=?, `destination`=?, `departdate`=?, `departarrival`=?, `seatclass`=?, `seatcode`=? WHERE `flightcode`=?";
        
        // Updates the data stored in travelbook record
        
        PreparedStatement update = con.prepareStatement(sql);
        update.setString(1, from);   // Updates flight from data
        update.setString(2, to);      // Updates flight to data
        update.setString(3, depart);  // Updates departure date data
        update.setString(4, arrive);  // Updates arrival date data
        update.setString(5, seatclass);  // Updates seat class
        update.setString(6, seatcode);   // Updates seat code
        update.setString(7, code);       // Updates flight code
        
        int rowsAffected = update.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Flight Record Updated!");   // Shpw message if flight update is sucessful
        } else {
            JOptionPane.showMessageDialog(this, "Flight Record Not Found or No Changes Made.");     // Show error message if flight is not found.
        }
        
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating flight.");   // Show message if encountered an error changing flight details.
    }


        
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed

        AdminMenu admin = new AdminMenu();    // Sets adminmenu as destination frame
        admin.show();
        dispose();                 // Disposes the current frame and replace with target destination

    }//GEN-LAST:event_returnbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFlightUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrival;
    private javax.swing.JComboBox<String> classcombobox;
    private javax.swing.JButton clearbutton;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField flightcode;
    private javax.swing.JTextField flyfrom;
    private javax.swing.JTextField flyto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton searchbutton;
    private javax.swing.JComboBox<String> seatcombobox;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
