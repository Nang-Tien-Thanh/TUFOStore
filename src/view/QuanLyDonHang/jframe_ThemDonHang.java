
package view.QuanLyDonHang;


/**
 *
 * @author NANG TIEN HANH
 */
import Model.CTDH;
import Model.DonHang;
import java.util.ArrayList;
import java.util.List;
import Model.SanPham;
import controller.CTDHDAO;
import controller.DonHangDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class jframe_ThemDonHang extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    List<SanPham> sanpham;
    
    public jframe_ThemDonHang() {
        initComponents();
        
        // Khởi tạo danh sách sản phẩm
        sanpham = new ArrayList<>();
        
        // Khởi tạo mô hình dữ liệu cho bảng với các cột tương ứng
        tableModel = new DefaultTableModel();
        tableModel.addColumn("MÃ SẢN PHẨM");
        tableModel.addColumn("TÊN SẢN PHẨM");
        tableModel.addColumn("ĐƠN VỊ TÍNH");
        tableModel.addColumn("SỐ LƯỢNG");
        tableModel.addColumn("ĐƠN GIÁ");
        
        // Gán mô hình dữ liệu cho bảng
        jtable_BangSP.setModel(tableModel);
    }
    
    // Hàm thêm sản phẩm vào danh sách sản phẩm
    public void themSanPhamVaoDanhSach(SanPham sp) {
        sanpham.add(sp);
    }
    
    // Hàm xoá sản phẩm khỏi danh sách sản phẩm
    public void xoaSanPhamKhoiDanhSach(int maSP) {
    // Tạo một biến để lưu vị trí của sản phẩm trong danh sách
    int index = -1;
    // Duyệt qua danh sách sản phẩm để tìm vị trí của sản phẩm có mã sản phẩm tương ứng
    for (int i = 0; i < sanpham.size(); i++) {
        if (sanpham.get(i).getMASP() == maSP) {
            index = i;
            break;
        }
    }
    // Nếu tìm thấy sản phẩm, tiến hành xoá
    if (index != -1) {
        sanpham.remove(index);
    } else {
        // Nếu không tìm thấy sản phẩm, có thể thông báo lỗi hoặc làm gì đó phù hợp với ứng dụng của bạn
        System.out.println("Khong the xoa san pham co ma " + maSP + " do khong ton tai.");
    }
}
    
    private void searchProductByID(int productID) {
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
    jtable_BangSP.setRowSorter(sorter);

    RowFilter<DefaultTableModel, Integer> filter = RowFilter.regexFilter(String.valueOf(productID), 0);
    sorter.setRowFilter(filter);
}

    
    // Phương thức để hiển thị bảng
    private void showTable() {
        tableModel.setRowCount(0); // Xóa toàn bộ dữ liệu trong bảng trước khi hiển thị lại
        
        for (SanPham sp : sanpham) {
            Object[] rowData = {sp.getMASP(), sp.getTENSP(), sp.getDVT(), sp.getSOLUONG(), sp.getGIABAN()};
            tableModel.addRow(rowData);
        }
    }
    
    public boolean checkMaSP(int MaSP) {
    for (SanPham sp : sanpham) {
        if (sp.getMASP() == MaSP) {
            return true; // Mã sản phẩm đã tồn tại trong danh sách
        }
    }
    return false; // Mã sản phẩm chưa tồn tại trong danh sách
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_Root = new view.panelBackgpround();
        jpanel_ThanhToan = new javax.swing.JPanel();
        jradiobutton_TienMat = new javax.swing.JRadioButton();
        jradiobutton_ChuyenKhoan = new javax.swing.JRadioButton();
        jbutton_ThanhToan = new javax.swing.JButton();
        jlable_HinhThucTT = new javax.swing.JLabel();
        jpanel_BangSP = new javax.swing.JPanel();
        jscrollpane_BangSP = new javax.swing.JScrollPane();
        jtable_BangSP = new javax.swing.JTable();
        jbutton_XoaSP = new javax.swing.JButton();
        jbutton_ChinhSuaSP = new javax.swing.JButton();
        jlable_MaDH = new javax.swing.JLabel();
        jbutton_ThemSP = new javax.swing.JButton();
        jlable_MaNV = new javax.swing.JLabel();
        jlable_MaKH = new javax.swing.JLabel();
        jtxt_MaDH = new javax.swing.JTextField();
        jlable_TenNV = new javax.swing.JLabel();
        jlable_TenKH = new javax.swing.JLabel();
        jtxt_TimKiem = new javax.swing.JTextField();
        jtxt_MaNV = new javax.swing.JTextField();
        jtxt_MaKH = new javax.swing.JTextField();
        jtxt_NgDH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel_ThanhToan.setBackground(new java.awt.Color(255, 255, 255));

        jradiobutton_TienMat.setFont(new java.awt.Font("UTM Helve", 1, 13)); // NOI18N
        jradiobutton_TienMat.setText("Tiền mặt");
        jradiobutton_TienMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradiobutton_TienMatActionPerformed(evt);
            }
        });

        jradiobutton_ChuyenKhoan.setFont(new java.awt.Font("UTM Helve", 1, 13)); // NOI18N
        jradiobutton_ChuyenKhoan.setText("Chuyển khoản");
        jradiobutton_ChuyenKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradiobutton_ChuyenKhoanActionPerformed(evt);
            }
        });

        jbutton_ThanhToan.setBackground(new java.awt.Color(94, 42, 14));
        jbutton_ThanhToan.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_ThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_ThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thanh-toan.png"))); // NOI18N
        jbutton_ThanhToan.setText("Thanh toán");
        jbutton_ThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ThanhToanActionPerformed(evt);
            }
        });

        jlable_HinhThucTT.setBackground(new java.awt.Color(255, 204, 204));
        jlable_HinhThucTT.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jlable_HinhThucTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_HinhThucTT.setText("Hình thức thanh toán");
        jlable_HinhThucTT.setAlignmentX(0.5F);
        jlable_HinhThucTT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_HinhThucTT.setOpaque(true);

        javax.swing.GroupLayout jpanel_ThanhToanLayout = new javax.swing.GroupLayout(jpanel_ThanhToan);
        jpanel_ThanhToan.setLayout(jpanel_ThanhToanLayout);
        jpanel_ThanhToanLayout.setHorizontalGroup(
            jpanel_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThanhToanLayout.createSequentialGroup()
                .addGroup(jpanel_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_ThanhToanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlable_HinhThucTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanel_ThanhToanLayout.createSequentialGroup()
                        .addGroup(jpanel_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel_ThanhToanLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jpanel_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jradiobutton_TienMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jradiobutton_ChuyenKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addGroup(jpanel_ThanhToanLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbutton_ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanel_ThanhToanLayout.setVerticalGroup(
            jpanel_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThanhToanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlable_HinhThucTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jradiobutton_TienMat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jradiobutton_ChuyenKhoan)
                .addGap(18, 18, 18)
                .addComponent(jbutton_ThanhToan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel_BangSP.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_BangSP.setPreferredSize(new java.awt.Dimension(765, 300));

        jscrollpane_BangSP.setBackground(new java.awt.Color(255, 204, 204));
        jscrollpane_BangSP.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N

        jtable_BangSP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jtable_BangSP.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jtable_BangSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null, null},
                {"", "", "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ SẢN PHẨM", "TÊN SẢN PHẨM", "ĐƠN VỊ TÍNH", "SỐ LƯỢNG", "ĐƠN GIÁ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtable_BangSP.getTableHeader().setResizingAllowed(false);
        jtable_BangSP.getTableHeader().setReorderingAllowed(false);
        jscrollpane_BangSP.setViewportView(jtable_BangSP);

        jbutton_XoaSP.setBackground(new java.awt.Color(147, 94, 64));
        jbutton_XoaSP.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_XoaSP.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_XoaSP.setText("Xóa sản phẩm");
        jbutton_XoaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_XoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_XoaSPActionPerformed(evt);
            }
        });

        jbutton_ChinhSuaSP.setBackground(new java.awt.Color(177, 137, 101));
        jbutton_ChinhSuaSP.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_ChinhSuaSP.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_ChinhSuaSP.setText("Chỉnh sửa");
        jbutton_ChinhSuaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_ChinhSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ChinhSuaSPActionPerformed(evt);
            }
        });

        jlable_MaDH.setBackground(new java.awt.Color(255, 204, 204));
        jlable_MaDH.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jlable_MaDH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_MaDH.setText("Mã đơn hàng");
        jlable_MaDH.setAlignmentX(0.5F);
        jlable_MaDH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_MaDH.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jbutton_ThemSP.setBackground(new java.awt.Color(94, 42, 14));
        jbutton_ThemSP.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_ThemSP.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_ThemSP.setText("Thêm sản phẩm");
        jbutton_ThemSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_ThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ThemSPActionPerformed(evt);
            }
        });

        jlable_MaNV.setBackground(new java.awt.Color(255, 204, 204));
        jlable_MaNV.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jlable_MaNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_MaNV.setText("Tìm kiếm");
        jlable_MaNV.setAlignmentX(0.5F);
        jlable_MaNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlable_MaKH.setBackground(new java.awt.Color(255, 204, 204));
        jlable_MaKH.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jlable_MaKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_MaKH.setText("Mã khách hàng");
        jlable_MaKH.setAlignmentX(0.5F);
        jlable_MaKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtxt_MaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_MaDHActionPerformed(evt);
            }
        });

        jlable_TenNV.setBackground(new java.awt.Color(255, 204, 204));
        jlable_TenNV.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jlable_TenNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_TenNV.setText("Mã nhân viên");
        jlable_TenNV.setAlignmentX(0.5F);
        jlable_TenNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlable_TenKH.setBackground(new java.awt.Color(255, 204, 204));
        jlable_TenKH.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jlable_TenKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlable_TenKH.setText("Ngày đơn hàng");
        jlable_TenKH.setAlignmentX(0.5F);
        jlable_TenKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtxt_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_BangSPLayout = new javax.swing.GroupLayout(jpanel_BangSP);
        jpanel_BangSP.setLayout(jpanel_BangSPLayout);
        jpanel_BangSPLayout.setHorizontalGroup(
            jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_BangSPLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanel_BangSPLayout.createSequentialGroup()
                        .addComponent(jlable_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbutton_XoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbutton_ChinhSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbutton_ThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jscrollpane_BangSP, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanel_BangSPLayout.createSequentialGroup()
                        .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlable_MaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlable_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlable_TenKH))
                        .addGap(26, 26, 26)
                        .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_NgDH)
                            .addComponent(jtxt_MaDH, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jtxt_MaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jtxt_MaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlable_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        jpanel_BangSPLayout.setVerticalGroup(
            jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_BangSPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlable_MaDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbutton_ThemSP)
                        .addComponent(jtxt_MaDH)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_XoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MaNV)
                    .addComponent(jlable_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_ChinhSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MaKH)
                    .addComponent(jlable_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel_BangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_NgDH)
                    .addComponent(jlable_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_TimKiem)
                    .addComponent(jlable_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jscrollpane_BangSP, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout jpanel_RootLayout = new javax.swing.GroupLayout(jpanel_Root);
        jpanel_Root.setLayout(jpanel_RootLayout);
        jpanel_RootLayout.setHorizontalGroup(
            jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_RootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_BangSP, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanel_ThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel_RootLayout.setVerticalGroup(
            jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_RootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel_ThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_BangSP, javax.swing.GroupLayout.PREFERRED_SIZE, 606, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_Root, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanel_Root, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_ThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ThemSPActionPerformed
        // TODO add your handling code here:
        jframe_ThemSP themSPFrame = new jframe_ThemSP(this);
        themSPFrame.setVisible(true);
        themSPFrame.setAlwaysOnTop(true);
        
        themSPFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Sau khi frame xác nhận xoá đóng, gọi phương thức showTable() để cập nhật lại bảng
                showTable();
            }
        });
    }//GEN-LAST:event_jbutton_ThemSPActionPerformed

    private void jbutton_XoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_XoaSPActionPerformed
        // TODO add your handling code here:
        // Kiểm tra xem đã chọn hàng trong bảng chưa
        if (jtable_BangSP.getSelectedRow() != -1) {
        // Lấy chỉ mục hàng được chọn
        int selectedIndex = jtable_BangSP.getSelectedRow();
        // Lấy thông tin tài khoản từ danh sách taikhoan
        SanPham sp = sanpham.get(selectedIndex);
        
        // Tạo một instance của frame Xác nhận Xóa
        // Tạo một frame xác nhận xoá và truyền dữ liệu tài khoản vào
        
        jframe_XacNhanXoaSP xacNhanXoaFrame = new jframe_XacNhanXoaSP(this);
        xacNhanXoaFrame.setSanPhamToDelete(sp);
    
        // Hiển thị frame xác nhận xoá như một popup
        xacNhanXoaFrame.setAlwaysOnTop(true);
        xacNhanXoaFrame.setVisible(true);
        
        xacNhanXoaFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Sau khi frame xác nhận xoá đóng, gọi phương thức showTable() để cập nhật lại bảng
                showTable();
            }
        });
        
        }
        else
        {
            JOptionPane.showMessageDialog(jframe_ThemDonHang.this, "Hãy chọn một sản phẩm trong bảng");
        }
    }//GEN-LAST:event_jbutton_XoaSPActionPerformed

    private void jbutton_ChinhSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ChinhSuaSPActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtable_BangSP.getSelectedRow();
        if (selectedRow >= 0) {
            jframe_ChinhSuaSP chinhSuaSPFrame = new jframe_ChinhSuaSP(this);
            chinhSuaSPFrame.setVisible(true);
            chinhSuaSPFrame.setAlwaysOnTop(true);
            SanPham sp = sanpham.get(selectedRow);
            
            chinhSuaSPFrame.setSanPhamToEdit(sp);
            
            chinhSuaSPFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Sau khi frame xác nhận xoá đóng, gọi phương thức showTable() để cập nhật lại bảng
                showTable();
            }
        });
        
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbutton_ChinhSuaSPActionPerformed

    private void jbutton_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ThanhToanActionPerformed
        // Check if either radio button is selected
    if (!jradiobutton_ChuyenKhoan.isSelected() && !jradiobutton_TienMat.isSelected()) {
        // Display a warning message if no radio button is selected
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phương thức thanh toán", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method without proceeding further
    }
    
    String maDHStr = jtxt_MaDH.getText().trim();
    String maNVStr = jtxt_MaNV.getText().trim();
    String maKHStr = jtxt_MaKH.getText().trim();

    // Kiểm tra trường rỗng
    if (maDHStr.isEmpty() || maNVStr.isEmpty() || maKHStr.isEmpty()){
        JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu.");
        return;
    }

    int maDH = 0, maNV = 0, maKH = 0;
    boolean isValid = true;

    try {
        maDH = Integer.parseInt(maDHStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Mã đơn hàng không hợp lệ");
        isValid = false;
    }
    
    try {
        maNV = Integer.parseInt(maNVStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Mã nhân viên không hợp lệ");
        isValid = false;
    }
    
    try {
        maKH = Integer.parseInt(maKHStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Mã khách hàng không hợp lệ");
        isValid = false;
    }
    
    // Parse date from text field or any other source
    Date ngayDH = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        ngayDH = new Date(dateFormat.parse(jtxt_NgDH.getText()).getTime());
    } catch (ParseException e) {
        isValid = false;
        JOptionPane.showMessageDialog(this, "Ngày đặt hàng không hợp lệ. Vui lòng kiểm tra lại định dạng (YYYY/MM/DD)", "Lỗi", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Handle parsing exception
    }
    
    // Kiểm tra xem mã đơn hàng đã tồn tại hay chưa
    DonHangDAO donHangDAO = new DonHangDAO();
    if (donHangDAO.isMaDHExists(maDH)) {
        JOptionPane.showMessageDialog(this, "Mã đơn hàng đã tồn tại. Vui lòng chọn mã đơn hàng khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        isValid = false;
        return; // Exit the method without proceeding further
    }
    
    if (isValid) {
    // Create a new order object
    DonHang donHang = new DonHang(maDH, maNV, maKH, ngayDH);
    
    // Add the order to the database
    try {
        donHangDAO.addDonHang(donHang); // Gọi phương thức từ đối tượng DonHangDAO
    } catch (SQLException ex) {
        ex.printStackTrace(); // Xử lý ngoại lệ
        JOptionPane.showMessageDialog(this, "Lỗi khi thêm đơn hàng vào cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return; // Thoát phương thức nếu có lỗi
    }
    }
    
    // Add order details to the database
    if (isValid) {
    DefaultTableModel model = (DefaultTableModel) jtable_BangSP.getModel();
    int rowCount = model.getRowCount();
    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "Đơn hàng phải có ít nhất một sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
    for (int i = 0; i < rowCount; i++) {
        int maSP = (int) model.getValueAt(i, 0); // Get product ID from table
        int soLuong = (int) model.getValueAt(i, 3); // Get quantity from table
        
        CTDH cthd = new CTDH(maSP, maDH, soLuong); // Create new order detail object
        
        CTDHDAO ctdhDAO = new CTDHDAO(); // Tạo một đối tượng CTDHDAO
        try {
            ctdhDAO.addCTDH(cthd); // Gọi phương thức từ đối tượng CTDHDAO
        } catch (SQLException ex) {
            ex.printStackTrace(); // Xử lý ngoại lệ
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm chi tiết đơn hàng vào cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Thoát phương thức nếu có lỗi
        }
    }
        JOptionPane.showMessageDialog(this, "Thêm đơn hàng thành công");
        dispose(); // Đóng cửa sổ sau khi thêm đơn hàng thành công
    }

    }//GEN-LAST:event_jbutton_ThanhToanActionPerformed

    private void jradiobutton_TienMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradiobutton_TienMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradiobutton_TienMatActionPerformed

    private void jradiobutton_ChuyenKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradiobutton_ChuyenKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradiobutton_ChuyenKhoanActionPerformed

    private void jtxt_MaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_MaDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_MaDHActionPerformed

    private void jtxt_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_TimKiemActionPerformed
        // TODO add your handling code here:
        try {
        int productID = Integer.parseInt(jtxt_TimKiem.getText().trim());
        searchProductByID(productID);
    } catch (NumberFormatException e) {
        // Xử lý khi người dùng nhập không phải là số
        JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm là số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jtxt_TimKiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(jframe_ThemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jframe_ThemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_ThemDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbutton_ChinhSuaSP;
    private javax.swing.JButton jbutton_ThanhToan;
    private javax.swing.JButton jbutton_ThemSP;
    private javax.swing.JButton jbutton_XoaSP;
    private javax.swing.JLabel jlable_HinhThucTT;
    private javax.swing.JLabel jlable_MaDH;
    private javax.swing.JLabel jlable_MaKH;
    private javax.swing.JLabel jlable_MaNV;
    private javax.swing.JLabel jlable_TenKH;
    private javax.swing.JLabel jlable_TenNV;
    private javax.swing.JPanel jpanel_BangSP;
    private view.panelBackgpround jpanel_Root;
    private javax.swing.JPanel jpanel_ThanhToan;
    private javax.swing.JRadioButton jradiobutton_ChuyenKhoan;
    private javax.swing.JRadioButton jradiobutton_TienMat;
    private javax.swing.JScrollPane jscrollpane_BangSP;
    private javax.swing.JTable jtable_BangSP;
    private javax.swing.JTextField jtxt_MaDH;
    private javax.swing.JTextField jtxt_MaKH;
    private javax.swing.JTextField jtxt_MaNV;
    private javax.swing.JTextField jtxt_NgDH;
    private javax.swing.JTextField jtxt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
