public class DetailPembayaran {
    private int no_pengembalian;
    private String kode_koleksi;
    private int jumlah_koleksi;
    private String kode_kategori_denda;
    private double jumlah_denda;
    private int jumlah_rusak;

    // Constructor
    public DetailPembayaran(int no_pengembalian, String kode_koleksi, int jumlah_koleksi, String kode_kategori_denda, double jumlah_denda, int jumlah_rusak) {
        this.no_pengembalian = no_pengembalian;
        this.kode_koleksi = kode_koleksi;
        this.jumlah_koleksi = jumlah_koleksi;
        this.kode_kategori_denda = kode_kategori_denda;
        this.jumlah_denda = jumlah_denda;
        this.jumlah_rusak = jumlah_rusak;
    }

    // Getters and setters
    public int getNo_pengembalian() {
        return no_pengembalian;
    }

    public void setNo_pengembalian(int no_pengembalian) {
        this.no_pengembalian = no_pengembalian;
    }

    public String getKode_koleksi() {
        return kode_koleksi;
    }

    public void setKode_koleksi(String kode_koleksi) {
        this.kode_koleksi = kode_koleksi;
    }

    public int getJumlah_koleksi() {
        return jumlah_koleksi;
    }

    public void setJumlah_koleksi(int jumlah_koleksi) {
        this.jumlah_koleksi = jumlah_koleksi;
    }

    public String getKode_kategori_denda() {
        return kode_kategori_denda;
    }

    public void setKode_kategori_denda(String kode_kategori_denda) {
        this.kode_kategori_denda = kode_kategori_denda;
    }

    public double getJumlah_denda() {
        return jumlah_denda;
    }

    public void setJumlah_denda(double jumlah_denda) {
        this.jumlah_denda = jumlah_denda;
    }

    public int getJumlah_rusak() {
        return jumlah_rusak;
    }

    public void setJumlah_rusak(int jumlah_rusak) {
        this.jumlah_rusak = jumlah_rusak;
    }
}