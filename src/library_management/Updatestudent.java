/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apurva
 */
public class Updatestudent extends javax.swing.JFrame {

    /**
     * Creates new form Updatestudent
     */
    public Updatestudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txt_id = new java.awt.TextField();
        label2 = new java.awt.Label();
        txt_enroll = new java.awt.TextField();
        label3 = new java.awt.Label();
        txt_sname = new java.awt.TextField();
        label4 = new java.awt.Label();
        rdb_male = new javax.swing.JRadioButton();
        rdb_female = new javax.swing.JRadioButton();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txt_class = new java.awt.TextField();
        label7 = new java.awt.Label();
        txt_address = new java.awt.TextField();
        label8 = new java.awt.Label();
        txt_phone = new java.awt.TextField();
        label9 = new java.awt.Label();
        txt_email = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        cmb_deptno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Student Id");

        txt_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("Enrollment No");

        txt_enroll.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setText("Student Name");

        txt_sname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setText("Gender");

        buttonGroup1.add(rdb_male);
        rdb_male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_male.setText("Male");

        buttonGroup1.add(rdb_female);
        rdb_female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_female.setText("Female");

        label5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label5.setText("Department No");

        label6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label6.setText("Class");

        txt_class.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setText("Address");

        txt_address.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label8.setText("Phone No");

        txt_phone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label9.setText("Email ID");

        txt_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        button1.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        button1.setLabel("UPDATE");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        button2.setLabel("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        cmb_deptno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_deptno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Enrollment No", "Studnet Name", "Gender", "Department No", "Class", "Address", "Phone No", "Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        button3.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        button3.setLabel("SHOW");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        button4.setLabel("REFRESH");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rdb_male, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(cmb_deptno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_female, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_enroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txt_sname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_class, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(txt_enroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdb_male, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdb_female, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(cmb_deptno))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_class, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        conn=DBconnection.connect();
        
        try
        {
            String gender="";     
            if (conn!=null) 
            {
               //JOptionPane.showMessageDialog(null,"Connected successfuly...");
               
               String sql="update student set enrollno=?,sname=?,gender=?,deptno=?,class=?,address=?,phone=?,email=? where studid=?";
               PreparedStatement stmt=conn.prepareStatement(sql);
               
                      
               if(rdb_male.isSelected())
               {
                   gender = rdb_male.getText();
               }
               else
               {
                   gender=rdb_female.getText();
               }
                        
               
               
               
               stmt.setString(1,txt_enroll.getText());
               stmt.setString(2,txt_sname.getText());
               stmt.setString(3,gender);
               stmt.setString(4,cmb_deptno.getSelectedItem().toString());
               stmt.setString(5,txt_class.getText());
               stmt.setString(6,txt_address.getText());
               stmt.setString(7,txt_phone.getText());
               stmt.setString(8,txt_email.getText());
               stmt.setString(9,txt_id.getText());
               
               
               
               int rowInserted=stmt.executeUpdate();
               if(rowInserted>0)
               {
                   JOptionPane.showMessageDialog(null,"A record is updated");
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"A record is not updates");
                }
                       
               
                
                  
            }
            else
             {
               JOptionPane.showMessageDialog(null,"Not Connected");
             }
        }catch (Exception e)
        {
        }


    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Connection conn=DBconnection.connect();
        try{
            model.setRowCount(0);
            String sql="select * from student ";
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {       
            String a=rs.getString("studid");
            String b=rs.getString("enrollno");
            String c=rs.getString("sname");
            String d=rs.getString("gender");
            String e=rs.getString("deptno");
            String f=rs.getString("class");
            String g=rs.getString("address");
            String h=rs.getString("phone");
            String i=rs.getString("email");
            
            model.addRow(new Object[]{a,b,c,d,e,f,g,h,i});
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try
        {
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        txt_id.setText(model.getValueAt(selectedRowIndex,0).toString());
        txt_enroll.setText(model.getValueAt(selectedRowIndex,1).toString());
        txt_sname.setText(model.getValueAt(selectedRowIndex,2).toString());
        
        String sex=model.getValueAt(selectedRowIndex, 3).toString();
          if(sex.equals("male"))
          {
              rdb_male.setSelected(true);
          }
          else{
              rdb_female.setSelected(true);
          }
        String r= model.getValueAt(selectedRowIndex,4).toString(); 
        cmb_deptno.addItem(r);
        cmb_deptno.setSelectedItem(r);
        txt_class.setText(model.getValueAt(selectedRowIndex,5).toString());
        txt_address.setText(model.getValueAt(selectedRowIndex,6).toString());
        txt_phone.setText(model.getValueAt(selectedRowIndex,7).toString());
        txt_email.setText(model.getValueAt(selectedRowIndex,8).toString());
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        txt_id.setText(" ");
        txt_enroll.setText(" ");
        txt_sname.setText(" ");
        rdb_male.setSelected(false);
        rdb_female.setSelected(false);
        txt_class.setText(" ");
        txt_address.setText(" ");
        txt_phone.setText(" ");
        txt_email.setText(" ");
    }//GEN-LAST:event_button4ActionPerformed

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
            java.util.logging.Logger.getLogger(Updatestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updatestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updatestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updatestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updatestudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_deptno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JRadioButton rdb_female;
    private javax.swing.JRadioButton rdb_male;
    private java.awt.TextField txt_address;
    private java.awt.TextField txt_class;
    private java.awt.TextField txt_email;
    private java.awt.TextField txt_enroll;
    private java.awt.TextField txt_id;
    private java.awt.TextField txt_phone;
    private java.awt.TextField txt_sname;
    // End of variables declaration//GEN-END:variables
}