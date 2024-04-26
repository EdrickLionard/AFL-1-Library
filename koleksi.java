public class koleksi {
    private String ID_Koleksi;
    private int Jumlah_total;
    private int Jumlah_rusak;
    private int Jumlah_tersedia;
    private int Jumlah_pinjam;

    public koleksi(String ID_Koleksi, int Jumlah_total, int Jumlah_rusak, int Jumlah_tersedia, int Jumlah_pinjam) {
        this.ID_Koleksi = ID_Koleksi;
        this.Jumlah_total = Jumlah_total;
        this.Jumlah_rusak = Jumlah_rusak;
        this.Jumlah_tersedia = Jumlah_tersedia;
        this.Jumlah_pinjam = Jumlah_pinjam;
    }

    public String getID_Koleksi() {
        return ID_Koleksi;
    }

    public void setID_Koleksi(String ID_Koleksi) {
        this.ID_Koleksi = ID_Koleksi;
    }

    public int getJumlah_total() {
        return Jumlah_total;
    }

    public void setJumlah_total(int Jumlah_total) {
        this.Jumlah_total = Jumlah_total;
    }

    public int getJumlah_rusak() {
        return Jumlah_rusak;
    }

    public void setJumlah_rusak(int Jumlah_rusak) {
        this.Jumlah_rusak = Jumlah_rusak;
    }

    public int getJumlah_tersedia() {
        return Jumlah_tersedia;
    }

    public void setJumlah_tersedia(int Jumlah_tersedia) {
        this.Jumlah_tersedia = Jumlah_tersedia;
    }

    public int getJumlah_pinjam() {
        return Jumlah_pinjam;
    }

    public void setJumlah_pinjam(int Jumlah_pinjam) {
        this.Jumlah_pinjam = Jumlah_pinjam;
    }
}