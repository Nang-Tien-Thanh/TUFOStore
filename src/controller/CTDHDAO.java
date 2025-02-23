package controller;

/**
 *
 * @author Admin
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.CTDH;

public class CTDHDAO {
    private Connection cons = null;
    public CTDHDAO() {
        try {
            String url="jdbc:oracle:thin:@localhost:1521:orcl21";
            String user = "c##sinhvien01";
            String password = "094492";
            cons = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<CTDH> getChiTietDonHangByMaDH(int maDH) throws SQLException {
        List<CTDH> chiTietDonHangList = new ArrayList<>();
        String query = "SELECT * FROM CTDH WHERE MADH = ?";
        try (PreparedStatement ps = cons.prepareStatement(query)) {
            ps.setInt(1, maDH);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int maSP = rs.getInt("MASP");
                    int soLuong = rs.getInt("SOLUONG");
                    CTDH chiTietDonHang = new CTDH(maSP, maDH, soLuong);
                    chiTietDonHangList.add(chiTietDonHang);
                }
            }
        }
        return chiTietDonHangList;
    }
    
    public void addCTDH(CTDH ctdh) throws SQLException {
        String query = "INSERT INTO CTDH (MASP, MADH, SOLUONG) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = cons.prepareStatement(query)) {
            stmt.setInt(1, ctdh.getMASP());
            stmt.setInt(2, ctdh.getMADH());
            stmt.setInt(3, ctdh.getSOLUONG());
            stmt.executeUpdate();
        }
    }

    
    public static void main (String[] args) {
        new CTDHDAO();
    }
}
