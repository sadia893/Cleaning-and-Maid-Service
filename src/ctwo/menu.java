
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {
  private Connection con;
    private Statement st;
    private ResultSet rs;
   
    public menu() {
        initComponents();
          setLocationRelativeTo(null);
        
        try{
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://:3306/checkpointnotwo","root","");
       st=con.createStatement();
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        client = new javax.swing.JButton();
        service = new javax.swing.JButton();
        team = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cleaningStaff = new javax.swing.JButton();
        maid = new javax.swing.JButton();
        projects = new javax.swing.JButton();
        allstaff = new javax.swing.JButton();
        projects1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1228, 780));
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

        client.setBackground(new java.awt.Color(255, 204, 51));
        client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        client.setForeground(new java.awt.Color(255, 255, 255));
        client.setText("Client");
        client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientActionPerformed(evt);
            }
        });
        getContentPane().add(client);
        client.setBounds(650, 260, 180, 110);

        service.setBackground(new java.awt.Color(255, 204, 51));
        service.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        service.setForeground(new java.awt.Color(255, 255, 255));
        service.setText("Service");
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        getContentPane().add(service);
        service.setBounds(920, 260, 180, 110);

        team.setBackground(new java.awt.Color(255, 204, 51));
        team.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        team.setForeground(new java.awt.Color(255, 255, 255));
        team.setText("Team");
        team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamActionPerformed(evt);
            }
        });
        getContentPane().add(team);
        team.setBounds(330, 250, 180, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("log out");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 700, 50, 20);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

        cleaningStaff.setBackground(new java.awt.Color(255, 204, 51));
        cleaningStaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cleaningStaff.setForeground(new java.awt.Color(255, 255, 255));
        cleaningStaff.setText("Cleaning Staff");
        cleaningStaff.setBorderPainted(false);
        cleaningStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleaningStaffActionPerformed(evt);
            }
        });
        getContentPane().add(cleaningStaff);
        cleaningStaff.setBounds(640, 90, 180, 110);

        maid.setBackground(new java.awt.Color(255, 204, 51));
        maid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maid.setForeground(new java.awt.Color(255, 255, 255));
        maid.setText("Maid");
        maid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maidActionPerformed(evt);
            }
        });
        getContentPane().add(maid);
        maid.setBounds(920, 90, 180, 110);

        projects.setBackground(new java.awt.Color(255, 204, 51));
        projects.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        projects.setForeground(new java.awt.Color(255, 255, 255));
        projects.setText("Projects");
        projects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectsActionPerformed(evt);
            }
        });
        getContentPane().add(projects);
        projects.setBounds(340, 410, 180, 110);

        allstaff.setBackground(new java.awt.Color(255, 204, 51));
        allstaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        allstaff.setForeground(new java.awt.Color(255, 255, 255));
        allstaff.setText("All staff");
        allstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allstaffActionPerformed(evt);
            }
        });
        getContentPane().add(allstaff);
        allstaff.setBounds(330, 90, 180, 110);

        projects1.setBackground(new java.awt.Color(255, 204, 51));
        projects1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        projects1.setForeground(new java.awt.Color(255, 255, 255));
        projects1.setText("Maid Tasks");
        projects1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projects1ActionPerformed(evt);
            }
        });
        getContentPane().add(projects1);
        projects1.setBounds(650, 410, 180, 110);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 0, 1040, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientActionPerformed
        // TODO add your handling code here:
            this.dispose();
         Client obj = new  Client();
         obj.setVisible(true);
    }//GEN-LAST:event_clientActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        // TODO add your handling code here:
        Service c=new Service();
        c.setVisible(true);
         new menu().setVisible(false);
                dispose();
    }//GEN-LAST:event_serviceActionPerformed

    private void teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamActionPerformed
        // TODO add your handling code here:
         Team c = new Team();
                c.setVisible(true);
                new menu().setVisible(false);
                dispose();
    }//GEN-LAST:event_teamActionPerformed

    private void cleaningStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleaningStaffActionPerformed
        // TODO add your handling code here:
        
          CleaningStaff c = new CleaningStaff();
                c.setVisible(true);
                new menu().setVisible(false);
                dispose();
            

    }//GEN-LAST:event_cleaningStaffActionPerformed

    private void maidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maidActionPerformed
        // TODO add your handling code here:
        Maid c = new Maid();
                c.setVisible(true);
                new menu().setVisible(false);
                dispose();
    }//GEN-LAST:event_maidActionPerformed

    private void allstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allstaffActionPerformed
        // TODO add your handling code here:
        AllstaffLIst as=new AllstaffLIst();
        as.setVisible(true);
         new menu().setVisible(false);
                dispose();
    }//GEN-LAST:event_allstaffActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new menu().setVisible(false);
        dispose();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void projects1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projects1ActionPerformed
        // TODO add your handling code here:
            ProjectT as=new ProjectT();
        as.setVisible(true);
        new menu().setVisible(false);
        dispose();
    }//GEN-LAST:event_projects1ActionPerformed

    private void projectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsActionPerformed
        // TODO add your handling code here:
        Project as=new Project();
        as.setVisible(true);
        new menu().setVisible(false);
        dispose();
    }//GEN-LAST:event_projectsActionPerformed

    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }/*
    Project.java
DueServiceClients.java
Project and service.java
Service.java
Serviceavailability.java
ClenaingServiceInfo.java
MaidServiceInfo.java
NewandOldServices.java
UserT.java
UserTam.java
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allstaff;
    private javax.swing.JButton cleaningStaff;
    private javax.swing.JButton client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton maid;
    private javax.swing.JButton projects;
    private javax.swing.JButton projects1;
    private javax.swing.JButton service;
    private javax.swing.JButton team;
    // End of variables declaration//GEN-END:variables
}
