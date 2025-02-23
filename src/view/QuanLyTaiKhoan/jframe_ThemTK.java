
package view.QuanLyTaiKhoan;

import Model.TaiKhoan;
import controller.TaiKhoanDAO;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author NANG TIEN HANH
 */
public class jframe_ThemTK extends javax.swing.JFrame {
  
    public jframe_ThemTK() {
        this.setLocationRelativeTo(null);
        initComponents();
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_ThemTK = new javax.swing.JPanel();
        jpanel_ThongTinThem = new javax.swing.JPanel();
        jlabel_MaTK = new javax.swing.JLabel();
        jlabel_MatKhau = new javax.swing.JLabel();
        jlabel_XacNhanMK = new javax.swing.JLabel();
        jlabel_TenDangNhap = new javax.swing.JLabel();
        jtxt_TenDangNhap = new javax.swing.JTextField();
        jtxt_MatKhau = new javax.swing.JTextField();
        jtxt_MaTK = new javax.swing.JTextField();
        jtxt_XacNhanMK = new javax.swing.JTextField();
        jtxt_MaNV = new javax.swing.JTextField();
        jlabel_MaNV = new javax.swing.JLabel();
        jbtn_Huy = new javax.swing.JButton();
        jbtn_XacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel_ThemTK.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_ThemTK.setPreferredSize(new java.awt.Dimension(0, 0));

        jpanel_ThongTinThem.setBackground(new java.awt.Color(255, 255, 255));

        jlabel_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MaTK.setText("Mã tài khoản");

        jlabel_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MatKhau.setText("Mật khẩu");

        jlabel_XacNhanMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_XacNhanMK.setText("Xác nhận mật khẩu");

        jlabel_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_TenDangNhap.setText("Tên đăng nhập");

        jtxt_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_XacNhanMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxt_MaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_MaNVActionPerformed(evt);
            }
        });

        jlabel_MaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MaNV.setText("Mã nhân viên");

        javax.swing.GroupLayout jpanel_ThongTinThemLayout = new javax.swing.GroupLayout(jpanel_ThongTinThem);
        jpanel_ThongTinThem.setLayout(jpanel_ThongTinThemLayout);
        jpanel_ThongTinThemLayout.setHorizontalGroup(
            jpanel_ThongTinThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinThemLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jpanel_ThongTinThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpanel_ThongTinThemLayout.setVerticalGroup(
            jpanel_ThongTinThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinThemLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlabel_MaTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabel_MaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jlabel_TenDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabel_MatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel_XacNhanMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jpanel_ThemTKLayout = new javax.swing.GroupLayout(jpanel_ThemTK);
        jpanel_ThemTK.setLayout(jpanel_ThemTKLayout);
        jpanel_ThemTKLayout.setHorizontalGroup(
            jpanel_ThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ThemTKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanel_ThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jpanel_ThemTKLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jbtn_Huy)
                .addGap(36, 36, 36)
                .addComponent(jbtn_XacNhan)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jpanel_ThemTKLayout.setVerticalGroup(
            jpanel_ThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ThemTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_ThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jpanel_ThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Huy)
                    .addComponent(jbtn_XacNhan))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel_ThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_ThemTK, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_MaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_MaNVActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtxt_MaNVActionPerformed

    private void jbtn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_XacNhanActionPerformed
    // TODO add your handling code here:
    TaiKhoan tk = new TaiKhoan();

    String maTKStr = jtxt_MaTK.getText();
    String maNVStr = jtxt_MaNV.getText();
    String tenDangNhap = jtxt_TenDangNhap.getText();
    String matKhauStr = jtxt_MatKhau.getText();
    String xacNhanMKStr = jtxt_XacNhanMK.getText();

    // Kiểm tra trường rỗng
    if (maTKStr.equals("") || maNVStr.equals("") || tenDangNhap.equals("") || matKhauStr.equals("") || xacNhanMKStr.equals("")) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Bạn cần nhập đủ dữ liệu");
        return;
    }

    int maTK = 0, maNV = 0, matKhau = 0, xacNhanMK = 0;
    boolean isValid = true;

    try {
        maTK = Integer.parseInt(maTKStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Mã tài khoản không hợp lệ");
        isValid = false;
    }

    try {
        maNV = Integer.parseInt(maNVStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Mã nhân viên không hợp lệ");
        isValid = false;
    }

    try {
        matKhau = Integer.parseInt(matKhauStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Mật khẩu không hợp lệ");
        isValid = false;
    }

    try {
        xacNhanMK = Integer.parseInt(xacNhanMKStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Xác nhận mật khẩu không hợp lệ");
        isValid = false;
    } finally {
        if (!isValid) {
            return;
        }
    }

    tk.setMATK(maTK);
    tk.setMANV(maNV);
    tk.setTENDANGNHAP(tenDangNhap);
    tk.setMATKHAU(matKhau);

    // Kiểm tra xác nhận mật khẩu
    if (!matKhauStr.equals(xacNhanMKStr)) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Xác nhận mật khẩu không khớp");
        return;
    }

    TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
    // Kiểm tra mã tài khoản đã tồn tại hay chưa
    if (taiKhoanDAO.isMaTKExists(maTK)) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Mã tài khoản đã tồn tại");
        return;
    }
    
    // Kiểm tra mã nhân viên đã tồn tại hay chưa
    if (taiKhoanDAO.isMaNVExists(maNV)) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Mã nhân viên đã tồn tại");
        return;
    }

    // Kiểm tra tên đăng nhập đã tồn tại hay chưa
    if (taiKhoanDAO.isTenDangNhapExists(tenDangNhap)) {
        JOptionPane.showMessageDialog(jframe_ThemTK.this, "Tên đăng nhập đã tồn tại");
        return;
    }

    // Thêm tài khoản mới
    taiKhoanDAO.AddTK(tk);
    JOptionPane.showMessageDialog(jframe_ThemTK.this, "Thêm thành công");
    Window window = SwingUtilities.getWindowAncestor(jbtn_XacNhan);
        window.dispose();
    }//GEN-LAST:event_jbtn_XacNhanActionPerformed

    private void jbtn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_HuyActionPerformed
        // TODO add your handling code here:
            // Đóng cửa sổ hiện tại
            Window window = SwingUtilities.getWindowAncestor(jbtn_Huy);
            window.dispose();
    }//GEN-LAST:event_jbtn_HuyActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
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
//            java.util.logging.Logger.getLogger(jframe_ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jframe_ThemTK().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Huy;
    private javax.swing.JButton jbtn_XacNhan;
    private javax.swing.JLabel jlabel_MaNV;
    private javax.swing.JLabel jlabel_MaTK;
    private javax.swing.JLabel jlabel_MatKhau;
    private javax.swing.JLabel jlabel_TenDangNhap;
    private javax.swing.JLabel jlabel_XacNhanMK;
    private javax.swing.JPanel jpanel_ThemTK;
    private javax.swing.JPanel jpanel_ThongTinThem;
    private javax.swing.JTextField jtxt_MaNV;
    private javax.swing.JTextField jtxt_MaTK;
    private javax.swing.JTextField jtxt_MatKhau;
    private javax.swing.JTextField jtxt_TenDangNhap;
    private javax.swing.JTextField jtxt_XacNhanMK;
    // End of variables declaration//GEN-END:variables
}
