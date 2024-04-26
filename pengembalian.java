import java.util.Date;

public class pengembalian {
    private int no_pengembalian;
    private int no_peminjaman;
    private String ID_Pustakawan;
    private Date tgl_pengembalian;

    // Constructor
    public pengembalian(int no_pengembalian, int no_peminjaman, String ID_Pustakawan, Date tgl_pengembalian) {
        this.no_pengembalian = no_pengembalian;
        this.no_peminjaman = no_peminjaman;
        this.ID_Pustakawan = ID_Pustakawan;
        this.tgl_pengembalian = tgl_pengembalian;
    }

    // Getters and setters
    public int getNo_pengembalian() {
        return no_pengembalian;
    }

    public void setNo_pengembalian(int no_pengembalian) {
        this.no_pengembalian = no_pengembalian;
    }

    public int getNo_peminjaman() {
        return no_peminjaman;
    }

    public void setNo_peminjaman(int no_peminjaman) {
        this.no_peminjaman = no_peminjaman;
    }

    public String getID_Pustakawan() {
        return ID_Pustakawan;
    }

    public void setID_Pustakawan(String ID_Pustakawan) {
        this.ID_Pustakawan = ID_Pustakawan;
    }

    public Date getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(Date tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }
}