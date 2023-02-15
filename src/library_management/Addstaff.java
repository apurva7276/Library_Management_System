/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apurva
 */
public class Addstaff extends javax.swing.JFrame {

    /**
     * Creates new form Addstaff
     */
    public Addstaff() {
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
        txt_sid = new java.awt.TextField();
        label2 = new java.awt.Label();
        txt_sname = new java.awt.TextField();
        label3 = new java.awt.Label();
        rdb_male = new javax.swing.JRadioButton();
        rdb_female = new javax.swing.JRadioButton();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        txt_desig = new java.awt.TextField();
        label6 = new java.awt.Label();
        txt_addr = new java.awt.TextField();
        label7 = new java.awt.Label();
        txt_phone = new java.awt.TextField();
        label8 = new java.awt.Label();
        txt_email = new java.awt.TextField();
        staffadd = new java.awt.Button();
        staffcancel = new java.awt.Button();
        cm_deptno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Staff ID");

        txt_sid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("Staff Name");

        txt_sname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_snameKeyTyped(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setText("Gender");

        buttonGroup1.add(rdb_male);
        rdb_male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdb_male.setText("Male");

        buttonGroup1.add(rdb_female);
        rdb_female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdb_female.setText("Female");

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setText("Department No");

        label5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label5.setText("Designation");

        txt_desig.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_desig.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_desigKeyTyped(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label6.setText("Address");

        txt_addr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_addr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_addrKeyTyped(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setText("Phone No");

        txt_phone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label8.setText("Email ID");

        txt_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        staffadd.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        staffadd.setLabel("ADD");
        staffadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffaddActionPerformed(evt);
            }
        });

        staffcancel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        staffcancel.setLabel("CANCEL");
        staffcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffcancelActionPerformed(evt);
            }
        });
        staffcancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffcancelKeyTyped(evt);
            }
        });

        cm_deptno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cm_deptno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Staff Id", "Staff Name", "Gender", "Designation", "Department No", "Address", "Phone No", "Email ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setLabel("SHOW");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button2.setLabel("REFRESH");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(cm_deptno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_sid, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_sname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rdb_male, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdb_female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(staffadd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(staffcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_sname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdb_male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdb_female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cm_deptno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(txt_addr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(staffadd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffcancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffaddActionPerformed
        // TODO add your handling code here:
         Connection conn=null;
        conn=DBconnection.connect();
        try
        {
          String gender=" ";
          
            if (conn!=null) 
            {
               //JOptionPane.showMessageDialog(null,"Connected successfuly...");
               
               String sql="insert into staff(name,gender,designation,deptno,address,phone,email) values(?,?,?,?,?,?,?)";
               PreparedStatement stmt=conn.prepareStatement(sql);
               
               if(rdb_male.isSelected())
               {
                   gender = rdb_male.getText();
               }
               else
               {
                   gender=rdb_female.getText();
               }
               
               stmt.setString(1,txt_sname.getText());
               stmt.setString(2,gender);
               stmt.setString(3,txt_desig.getText());
               stmt.setString(4,cm_deptno.getSelectedItem().toString());
               stmt.setString(5,txt_addr.getText());
               stmt.setString(6,txt_phone.getText());
               stmt.setString(7,txt_email.getText());
               
               int rowInserted=stmt.executeUpdate();
               if(rowInserted>0)
               {
                   JOptionPane.showMessageDialog(null,"Staff added successfuly");
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"A new staff was not inserted");
                }
                       
               
                
                  
            }
            else
             {
               JOptionPane.showMessageDialog(null,"Not Connected");
             }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_staffaddActionPerformed

    private void staffcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_staffcancelActionPerformed

    private void txt_snameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_snameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || ((evt.getKeyCode()==evt.VK_BACK_SPACE)))
        {
        evt.consume();
        }
    }//GEN-LAST:event_txt_snameKeyTyped

    private void txt_desigKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desigKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || ((evt.getKeyCode()==evt.VK_BACK_SPACE)))
        {
        evt.consume();
        }
    }//GEN-LAST:event_txt_desigKeyTyped

    private void txt_addrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addrKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || ((evt.getKeyCode()==evt.VK_BACK_SPACE)))
        {
        evt.consume();
        }
    }//GEN-LAST:event_txt_addrKeyTyped

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((!Character.isDigit(c)) || ((evt.getKeyCode()==evt.VK_BACK_SPACE)))
        {
        evt.consume();
        }
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void staffcancelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffcancelKeyTyped
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_staffcancelKeyTyped

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Connection conn=DBconnection.connect();
        try{
            model.setRowCount(0);
            String sql="select * from staff ";
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {       
            String a=rs.getString("staffid");
            String b=rs.getString("name");
            String c=rs.getString("gender");
            String d=rs.getString("designation");
            String e=rs.getString("deptno");
            String f=rs.getString("address");
            String g=rs.getString("phone");
            String h=rs.getString("email");
            
            model.addRow(new Object[]{a,b,c,d,e,f,g,h});
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        txt_sid.setText(" ");
        txt_sname.setText(" ");
        txt_desig.setText(" ");
        txt_addr.setText(" ");
        txt_phone.setText(" ");
        txt_email.setText(" ");
        
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(Addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addstaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cm_deptno;
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
    private javax.swing.JRadioButton rdb_female;
    private javax.swing.JRadioButton rdb_male;
    private java.awt.Button staffadd;
    private java.awt.Button staffcancel;
    private java.awt.TextField txt_addr;
    private java.awt.TextField txt_desig;
    private java.awt.TextField txt_email;
    private java.awt.TextField txt_phone;
    private java.awt.TextField txt_sid;
    private java.awt.TextField txt_sname;
    // End of variables declaration//GEN-END:variables
}
