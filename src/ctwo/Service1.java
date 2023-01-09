
package ctwo;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Service1 extends javax.swing.JFrame {

   
    public Service1() {
        initComponents();
        setLocationRelativeTo(null);
         show_user();
         
    }
public Connection connection;  
    public ArrayList<UserT>userList()
    {
      ArrayList<UserT>userList = new ArrayList<>();

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
          
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select * from OurService");
            
        
             UserT user;
            
            while(resultSet.next())
         {
            user = new UserT (resultSet.getInt("ServiceId"),resultSet.getString("ServiceName"),resultSet.getString("Cost"),resultSet.getString("Unit"));
            userList.add(user);

         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return userList;
    
    
    
    }
      
 public void show_user()
 {
   ArrayList<UserT>list = userList();
   DefaultTableModel model =(DefaultTableModel) ServiceTable.getModel();
   Object[] row = new Object[6];


   for(int i = 0;i<list.size();i++)
   {
     row[0]=list.get(i).getServiceId();
     row[1]=list.get(i).getServiceName();
     row[2]=list.get(i).getCost();
     row[3]=list.get(i).getUnit();
    
     model.addRow(row);
   
   }
 
 }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ServiceTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        ServiceId = new javax.swing.JTextField();
        ServiceName = new javax.swing.JTextField();
        Cost = new javax.swing.JTextField();
        Unit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1228, 780));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackToMenu.setText("<<");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 90, -1));

        ServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ServiceId", "ServiceName", "Cost", "Unit"
            }
        ));
        ServiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ServiceTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 1010, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search (enter Service Id)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ServiceId");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ServiceName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cost");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Unit");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 385, 60, 20));

        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 180, 30));
        jPanel1.add(ServiceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 180, 30));
        jPanel1.add(ServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 180, 30));
        jPanel1.add(Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 180, 30));
        jPanel1.add(Unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 180, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 250, 250));
        jLabel9.setText("Cleaning &");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, 130, 40));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(250, 250, 250));
        jLabel10.setText("Maid Service");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 60));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiceTableMouseClicked
        
          int i = ServiceTable.getSelectedRow();
        TableModel model = ServiceTable.getModel();
        ServiceId.setText(model.getValueAt(i,0).toString());
        ServiceName.setText(model.getValueAt(i,1).toString());
        Cost.setText(model.getValueAt(i,2).toString());
        Unit.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_ServiceTableMouseClicked

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="Select*from  OurService where  ServiceId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, Search.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
              String setServiceId = rs.getString("ServiceId");
             ServiceId.setText(setServiceId);
               String setServiceName = rs.getString("ServiceName");
              ServiceName.setText(setServiceName);
               String setCost= rs.getString("Cost");
             Cost.setText(setCost);
               String setUnit = rs.getString("Unit");
             Unit.setText(setUnit);
               
            
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
    }//GEN-LAST:event_SearchKeyReleased

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
         Client_ownorder as=new Client_ownorder();
         as.setVisible(true);
         new Service1().setVisible(false);
         dispose();
    }//GEN-LAST:event_BackToMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Service1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JTextField Cost;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField ServiceId;
    private javax.swing.JTextField ServiceName;
    private javax.swing.JTable ServiceTable;
    private javax.swing.JTextField Unit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
