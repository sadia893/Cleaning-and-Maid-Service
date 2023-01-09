
package ctwo;

public class start extends javax.swing.JFrame {

    public start() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        staff_login_button1 = new javax.swing.JButton();
        staff_login_button2 = new javax.swing.JButton();
        staff_login_button3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1228, 780));
        setMinimumSize(new java.awt.Dimension(1228, 780));
        setPreferredSize(new java.awt.Dimension(1228, 780));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cleaning & ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 210, 100);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maid Service");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 280, 230, 60);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        staff_login_button1.setBackground(new java.awt.Color(255, 204, 0));
        staff_login_button1.setForeground(new java.awt.Color(51, 51, 51));
        staff_login_button1.setText("Staff Log In");
        staff_login_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_login_button1ActionPerformed(evt);
            }
        });

        staff_login_button2.setBackground(new java.awt.Color(255, 204, 0));
        staff_login_button2.setForeground(new java.awt.Color(51, 51, 51));
        staff_login_button2.setText("Client Log In");
        staff_login_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_login_button2ActionPerformed(evt);
            }
        });

        staff_login_button3.setBackground(new java.awt.Color(255, 204, 0));
        staff_login_button3.setForeground(new java.awt.Color(51, 51, 51));
        staff_login_button3.setText("Admin Log In");
        staff_login_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_login_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(staff_login_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staff_login_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staff_login_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(staff_login_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(staff_login_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(staff_login_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 0, 1000, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staff_login_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_login_button1ActionPerformed
        // TODO add your handling code here:
          stafflogin c = new stafflogin();
                c.setVisible(true);
                new start().setVisible(false);
                dispose();
    }//GEN-LAST:event_staff_login_button1ActionPerformed

    private void staff_login_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_login_button2ActionPerformed
        // TODO add your handling code here:
        ClientLogin c = new  ClientLogin();
                c.setVisible(true);
                new start().setVisible(false);
                dispose();
                
                
    }//GEN-LAST:event_staff_login_button2ActionPerformed

    private void staff_login_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_login_button3ActionPerformed
          AdminLogin c = new AdminLogin();
                c.setVisible(true);
                new start().setVisible(false);
                dispose();
    }//GEN-LAST:event_staff_login_button3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton staff_login_button1;
    private javax.swing.JButton staff_login_button2;
    private javax.swing.JButton staff_login_button3;
    // End of variables declaration//GEN-END:variables
}
