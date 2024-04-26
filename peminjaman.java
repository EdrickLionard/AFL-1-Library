public class peminjaman {
    private int no_pengembalian;
    private int no_peminjaman;
    private String NIM;
    private String NIK;
    private String ID_Koleksi;
    private String Kode_CD;

    // Constructor
    public peminjaman(int no_pengembalian, int no_peminjaman, String NIM, String NIK, String ID_Koleksi, String Kode_CD) {
        this.no_pengembalian = no_pengembalian;
        this.no_peminjaman = no_peminjaman;
        this.NIM = NIM;
        this.NIK = NIK;
        this.ID_Koleksi = ID_Koleksi;
        this.Kode_CD = Kode_CD;
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

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getID_Koleksi() {
        return ID_Koleksi;
    }

    public void setID_Koleksi(String ID_Koleksi) {
        this.ID_Koleksi = ID_Koleksi;
    }

    public String getKode_CD() {
        return Kode_CD;
    }

    public void setKode_CD(String Kode_CD) {
        this.Kode_CD = Kode_CD;
    }
}