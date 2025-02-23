
package view;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class panelBackgpround extends javax.swing.JPanel {

    private BufferedImage background;
    public panelBackgpround() {
        initComponents();
        //cài nền cho panel
       try 
         {
            // Tải hình ảnh từ thư mục Icon trong project DOAN
            background = ImageIO.read(getClass().getResource("/Icon/nen.png"));
        } catch (IOException ex) {
            // Xử lý nếu không thể đọc được hình ảnh
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
     // Vẽ hình ảnh làm nền
        if (background != null) {
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        }
    }
       
//   public static void main(String[] args) {
//        /*SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame frame = new JFrame("Image Background Panel");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.add(new panelBackgpround());
//                frame.pack(); //tự động điều chỉnh kích thước
//                frame.setVisible(true);
//            }
//        });*/
//        //public void run() {
//                JFrame frame = new JFrame("Image Background Panel");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.add(new panelBackgpround());
//                frame.pack(); //tự động điều chỉnh kích thước
//                frame.setVisible(true);
//          //  }
//        
//    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
