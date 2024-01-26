package SuiseiAirlines;

public class AdminMenu extends javax.swing.JFrame {

    public AdminMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deleteflightbutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        managebutton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Menu");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("SUISEI");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("AIRLINES");

        deleteflightbutton.setBackground(new java.awt.Color(222, 254, 255));
        deleteflightbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        deleteflightbutton.setForeground(new java.awt.Color(0, 0, 204));
        deleteflightbutton.setText("DELETE FLIGHT");
        deleteflightbutton.setToolTipText("");
        deleteflightbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deleteflightbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteflightbuttonActionPerformed(evt);
            }
        });

        logoutbutton.setBackground(new java.awt.Color(222, 254, 255));
        logoutbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(0, 0, 204));
        logoutbutton.setText("LOGOUT");
        logoutbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        managebutton1.setBackground(new java.awt.Color(222, 254, 255));
        managebutton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        managebutton1.setForeground(new java.awt.Color(0, 0, 204));
        managebutton1.setText("UPDATE FLIGHT");
        managebutton1.setToolTipText("");
        managebutton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        managebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managebutton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei2.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managebutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteflightbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(deleteflightbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(managebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        
        Login frame1 = new Login();       // Directs back to login frame
        frame1.show();
        dispose();          // Disposes current frame and show placed destination frame
        
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void deleteflightbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteflightbuttonActionPerformed
        
        AdminFlightDelete admindelete = new AdminFlightDelete();  // Sets admindelete frame as target destination
        admindelete.show();
        dispose();    // Disposes the current frame and replace with target destination
        
    }//GEN-LAST:event_deleteflightbuttonActionPerformed

    private void managebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managebutton1ActionPerformed
        
        AdminFlightUpdate adminupdate = new AdminFlightUpdate();    // Sets adminupdate frame as target destination
        adminupdate.show();
        dispose();      // Disposes the current frame and replace with target destination
        
    }//GEN-LAST:event_managebutton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteflightbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton managebutton1;
    // End of variables declaration//GEN-END:variables
}
