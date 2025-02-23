package Model;

/**
 *
 * @author Admin
 */
public class CTDH {
    private int MASP;
    private int MADH;
    private int SOLUONG;

    public CTDH() {
        this.MASP = 0;
        this.MADH = 0;
        this.SOLUONG = 0;
    }

    public CTDH(int MASP, int MADH, int SOLUONG) {
        this.MASP = MASP;
        this.MADH = MADH;
        this.SOLUONG = SOLUONG;
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public int getMADH() {
        return MADH;
    }

    public void setMADH(int MADH) {
        this.MADH = MADH;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }
    
    
    
    
}
