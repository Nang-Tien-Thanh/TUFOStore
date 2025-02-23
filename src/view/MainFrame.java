package view;
import controller.ChuyenManHinhController;
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setTitle("TUFO STORE");
        
        ChuyenManHinhController controller = new ChuyenManHinhController(jpanel_View);
        //controller.setView(jpanel_TaiKhoan,jlabel_TaiKhoan);
         //controller.setView(jpanel_DonHang,jlable_DonHang);
         
        controller.setView(jpanel_DonHang,jlable_DonHang);
         //controller.setView(jpanel_DonHang,jlable_DonHang);
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_Root = new view.panelBackgpround();
        jpanel_Menu = new javax.swing.JPanel();
        jpanel_TaiKhoan = new javax.swing.JPanel();
        jlabel_TaiKhoan = new javax.swing.JLabel();
        jpanel_NhanVien = new javax.swing.JPanel();
        jlable_NhanVien = new javax.swing.JLabel();
        jpanel_SanPham = new javax.swing.JPanel();
        jlable_SanPham = new javax.swing.JLabel();
        jpanel_DonHang = new javax.swing.JPanel();
        jlable_DonHang = new javax.swing.JLabel();
        jpanel_KhachHang = new javax.swing.JPanel();
        jlable_KhachHang = new javax.swing.JLabel();
        jpanel_ThongKe = new javax.swing.JPanel();
        jlable_ThongKe = new javax.swing.JLabel();
        jpanel_Logout = new javax.swing.JPanel();
        jlable_Logout = new javax.swing.JLabel();
        jpanel_View = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpanel_Menu.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_Menu.setPreferredSize(new java.awt.Dimension(120, 600));

        jpanel_TaiKhoan.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_TaiKhoan.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_TaiKhoan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_TaiKhoan.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_TaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_TaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/account.png"))); // NOI18N
        jlabel_TaiKhoan.setText("TÀI KHOẢN");
        jlabel_TaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_TaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_TaiKhoan.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_TaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_TaiKhoanLayout = new javax.swing.GroupLayout(jpanel_TaiKhoan);
        jpanel_TaiKhoan.setLayout(jpanel_TaiKhoanLayout);
        jpanel_TaiKhoanLayout.setHorizontalGroup(
            jpanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jpanel_TaiKhoanLayout.setVerticalGroup(
            jpanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_TaiKhoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabel_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jpanel_NhanVien.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_NhanVien.setPreferredSize(new java.awt.Dimension(120, 100));

        jlable_NhanVien.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlable_NhanVien.setForeground(new java.awt.Color(126, 80, 32));
        jlable_NhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        jlable_NhanVien.setText("NHÂN VIÊN");
        jlable_NhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlable_NhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_NhanVien.setPreferredSize(new java.awt.Dimension(90, 90));
        jlable_NhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_NhanVienLayout = new javax.swing.GroupLayout(jpanel_NhanVien);
        jpanel_NhanVien.setLayout(jpanel_NhanVienLayout);
        jpanel_NhanVienLayout.setHorizontalGroup(
            jpanel_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_NhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlable_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_NhanVienLayout.setVerticalGroup(
            jpanel_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlable_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_SanPham.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_SanPham.setPreferredSize(new java.awt.Dimension(120, 100));

        jlable_SanPham.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlable_SanPham.setForeground(new java.awt.Color(126, 80, 32));
        jlable_SanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_SanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/item.png"))); // NOI18N
        jlable_SanPham.setText("SẢN PHẨM");
        jlable_SanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_SanPham.setPreferredSize(new java.awt.Dimension(90, 90));
        jlable_SanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_SanPhamLayout = new javax.swing.GroupLayout(jpanel_SanPham);
        jpanel_SanPham.setLayout(jpanel_SanPhamLayout);
        jpanel_SanPhamLayout.setHorizontalGroup(
            jpanel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlable_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_SanPhamLayout.setVerticalGroup(
            jpanel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_SanPhamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlable_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jpanel_DonHang.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_DonHang.setPreferredSize(new java.awt.Dimension(120, 100));

        jlable_DonHang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlable_DonHang.setForeground(new java.awt.Color(126, 80, 32));
        jlable_DonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_DonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/don-hang.png"))); // NOI18N
        jlable_DonHang.setText("ĐƠN HÀNG");
        jlable_DonHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_DonHang.setPreferredSize(new java.awt.Dimension(90, 90));
        jlable_DonHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_DonHangLayout = new javax.swing.GroupLayout(jpanel_DonHang);
        jpanel_DonHang.setLayout(jpanel_DonHangLayout);
        jpanel_DonHangLayout.setHorizontalGroup(
            jpanel_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlable_DonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_DonHangLayout.setVerticalGroup(
            jpanel_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlable_DonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_KhachHang.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_KhachHang.setPreferredSize(new java.awt.Dimension(120, 100));

        jlable_KhachHang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlable_KhachHang.setForeground(new java.awt.Color(126, 80, 32));
        jlable_KhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/customer.png"))); // NOI18N
        jlable_KhachHang.setText("KHÁCH HÀNG");
        jlable_KhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_KhachHang.setPreferredSize(new java.awt.Dimension(90, 90));
        jlable_KhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_KhachHangLayout = new javax.swing.GroupLayout(jpanel_KhachHang);
        jpanel_KhachHang.setLayout(jpanel_KhachHangLayout);
        jpanel_KhachHangLayout.setHorizontalGroup(
            jpanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlable_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_KhachHangLayout.setVerticalGroup(
            jpanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlable_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_ThongKe.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_ThongKe.setPreferredSize(new java.awt.Dimension(120, 100));

        jlable_ThongKe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlable_ThongKe.setForeground(new java.awt.Color(126, 80, 32));
        jlable_ThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_ThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thong-ke.png"))); // NOI18N
        jlable_ThongKe.setText("THỐNG KÊ");
        jlable_ThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_ThongKe.setPreferredSize(new java.awt.Dimension(90, 90));
        jlable_ThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_ThongKeLayout = new javax.swing.GroupLayout(jpanel_ThongKe);
        jpanel_ThongKe.setLayout(jpanel_ThongKeLayout);
        jpanel_ThongKeLayout.setHorizontalGroup(
            jpanel_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlable_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_ThongKeLayout.setVerticalGroup(
            jpanel_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlable_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_Logout.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_Logout.setPreferredSize(new java.awt.Dimension(120, 100));

        jlable_Logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlable_Logout.setForeground(new java.awt.Color(126, 80, 32));
        jlable_Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jlable_Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_Logout.setPreferredSize(new java.awt.Dimension(90, 90));
        jlable_Logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_LogoutLayout = new javax.swing.GroupLayout(jpanel_Logout);
        jpanel_Logout.setLayout(jpanel_LogoutLayout);
        jpanel_LogoutLayout.setHorizontalGroup(
            jpanel_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_LogoutLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jlable_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanel_LogoutLayout.setVerticalGroup(
            jpanel_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlable_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanel_MenuLayout = new javax.swing.GroupLayout(jpanel_Menu);
        jpanel_Menu.setLayout(jpanel_MenuLayout);
        jpanel_MenuLayout.setHorizontalGroup(
            jpanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_MenuLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jpanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jpanel_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jpanel_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jpanel_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jpanel_DonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jpanel_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jpanel_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jpanel_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jpanel_MenuLayout.setVerticalGroup(
            jpanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_MenuLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jpanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_DonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpanel_View.setFocusable(false);
        jpanel_View.setOpaque(false);
        jpanel_View.setPreferredSize(new java.awt.Dimension(765, 600));

        javax.swing.GroupLayout jpanel_ViewLayout = new javax.swing.GroupLayout(jpanel_View);
        jpanel_View.setLayout(jpanel_ViewLayout);
        jpanel_ViewLayout.setHorizontalGroup(
            jpanel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        jpanel_ViewLayout.setVerticalGroup(
            jpanel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanel_RootLayout = new javax.swing.GroupLayout(jpanel_Root);
        jpanel_Root.setLayout(jpanel_RootLayout);
        jpanel_RootLayout.setHorizontalGroup(
            jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_RootLayout.createSequentialGroup()
                .addComponent(jpanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpanel_View, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
        );
        jpanel_RootLayout.setVerticalGroup(
            jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addComponent(jpanel_View, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        jpanel_View.getAccessibleContext().setAccessibleName("770");
        jpanel_View.getAccessibleContext().setAccessibleDescription("600");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabel_TaiKhoan;
    private javax.swing.JLabel jlable_DonHang;
    private javax.swing.JLabel jlable_KhachHang;
    private javax.swing.JLabel jlable_Logout;
    private javax.swing.JLabel jlable_NhanVien;
    private javax.swing.JLabel jlable_SanPham;
    private javax.swing.JLabel jlable_ThongKe;
    private javax.swing.JPanel jpanel_DonHang;
    private javax.swing.JPanel jpanel_KhachHang;
    private javax.swing.JPanel jpanel_Logout;
    private javax.swing.JPanel jpanel_Menu;
    private javax.swing.JPanel jpanel_NhanVien;
    private view.panelBackgpround jpanel_Root;
    private javax.swing.JPanel jpanel_SanPham;
    private javax.swing.JPanel jpanel_TaiKhoan;
    private javax.swing.JPanel jpanel_ThongKe;
    private javax.swing.JPanel jpanel_View;
    // End of variables declaration//GEN-END:variables
//=======
//import javax.swing.*;
//import view.DangNhap;
//import view.QLKH;
///**
// *
// * @author NANG TIEN HANH
// */
//public class MainFrame extends JFrame {
//    private ThanhBen thanhben;
//    
//   public static void main(String[] agr){
//       
////        DangNhap dn = new DangNhap();
////        dn.setTitle("Đăng nhập");
////        dn.setResizable(false);
////        dn.setLocationRelativeTo(null);
////        dn.setVisible(true);
//    
//    }
//>>>>>>> d804112b12df4c2a0ea3aa0d606b47c53533cbc5
}
