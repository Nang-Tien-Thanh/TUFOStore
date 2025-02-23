package Model;

public class TaiKhoan {
    private int MATK;
    private int MANV;
    private String TENDANGNHAP;
    private int MATKHAU;

    public TaiKhoan() {
        this.MATK = 0;
        this.MANV = 0;
        this.TENDANGNHAP = "";
        this.MATKHAU = 0;
    }
    
    public TaiKhoan(int MATK, int MANV, String TENDANGNHAP, int MATKHAU) {
        this.MATK = MATK;
        this.MANV = MANV;
        this.TENDANGNHAP = TENDANGNHAP;
        this.MATKHAU = MATKHAU;
    }

    public TaiKhoan(int MANV, String TENDANGNHAP, int MATKHAU) {
        this.MANV = MANV;
        this.TENDANGNHAP = TENDANGNHAP;
        this.MATKHAU = MATKHAU;
    }

    public int getMATK() {
        return MATK;
    }

    public void setMATK(int MATK) {
        this.MATK = MATK;
    }

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public String getTENDANGNHAP() {
        return TENDANGNHAP;
    }

    public void setTENDANGNHAP(String TENDANGNHAP) {
        this.TENDANGNHAP = TENDANGNHAP;
    }

    public int getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(int MATKHAU) {
        this.MATKHAU = MATKHAU;
    }
    
    
    
}
