/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAMADHANI
 */
public class transaksi extends javax.swing.JFrame {
    private Connection koneksi;
    /**
     * Creates new form transaksi
     */
    public transaksi() {
        initComponents();
        connectionDatabase();
        lblnomeja.show(false);
        nomeja.show(false);
        txtinputidorder.getFocusAccelerator();
        this.setLocation(285, 70);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhasil = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblidorder = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        btnbayar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbltanggal = new javax.swing.JLabel();
        nomeja = new javax.swing.JLabel();
        lblnomeja = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbltotalbayar = new javax.swing.JLabel();
        lbltotalbaayar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltotalbaayar2 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JLabel();
        lblkembalian = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtinputidorder = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setText("TRANSAKSI");

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Status                 :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("ID Order            :");

        lblidorder.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblidorder.setText("-");

        lblstatus.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblstatus.setText("-");

        btnbayar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnbayar.setText("Bayar");
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keterangan");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbltanggal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbltanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbltanggal.setText("-");
        lbltanggal.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbltanggal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(lbltanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 79, -1));

        nomeja.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nomeja.setText("No Meja            :");

        lblnomeja.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblnomeja.setText("-");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Total Bayar");

        lbltotalbayar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbltotalbayar.setText("-");

        lbltotalbaayar1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbltotalbaayar1.setText("Rp.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("---------------------------------------");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("---------------------------------------");

        lbltotalbaayar2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbltotalbaayar2.setText("Bayar                  :");

        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbayarKeyReleased(evt);
            }
        });

        kembalian.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        kembalian.setText("Kembalian           :");

        lblkembalian.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblkembalian.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(nomeja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnomeja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblidorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(kembalian)
                                .addGap(18, 18, 18)
                                .addComponent(lblkembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbltotalbaayar2)
                            .addGap(18, 18, 18)
                            .addComponent(txtbayar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lbltotalbaayar1)
                            .addGap(26, 26, 26)
                            .addComponent(lbltotalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblidorder))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblstatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeja)
                    .addComponent(lblnomeja))
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalbayar)
                    .addComponent(lbltotalbaayar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalbaayar2)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalian)
                    .addComponent(lblkembalian))
                .addGap(67, 67, 67)
                .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Input ID Order :");

        txtinputidorder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtinputidorderKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtinputidorder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtinputidorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tblhasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhasilMouseClicked
        // TODO add your handling code here:

