package Model;

/**
 *
 * @author Khoa Trinh
 */
public class SanPham {
    private int MASP;
    private int MALOAI;
    private String TENSP;
    private String DVT;
    private double GIANHAP;
    private double GIABAN;
    private int SOLUONG;
    private String MOTA;

    public SanPham() {
        this.MASP = 0;
        this.MALOAI = 0;
        this.TENSP = "";
        this.DVT = "";
        this.GIANHAP = 0.0;
        this.GIABAN = 0.0;
        this.SOLUONG = 0;
        this.MOTA = "";
    }
    
    public SanPham(int MASP, String TENSP, String DVT, double GIABAN, int SOLUONG) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.DVT = DVT;
        this.GIABAN = GIABAN;
        this.SOLUONG = SOLUONG;
    }
    public SanPham(int MASP, int MALOAI, String TENSP, String DVT, double GIABAN, int SOLUONG) {
        this.MASP = MASP;
        this.MALOAI = MALOAI;
        this.TENSP = TENSP;
        this.DVT = DVT;
        this.GIABAN = GIABAN;
        this.SOLUONG = SOLUONG;
    }

    public SanPham(int MASP, int MALOAI, String TENSP, String DVT, double GIANHAP, double GIABAN, int SOLUONG, String MOTA) {
        this.MASP = MASP;
        this.MALOAI = MALOAI;
        this.TENSP = TENSP;
        this.DVT = DVT;
        this.GIANHAP = GIANHAP;
        this.GIABAN = GIABAN;
        this.SOLUONG = SOLUONG;
        this.MOTA = MOTA;
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public int getMALOAI() {
        return MALOAI;
    }

    public void setMALOAI(int MALOAI) {
        this.MALOAI = MALOAI;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public double getGIANHAP() {
        return GIANHAP;
    }

    public void setGIANHAP(double GIANHAP) {
        this.GIANHAP = GIANHAP;
    }

    public double getGIABAN() {
        return GIABAN;
    }

    public void setGIABAN(double GIABAN) {
        this.GIABAN = GIABAN;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }

    public void setMASL(int SL) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
