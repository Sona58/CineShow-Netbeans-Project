/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Tej Prakash
 */
public class book extends javax.swing.JFrame {
String str,str1;
Connection con;
Statement stmt;
ResultSet rs;
int p;
    /**
     * Creates new form book
     */
    public book() {
        initComponents();
    }
    public book(String a,String b)
    {
        initComponents();
        str=a;
        str1=b;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            stmt=con.createStatement();
            rs=stmt.executeQuery("select name from movie");
            while(rs.next())
            {
                t1.addItem(rs.getString(1));
            }
            
        }
        catch(Exception e)
        {
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

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        t5 = new javax.swing.JComboBox();
        t4 = new javax.swing.JComboBox();
        t3 = new javax.swing.JComboBox();
        t2 = new javax.swing.JComboBox();
        t1 = new javax.swing.JComboBox();
        b1 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();
        note = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setText("Choose Movie :");

        l2.setText("Choose Theatre :");

        l3.setText("Choose Date :");

        l4.setText("Choose Time :");

        l5.setText("No. Of Seats :");

        l6.setText("Seats No. :");

        back.setText("<< BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        t5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        t4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));

        t3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        t3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t3ItemStateChanged(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        t2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t2ItemStateChanged(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        t1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t1ItemStateChanged(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        b1.setText("BOOK TICKET");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l2)
                                    .addComponent(l1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l5)
                                    .addGap(16, 16, 16)))
                            .addComponent(back)
                            .addComponent(l6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t5, javax.swing.GroupLayout.Alignment.TRAILING, 0, 100, Short.MAX_VALUE)
                            .addComponent(t6))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(b1)
                .addGap(0, 138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l6)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(logout))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
    // TODO add your handling code here:
    switch (str) {
        case "admin":
            {
                menu m=new menu(str1);
                m.setVisible(true);
                setVisible(false);
                break;
            }
        case "staff":
            {
                menu1 m=new menu1(str1);
                m.setVisible(true);
                setVisible(false);
                break;
            }
        case "customer":
            {
                menu2 m=new menu2(str1);
                m.setVisible(true);
                setVisible(false);
                break;
            }
    }
    }//GEN-LAST:event_backMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        login l=new login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        try{
            if(!t1.getSelectedItem().equals("--Select--") && !t2.getSelectedItem().equals("--Select--") && !t3.getSelectedItem().equals("--Select--") && !t4.getSelectedItem().equals("--Select--") && !t5.getSelectedItem().equals("--Select--") && !t6.getText().equals(""))
            {
                note.setText("");
                String ab=(String)t2.getSelectedItem();
                int n=ab.indexOf(",");
                String ab1=ab.substring(0,n);
                
                rs=stmt.executeQuery("select * from theatre where name='"+ab1+"'");
                if(rs.next())
                {
                    int ba=Integer.parseInt(rs.getString(6));
                    int bba=Integer.parseInt(t5.getSelectedItem().toString());
                    if(ba>=bba)
                    {//System.out.println(ba);
                       //System.out.println("select * from login where phone='"+str1+"'");
                rs=stmt.executeQuery("select * from login where phone='"+str1+"'");
                if(rs.next())
                {
                    int pr=p*Integer.parseInt(t5.getSelectedItem().toString());
                    int as=ba-Integer.parseInt(t5.getSelectedItem().toString());
                            //System.out.println("insert into booking(name,phone,utype,movie,theatre,sdate,stime,no_of_seats,seat_no,bdate,price,status)values('"+rs.getString(1)+"','"+str1+"','"+rs.getString(5)+"','"+t1.getSelectedItem()+"','"+t2.getSelectedItem()+"','"+t3.getSelectedItem()+"','"+t4.getSelectedItem()+"','"+t5.getSelectedItem()+"','"+t6.getText()+"',now(),'"+pr+"','pending')");
                   stmt.executeUpdate("insert into booking(name,phone,utype,movie,theatre,sdate,stime,no_of_seats,seat_no,bdate,price,status)values('"+rs.getString(1)+"','"+str1+"','"+rs.getString(5)+"','"+t1.getSelectedItem()+"','"+t2.getSelectedItem()+"','"+t3.getSelectedItem()+"','"+t4.getSelectedItem()+"','"+t5.getSelectedItem()+"','"+t6.getText()+"',now(),'"+pr+"','pending')");
                   stmt.executeUpdate("update theatre set ava_seats='"+as+"' where name='"+ab1+"'");
                   thank_u t=new thank_u(str,str1,pr);
                   t.setVisible(true);
                   setVisible(false);
                }
            }
            else{
                note.setText("Please fill all the details");
            }
                }
                else
                {
                    note.setText("Seats not Available");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void t1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t1ItemStateChanged
        // TODO add your handling code here:
         try{
            rs=stmt.executeQuery("select * from movie where name='"+t1.getSelectedItem()+"'");
            if(rs.next())
            {
                p=Integer.parseInt(rs.getString(3));
                //System.out.println(p);
            }
            t2.removeAllItems();
            t2.addItem("--Select--");
            //System.out.println("select distinct(theater) from movietheatre where movie='"+t1.getSelectedItem()+"'");
            rs=stmt.executeQuery("select theater from movietheatre where movie='"+t1.getSelectedItem()+"' group by theater");
            while(rs.next())
            {
                
                t2.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_t1ItemStateChanged

    private void t2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t2ItemStateChanged
        // TODO add your handling code here:
        try{
            t3.removeAllItems();
            t3.addItem("--Select--");
            rs=stmt.executeQuery("select sdate from movietheatre where movie='"+t1.getSelectedItem()+"' and theater='"+t2.getSelectedItem()+"' group by sdate");
            while(rs.next())
            {
                t3.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_t2ItemStateChanged

    private void t3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t3ItemStateChanged
        // TODO add your handling code here:
        try{
            t4.removeAllItems();
            t4.addItem("--Select--");
            rs=stmt.executeQuery("select stime from movietheatre where movie='"+t1.getSelectedItem()+"' and theater='"+t2.getSelectedItem()+"' and sdate='"+t3.getSelectedItem()+"' group by stime");
            while(rs.next())
            {
                t4.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_t3ItemStateChanged

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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel note;
    private javax.swing.JComboBox t1;
    private javax.swing.JComboBox t2;
    private javax.swing.JComboBox t3;
    private javax.swing.JComboBox t4;
    private javax.swing.JComboBox t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
