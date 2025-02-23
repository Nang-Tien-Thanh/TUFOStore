
package controller;

import view.*;
import javax.swing.*;
import java.awt.*;
import view.QuanLyDonHang.jpanel_QuanLyDonHang;
import view.QuanLyTaiKhoan.jpanel_QuanLyTaiKhoan;

/**
 *
 * @author NANG TIEN HANH
 */
public class ChuyenManHinhController {
    private JPanel jpanel_Root;
    private String kindSelect = "";

    public ChuyenManHinhController(JPanel jpanel_Root) {
        this.jpanel_Root = jpanel_Root;
    }

    public void setView (JPanel jpanel_Item, JLabel jlable_Item){
        kindSelect="Quan ly tai khoan";
        jpanel_Item.setBackground(new Color(177, 137, 101));
        jlable_Item.setBackground(new Color(177, 137, 101));
        
        jpanel_Root.removeAll();
        jpanel_Root.setLayout(new BorderLayout());
        jpanel_Root.add( new jpanel_QuanLyDonHang());
        jpanel_Root.validate();
        jpanel_Root.repaint();

    }
    
//    public void setEvent(){
//        
//    }
    
    
    
}
