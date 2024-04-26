public class mahasiswa {
    private String NIM;
    private String kodeFakultas;
    private String nama;
    private String alamat;
    private String nomorHP;
    private String status;

    // Constructor
    public mahasiswa(String NIM, String kodeFakultas, String nama, String alamat, String nomorHP, String status) {
        this.NIM = NIM;
        this.kodeFakultas = kodeFakultas;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHP = nomorHP;
        this.status = status;
    }

    // Getters and setters
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getKodeFakultas() {
        return kodeFakultas;
    }

    public void setKodeFakultas(String kodeFakultas) {
        this.kodeFakultas = kodeFakultas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}