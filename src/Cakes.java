
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hs247
 */
public class Cakes extends javax.swing.JFrame {

    /**
     * Creates new form Cakes
     */
    public Cakes() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ChocoBtn = new javax.swing.JButton();
        BlackBtn = new javax.swing.JButton();
        FruitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 538));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 538));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setText("CAKES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(374, 11, 126, 57);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\Chocolate Cake.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 150, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\black-forest.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 120, 151, 130);

        ChocoBtn.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        ChocoBtn.setText("Chocolate cake");
        ChocoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ChocoBtn);
        ChocoBtn.setBounds(90, 250, 150, 35);

        BlackBtn.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        BlackBtn.setText("Black Forest Cake");
        getContentPane().add(BlackBtn);
        BlackBtn.setBounds(610, 250, 175, 35);

        FruitBtn.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        FruitBtn.setText("Fruit Cake");
        getContentPane().add(FruitBtn);
        FruitBtn.setBounds(370, 250, 111, 35);

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\download 1.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 120, 150, 130);

        HomeBtn.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        HomeBtn.setText("HOME");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBtn);
        HomeBtn.setBounds(750, 70, 90, 30);

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel3.setText("CAKES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 80, 80, 30);

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel5.setText("CUPCAKES");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 300, 160, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\chocolate-cupcakes.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 340, 150, 130);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\download (6).jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 340, 150, 130);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\Funfetti-Cupcake.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(620, 340, 150, 130);

        jButton1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButton1.setText("Chocolate cupcake");
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 470, 190, 29);

        jButton2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButton2.setText("Vanilla cupcake");
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 470, 150, 29);

        jButton3.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButton3.setText("Sprinkle cupcake");
        getContentPane().add(jButton3);
        jButton3.setBounds(610, 470, 170, 29);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\java project\\Bakery management system\\image\\bakery.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 900, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Close()  {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void ChocoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocoBtnActionPerformed
        Close();
        Chococake ob = new Chococake();
        ob.setVisible(true); 
        dispose();
    }//GEN-LAST:event_ChocoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Cakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cakes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlackBtn;
    private javax.swing.JButton ChocoBtn;
    private javax.swing.JButton FruitBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
