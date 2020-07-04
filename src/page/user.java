/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import koneksi.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva Nuramalia
 */
public class user extends javax.swing.JFrame {
    private Connection koneksi;
    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        connectionDatabase();
        loadtabel();
        this.setLocation(285, 70);
        txtiduser.enable(false);
        generateid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtiduser = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        tambah_masakan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhasil = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Input User");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("ID User             :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Nama User        :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Username          :");

        tambah_masakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus (1).png"))); // NOI18N
        tambah_masakan.setText("Tambah");
        tambah_masakan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tambah_masakan.setIconTextGap(10);
        tambah_masakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_masakanActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil (1).png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(10);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/criss-cross (1).png"))); // NOI18N
        jButton3.setText("Hapus");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(10);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset (1).png"))); // NOI18N
        jButton4.setText("Reset");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setIconTextGap(10);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tblhasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblhasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhasilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhasil);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Password          :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tambah_masakan))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtiduser)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah_masakan)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambah_masakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_masakanActionPerformed
        // TODO add your handling code here:
        String id = txtiduser.getText();
        String nama = txtnama.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Input field nama", "Failed", 
                                    JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        
        if(nama.equals("")){
            JOptionPane.showMessageDialog(null, "Input field nama masakan", "Failed", 
                                    JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        
        
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Input field harga", "Failed", 
                                    JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        
         if (nama.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Mohon Masukkan Data untuk di Input", "PERHATIAN", 
                        JOptionPane.WARNING_MESSAGE);
                } else {
                try {
                    try (java.sql.Statement stat = koneksi.createStatement()) {
                        ResultSet data = stat.executeQuery("SELECT * FROM user WHERE id ='" + 
                                id + "'");
                        if (data.next()) {
                            JOptionPane.showMessageDialog(null, "ID anda sudah terdaftar", "PERHATIAN", 
                                    JOptionPane.WARNING_MESSAGE);
                            generateid();
                            return;
                        } else {
//                            String sql = "INSERT INTO masakan VALUES("  + id + ""
//                                    + ",'" + nama + "'"
//                                    + ",'" + harga + "')";
                            String sql = "INSERT INTO user VALUES ('"+id+"','"+username+"','"+username+"','"+password+"')";
                            
                            stat.executeUpdate(sql);
                            loadtabel();
                            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan", "SUKSES", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            bersih();
                        }   }
                } catch (HeadlessException | SQLException exc) {
                    System.err.println("Terjadi Kesalahan :" + exc);
                }
            }
    }//GEN-LAST:event_tambah_masakanActionPerformed

    private void tblhasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhasilMouseClicked
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            int baris = tblhasil.getSelectedRow();
            if (baris != -1) {
                txtiduser.setText(tblhasil.getValueAt(baris, 0).toString());
                txtnama.setText(tblhasil.getValueAt(baris, 1).toString());
                txtusername.setText(tblhasil.getValueAt(baris, 2).toString());
                txtpassword.setText(tblhasil.getValueAt(baris, 3).toString());
               
            }
            
        } catch (Exception ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblhasilMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = txtiduser.getText();
        String nama = txtnama.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();
        
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi Dialog"
                    , JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from user where id='" + id + "'";
        try {
            try (java.sql.Statement stat =koneksi.createStatement()) {
            ResultSet data = stat.executeQuery("SELECT * FROM user WHERE id ='" + 
                             id + "'");
            if (data.next()) { 
//                stat.executeUpdate(sql);
                stat.executeUpdate(sql);
                loadtabel();

                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus", "SUKSES", 
                JOptionPane.INFORMATION_MESSAGE);
                bersih();
                return;
            } else {
//              String sql = "INSERT INTO masakan VALUES ('"+id+"','"+nama+"','"+harga+"')";
                    
                JOptionPane.showMessageDialog(null, "Pilih data pada tabel", "PERHATIAN", 
                JOptionPane.WARNING_MESSAGE);
                generateid();
                        }   }
                } catch (HeadlessException | SQLException exc) {
                    System.err.println("Terjadi Kesalahan :" + exc);
                }       
        }
        
             
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = txtiduser.getText();
        String nama = txtnama.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();
                
         int ok = JOptionPane.showConfirmDialog(null, "Yakin ?", "Konfirmasi Dialog",
                    JOptionPane.YES_NO_OPTION);
        
        if (ok == 0) {
            String sql = "update user set nama='" + nama
            + "',username='" + username
            + "',password='" + password
            + "'where id='" + id + "'";
        try {
            try (java.sql.Statement stat =koneksi.createStatement()) {
            ResultSet data = stat.executeQuery("SELECT * FROM user WHERE id ='" + 
                             id + "'");
            if (data.next()) { 
//                stat.executeUpdate(sql);
                stat.executeUpdate(sql);
                loadtabel();

                JOptionPane.showMessageDialog(null, "Data Berhasil Di Edit", "SUKSES", 
                JOptionPane.INFORMATION_MESSAGE);
                bersih();
                return;
            } else {
//              String sql = "INSERT INTO masakan VALUES ('"+id+"','"+nama+"','"+harga+"')";
                    
                JOptionPane.showMessageDialog(null, "Pilih data pada tabel", "PERHATIAN", 
                JOptionPane.WARNING_MESSAGE);
                generateid();
                        }   }
                } catch (HeadlessException | SQLException exc) {
                    System.err.println("Terjadi Kesalahan :" + exc);
                }       
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void bersih() {
        generateid();
        txtnama.setText("");
        txtusername.setText("");
        txtpassword.setText("");
    }
    
    private void generateid() {
        int angka_random = (int) (Math.random() * 1000);
        String id = "USR" + String.valueOf(angka_random) ;
        txtiduser.setText(id);
    }
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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }
    
    public void loadtabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID User");
        model.addColumn("Nama User");
        model.addColumn("Username");
        model.addColumn("Password");
        tblhasil.setModel(model);
        String sqls = "SELECT * FROM user";
        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet datas = stat.executeQuery(sqls);
        while (datas.next()) {
            model.addRow(new Object[]{
            datas.getString("id"),
            datas.getString("nama"),
            datas.getString("username"),
            datas.getString("password"),
         });
         tblhasil.setModel(model);
        }
        } catch (Exception e) {
        System.err.println("Terjadi Kesalahan :" + e);
        }
    }
    
    private void connectionDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/warteg", "root", "");
        } catch (SQLException se) {
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tambah_masakan;
    private javax.swing.JTable tblhasil;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}