//        try {
//            // TODO add your handling code here:
//            int baris = tblhasil.getSelectedRow();
//            if (baris != -1) {
//                lblidmakanan.setText(tblhasil.getValueAt(baris, 0).toString());
//                lblnamamakanan.setText(tblhasil.getValueAt(baris, 1).toString());
//                lblharga.setText(tblhasil.getValueAt(baris, 2).toString());
//            }
//
//        } catch (Exception ex) {
//            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_tblhasilMouseClicked

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        String id_transaksi = generateid();
        String order_id = lblidorder.getText();
        String totals = lbltotalbayar.getText();
        String status = "Lunas";
        
        if(totals.equals("-")){
            JOptionPane.showMessageDialog(null, "Mohon Input id order terlebih dahulu", "PERHATIAN",
                JOptionPane.WARNING_MESSAGE);
        }
        
        if (!txtbayar.getText().equalsIgnoreCase("")) {
            Double bayar = Double.parseDouble(txtbayar.getText());
            Double total = Double.parseDouble(lbltotalbayar.getText());
            Double kem = bayar-total;
            
            if (kem < 0) {
                JOptionPane.showMessageDialog(null, "Mohon Masukkan Data untuk di Input", "PERHATIAN",
                JOptionPane.WARNING_MESSAGE);
            }else{
                try {
                try (java.sql.Statement stat = koneksi.createStatement()) {
                    String sql = "INSERT INTO `transaksi` VALUES ('"
                    + id_transaksi + "'"
                    + ",'" + order_id + "'"
                    + ",'" + totals + "'"
                    + ",'" + status + "')";
                    stat.executeUpdate(sql);
                    txtinputidorder.setText("");
                    txtbayar.setText("");
                    lblkembalian.setText("-");
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan", "SUKSES",
                        JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (SQLException exc) {
                System.err.println("Terjadi Kesalahan :" + exc);
            }

            }   
        }
         //INSERT INTO `order` (`id_order`, `masakan_id`, `no_meja`, `tanggal`, `jumlah`, `status`) VALUES ('USR199', 'M646', '1', '2020-07-04', '1', 'di tempat');
    }//GEN-LAST:event_btnbayarActionPerformed

    private void txtinputidorderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinputidorderKeyReleased
        // TODO add your handling code here:
        loadtabel(txtinputidorder.getText());
    }//GEN-LAST:event_txtinputidorderKeyReleased

    private void txtbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyReleased
        // TODO add your handling code here:
        if (!txtbayar.getText().equalsIgnoreCase("")) {
            Double bayar = Double.parseDouble(txtbayar.getText());
            Double total = Double.parseDouble(lbltotalbayar.getText());
            Double kem = bayar-total;
            
            if (kem < 0) {
                kembalian.setVisible(false);
                lblkembalian.setText("Jumlah uang kurang");
                lblkembalian.setForeground(new java.awt.Color(255, 51, 51));
                btnbayar.setEnabled(false);
            }else{
                kembalian.setVisible(true);
                lblkembalian.setText(String.valueOf(+kem));
                lblkembalian.setForeground(new java.awt.Color(0,0,0));
                btnbayar.setEnabled(true);

            }
        }
    }//GEN-LAST:event_txtbayarKeyReleased

    private String generateid() {
        int angka_random = (int) (Math.random() * 1000);
        String id = "TRS" + String.valueOf(angka_random) ;
        return id;
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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    public void loadtabel(String id) {
        String id_order = id;
        result_total(id_order);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Order");
        model.addColumn("Nama Masakan");
        model.addColumn("Jumlah");
        model.addColumn("Harga");
        tblhasil.setModel(model);
        String sqls = "SELECT * FROM `order` INNER JOIN `masakan` ON `order`.`masakan_id`=`masakan`.`id_masakan` WHERE `id_order`='"+ id_order +"'";
        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet datas = stat.executeQuery(sqls);
        while (datas.next()) {
            model.addRow(new Object[]{
            datas.getString("id_order"),
            datas.getString("nama_masakan"),
            datas.getString("jumlah"),
            datas.getString("harga"),
         });
         tblhasil.setModel(model);
         lblidorder.setText(datas.getString("id_order"));
         lblstatus.setText(datas.getString("status"));
         lblnomeja.setText(datas.getString("no_meja"));
         lbltanggal.setText(datas.getString("tanggal"));
         String a = lblnomeja.getText();
         if(a.equals("null")) {
             lblnomeja.show(false);
             nomeja.show(false);
             System.out.println("t");
         } else {
             System.out.println("f");
         }
        }
        } catch (Exception e) {
        System.err.println("Terjadi Kesalahan :" + e);
        }
    }
    
    public void result_total(String id_order) {
        String sqls = "SELECT SUM(masakan.harga*order.jumlah) AS total FROM `order` INNER JOIN masakan ON `order`.`masakan_id`=`masakan`.`id_masakan` WHERE id_order ='"+ id_order +"'";
        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet datas = stat.executeQuery(sqls);
        while (datas.next()) {
            lbltotalbayar.setText(datas.getString("total"));
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
    private javax.swing.JButton btnbayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel lblidorder;
    private javax.swing.JLabel lblkembalian;
    private javax.swing.JLabel lblnomeja;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbltanggal;
    private javax.swing.JLabel lbltotalbaayar1;
    private javax.swing.JLabel lbltotalbaayar2;
    private javax.swing.JLabel lbltotalbayar;
    private javax.swing.JLabel nomeja;
    private javax.swing.JTable tblhasil;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtinputidorder;
    // End of variables declaration//GEN-END:variables
}
