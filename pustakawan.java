public class pustakawan {
    private String idPustakawan;
    private String nama;
    private String alamat;
    private String noHp;
    private String email;
    private String password;
    private String jenisKelamin;
    private String jabatan;
    private String foto;

    // Constructor
    public pustakawan(String idPustakawan, String nama, String alamat, String noHp, String email, String password,
                      String jenisKelamin, String jabatan, String foto) {
        this.idPustakawan = idPustakawan;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.foto = foto;
    }

    // Getters and setters
    public String getIdPustakawan() {
        return idPustakawan;
    }

    public void setIdPustakawan(String idPustakawan) {
        this.idPustakawan = idPustakawan;
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

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
