public class buku {
    private String kodeBuku;
    private String idPengarang;
    private String idPenerbit;
    private String idKategori;
    private String judulBuku;
    private int tahunTerbitBuku;
    private int edisiTerbitBuku;
    private String jenisSampulBuku;

    // Constructor
    public buku(String kodeBuku, String idPengarang, String idPenerbit, String idKategori,
                String judulBuku, int tahunTerbitBuku, int edisiTerbitBuku, String jenisSampulBuku) {
        this.kodeBuku = kodeBuku;
        this.idPengarang = idPengarang;
        this.idPenerbit = idPenerbit;
        this.idKategori = idKategori;
        this.judulBuku = judulBuku;
        this.tahunTerbitBuku = tahunTerbitBuku;
        this.edisiTerbitBuku = edisiTerbitBuku;
        this.jenisSampulBuku = jenisSampulBuku;
    }

    // Getters and Setters
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getIdPengarang() {
        return idPengarang;
    }

    public void setIdPengarang(String idPengarang) {
        this.idPengarang = idPengarang;
    }

    public String getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(String idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getTahunTerbitBuku() {
        return tahunTerbitBuku;
    }

    public void setTahunTerbitBuku(int tahunTerbitBuku) {
        this.tahunTerbitBuku = tahunTerbitBuku;
    }

    public int getEdisiTerbitBuku() {
        return edisiTerbitBuku;
    }

    public void setEdisiTerbitBuku(int edisiTerbitBuku) {
        this.edisiTerbitBuku = edisiTerbitBuku;
    }

    public String getJenisSampulBuku() {
        return jenisSampulBuku;
    }

    public void setJenisSampulBuku(String jenisSampulBuku) {
        this.jenisSampulBuku = jenisSampulBuku;
    }
}
