package controller;

/**
 *
 * @author Admin
 */

import Model.SanPham;
import java.sql.*;
import java.util.ArrayList;

public class SanPhamDAO {
    
    private Connection cons = null;
    public SanPhamDAO() {
        try {
            String url="jdbc:oracle:thin:@localhost:1521:orcl21";
            String user = "c##sinhvien01";
            String password = "094492";
            cons = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<SanPham> getListSP() {
    ArrayList<SanPham> list = new ArrayList<>();
    String sql = "SELECT * FROM TAIKHOAN ORDER BY MASP ASC"; // Thay đổi cú pháp SQL phù hợp với Oracle SQL
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SanPham sp = new SanPham();
            // Sử dụng tên cột thay vì tên bảng để truy cập dữ liệu từ ResultSet
            sp.setMASP(rs.getInt("MASP"));
            sp.setMALOAI(rs.getInt("MALOAI"));
            sp.setTENSP(rs.getString("TENSP"));
            sp.setDVT(rs.getString("DVT"));
            sp.setGIANHAP(rs.getDouble("GIANHAP"));
            sp.setGIABAN(rs.getDouble("GIABAN"));
            sp.setSOLUONG(rs.getInt("SOLUONG"));
            sp.setMOTA(rs.getString("MOTA"));
            list.add(sp);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}
    //Phương thức layThongTinSanPhamTheoMa
    public SanPham layThongTinSanPhamTheoMa(int maSP) {
        SanPham sanPham = null;
        String sql = "SELECT * FROM SANPHAM WHERE MASP = ?"; // Sửa lại cú pháp SQL phù hợp với Oracle SQL
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, maSP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sanPham = new SanPham();
                sanPham.setMASP(rs.getInt("MASP"));
                sanPham.setMALOAI(rs.getInt("MALOAI"));
                sanPham.setTENSP(rs.getString("TENSP"));
                sanPham.setDVT(rs.getString("DVT"));
                sanPham.setGIANHAP(rs.getDouble("GIANHAP"));
                sanPham.setGIABAN(rs.getDouble("GIABAN"));
                sanPham.setSOLUONG(rs.getInt("SOLUONG"));
                sanPham.setMOTA(rs.getString("MOTA"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPham;
    }
    
    // Hàm lấy số lượng sản phẩm theo mã sản phẩm
public int laySoLuongSanPham(int maSP) {
    int soLuong = 0;
    String sql = "SELECT SOLUONG FROM SANPHAM WHERE MASP = ?";
    try {
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setInt(1, maSP);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            soLuong = rs.getInt("SOLUONG");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return soLuong;
}


    
    public void DeleteSP(int MASP) {
    try {
        // Xóa tài khoản từ bảng TAIKHOAN
        String deleteTaiKhoanSQL = "DELETE FROM TAIKHOAN WHERE MASP = ?";
        PreparedStatement deleteTaiKhoanStmt = cons.prepareStatement(deleteTaiKhoanSQL);
        deleteTaiKhoanStmt.setInt(1, MASP);
        deleteTaiKhoanStmt.executeUpdate();

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    public void AddSP(SanPham sanpham) {
    try {

        // Tiến hành thêm tài khoản mới vào bảng TAIKHOAN
        String sql = "INSERT INTO SANPHAM (MATK, MANV, TENDNHAP, MATKHAU) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = cons.prepareStatement(sql);
        ps.setInt(1, sanpham.getMASP());
        ps.setInt(2, sanpham.getMALOAI());
        ps.setString(3, sanpham.getTENSP());
        ps.setDouble(4, sanpham.getGIANHAP());
        ps.setDouble(4, sanpham.getGIABAN());
        ps.setInt(4, sanpham.getSOLUONG());
        ps.setString(4, sanpham.getMOTA());
        ps.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
}
