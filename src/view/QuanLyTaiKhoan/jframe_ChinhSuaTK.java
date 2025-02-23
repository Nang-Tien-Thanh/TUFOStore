
package view.QuanLyTaiKhoan;
/**
 *
 * @author NANG TIEN HANH
 */

import Model.TaiKhoan;
import controller.TaiKhoanDAO;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class jframe_ChinhSuaTK extends javax.swing.JFrame {
private TaiKhoan taiKhoanToEdit;
    
    public jframe_ChinhSuaTK() {
        this.setLocationRelativeTo(null);
        initComponents();
    }
    
    public void setTaiKhoanToEdit(TaiKhoan tk) {
        this.taiKhoanToEdit = tk;
        jtxt_MaTK.setText(String.valueOf(tk.getMATK()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_ChinhSuaTK = new javax.swing.JPanel();
        jpanel_ThongTinChinhSua = new javax.swing.JPanel();
        jlabel_MaTK = new javax.swing.JLabel();
        jlabel_MatKhau = new javax.swing.JLabel();
        jlabel_TenDangNhap = new javax.swing.JLabel();
        jtxt_TenDangNhap = new javax.swing.JTextField();
        jtxt_MatKhau = new javax.swing.JTextField();
        jtxt_MaTK = new javax.swing.JTextField();
        jtxt_MaTK1 = new javax.swing.JTextField();
        jlabel_MaTK1 = new javax.swing.JLabel();
        jbtn_Huy = new javax.swing.JButton();
        jbtn_XacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpanel_ChinhSuaTK.setBackground(new java.awt.Color(255, 255, 255));

        jpanel_ThongTinChinhSua.setBackground(new java.awt.Color(255, 255, 255));

        jlabel_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MaTK.setText("Mã tài khoản");

        jlabel_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MatKhau.setText("Mật khẩu");

        jlabel_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_TenDangNhap.setText("Tên đăng nhập");

        jtxt_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MaTK1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlabel_MaTK1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MaTK1.setText("Mã nhân viên");

        javax.swing.GroupLayout jpanel_ThongTinChinhSuaLayout = new javax.swing.GroupLayout(jpanel_ThongTinChinhSua);
        jpanel_ThongTinChinhSua.setLayout(jpanel_ThongTinChinhSuaLayout);
        jpanel_ThongTinChinhSuaLayout.setHorizontalGroup(
            jpanel_ThongTinChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinChinhSuaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jpanel_ThongTinChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_MaTK1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MaTK1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpanel_ThongTinChinhSuaLayout.setVerticalGroup(
            jpanel_ThongTinChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinChinhSuaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlabel_MaTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel_MaTK1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_MaTK1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabel_TenDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_MatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

        javax.swing.GroupLayout jpanel_ChinhSuaTKLayout = new javax.swing.GroupLayout(jpanel_ChinhSuaTK);
        jpanel_ChinhSuaTK.setLayout(jpanel_ChinhSuaTKLayout);
        jpanel_ChinhSuaTKLayout.setHorizontalGroup(
            jpanel_ChinhSuaTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ChinhSuaTKLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jpanel_ThongTinChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addGroup(jpanel_ChinhSuaTKLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jbtn_Huy)
                .addGap(39, 39, 39)
                .addComponent(jbtn_XacNhan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_ChinhSuaTKLayout.setVerticalGroup(
            jpanel_ChinhSuaTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ChinhSuaTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_ThongTinChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_ChinhSuaTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Huy)
                    .addComponent(jbtn_XacNhan))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel_ChinhSuaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_ChinhSuaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_XacNhanActionPerformed
        // Lấy thông tin từ các trường nhập liệu
    String maNVStr = jtxt_MaTK1.getText();
    String tenDangNhap = jtxt_TenDangNhap.getText();
    String matKhauStr = jtxt_MatKhau.getText();
    
    TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
    TaiKhoan taiKhoanMoi = new TaiKhoan();
    
    int matk_luu = taiKhoanToEdit.getMATK();
    taiKhoanDAO.DeleteTK(taiKhoanToEdit.getMATK());

    // Kiểm tra trường rỗng
    if (maNVStr.equals("") || tenDangNhap.equals("") || matKhauStr.equals("")) {
        JOptionPane.showMessageDialog(jframe_ChinhSuaTK.this, "Bạn cần nhập đủ dữ liệu");
        return;
    }

    int maNV = 0;
    int matKhau = 0;
    boolean isValid = true;

    // Kiểm tra định dạng mã nhân viên mới nhập
    try {
        maNV = Integer.parseInt(maNVStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jframe_ChinhSuaTK.this, "Mã nhân viên không hợp lệ");
        isValid = false;
    }

    // Kiểm tra định dạng mật khẩu mới nhập
    try {
        matKhau = Integer.parseInt(matKhauStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jframe_ChinhSuaTK.this, "Mật khẩu không hợp lệ");
        isValid = false;
    } finally {
        if (!isValid) {
            return;
        }
    }

    taiKhoanMoi.setMATK(matk_luu);
    taiKhoanMoi.setMANV(maNV);
    taiKhoanMoi.setTENDANGNHAP(tenDangNhap);
    taiKhoanMoi.setMATKHAU(matKhau);
    
    // Kiểm tra mã nhân viên đã tồn tại hay chưa
    if (new TaiKhoanDAO().isMaNVExists(maNV)) {
        JOptionPane.showMessageDialog(jframe_ChinhSuaTK.this, "Mã nhân viên mà bạn cập nhật đã tồn tại");
        taiKhoanDAO.AddTK(taiKhoanToEdit);
    } else
    
    // Kiểm tra tên đăng nhập đã tồn tại hay chưa
    if (taiKhoanDAO.isTenDangNhapExists(tenDangNhap)) {
        JOptionPane.showMessageDialog(jframe_ChinhSuaTK.this, "Tên đăng nhập mà bạn cập nhật đã tồn tại");
        // Phục hồi tài khoản cũ nếu cập nhật thất bại
        taiKhoanDAO.AddTK(taiKhoanToEdit);
    } else {
        taiKhoanDAO.AddTK(taiKhoanMoi);
        JOptionPane.showMessageDialog(jframe_ChinhSuaTK.this, "Cập nhật thành công");
        dispose(); // Đóng cửa sổ sau khi cập nhật thành công
    }
    
    }//GEN-LAST:event_jbtn_XacNhanActionPerformed

    private void jbtn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_HuyActionPerformed
        // TODO add your handling code here:
        // Lấy cửa sổ cha của cửa sổ hiện tại và đóng nó
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
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jframe_ChinhSuaTK().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Huy;
    private javax.swing.JButton jbtn_XacNhan;
    private javax.swing.JLabel jlabel_MaTK;
    private javax.swing.JLabel jlabel_MaTK1;
    private javax.swing.JLabel jlabel_MatKhau;
    private javax.swing.JLabel jlabel_TenDangNhap;
    private javax.swing.JPanel jpanel_ChinhSuaTK;
    private javax.swing.JPanel jpanel_ThongTinChinhSua;
    private javax.swing.JTextField jtxt_MaTK;
    private javax.swing.JTextField jtxt_MaTK1;
    private javax.swing.JTextField jtxt_MatKhau;
    private javax.swing.JTextField jtxt_TenDangNhap;
    // End of variables declaration//GEN-END:variables
}
