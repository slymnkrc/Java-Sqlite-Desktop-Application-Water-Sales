package appPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import props.User;

public class DB {

    private final String driver = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:db/suapp.db";
    private Connection conn = null;
    private PreparedStatement pre = null;
    private Statement st = null;
    public static User user = new User();

    public DB() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Success");
        } catch (Exception e) {
            System.err.println("Connection Error : " + e);
        }

    }

    public Statement DB() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            System.out.println("Connection Success");
        } catch (Exception e) {
            System.err.println("Connection Error : " + e);
        }
        return st;
    }

    // USER LOGIN
    public boolean fncUserLogin(String username, String password) {
        boolean status = false;

        try {
            String sql = "SELECT *FROM user WHERE   password = ? AND username = ?";

            pre = conn.prepareStatement(sql);
            pre.setString(1, Utils.fncMd5(password, 2));

            pre.setString(2, username);

            ResultSet rs = pre.executeQuery();
            status = rs.next();
            if (status) {
                user.setUid(rs.getInt("uid"));
                user.setUsername(rs.getString("username"));
                user.setName(rs.getString("name"));
            }

        } catch (Exception e) {
            System.err.println("Login Error : " + e);
        }
        return status;
    }

    // TÜM MÜŞTERİLER TABLOSU
    public DefaultTableModel allCustomer() {

        DefaultTableModel dtm = new DefaultTableModel();

        // add column
        dtm.addColumn("Mid");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");

        // add rows
        try {
            String sql = "select * from musteriler";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int mid = rs.getInt("mid");
                String ad = rs.getString("Ad");
                String soyad = rs.getString("Soyad");
                String telefon = rs.getString("Telefon");
                String adres = rs.getString("Adres");

                Object[] row = {mid, ad, soyad, telefon, adres};
                dtm.addRow(row);

            }
        } catch (Exception e) {
            System.err.println("allNote Error : " + e);
        }

        return dtm;

    }

    // TÜM SİPARİŞLER TABLOSU
    public DefaultTableModel allOrders() {

        DefaultTableModel dtm = new DefaultTableModel();

        // add column
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        dtm.addColumn("Durum");
        dtm.addColumn("Tutar");

        // add rows
        try {
            String sql = "select * from siparisler";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String telefon = rs.getString("telefon");
                String adres = rs.getString("adres");
                String durum = rs.getString("durum");
                int tutar = rs.getInt("fiyat");

                Object[] row = {sid, ad, soyad, telefon, adres, durum, tutar};
                dtm.addRow(row);

            }
        } catch (Exception e) {
            System.err.println("allOrders Error : " + e);
        }

        return dtm;
    }
        
        // HAZIRLANIYOR DURUMDAKİ SİPARİŞLER
        
    public DefaultTableModel gettingreadyOrder() {

        DefaultTableModel dtm = new DefaultTableModel();
        // add Cloumn
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        dtm.addColumn("Durum");
        dtm.addColumn("Tutar");
        // add Rows
        try {
            String sql = "select * from siparisler where durum = 'Hazırlanıyor'";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String telefon = rs.getString("telefon");
                String adres = rs.getString("adres");
                String durum = rs.getString("durum");
                int tutar = rs.getInt("fiyat");
                Object[] row = {sid, ad, soyad, telefon, adres, durum, tutar};
                dtm.addRow(row);
            }
        } catch (Exception e) {
            System.err.println("Hazırlanıyor Error : " + e);
        }
        return dtm;
    }
    
    // YOLDA OLAN SİPARİŞLER
        
    public DefaultTableModel outputOrder() {

        DefaultTableModel dtm = new DefaultTableModel();
        // add Cloumn
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        dtm.addColumn("Durum");
        dtm.addColumn("Tutar");
        // add Rows
        try {
            String sql = "select * from siparisler where durum = 'Yolda'";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String telefon = rs.getString("telefon");
                String adres = rs.getString("adres");
                String durum = rs.getString("durum");
                int tutar = rs.getInt("fiyat");
                Object[] row = {sid, ad, soyad, telefon, adres, durum, tutar};
                dtm.addRow(row);
            }
        } catch (Exception e) {
            System.err.println("Hazırlanıyor Error : " + e);
        }
        return dtm;
    }
    
    // TESLİM EDİLEN SİPARİŞLER
        
    public DefaultTableModel deliveredOrder() {

        DefaultTableModel dtm = new DefaultTableModel();
        // add Cloumn
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        dtm.addColumn("Durum");
        dtm.addColumn("Tutar");
        // add Rows
        try {
            String sql = "select * from siparisler where durum = 'Teslim Edildi'";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String telefon = rs.getString("telefon");
                String adres = rs.getString("adres");
                String durum = rs.getString("durum");
                int tutar = rs.getInt("fiyat");
                Object[] row = {sid, ad, soyad, telefon, adres, durum, tutar};
                dtm.addRow(row);
            }
        } catch (Exception e) {
            System.err.println("Hazırlanıyor Error : " + e);
        }
        return dtm;
    }
    

// MÜŞTERİ EKLE
    public int customerInsert(String Ad, String Soyad, String Telefon, String Adres) {
        int status = 0;

        try {
            String sql = " insert into musteriler values ( null,?,?,?,? )";
            pre = conn.prepareStatement(sql);
            pre.setString(1, Ad);
            pre.setString(2, Soyad);
            pre.setString(3, Telefon);
            pre.setString(4, Adres);

            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("CustomerInsert Error : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                status = -1;
            }
        }

        return status;
    }

    // MÜŞTERİ BİLGİLERİNİ GÜNCELLEME
    public int customerUpdate(String ad, String soyad, String tel, String adres, int mid) {

        int status = 0;

        try {
            String sql = "update customer set ad = ?, soyad = ?, telefon = ?, adres = ? where mid = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, ad);
            pre.setString(2, soyad);
            pre.setString(3, tel);
            pre.setString(4, adres);
            pre.setInt(5, mid);
            status = pre.executeUpdate();  // data gönderiyoruz executeUpdate.
        } catch (Exception e) {
            System.err.println("CustomerUpdate Error : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                status = -1;
            }
        }

        return status;
    }

    // SİPARİŞ EKLE
    public int orderInsert(String Ad, String Soyad, String Telefon, String Adres, String Durum, String Tutar) {
        int status = 0;
        try {
            String sql = "insert into siparisler values(null,?,?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, Ad);
            pre.setString(2, Soyad);
            pre.setString(3, Telefon);
            pre.setString(4, Adres);
            pre.setString(5, Durum);
            pre.setString(6, Tutar);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("OrderInsert Error : " + e);
            status = -1;
        }
        return status;
    }

    
    
    public void close() { // bu yapıyı kurmak zorundayız !!!

        try {

            if (conn != null && !conn.isClosed()) {
                conn.close();
            }

            if (pre != null) {
                pre.close();
            }

        } catch (Exception e) {
            System.err.println("Close Error : " + e);
        }
    }
}
