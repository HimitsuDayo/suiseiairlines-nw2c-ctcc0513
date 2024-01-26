package SuiseiAirlines;

public class Travelmenu extends javax.swing.JFrame {

    public Travelmenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bookbutton = new javax.swing.JButton();
        tripbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei2.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Menu");

        bookbutton.setBackground(new java.awt.Color(222, 254, 255));
        bookbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        bookbutton.setForeground(new java.awt.Color(0, 0, 204));
        bookbutton.setText("BOOK FLIGHT");
        bookbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bookbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbuttonActionPerformed(evt);
            }
        });

        tripbutton.setBackground(new java.awt.Color(222, 254, 255));
        tripbutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        tripbutton.setForeground(new java.awt.Color(0, 0, 204));
        tripbutton.setText("MY TRIPS");
        tripbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tripbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripbuttonActionPerformed(evt);
            }
        });

        updatebutton.setBackground(new java.awt.Color(222, 254, 255));
        updatebutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(0, 0, 204));
        updatebutton.setText("UPDATE ACCOUNT DETAILS");
        updatebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("SUISEI");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("AIRLINES");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\yeet\\suisei2.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tripbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(bookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(tripbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        
        Login frame1 = new Login();   // Sets login frame as target destination
        frame1.show();
        dispose();   // Disposes current frame and replaces with target destination frame
        
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void bookbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbuttonActionPerformed
        
        Bookflight book = new Bookflight();    // Sets bookflight frame as target destination
        book.show();
        dispose();       // Disposes current frame and replaces with target destination frame
        
    }//GEN-LAST:event_bookbuttonActionPerformed

    private void tripbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripbuttonActionPerformed
        
        Trips trip = new Trips();     // Sets trips frame as target destination
        trip.show();
        dispose();     // Disposes current frame and replaces with target destination frame
        
    }//GEN-LAST:event_tripbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        
        UpdateAcc updacc = new UpdateAcc();     // Sets updateacc frame as target destination
        updacc.show();
        dispose();      // Disposes current frame and replaces with target destination frame
        
    }//GEN-LAST:event_updatebuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Travelmenu().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton tripbutton;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
