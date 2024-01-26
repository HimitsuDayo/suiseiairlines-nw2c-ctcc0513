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

public class AdminFlightDelete extends javax.swing.JFrame {

    public AdminFlightDelete() {
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

        jLabel2 = new javax.swing.JLabel();
        flightcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        returnbutton = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Flight Delete");
        setBackground(new java.awt.Color(182, 208, 241));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("SUISEI'S FLIGHT MANAGEMENT");

        flightcode.setBackground(new java.awt.Color(222, 254, 255));
        flightcode.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        flightcode.setForeground(new java.awt.Color(0, 0, 204));
        flightcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        flightcode.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        flightcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightcodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("FLIGHT CODE");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(222, 254, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable1.setFont(new java.awt.Font("Showcard Gothic", 0, 20));
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "FLIGHT CODE", "FLY FROM", "FLY TO", "DEPARTURE", "ARRIVAL", "SEAT CLASS", "SEAT CODE"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

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

        deletebutton.setBackground(new java.awt.Color(222, 254, 255));
        deletebutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(0, 0, 204));
        deletebutton.setText("DELETE");
        deletebutton.setToolTipText("");
        deletebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
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

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei3.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(flightcode, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(returnbutton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flightcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed

        AdminMenu admin = new AdminMenu();  // Returns to Adminmenu frame if clicked
        admin.show();
        dispose();  // Disposes the current frame and replace with existing one

    }//GEN-LAST:event_returnbuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        
        String inputFlightCode = flightcode.getText();  // Captures flight code and matches with one stored in database
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");    // Connection driver to phpadmin sql via xampp 
        Statement st = con.createStatement();
        String sql = "SELECT * from travelbook WHERE flightcode = ?";   // Selects and display flightcode that matches input 
        PreparedStatement ptst = con.prepareStatement(sql);
        ptst.setString(1, inputFlightCode);
        
        ResultSet rs = ptst.executeQuery();
        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();  
        dt.setRowCount(0);
        
        while(rs.next()){       // Displays the whole flight details inside the table based on input flightcode
        Object o[] = {rs.getString("flightcode"),rs.getString("source"),rs.getString("destination"),rs.getString("departdate"),rs.getString("departarrival"),rs.getString("seatclass"),rs.getString("seatcode")};
        dt.addRow(o);            
        }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e);     // Shows an error if flight isnt found or searching wrong flight code
        }
        
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root",""); 
        Statement dlt = con.createStatement();
        
        String id = flightcode.getText();
        String sql = "DELETE FROM `travelbook` WHERE flightcode='"+id+"'";           // This function deletes the flight from the database. Option is only available to admin.
        PreparedStatement dltst = con.prepareStatement(sql);
        dltst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Flight deleted sucessfully!");  // Shows prompt that flight has been sucessfully deleted from the database.
        con.close();
        
        }catch (Exception e){
        JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        
        // Clears the textfield and current table that shows the flight description.
        
        flightcode.setText("");
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();        
        dt.setRowCount(0);
        
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void flightcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightcodeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFlightDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField flightcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton searchbutton;
    // End of variables declaration//GEN-END:variables
}
