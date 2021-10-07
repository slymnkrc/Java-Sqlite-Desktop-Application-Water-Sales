package appPack;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KARACA
 */
public class Dashboard extends javax.swing.JFrame {
     int mousepX;
     int mousepY;
     
    

    public Dashboard() {
        initComponents();
        refreshCustomer();
        refreshOrders();
        
    }

    // VERİTABANIINDA YAPILAN MÜŞTERİ İŞLEMLERİ TABLOYA GÜNCELLENMİŞ HALDE GETİRİLİR.
    private void refreshCustomer() {
        DB db = new DB();
        tbl_customer.setModel(db.allCustomer());
        db.close();
    }

    private void refreshOrders() {
        DB db = new DB();
        tbl_order.setModel(db.allOrders());
        db.close();
    }
    
    
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtsearchAd = new javax.swing.JTextField();
        txtsearchSoyad = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_order = new javax.swing.JTable();
        neworderBtn = new javax.swing.JButton();
        cargoBtn = new javax.swing.JButton();
        teslimBtn = new javax.swing.JButton();
        deleteOrderBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        closeBtnLgn = new javax.swing.JButton();
        minimizeScrnBtnLgn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(149, 175, 192));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(26, 188, 156));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_icon.png"))); // NOI18N
        searchBtn.setToolTipText("Müşteri Ara");
        searchBtn.setContentAreaFilled(false);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Ad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Soyad");

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh_icon.png"))); // NOI18N
        refreshBtn.setToolTipText("Yenile");
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtsearchAd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearchSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearchAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearchSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45))))
        );

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteriler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        tbl_customer.setBackground(new java.awt.Color(22, 160, 133));
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_customer.setSelectionForeground(new java.awt.Color(149, 175, 192));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_customerMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_customer);

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_icon.png"))); // NOI18N
        addBtn.setToolTipText("Müşteri Ekle");
        addBtn.setContentAreaFilled(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_icon.png"))); // NOI18N
        editBtn.setToolTipText("Müşteri Güncelle");
        editBtn.setContentAreaFilled(false);
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_icon (2).png"))); // NOI18N
        deleteBtn.setToolTipText("Müşteri Sil");
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(39, 174, 96));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Siparişler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        tbl_order.setBackground(new java.awt.Color(39, 174, 96));
        tbl_order.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_orderMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_order);

        neworderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_icon.png"))); // NOI18N
        neworderBtn.setToolTipText("Sipariş Ekle");
        neworderBtn.setContentAreaFilled(false);
        neworderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neworderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neworderBtnActionPerformed(evt);
            }
        });

        cargoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kargo_icon.png"))); // NOI18N
        cargoBtn.setToolTipText("Siparişi Yola Çıktı");
        cargoBtn.setContentAreaFilled(false);
        cargoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cargoBtnMouseReleased(evt);
            }
        });
        cargoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoBtnActionPerformed(evt);
            }
        });

        teslimBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teslim_icon.png"))); // NOI18N
        teslimBtn.setToolTipText("Sipariş Teslim Edildi");
        teslimBtn.setContentAreaFilled(false);
        teslimBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teslimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teslimBtnActionPerformed(evt);
            }
        });

        deleteOrderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_icon (2).png"))); // NOI18N
        deleteOrderBtn.setToolTipText("Siparişi Sil");
        deleteOrderBtn.setContentAreaFilled(false);
        deleteOrderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(neworderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cargoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teslimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neworderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teslimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(83, 92, 104));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        closeBtnLgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_icon.png"))); // NOI18N
        closeBtnLgn.setContentAreaFilled(false);
        closeBtnLgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnLgnActionPerformed(evt);
            }
        });

        minimizeScrnBtnLgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizescreen_icon.png"))); // NOI18N
        minimizeScrnBtnLgn.setContentAreaFilled(false);
        minimizeScrnBtnLgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeScrnBtnLgnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Kontrol Ekranı");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeScrnBtnLgn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtnLgn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeBtnLgn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(minimizeScrnBtnLgn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(46, 204, 113));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sipariş Durumu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jButton1.setText("Hazırlanan Siparişler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Yoldaki Siparişler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Teslim Edilenler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tüm Siparişler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// MÜŞTERİ EKLE BUTONU

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        DB db = new DB();
        CustomerAdd customerAdd = new CustomerAdd();
        customerAdd.setVisible(true);
        refreshCustomer();
        dispose();
        db.close();

    }//GEN-LAST:event_addBtnActionPerformed

    // MÜŞTERİ DÜZENLEME BUTONU

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen müşteri seçimi yapınız");
            
        } else {
            CustomerEdit ce = new CustomerEdit(mid);
            ce.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_editBtnActionPerformed
    // TABLODAN TIKLANAN MÜŞTERİNİN ID SİNİ ALMA
    String mid = "";
    int row;
    private void tbl_customerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseReleased

        row = tbl_customer.getSelectedRow();
        if (row > -1) {
            mid = "" + tbl_customer.getValueAt(row, 0);
            System.out.println("mid : " + mid);

        }

    }//GEN-LAST:event_tbl_customerMouseReleased

    // MÜŞTERİ SİLME BUTONU

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DB db = new DB();
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen müşteri seçimi yapınız");
            
        } else {
            int status = JOptionPane.showConfirmDialog(rootPane, "Silme işlemi geri alınamaz, silmek istediğinize emin misiniz?", "Silme İşlemi", JOptionPane.YES_NO_OPTION);
            if (status == 0) {
                try {
                    String url = "delete from musteriler where mid = '" + mid + "' ";
                    int silSonuc = db.DB().executeUpdate(url);
                    if (silSonuc > 0) {
                        getData();
                        JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Silme hatası !");
                    }
                } catch (Exception e) {
                    System.err.println("Silme hatası : " + e);
                }
                db.close();
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    // MÜŞTERİ ARAMA BUTONU

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DB db = new DB();
        String ad, soyad;
        ad = txtsearchAd.getText();
        soyad = txtsearchSoyad.getText();
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Mid");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");
            ResultSet rs = db.DB().executeQuery("select * from musteriler where ad = '" + ad + "' or soyad = '" + soyad + "' ");
            while (rs.next()) {
                if (ad.equals(rs.getString("ad")) || soyad.equals(rs.getString("soyad"))) {
                    dtm.addRow(new String[]{rs.getString("mid"), rs.getString("ad"), rs.getString("soyad"), rs.getString("telefon"), rs.getString("adres")});
                }
            }
            tbl_customer.setModel(dtm);
        } catch (Exception e) {
            System.err.println("errorSearchBtn : " + e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    // BUTON YENİLE

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        txtsearchAd.setText("");
        txtsearchSoyad.setText("");
        refreshCustomer();
    }//GEN-LAST:event_refreshBtnActionPerformed

    // SİPARİŞ EKLE BUTONU

    private void neworderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neworderBtnActionPerformed
        DB db = new DB();
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteriler Tablosundan Müşteri Seçiniz!");
        } else {
            OrderAdd oa = new OrderAdd(mid);
            oa.setVisible(true);
            refreshOrders();
            dispose();
            db.close();
        }
    }//GEN-LAST:event_neworderBtnActionPerformed

    // SİPARİŞLER TABLOSUNDAKİ TIKLANAN SİPARİŞ İD Sİ BULMA
    String midd = "";
    int roww;
    private void tbl_orderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_orderMouseReleased

        roww = tbl_order.getSelectedRow();
        if (roww > -1) {
            midd = "" + tbl_order.getValueAt(roww, 0);
            System.out.println("midd : " + midd);

        }
        
    }//GEN-LAST:event_tbl_orderMouseReleased

    // KARGO BUTONU

    private void cargoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoBtnActionPerformed
        DB db = new DB();
        String state = "Yolda";
        if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Sipariş Seçimi yapınız");
        } else {
            try {
                String url = "update siparisler set durum = '" +state+ "'where sid = '" + midd + "'";
                
                int update = db.DB().executeUpdate(url);
                refreshOrders();
                
                            
//                
            }catch (Exception e) {
                System.err.println("cargoError : " + e);
            }
            
            
        }
        db.close();
           
    }//GEN-LAST:event_cargoBtnActionPerformed

    // TESLİM EDİLDİ BUTONU
    
    private void teslimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teslimBtnActionPerformed
        DB db = new DB();
        String state2 = "Teslim Edildi";
        if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Sipariş Seçimi yapınız");
        } else {
            try {
                String url = "update siparisler set durum = '" +state2+ "'where sid = '" + midd + "'";
                
                int update = db.DB().executeUpdate(url);
                refreshOrders();
//                
            }catch (Exception e) {
                System.err.println("cargoError : " + e);
            }
            
            
        }
        db.close();
    }//GEN-LAST:event_teslimBtnActionPerformed

    // HAZIRLANAN SİPARİŞLER BUTONU
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DB db = new DB();
        tbl_order.setModel(db.gettingreadyOrder());
        db.close();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // YOLDAKİ SİPARİŞLER BUTONU
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DB db = new DB();
        tbl_order.setModel(db.outputOrder());
        db.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    // TESLİM EDİLEN SİPARİŞLER BUTONU
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DB db = new DB();
        tbl_order.setModel(db.deliveredOrder());
        db.close();
    }//GEN-LAST:event_jButton3ActionPerformed

    // BÜTÜN SİPARİŞLER BUTONU
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DB db = new DB();
        tbl_order.setModel(db.allOrders());
        db.close();
    }//GEN-LAST:event_jButton4ActionPerformed

        // SİPARİŞİ SİL
    
    private void deleteOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderBtnActionPerformed
         DB db = new DB();
        if (midd.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen sipariş seçim yapınız");
        } else {
            int status = JOptionPane.showConfirmDialog(rootPane, "Silme işlemi geri alınamaz, silmek istediğinize emin misiniz?", "Silme İşlemi", JOptionPane.YES_NO_OPTION);
            if (status == 0) {
                try {
                    String url = "delete from siparisler where sid = '" + midd + "' ";
                    int silSonuc = db.DB().executeUpdate(url);
                    if (silSonuc > 0) {
                        getData();
                        refreshOrders();
                        JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Silme hatası !");
                    }
                } catch (Exception e) {
                    System.err.println("Silme hatası : " + e);
                }
                db.close();
            }
        }
    }//GEN-LAST:event_deleteOrderBtnActionPerformed

    private void closeBtnLgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnLgnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnLgnActionPerformed

    private void minimizeScrnBtnLgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeScrnBtnLgnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeScrnBtnLgnActionPerformed

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX - mousepX, kordinatY - mousepY);
    }//GEN-LAST:event_jPanel7MouseDragged

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel7MousePressed

    private void cargoBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargoBtnMouseReleased
        
    }//GEN-LAST:event_cargoBtnMouseReleased

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cargoBtn;
    private javax.swing.JButton closeBtnLgn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteOrderBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton minimizeScrnBtnLgn;
    private javax.swing.JButton neworderBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTable tbl_order;
    private javax.swing.JButton teslimBtn;
    private javax.swing.JTextField txtsearchAd;
    private javax.swing.JTextField txtsearchSoyad;
    // End of variables declaration//GEN-END:variables
public void getData() {
     DB db = new DB();
        try {
            
            String musteriQuery = "select *from musteriler";
            ResultSet rs = db.DB().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Mid");
            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("Adres");

            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("mid"), rs.getString("ad"), rs.getString("soyad"), rs.getString("telefon"), rs.getString("adres")});
            }
            tbl_customer.setModel(dtm);

        } catch (SQLException e) {
            System.err.println("Data Getirme Hatası : " + e);
        } 
            db.close();
        
    }
}
