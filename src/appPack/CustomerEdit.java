package appPack;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author KARACA
 */
public class CustomerEdit extends javax.swing.JFrame {

    String id = "";
    int mousepX;
    int mousepY;
    DB db = new DB();

    private CustomerEdit() {

    }

    // DASHBOARD EKRANINDA TIKLANAN MÜŞTERİ ID Sİ ALINIR VE EDİT EKRANINDA TEXTFİELDLERE YAZILIR.
    public CustomerEdit(String id) {
        this.id = id;
        initComponents();
        try {
            String url = "select *from musteriler where mid = '" + id + "'";
            ResultSet rs = db.DB().executeQuery(url);
            if (rs.next()) { // yukarıdaki sorgudan eb az bir adet var mı ?
                txtAdCe.setText(rs.getString("ad"));
                txtSoyadCe.setText(rs.getString("soyad"));
                txtTelCe.setText(rs.getString("telefon"));
                txtAdresCe.setText(rs.getString("adres"));
            }
        } catch (Exception e) {
        } finally {
            db.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        minimizeScrnBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdresCe = new javax.swing.JTextArea();
        txtTelCe = new javax.swing.JTextField();
        txtSoyadCe = new javax.swing.JTextField();
        txtAdCe = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblUyari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 175, 192));

        jPanel2.setBackground(new java.awt.Color(83, 92, 104));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 24));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        minimizeScrnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizescreen_icon.png"))); // NOI18N
        minimizeScrnBtn.setContentAreaFilled(false);
        minimizeScrnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeScrnBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Müşteri Güncelle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeScrnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(minimizeScrnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Soyad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefon");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Adres");

        txtAdresCe.setColumns(20);
        txtAdresCe.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtAdresCe.setRows(5);
        txtAdresCe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdresCeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtAdresCe);

        txtTelCe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelCeKeyReleased(evt);
            }
        });

        txtSoyadCe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoyadCeKeyReleased(evt);
            }
        });

        txtAdCe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdCeKeyReleased(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_icon.png"))); // NOI18N
        backBtn.setToolTipText("Önceki Sayfa");
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(252, 92, 101));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_icon.png"))); // NOI18N
        editBtn.setToolTipText("Müşteriyi Güncelle");
        editBtn.setContentAreaFilled(false);
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settingsUser_icon.png"))); // NOI18N

        lblUyari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUyari.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(198, 198, 198))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lblUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(45, 45, 45))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(53, 53, 53)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(txtAdCe)
                        .addComponent(txtSoyadCe)
                        .addComponent(txtTelCe))
                    .addGap(56, 56, 56)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(editBtn)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtAdCe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoyadCe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelCe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(157, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // SAYFAYI MOUSE İLE HAREKET ETTİRME

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX - mousepX, kordinatY - mousepY);
    }//GEN-LAST:event_jPanel2MouseDragged

    //SAYFAYI MOUSE İLE HAREKET ETTİRME

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    // ENTER TUŞU İLE İŞLEMİ ONAYLAMA

    private void txtAdresCeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdresCeKeyReleased
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_txtAdresCeKeyReleased

    // ENTER TUŞU İLE İŞLEMİ ONAYLAMA

    private void txtTelCeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelCeKeyReleased
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_txtTelCeKeyReleased

    // ENTER TUŞU İLE İŞLEMİ ONAYLAMA

    private void txtSoyadCeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoyadCeKeyReleased
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_txtSoyadCeKeyReleased

    // ENTER TUŞU İLE İŞLEMİ ONAYLAMA

    private void txtAdCeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdCeKeyReleased
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_txtAdCeKeyReleased

    // DASHBOARD EKRANINA DÖNÜŞ

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        DB db = new DB();
        Dashboard dashboard = new Dashboard();

        dashboard.setVisible(true);
        db.close();
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    // MÜŞTERİ GÜNCELLEME BUTONU

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        String ad = txtAdCe.getText().trim();
        String soyad = txtSoyadCe.getText().trim();
        String tel = txtTelCe.getText().trim();
        String adres = txtAdresCe.getText().trim();

        if (ad.equals("") || soyad.equals("") || tel.equals("") || adres.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tüm Alanları Doldurunuz!");
        } else {
            try {
                String url = "update musteriler set ad = '" + ad + "', "
                        + "soyad = '" + soyad + "', telefon = '" + tel + "', "
                        + "adres = '" + adres + "' where mid = '" + id + "'";
                int duzenle = db.DB().executeUpdate(url);
                db.close();
                lblUyari.setText("Müşteri Güncellendi");
            } catch (Exception e) {
                System.err.println("Düzenleme Hatası : " + e);
            }

        }


    }//GEN-LAST:event_editBtnActionPerformed

    private void minimizeScrnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeScrnBtnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeScrnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUyari;
    private javax.swing.JButton minimizeScrnBtn;
    private javax.swing.JTextField txtAdCe;
    private javax.swing.JTextArea txtAdresCe;
    private javax.swing.JTextField txtSoyadCe;
    private javax.swing.JTextField txtTelCe;
    // End of variables declaration//GEN-END:variables
}
