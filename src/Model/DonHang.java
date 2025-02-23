package Model;


import java.sql.Date;
/**
 *
 * @author Admin
 */
public class DonHang {
    private int MADH;
    private int MANV;
    private int MAKH;
    private Date NGAYDH;
    private double TRIGIA;

    public DonHang(int MADH, int MANV, int MAKH, Date NGAYDH, double TRIGIA) {
        this.MADH = MADH;
        this.MANV = MANV;
        this.MAKH = MAKH;
        this.NGAYDH = NGAYDH;
        this.TRIGIA = TRIGIA;
    }

    public DonHang() {
        this.MADH = 0;
        this.MANV = 0;
        this.MAKH = 0;
        this.NGAYDH = null;
        this.TRIGIA = 0.0;
    }

    public DonHang(int MADH, int MANV, int MAKH, Date NGAYDH) {
        this.MADH = MADH;
        this.MANV = MANV;
        this.MAKH = MAKH;
        this.NGAYDH = NGAYDH;
    }



    public int getMADH() {
        return MADH;
    }

    public void setMADH(int MADH) {
        this.MADH = MADH;
    }

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }

    public Date getNGAYDH() {
        return NGAYDH;
    }

    public void setNGAYDH(Date NGAYDH) {
        this.NGAYDH = NGAYDH;
    }

    public double getTRIGIA() {
        return TRIGIA;
    }

    public void setTRIGIA(double TRIGIA) {
        this.TRIGIA = TRIGIA;
    }
    
}
