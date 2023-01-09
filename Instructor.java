
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aparna
 */
public class Instructor extends javax.swing.JFrame {

    /**
     * Creates new form under_water
     */
    public Instructor() {
        initComponents();
    }
    public void clearTable(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    }
    public void updateTable(){
        if(j1.getText().equals("")){
    JOptionPane.showMessageDialog(this, "select any row fro table to edit its value",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
}else{
        clearTable();
    Connection conn;
    //ResultSet rs;
    Statement st;
            try {
            int id=Integer.parseInt(j1.getText());
            String name=j2.getText();
            String gender=j3.getText();
            String Phone=j5.getText();
            String activity=j6.getText();
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();
st.executeQuery("update JR_NEW.INSTRUCTOR set Instructor_id='"+id+"',name='"+name+"',gender='"+gender+"',Phone_number='"+Phone+"',Activity_id='"+activity+"' where Instructor_id='"+id+"'");

            
            conn.close();
            JOptionPane.showMessageDialog(this, "successfully updated",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);// TODO add your handling code here:
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
System.out.print(e);            
        }
            display();
            clearFields();
    }
    }
    public void insertTable(){
        if(j1.getText().equals("")){
    JOptionPane.showMessageDialog(this, "enter Instructor id to insert",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
}else{
    clearTable();
    Connection conn;
    //ResultSet rs;
    Statement st;
            try {
            int id=Integer.parseInt(j1.getText());
            String name=j2.getText();
            String gender=j3.getText();
            String Phone=j5.getText();
            String activity=j6.getText();
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();

st.executeQuery("insert into h.INSTRUCTOR(Instructor_id,name,gender,Phone_number,Activity_id) values"
                   + "('"+id+"','"+name+"','"+gender+"','"+Phone+"','"+activity+"')");
            
            conn.close();
            JOptionPane.showMessageDialog(this, "successfully inserted",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);// TODO add your handling code here:
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
System.out.print(e);            
        }
            display();
            clearFields();
    }
    }
    public void clearFields(){
            j1.setText("");
            j2.setText("");
            j3.setText("");

            j5.setText("");
            j6.setText("");

}
public void display(){
    clearTable();
    Connection conn;
    ResultSet rs;
    Statement st;
            try {
   
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM JR_NEW.INSTRUCTOR ");
            while (rs.next()) {
                String id=String.valueOf(rs.getInt("Instructor_id"));
                String name=rs.getString("Name");
                String gender=rs.getString("gender");
                String phone=rs.getString("phone_number");
                String Activity=rs.getString("Activity_id");
                
                
                String tbdata[]={id,name,gender,phone,Activity};
                DefaultTableModel tblModel =(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbdata);
            
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        j3 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        j6 = new javax.swing.JTextField();
        j1 = new javax.swing.JTextField();
        bg1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instructor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instructor_id", "Name", "gender", "phone_number", "Activity_id"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 810, 140));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Instructor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 180, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Instructor_id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Ph_No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 90, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Activity_id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 120, 50));
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, 40));
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 170, 40));
        jPanel1.add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 170, 40));
        jPanel1.add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 170, 40));
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, 40));

        bg1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_data/sunrise-over-beach-cancun-beautiful-mexico-40065727.jpg"))); // NOI18N
        bg1.setText("jLabel1");
        jPanel1.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 700, 350));

        jButton4.setText("insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 100, 30));

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 100, 30));

        jButton2.setText("delet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 100, 30));

        jButton1.setText("show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 100, 30));

        jButton5.setText("back to home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, 120, 40));

        jButton6.setText("clear Table");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 120, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_data/e832c18e-21ff-476a-b814-f5e96b52cabd-1-2.jpeg"))); // NOI18N
        bg.setText("jLabel1");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
insertTable();
clearFields();
clearTable();
display();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    display();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

      
            // do some actions here, for example
            // print first column value from selected row
            
            String id=jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String name=jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(); 
            String gender=jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String phone=jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String Activity=jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            
            j1.setText(id);
            j2.setText(name);
            j3.setText(gender);

            j5.setText(phone);
            j6.setText(Activity);

            
            
            
            
                
            
         // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(j1.getText().equals("")){
    JOptionPane.showMessageDialog(this, "select any row from table to delete",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
}else{
        
        Connection conn;
   // ResultSet rs;
    Statement st;
            try {
   
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();
            int iid=Integer.parseInt(j1.getText());
            st.executeQuery("delete FROM JR_NEW.INSTRUCTOR where Instructor_id='"+iid+"'");
            JOptionPane.showMessageDialog(this, "successfull deleted",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
            conn.close();
            display();
        } catch (Exception e) {
            System.out.println(e);
        } 
            clearFields();
}      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    home_page h=new home_page();
            h.show();
            this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
updateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
clearTable();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(under_water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(under_water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(under_water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(under_water.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
