

import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hs247
 */
public class Shipping extends javax.swing.JFrame {

    Connection con;
       ResultSet rs;
       PreparedStatement pst;
    
    public Shipping() {
        initComponents();
        con = dbconnect.ConnecrDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        houseno = new javax.swing.JLabel();
        street = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        pincode = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        housetf = new javax.swing.JTextField();
        streettf = new javax.swing.JTextField();
        citytf = new javax.swing.JTextField();
        pintf = new javax.swing.JTextField();
        statetf = new javax.swing.JTextField();
        countrytf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usertf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 530));
        setPreferredSize(new java.awt.Dimension(901, 531));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 530));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SHIPPING ADDRESS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 290, 33);

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("NAME");
        getContentPane().add(name);
        name.setBounds(60, 140, 54, 30);

        houseno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        houseno.setForeground(new java.awt.Color(255, 255, 255));
        houseno.setText("HOUSE NO.");
        getContentPane().add(houseno);
        houseno.setBounds(60, 180, 99, 30);

        street.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        street.setForeground(new java.awt.Color(255, 255, 255));
        street.setText("STREET\n");
        getContentPane().add(street);
        street.setBounds(60, 220, 67, 30);

        city.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setText("CITY");
        getContentPane().add(city);
        city.setBounds(60, 260, 43, 30);

        pincode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pincode.setForeground(new java.awt.Color(255, 255, 255));
        pincode.setText("PINCODE");
        getContentPane().add(pincode);
        pincode.setBounds(60, 300, 82, 30);

        state.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        state.setForeground(new java.awt.Color(255, 255, 255));
        state.setText("STATE");
        getContentPane().add(state);
        state.setBounds(60, 340, 56, 30);

        country.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        country.setForeground(new java.awt.Color(255, 255, 255));
        country.setText("COUNTRY");
        getContentPane().add(country);
        country.setBounds(60, 390, 89, 20);
        getContentPane().add(nametf);
        nametf.setBounds(210, 140, 222, 30);

        housetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housetfActionPerformed(evt);
            }
        });
        getContentPane().add(housetf);
        housetf.setBounds(210, 180, 222, 30);
        getContentPane().add(streettf);
        streettf.setBounds(210, 220, 223, 30);
        getContentPane().add(citytf);
        citytf.setBounds(210, 260, 223, 30);
        getContentPane().add(pintf);
        pintf.setBounds(210, 300, 223, 30);
        getContentPane().add(statetf);
        statetf.setBounds(210, 340, 223, 30);
        getContentPane().add(countrytf);
        countrytf.setBounds(211, 382, 223, 30);

        jButton1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButton1.setText("PAYMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(273, 455, 140, 30);

        jButton2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 455, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 102, 70, 30);
        getContentPane().add(usertf);
        usertf.setBounds(210, 100, 220, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\flour.378377ce.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void housetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_housetfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "insert into Shipping(Userid,Name,Houseno,Street,City,Pincode,State,Country) values(?,?,?,?,?,?,?,?)";
      try
      {
          pst=con.prepareStatement(sql);
          pst.setString(1,usertf.getText());
          pst.setString(2,nametf.getText());
          pst.setString(3,housetf.getText());
          pst.setString(4,streettf.getText());
          pst.setString(5,citytf.getText());
          pst.setString(6,pintf.getText());
          pst.setString(7,statetf.getText());
          pst.setString(8,countrytf.getText());
          pst.execute();
          JOptionPane.showMessageDialog(null,"Address insert");
          
          Payment ob = new Payment();
          ob.setVisible(true);
          dispose();
        }
      catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }    
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        usertf.setText(" ");
        nametf.setText(" ");
        housetf.setText(" ");
        streettf.setText(" ");
        citytf.setText(" ");
        pintf.setText(" ");
        statetf.setText(" ");
        countrytf.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shipping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JTextField citytf;
    private javax.swing.JLabel country;
    private javax.swing.JTextField countrytf;
    private javax.swing.JLabel houseno;
    private javax.swing.JTextField housetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel pincode;
    private javax.swing.JTextField pintf;
    private javax.swing.JLabel state;
    private javax.swing.JTextField statetf;
    private javax.swing.JLabel street;
    private javax.swing.JTextField streettf;
    private javax.swing.JTextField usertf;
    // End of variables declaration//GEN-END:variables
}