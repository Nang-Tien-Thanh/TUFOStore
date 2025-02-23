package view.QuanLyDonHang;

import Model.SanPham;
import controller.SanPhamDAO;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author NANG TIEN HANH
 */
public class jframe_ThemSP extends javax.swing.JFrame {

    private jframe_ThemDonHang themDonHangFrame;
    
    public jframe_ThemSP(jframe_ThemDonHang parent) {
        this.themDonHangFrame = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        jtxt_MaSP.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jtxt_MaSPKeyPressed(evt);
        }
    });
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void jtxt_MaSPKeyPressed(java.awt.event.KeyEvent evt) {                                           
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Khi nhấn Enter
            String maSP = jtxt_MaSP.getText();
            if (!maSP.isEmpty()) {
                try {
                    int MaSP = Integer.parseInt(maSP);
                    // Gọi phương thức truy vấn thông tin sản phẩm từ cơ sở dữ liệu
                    SanPhamDAO sanPhamDAO = new SanPhamDAO();
                    SanPham sanPham = sanPhamDAO.layThongTinSanPhamTheoMa(MaSP);
                    if (sanPham != null) {
                        // Nếu sản phẩm tồn tại, hiển thị thông tin lên giao diện
                        jtxt_TenSP.setText(sanPham.getTENSP());
                        jtxt_Gia.setText(String.valueOf(sanPham.getGIABAN()));
                        jtxt_DVT.setText(sanPham.getDVT());
                    } else {
                        // Nếu không tìm thấy sản phẩm, thông báo lỗi
                        JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm có mã: " + maSP);
                    }
                } catch (NumberFormatException e) {
                    // Nếu nhập không phải số, thông báo lỗi
                    JOptionPane.showMessageDialog(null, "Mã sản phẩm phải là số nguyên.");
                }
            } else {
                // Nếu mã sản phẩm trống, xóa thông tin trên các trường
                jtxt_TenSP.setText("");
                jtxt_Gia.setText("");
                jtxt_DVT.setText("");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_ThemSP = new javax.swing.JPanel();
        jpanel_ThongTinThem = new javax.swing.JPanel();
        jlabel_MaSP = new javax.swing.JLabel();
        jlabel_TenSP = new javax.swing.JLabel();
        jlabel_DVT = new javax.swing.JLabel();
        jlabel_SL = new javax.swing.JLabel();
        jtxt_SL = new javax.swing.JTextField();
        jtxt_TenSP = new javax.swing.JTextField();
        jtxt_MaSP = new javax.swing.JTextField();
        jtxt_DVT = new javax.swing.JTextField();
        jlabel_Gia = new javax.swing.JLabel();
        jtxt_Gia = new javax.swing.JTextField();
        jbtn_Huy = new javax.swing.JButton();
        jbtn_XacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel_ThemSP.setBackground(new java.awt.Color(255, 255, 255));

        jpanel_ThongTinThem.setBackground(new java.awt.Color(255, 255, 255));

        jlabel_MaSP.setFont(new java.awt.Font("UTM Helve", 1, 12)); // NOI18N
        jlabel_MaSP.setText("Mã sản phẩm");

        jlabel_TenSP.setFont(new java.awt.Font("UTM Helve", 1, 12)); // NOI18N
        jlabel_TenSP.setText("Tên sản phẩm");

        jlabel_DVT.setFont(new java.awt.Font("UTM Helve", 1, 12)); // NOI18N
        jlabel_DVT.setText("Đơn vị tính");

        jlabel_SL.setFont(new java.awt.Font("UTM Helve", 1, 12)); // NOI18N
        jlabel_SL.setText("Số lượng");

        jtxt_SL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_TenSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_DVT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlabel_Gia.setFont(new java.awt.Font("UTM Helve", 1, 12)); // NOI18N
        jlabel_Gia.setText("Giá");

        jtxt_Gia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpanel_ThongTinThemLayout = new javax.swing.GroupLayout(jpanel_ThongTinThem);
        jpanel_ThongTinThem.setLayout(jpanel_ThongTinThemLayout);
        jpanel_ThongTinThemLayout.setHorizontalGroup(
            jpanel_ThongTinThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinThemLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jpanel_ThongTinThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_DVT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_DVT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpanel_ThongTinThemLayout.setVerticalGroup(
            jpanel_ThongTinThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinThemLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlabel_MaSP)
                .addGap(6, 6, 6)
                .addComponent(jtxt_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_SL)
                .addGap(6, 6, 6)
                .addComponent(jtxt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_TenSP)
                .addGap(6, 6, 6)
                .addComponent(jtxt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_DVT)
                .addGap(6, 6, 6)
                .addComponent(jtxt_DVT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_Gia)
                .addGap(6, 6, 6)
                .addComponent(jtxt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jbtn_Huy.setBackground(new java.awt.Color(236, 227, 214));
        jbtn_Huy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_Huy.setForeground(new java.awt.Color(94, 42, 14));
        jbtn_Huy.setText("Hủy");
        jbtn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_HuyActionPerformed(evt);
            }
        });

        jbtn_XacNhan.setBackground(new java.awt.Color(94, 42, 14));
        jbtn_XacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_XacNhan.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_XacNhan.setText("Xác nhận");
        jbtn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_XacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_ThemSPLayout = new javax.swing.GroupLayout(jpanel_ThemSP);
        jpanel_ThemSP.setLayout(jpanel_ThemSPLayout);
        jpanel_ThemSPLayout.setHorizontalGroup(
            jpanel_ThemSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThemSPLayout.createSequentialGroup()
                .addGroup(jpanel_ThemSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_ThemSPLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jpanel_ThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel_ThemSPLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jbtn_Huy)
                        .addGap(40, 40, 40)
                        .addComponent(jbtn_XacNhan)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpanel_ThemSPLayout.setVerticalGroup(
            jpanel_ThemSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ThemSPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpanel_ThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_ThemSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Huy)
                    .addComponent(jbtn_XacNhan))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_ThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jpanel_ThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_XacNhanActionPerformed
     
    // TODO add your handling code here:
    String maSPStr = jtxt_MaSP.getText().trim();
    String SLStr = jtxt_SL.getText().trim();
    String tenSanPham = jtxt_TenSP.getText().trim();
    String DVTStr = jtxt_DVT.getText().trim();
    String giaStr = jtxt_Gia.getText().trim();

    // Kiểm tra trường rỗng
    if (maSPStr.isEmpty() || SLStr.isEmpty() || tenSanPham.isEmpty() || DVTStr.isEmpty() || giaStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu mã sản phẩm, số lượng, tên sản phẩm, đơn vị tính và giá bán");
        return;
    }

    int maSP = 0, SL = 0;
    double gia = 0.0;
    boolean isValid = true;

    try {
        maSP = Integer.parseInt(maSPStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Mã sản phẩm không hợp lệ");
        isValid = false;
    }

    try {
        SL = Integer.parseInt(SLStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ");
        isValid = false;
    }

    try {
        gia = Double.parseDouble(giaStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Giá bán không hợp lệ");
        isValid = false;
    }

    if (!isValid) {
        return;
    }
    
    // Kiểm tra số lượng sản phẩm trong kho
    SanPhamDAO sanPhamDAO = new SanPhamDAO();
    int soLuongTrongKho = sanPhamDAO.laySoLuongSanPham(maSP);
    if (SL > soLuongTrongKho) {
        JOptionPane.showMessageDialog(this, "Bạn đã nhập quá số lượng trong kho sản phẩm, vui lòng nhập lại.");
        return;
    }

    SanPham sanPhamMoi = new SanPham();
    sanPhamMoi.setMASP(maSP);
    sanPhamMoi.setSOLUONG(SL);
    sanPhamMoi.setTENSP(tenSanPham);
    sanPhamMoi.setDVT(DVTStr);
    sanPhamMoi.setGIABAN(gia);

    // Kiểm tra mã sản phẩm đã tồn tại hay chưa
    if (themDonHangFrame.checkMaSP(maSP)) {
        JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại");
        return;
    }

    // Thêm sản phẩm mới
    themDonHangFrame.themSanPhamVaoDanhSach(sanPhamMoi);
    JOptionPane.showMessageDialog(this, "Thêm thành công");
    Window window = SwingUtilities.getWindowAncestor(jbtn_XacNhan);
    window.dispose();
    }//GEN-LAST:event_jbtn_XacNhanActionPerformed

    private void jbtn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_HuyActionPerformed
        // TODO add your handling code here:
            Window window = SwingUtilities.getWindowAncestor(jbtn_Huy);
        window.dispose();
    }//GEN-LAST:event_jbtn_HuyActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               new jframe_ThemSP().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Huy;
    private javax.swing.JButton jbtn_XacNhan;
    private javax.swing.JLabel jlabel_DVT;
    private javax.swing.JLabel jlabel_Gia;
    private javax.swing.JLabel jlabel_MaSP;
    private javax.swing.JLabel jlabel_SL;
    private javax.swing.JLabel jlabel_TenSP;
    private javax.swing.JPanel jpanel_ThemSP;
    private javax.swing.JPanel jpanel_ThongTinThem;
    private javax.swing.JTextField jtxt_DVT;
    private javax.swing.JTextField jtxt_Gia;
    private javax.swing.JTextField jtxt_MaSP;
    private javax.swing.JTextField jtxt_SL;
    private javax.swing.JTextField jtxt_TenSP;
    // End of variables declaration//GEN-END:variables
}
