/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Tran Thi Kieu Oanh
 */
public class QLKHang extends javax.swing.JFrame {

    /**
     * Creates new form QLKHang
     */
    public QLKHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgpround1 = new view.panelBackgpround();
        jTextField_Search = new javax.swing.JTextField();
        jButtonThemKH = new javax.swing.JButton();
        jButtonChinhSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jPanelNenTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKH = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(94, 42, 14));
        jTextField_Search.setPreferredSize(new java.awt.Dimension(805, 75));
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButtonThemKH.setBackground(new java.awt.Color(52, 28, 11));
        jButtonThemKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonThemKH.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemKH.setText("Thêm khách hàng");
        jButtonThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemKHActionPerformed(evt);
            }
        });

        jButtonChinhSua.setBackground(new java.awt.Color(94, 42, 14));
        jButtonChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonChinhSua.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChinhSua.setText("Chỉnh sửa");
        jButtonChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChinhSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setBackground(new java.awt.Color(193, 149, 120));
        jButtonXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoa.setText("Xóa");

        jPanelNenTable.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(245, 237, 224));

        jTableKH.setBackground(new java.awt.Color(245, 237, 224));
        jTableKH.setForeground(new java.awt.Color(148, 135, 119));
        jTableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ KHÁCH HÀNG", "TÊN KHÁCH HÀNG", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI", "NGÀY ĐĂNG KÝ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableKH.setGridColor(new java.awt.Color(255, 255, 255));
        jTableKH.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTableKH);

        javax.swing.GroupLayout jPanelNenTableLayout = new javax.swing.GroupLayout(jPanelNenTable);
        jPanelNenTable.setLayout(jPanelNenTableLayout);
        jPanelNenTableLayout.setHorizontalGroup(
            jPanelNenTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNenTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelNenTableLayout.setVerticalGroup(
            jPanelNenTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNenTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(52, 28, 11));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm kiếm");

        javax.swing.GroupLayout panelBackgpround1Layout = new javax.swing.GroupLayout(panelBackgpround1);
        panelBackgpround1.setLayout(panelBackgpround1Layout);
        panelBackgpround1Layout.setHorizontalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgpround1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelNenTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBackgpround1Layout.createSequentialGroup()
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonThemKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        panelBackgpround1Layout.setVerticalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgpround1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThemKH)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonChinhSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonXoa)
                .addGap(18, 18, 18)
                .addComponent(jPanelNenTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jButtonThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThemKHActionPerformed

    private void jButtonChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChinhSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChinhSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLKHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChinhSua;
    private javax.swing.JButton jButtonThemKH;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JPanel jPanelNenTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKH;
    private javax.swing.JTextField jTextField_Search;
    private view.panelBackgpround panelBackgpround1;
    // End of variables declaration//GEN-END:variables
}
