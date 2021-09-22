/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agricare;
import static agricare.ConnectionDB.conn;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Akshay
 */
public class seller extends javax.swing.JFrame {

    
    Connection conn =null;
    PreparedStatement pstmt = null;
    
    public seller() {
        initComponents();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        seph = new javax.swing.JTextField();
        senm = new javax.swing.JTextField();
        seid = new javax.swing.JTextField();
        seadd = new javax.swing.JTextField();
        back1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SELLER ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 120, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SELLER NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 180, 100, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PHONE NUMBER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 230, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("PLACE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 280, 90, 20);

        insert.setBackground(new java.awt.Color(153, 153, 255));
        insert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        insert.setText("INSERT");
        insert.setBorder(null);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        getContentPane().add(insert);
        insert.setBounds(250, 380, 76, 44);

        update.setBackground(new java.awt.Color(153, 153, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(470, 380, 90, 40);

        delete1.setBackground(new java.awt.Color(153, 153, 255));
        delete1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete1.setText("DELETE");
        delete1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(delete1);
        delete1.setBounds(670, 380, 86, 40);

        seph.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        seph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sephActionPerformed(evt);
            }
        });
        getContentPane().add(seph);
        seph.setBounds(680, 220, 91, 30);

        senm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(senm);
        senm.setBounds(680, 170, 91, 30);

        seid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        seid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seidActionPerformed(evt);
            }
        });
        getContentPane().add(seid);
        seid.setBounds(680, 110, 91, 30);

        seadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(seadd);
        seadd.setBounds(680, 280, 91, 30);

        back1.setBackground(new java.awt.Color(153, 153, 255));
        back1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1);
        back1.setBounds(1060, 380, 86, 40);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("SELLER  Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1441, 71);

        back2.setBackground(new java.awt.Color(153, 153, 255));
        back2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back2.setText("VIEW");
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        getContentPane().add(back2);
        back2.setBounds(860, 380, 86, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SELLER ID", "NAME", "PHONE", "ADDRESS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 470, 452, 110);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(850, 110, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try
        {
            conn=ConnectionDB.myconnection();

            String sql= "INSERT INTO agricare.seller VALUES(?,?,?,?) ";
            pstmt=conn.prepareStatement(sql);
            
            pstmt.setString(1,seid.getText());
            pstmt.setString(2,senm.getText());
            pstmt.setString(3,seph.getText());
            pstmt.setString(4,seadd.getText());
            

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"INSERTION SUCCESSFULL");

            conn.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try{
             Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/agricare?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Veenaalur@24");
             String js= JOptionPane.showInputDialog("enter the seller id");
             String seid = this.seid.getText();
             
             pstmt = conn.prepareStatement("UPDATE seller set senm =? , seph= ? , seadd =? WHERE seid =?");
             pstmt.setString(4, js);
             pstmt.setString(1, senm.getText());
             pstmt.setString(2, seph.getText());
             pstmt.setString(3, seadd.getText());
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null," UPDATE SUCCESSFUL!");
             conn.close();
             pstmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        try{
            conn = ConnectionDB.myconnection();

            String sql = "DELETE FROM  agricare.seller WHERE seid = ?";

            pstmt=conn.prepareStatement(sql);

            pstmt.setString(1,seid.getText());

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY");
            seid.setText("");
            //    RTYPE.setText("");

            senm.setText("");

            conn.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void sephActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sephActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sephActionPerformed

    private void seidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seidActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        mainpage v=new mainpage();
        v.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        // TODO add your handling code here:
         try{
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/agricare?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Veenaalur@24");
           Statement st=con.createStatement();
           ResultSet myRs = st.executeQuery("select * from agricare.seller");
           DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
           model.setRowCount(0);
           while(myRs.next())
           {
                Object oo[]={myRs.getString("seid"), myRs.getString("senm"), myRs.getString("seph"), myRs.getString("seadd")};
               model.addRow(oo);
           }
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_back2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try{
            Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/agricare?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Veenaalur@24");
        pstmt = conn.prepareStatement("select * from seller where seid=? ");
        int snoo = Integer.parseInt(seid.getText());
                pstmt.setInt(1, snoo);
                ResultSet rs1 = pstmt.executeQuery();
                if(rs1.next()==false)
                {
                    JOptionPane.showMessageDialog(this, "Sorry record not found");
                    senm.setText("");
                    seph.setText("");
                    seadd.setText("");
                    
                }
                else{
                    senm.setText(rs1.getString("senm"));
                    seph.setText(rs1.getString("seph"));
                    seadd.setText(rs1.getString("seadd"));
                    
                }
        
        }
          catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JButton delete1;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField seadd;
    private javax.swing.JTextField seid;
    private javax.swing.JTextField senm;
    private javax.swing.JTextField seph;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
