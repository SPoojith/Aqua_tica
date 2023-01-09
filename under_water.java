
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
public class under_water extends javax.swing.JFrame {

    /**
     * Creates new form under_water
     */
    public under_water() {
        initComponents();
    }
    public void clearTable(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    }
    public void updateTable(){
        if(j1.getText().equals("")){
    JOptionPane.showMessageDialog(this, "enter id to update",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
}else{
        clearTable();
    Connection conn;
    //ResultSet rs;
    Statement st;
            try {
            int id=Integer.parseInt(j1.getText());
            String name=j2.getText();
            String type=j3.getText();
            String Price=j4.getText();
            String age_group=j5.getText();
            String exprience=j6.getText();
            String Discription=j7.getText();
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();
st.executeQuery("update under_water set activity_id='"+id+"',name='"+name+"',type='"+type+"',price='"+Price+"',age_group='"+age_group+"',exprience='"+exprience+"',discription='"+Discription+"' where activity_id='"+id+"'");

            
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
    JOptionPane.showMessageDialog(this, "enter id to insert",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
}else if(Integer.parseInt(j1.getText())<=300 || Integer.parseInt(j1.getText())>399){
    JOptionPane.showMessageDialog(this, "enter id with in 100 to 199 range",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
}else{
    clearTable();
    Connection conn;
    //ResultSet rs;
    Statement st;
            try {
            int id=Integer.parseInt(j1.getText());
            String name=j2.getText();
            String type=j3.getText();
            String Price=j4.getText();
            String age_group=j5.getText();
            String exprience=j6.getText();
            String Discription=j7.getText();
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();

st.executeQuery("insert into under_water(activity_id ,name ,type ,price ,age_group ,exprience ,discription) values"
                   + "('"+id+"','"+name+"','"+type+"','"+Price+"','"+age_group+"','"+exprience+"','"+Discription+"')");
            
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
    }}
    public void clearFields(){
            j1.setText("");
            j2.setText("");
            j3.setText("");
            j4.setText("");
            j5.setText("");
            j6.setText("");
            j7.setText("");
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
            rs = st.executeQuery("SELECT * FROM JR_NEW.UNDER_WATER order by Activity_id");
            while (rs.next()) {
                String id=String.valueOf(rs.getInt("Activity_id"));
                String name=rs.getString("Name");
                String type=rs.getString("Type");
                String Price=rs.getString("Price");
                String age_group=rs.getString("Age_group");
                String exprience=rs.getString("Exprience");
                String Discription=rs.getString("Discription");
                
                
                String tbdata[]={id,name,type,Price,age_group,exprience,Discription};
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        j4 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        j6 = new javax.swing.JTextField();
        j1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        j7 = new javax.swing.JTextArea();
        bg1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Under_water");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Activity_id", "Name", "Type", "Price", "Age_group", "Exprience", "Discription"
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
        jLabel2.setText("Under_water");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 180, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Discription");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Exprience");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 120, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Age_group");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Activity_id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 50));
        jPanel1.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, 40));
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, 40));
        jPanel1.add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 170, 40));
        jPanel1.add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 170, 40));
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 40));

        j7.setColumns(20);
        j7.setRows(5);
        jScrollPane2.setViewportView(j7);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, 60));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 100, 30));

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 100, 30));

        jButton2.setText("delet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 100, 30));

        jButton1.setText("show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 100, 30));

        jButton5.setText("clear Table");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 90, 30));

        jButton6.setText("bach to menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 110, 30));

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
            String type=jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String Price=jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String age_group=jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String exprience=jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            String Discription=jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
            
            j1.setText(id);
            j2.setText(name);
            j3.setText(type);
            j4.setText(Price);
            j5.setText(age_group);
            j6.setText(exprience);
            j7.setText(Discription);
            
            
            
            
                
            
         // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Connection conn;
   // ResultSet rs;
    Statement st;
            try {
   
            Class<?> clazz = Class.forName("oracle.jdbc.driver.OracleDriver"); Driver driver = (Driver) clazz.newInstance(); DriverManager.registerDriver(driver);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jr_new", "root");
            st = conn.createStatement();
            int iid=Integer.parseInt(j1.getText());
            st.executeQuery("delete FROM JR_NEW.UNDER_WATER where Activity_id='"+iid+"'");
            JOptionPane.showMessageDialog(this, "successfull deleted",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
            conn.close();
            display();
        } catch (Exception e) {
            System.out.println(e);
        } 
            clearFields();
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    clearTable();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
updateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
home_page h=new home_page();
h.show();
this.dispose();// TODO add your handling code here:
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
                new under_water().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private javax.swing.JTextArea j7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
