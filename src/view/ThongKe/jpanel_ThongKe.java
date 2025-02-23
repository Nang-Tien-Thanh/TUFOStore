package view.ThongKe;

import controller.ThongKeDAO;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author NANG TIEN HANH
 */
public class jpanel_ThongKe extends javax.swing.JPanel {
    private ThongKeDAO thongKeDAO;
    /**
     * Creates new form jpanel_ThongKe
     */
    public jpanel_ThongKe() {
        initComponents();
        thongKeDAO = new ThongKeDAO();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart_ThongKe = new com.raven.chart.Chart();
        jpanel_DieuKhien = new javax.swing.JPanel();
        jcombobox_ChuKy = new javax.swing.JComboBox<>();
        jcombobox_ThoiGianTheoNam = new javax.swing.JComboBox<>();
        jlabel_ThoiGianTheoNam = new javax.swing.JLabel();
        jlabel_Chuky = new javax.swing.JLabel();
        jlabel_ThoiGianTheoThang = new javax.swing.JLabel();
        jcombobox_ThoiGianTheoThang = new javax.swing.JComboBox<>();
        jbutton_Xem = new javax.swing.JButton();
        jbutton_LapBaoCao = new javax.swing.JButton();

        chart_ThongKe.setOpaque(true);

        jpanel_DieuKhien.setBackground(new java.awt.Color(255, 204, 204));
        jpanel_DieuKhien.setOpaque(false);

        jcombobox_ChuKy.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jcombobox_ChuKy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "Tháng" }));
        jcombobox_ChuKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombobox_ChuKyActionPerformed(evt);
            }
        });

        jcombobox_ThoiGianTheoNam.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jcombobox_ThoiGianTheoNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009" }));
        jcombobox_ThoiGianTheoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombobox_ThoiGianTheoNamActionPerformed(evt);
            }
        });

        jlabel_ThoiGianTheoNam.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jlabel_ThoiGianTheoNam.setText("Chọn thời gian theo năm");

        jlabel_Chuky.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jlabel_Chuky.setText("Chọn chu kỳ");

        jlabel_ThoiGianTheoThang.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jlabel_ThoiGianTheoThang.setText("Chọn thời gian theo tháng");

        jcombobox_ThoiGianTheoThang.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jcombobox_ThoiGianTheoThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jcombobox_ThoiGianTheoThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombobox_ThoiGianTheoThangActionPerformed(evt);
            }
        });

        jbutton_Xem.setBackground(new java.awt.Color(94, 42, 14));
        jbutton_Xem.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_Xem.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_Xem.setText("Xem");
        jbutton_Xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_XemActionPerformed(evt);
            }
        });

        jbutton_LapBaoCao.setBackground(new java.awt.Color(177, 137, 101));
        jbutton_LapBaoCao.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_LapBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_LapBaoCao.setText("Lập báo cáo");
        jbutton_LapBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_LapBaoCaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_DieuKhienLayout = new javax.swing.GroupLayout(jpanel_DieuKhien);
        jpanel_DieuKhien.setLayout(jpanel_DieuKhienLayout);
        jpanel_DieuKhienLayout.setHorizontalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcombobox_ChuKy, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_Chuky))
                .addGap(31, 31, 31)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_ThoiGianTheoNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcombobox_ThoiGianTheoNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                        .addComponent(jcombobox_ThoiGianTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jbutton_LapBaoCao))
                    .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                        .addComponent(jlabel_ThoiGianTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutton_Xem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jpanel_DieuKhienLayout.setVerticalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_Xem)
                    .addComponent(jlabel_ThoiGianTheoThang)
                    .addComponent(jlabel_ThoiGianTheoNam)
                    .addComponent(jlabel_Chuky))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_LapBaoCao)
                    .addComponent(jcombobox_ThoiGianTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcombobox_ThoiGianTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcombobox_ChuKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chart_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chart_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcombobox_ChuKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombobox_ChuKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombobox_ChuKyActionPerformed

    private void jcombobox_ThoiGianTheoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombobox_ThoiGianTheoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombobox_ThoiGianTheoNamActionPerformed

    private void jcombobox_ThoiGianTheoThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombobox_ThoiGianTheoThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombobox_ThoiGianTheoThangActionPerformed

    private void jbutton_XemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_XemActionPerformed
        // TODO add your handling code here:
        if (jcombobox_ChuKy.getSelectedItem().equals("Tháng")) {
        String selectedYear = (String) jcombobox_ThoiGianTheoNam.getSelectedItem();
        String selectedMonth = (String) jcombobox_ThoiGianTheoThang.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
        int year = Integer.parseInt(selectedYear);
        int month = Integer.parseInt(selectedMonth);
        Map<Integer, Double> revenueData = thongKeDAO.getRevenueByMonth(year, month);
        JFreeChart chart = createChartt(revenueData, year, month);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(675, 400));
            chart_ThongKe.removeAll();
            chart_ThongKe.setLayout(new BorderLayout());
            chart_ThongKe.add(chartPanel, BorderLayout.CENTER);
            chart_ThongKe.validate();
            }
        } else {
        String selectedYear = (String) jcombobox_ThoiGianTheoNam.getSelectedItem();
        if (selectedYear != null) {
            int year = Integer.parseInt(selectedYear);
            Map<Integer, Double> revenueData = thongKeDAO.getRevenueByYear(year);
            JFreeChart barChart = createChart(revenueData, year);
            ChartPanel chartPanel = new ChartPanel(barChart);
            chartPanel.setPreferredSize(new Dimension(675, 400));
            chart_ThongKe.removeAll();
            chart_ThongKe.setLayout(new BorderLayout());
            chart_ThongKe.add(chartPanel, BorderLayout.CENTER);
            chart_ThongKe.validate();
                }
            }
    }//GEN-LAST:event_jbutton_XemActionPerformed

    private JFreeChart createChart(Map<Integer, Double> revenueData, int year) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<Integer, Double> entry : revenueData.entrySet()) {
            dataset.addValue(entry.getValue(), "Doanh thu", String.valueOf(entry.getKey()));
        }
        return ChartFactory.createBarChart(
                "Thống kê doanh thu năm " + year,
                "Tháng",
                "Doanh thu (VND)",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
    }
    
    private JFreeChart createChartt(Map<Integer, Double> revenueData, int year, int month) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<Integer, Double> entry : revenueData.entrySet()) {
            dataset.addValue(entry.getValue(), "Doanh thu", String.valueOf(entry.getKey()));
        }
        return ChartFactory.createBarChart(
                "Thống kê doanh thu tháng " + month + "/" + year,
                "Ngày",
                "Doanh thu (VND)",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
    }
    
    private void jbutton_LapBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_LapBaoCaoActionPerformed
        // TODO add your handling code here:
        String chuKy = (String) jcombobox_ChuKy.getSelectedItem();
    int year = Integer.parseInt((String) jcombobox_ThoiGianTheoNam.getSelectedItem());
    Map<Integer, Double> revenueData = null;

    if ("Tháng".equals(chuKy)) {
        int month = Integer.parseInt((String) jcombobox_ThoiGianTheoThang.getSelectedItem());
        revenueData = thongKeDAO.getRevenueByMonth(year, month);
    } else {
        revenueData = thongKeDAO.getRevenueByYear(year);
    }

    if (revenueData != null) {
        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            XSSFSheet spreadsheet = workbook.createSheet("Doanh Thu");
            XSSFRow row;
            Cell cell;

            // Tiêu đề báo cáo
            row = spreadsheet.createRow((short) 0);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("BÁO CÁO DOANH THU");

            // Tiêu đề các cột
            row = spreadsheet.createRow((short) 1);
            cell = row.createCell(0, CellType.STRING);
            if ("Tháng".equals(chuKy)) {
            cell.setCellValue("Thời gian (ngày)");
            } else {
            cell.setCellValue("Thời gian (tháng)");
            }
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Doanh thu");

            // Ghi dữ liệu doanh thu vào bảng tính
            int rowNum = 2;
            for (Map.Entry<Integer, Double> entry : revenueData.entrySet()) {
                row = spreadsheet.createRow(rowNum++);
                row.createCell(0, CellType.NUMERIC).setCellValue(entry.getKey());
                row.createCell(1, CellType.NUMERIC).setCellValue(entry.getValue());
            }

            // Đường dẫn lưu file báo cáo
            String filePath = "D:\\Clone Do An JAVA\\Quan-ly-cua-hang-ban-trang-suc\\File_bao_cao\\DoanhThu_" + chuKy + "_" + year + ".xlsx";
            File file = new File(filePath);
            try (FileOutputStream out = new FileOutputStream(file)) {
                workbook.write(out);
            }
            System.out.println("File báo cáo đã được lưu tại: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jbutton_LapBaoCaoActionPerformed

    public static void main (String args[]) {
        /* Set the Nimbus look and feel */
        
        /*Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            JFrame frame = new JFrame("Thống kê");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thêm dòng này để đặt thao tác khi đóng cửa sổ
            frame.getContentPane().add(new jpanel_ThongKe()); // Thêm JPanel vào JFrame
            frame.pack(); // Tự động điều chỉnh kích thước cửa sổ
            frame.setVisible(true); // Hiển thị cửa sổ
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart_ThongKe;
    private javax.swing.JButton jbutton_LapBaoCao;
    private javax.swing.JButton jbutton_Xem;
    private javax.swing.JComboBox<String> jcombobox_ChuKy;
    private javax.swing.JComboBox<String> jcombobox_ThoiGianTheoNam;
    private javax.swing.JComboBox<String> jcombobox_ThoiGianTheoThang;
    private javax.swing.JLabel jlabel_Chuky;
    private javax.swing.JLabel jlabel_ThoiGianTheoNam;
    private javax.swing.JLabel jlabel_ThoiGianTheoThang;
    private javax.swing.JPanel jpanel_DieuKhien;
    // End of variables declaration//GEN-END:variables
 
}
