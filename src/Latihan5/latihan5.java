/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author A456U
 */
public class latihan5 extends javax.swing.JFrame {

    /**
     * Creates new form latihan5
     */
    public latihan5() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox<>();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        Alamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        jLabel1.setText("Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 130, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 40, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 40, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 160, 40, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 50, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 230, 40, 30);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(100, 80, 130, 30);
        getContentPane().add(Absen);
        Absen.setBounds(100, 120, 130, 30);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6" }));
        Kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelasActionPerformed(evt);
            }
        });
        getContentPane().add(Kelas);
        Kelas.setBounds(100, 160, 130, 30);

        rdb1.setText("RPL");
        getContentPane().add(rdb1);
        rdb1.setBounds(100, 200, 43, 23);

        rdb2.setText("TKJ");
        rdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb2);
        rdb2.setBounds(170, 200, 43, 23);
        getContentPane().add(Alamat);
        Alamat.setBounds(100, 230, 130, 30);

        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 300, 70, 30);

        jButton2.setText("EXIT");
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 300, 60, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 130, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Latihan5/siswa.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 10, 200, 330);

        setSize(new java.awt.Dimension(498, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void rdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = Kelas.getSelectedItem().toString();
        String jurusan = "";
        String alamat = Alamat.getText();
        
        if (rdb1.isSelected())
            jurusan = "RPL";
        else if (rdb2.isSelected())
            jurusan = "TKJ";
        else
            
        if (Kelas.getSelectedItem()== "XI RPL 1"){
        }
        if (Kelas.getSelectedItem()== "XI RPL 2"){
        }
        if (Kelas.getSelectedItem()== "XI RPL 3"){
        }
        if (Kelas.getSelectedItem()== "XI RPL 4"){
        }
        if (Kelas.getSelectedItem()== "XI RPL 5"){
        }
        if (Kelas.getSelectedItem()== "XI RPL 6"){
        }
        
        new Latihan5b (nama, absen, kelas, jurusan, alamat).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void KelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KelasActionPerformed

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
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
