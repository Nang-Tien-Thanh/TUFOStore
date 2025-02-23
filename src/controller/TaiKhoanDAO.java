package controller;

import Model.TaiKhoan;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Khoa
 */
public class TaiKhoanDAO {
    private Connection cons = null;
    public TaiKhoanDAO() {
        try {
            String url="jdbc:oracle:thin:@localhost:1521:orcl21";
            String user = "c##sinhvien01";
            String password = "094492";
            cons = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<TaiKhoan> getListTK() {
    ArrayList<TaiKhoan> list = new ArrayList<>();
    String sql = "SELECT * FROM TAIKHOAN ORDER BY MATK ASC"; // Thay đổi cú pháp SQL phù hợp với Oracle SQL
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            TaiKhoan taikhoan = new TaiKhoan();
            // Sử dụng tên cột thay vì tên bảng để truy cập dữ liệu từ ResultSet
            taikhoan.setMATK(rs.getInt("MATK"));
            taikhoan.setMANV(rs.getInt("MANV"));
            taikhoan.setTENDANGNHAP(rs.getString("TENDNHAP"));
            taikhoan.setMATKHAU(rs.getInt("MATKHAU"));
            list.add(taikhoan);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}

    
    public void DeleteTK(int MATK) {
    try {
        // Xóa tài khoản từ bảng TAIKHOAN
        String deleteTaiKhoanSQL = "DELETE FROM TAIKHOAN WHERE MATK = ?";
        PreparedStatement deleteTaiKhoanStmt = cons.prepareStatement(deleteTaiKhoanSQL);
        deleteTaiKhoanStmt.setInt(1, MATK);
        deleteTaiKhoanStmt.executeUpdate();

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    public void AddTK(TaiKhoan taikhoan) {
    try {

        // Tiến hành thêm tài khoản mới vào bảng TAIKHOAN
        String sql = "INSERT INTO TAIKHOAN (MATK, MANV, TENDNHAP, MATKHAU) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setInt(1, taikhoan.getMATK());
        ps.setInt(2, taikhoan.getMANV());
        ps.setString(3, taikhoan.getTENDANGNHAP());
        ps.setInt(4, taikhoan.getMATKHAU());
        ps.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}




    
    public void UpdateTK(TaiKhoan taiKhoan) {
    try {
        String updateTaiKhoanSQL = "UPDATE TAIKHOAN SET MATK = ?, MANV = ?, TENDNHAP = ?, MATKHAU = ? WHERE MATK = ?";
        PreparedStatement updateTaiKhoanStmt = cons.prepareStatement(updateTaiKhoanSQL);
        updateTaiKhoanStmt.setInt(1, taiKhoan.getMATK());
        updateTaiKhoanStmt.setInt(2, taiKhoan.getMANV());
        updateTaiKhoanStmt.setString(3, taiKhoan.getTENDANGNHAP());
        updateTaiKhoanStmt.setInt(4, taiKhoan.getMATKHAU());
        updateTaiKhoanStmt.setInt(5, taiKhoan.getMATK()); // Giả sử đây là MATK bạn muốn sử dụng trong mệnh đề WHERE

        updateTaiKhoanStmt.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    
    public ArrayList<TaiKhoan> FindByMATK(int MATK) {
    ArrayList<TaiKhoan> list = new ArrayList<>();
    String sql = "SELECT * FROM TAIKHOAN WHERE MATK = ?";
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setInt(1, MATK);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            TaiKhoan taikhoan = new TaiKhoan();
            taikhoan.setMATK(rs.getInt("MATK"));
            taikhoan.setMANV(rs.getInt("MANV"));
            taikhoan.setTENDANGNHAP(rs.getString("TENDNHAP"));
            taikhoan.setMATKHAU(rs.getInt("MATKHAU"));
            list.add(taikhoan);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}


    
    public boolean isTenDangNhapExists(String tenDangNhap) {
    String sql = "SELECT * FROM TAIKHOAN WHERE TENDNHAP = ?";
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setString(1, tenDangNhap);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    public boolean isMaNVExists(int maNV) {
    String sql = "SELECT * FROM TAIKHOAN WHERE MANV = ?";
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setInt(1, maNV);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    public boolean isMaTKExists(int maTK) {
    String sql = "SELECT * FROM TAIKHOAN WHERE MATK = ?";
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setInt(1, maTK);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    
    public static void main (String[] args) {
        new TaiKhoanDAO();
    }
    
}
