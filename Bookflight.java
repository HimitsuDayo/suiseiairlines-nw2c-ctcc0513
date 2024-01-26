package SuiseiAirlines;

import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;


public class Bookflight extends javax.swing.JFrame {

    public Bookflight() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        returnbutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        bookbutton = new javax.swing.JButton();
        departure = new javax.swing.JTextField();
        arrival = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        flcode = new javax.swing.JTextField();
        flyto = new javax.swing.JTextField();
        flyfrom = new javax.swing.JTextField();
        printbutton = new javax.swing.JButton();
        classcombobox = new javax.swing.JComboBox<>();
        seatcombobox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FLIGHT BOOKING");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Booking");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("SUISEI'S FLIGHT BOOKING");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("FLIGHT FROM");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("FLIGHT TO");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("DATE OF DEPARTURE");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("DATE OF ARRIVAL");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("SEAT CLASS");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("SEAT NUMBER");

        returnbutton.setBackground(new java.awt.Color(222, 254, 255));
        returnbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        returnbutton.setForeground(new java.awt.Color(0, 0, 204));
        returnbutton.setText("RETURN");
        returnbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        resetbutton.setBackground(new java.awt.Color(222, 254, 255));
        resetbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(0, 0, 204));
        resetbutton.setText("RESET FORM");
        resetbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        bookbutton.setBackground(new java.awt.Color(222, 254, 255));
        bookbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        bookbutton.setForeground(new java.awt.Color(0, 0, 204));
        bookbutton.setText("BOOK FLIGHT");
        bookbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bookbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbuttonActionPerformed(evt);
            }
        });

        departure.setBackground(new java.awt.Color(222, 254, 255));
        departure.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        departure.setForeground(new java.awt.Color(0, 0, 204));
        departure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureActionPerformed(evt);
            }
        });

        arrival.setBackground(new java.awt.Color(222, 254, 255));
        arrival.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        arrival.setForeground(new java.awt.Color(0, 0, 204));
        arrival.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("FLIGHT CODE");

        flcode.setBackground(new java.awt.Color(222, 254, 255));
        flcode.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        flcode.setForeground(new java.awt.Color(0, 0, 204));
        flcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        flyto.setBackground(new java.awt.Color(222, 254, 255));
        flyto.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        flyto.setForeground(new java.awt.Color(0, 0, 204));
        flyto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        flyfrom.setBackground(new java.awt.Color(222, 254, 255));
        flyfrom.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        flyfrom.setForeground(new java.awt.Color(0, 0, 204));
        flyfrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        printbutton.setBackground(new java.awt.Color(222, 254, 255));
        printbutton.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        printbutton.setForeground(new java.awt.Color(0, 0, 204));
        printbutton.setText("PRINT TICKET");
        printbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbuttonActionPerformed(evt);
            }
        });

        classcombobox.setBackground(new java.awt.Color(222, 254, 255));
        classcombobox.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        classcombobox.setForeground(new java.awt.Color(0, 0, 204));
        classcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "ECONOMY", "BUSINESS" }));
        classcombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        classcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classcomboboxActionPerformed(evt);
            }
        });

        seatcombobox.setBackground(new java.awt.Color(222, 254, 255));
        seatcombobox.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        seatcombobox.setForeground(new java.awt.Color(0, 0, 204));
        seatcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        seatcombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        seatcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatcomboboxActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei1.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arrival)
                            .addComponent(flyto)
                            .addComponent(seatcombobox, 0, 180, Short.MAX_VALUE)
                            .addComponent(flcode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flyfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel11)
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(flcode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(flyto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(flyfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(seatcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(classcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(67, 67, 67)))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        
        // Clears the form if user clicks reset button
        
        flcode.setText("");
        flyfrom.setText("");
        flyto.setText("");
        departure.setText("");
        arrival.setText("");
        classcombobox.setSelectedIndex(0);
        seatcombobox.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        
        Travelmenu trav = new Travelmenu();   // Sets travelmenu frame as target destination
        trav.show();     // Opens the travelmenu frame
        dispose();       // Disposes current frame then replace with target destination
        
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void bookbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbuttonActionPerformed
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");   // Connection driver to phpadmin sql via xampp 
        
        if (seatcombobox.getSelectedItem().toString().equals("<select>")) {
            JOptionPane.showMessageDialog(this, "Please select a seat before booking.");   // Show message that stops user from booking without selecting seat code first
            return; 
        }
        
        String seatcheck = seatcombobox.getSelectedItem().toString();
        String checkerquery = "SELECT seatcode FROM travelbook WHERE seatcode = ?";    
        PreparedStatement checkseatstatement = con.prepareStatement(checkerquery);      // Selects and checks if seatcode is available for user to book.
        checkseatstatement.setString(1, seatcheck);
        ResultSet resultSet = checkseatstatement.executeQuery();     // Returns result after checking seat availability
        
        if (resultSet.next()) {
            JOptionPane.showMessageDialog(this, "Seat is already occupied. Please choose another seat.");   // Shows message if seat is already occupied. Prompt user to choose another one.
        } else {
        String sql = "insert into travelbook (flightcode, source, destination, departdate, departarrival, seatclass, seatcode) values (?,?,?,?,?,?,?,?)";  // Statement that inserts flight data input by user to database system
        PreparedStatement flightadd = con.prepareStatement(sql);
        flightadd.setString(1,flcode.getText());    // Adds flight code input
        flightadd.setString(2,flyfrom.getText());   // Adds flight from input
        flightadd.setString(3,flyto.getText());     // Adds flight to input
        flightadd.setString(4,departure.getText());    // Adds departure data input
        flightadd.setString(5,arrival.getText());      // Adds arrival data input
        flightadd.setString(6,classcombobox.getSelectedItem().toString());  // Adds seat class result picked by user
        flightadd.setString(7,seatcombobox.getSelectedItem().toString());   // Adds seat code result picked by user
        flightadd.executeUpdate();
            JOptionPane.showMessageDialog(this,"Flight has been book. Click below to print boarding pass ticket!");    // Popup message that shows flight has been sucesfully added to system.
        }
        con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error booking flight. Please check details!");    // Popup error message that user encountered an error trying to book flight.
        }
        
    }//GEN-LAST:event_bookbuttonActionPerformed

    private void printbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbuttonActionPerformed
        
        String flightCode = flcode.getText();
        String flightFrom = flyfrom.getText();
        String flightTo = flyto.getText();
        String departDate = departure.getText();
        String departArrival = arrival.getText();
        String seatClass = classcombobox.getSelectedItem().toString();
        String seatNumber = seatcombobox.getSelectedItem().toString();

        // Check if any textfield details are missing then show error if user tries to print ticket without any booking inputs.
        if (flightCode.isEmpty() || flightFrom.isEmpty() || flightTo.isEmpty() ||
        departDate.isEmpty() || departArrival.isEmpty() ||
        seatClass.equals("<select>") || seatNumber.equals("<select>")) {
        JOptionPane.showMessageDialog(this, "Please enter all flight details first before printing! ", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        
        // Boarding pass ticket display format
        
        String boardingPassMessage = "===== Boarding Pass Ticket =====\n"
            + "Flight Code: " + flightCode + "\n"
            + "From: " + flightFrom + "\n"
            + "To: " + flightTo + "\n"
            + "Departure Date: " + departDate + "\n"
            + "Arrival Date: " + departArrival + "\n"
            + "Seat Class: " + seatClass + "\n"
            + "Seat Number: " + seatNumber + "\n"
            + "\nNext flight leaves in 5 hours. Safe Travels!";

        
        // Prints the boarding pass ticket details using a JOptionPane popup message.
        
        JOptionPane.showMessageDialog(this, boardingPassMessage, "Boarding Pass Ticket", JOptionPane.INFORMATION_MESSAGE); 
        
        // Clears the booking form after printing boarding pass after printing ticket information
        
        flcode.setText("");
        flyfrom.setText("");
        flyto.setText("");
        departure.setText("");
        arrival.setText("");
        classcombobox.setSelectedIndex(0);
        seatcombobox.setSelectedIndex(0);



        
    }//GEN-LAST:event_printbuttonActionPerformed

    private void classcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classcomboboxActionPerformed
   
    }//GEN-LAST:event_classcomboboxActionPerformed

    private void seatcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatcomboboxActionPerformed
                                   
        
    }//GEN-LAST:event_seatcomboboxActionPerformed

    private void departureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookflight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrival;
    private javax.swing.JButton bookbutton;
    private javax.swing.JComboBox<String> classcombobox;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField flcode;
    private javax.swing.JTextField flyfrom;
    private javax.swing.JTextField flyto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton printbutton;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton returnbutton;
    private javax.swing.JComboBox<String> seatcombobox;
    // End of variables declaration//GEN-END:variables

    
}
