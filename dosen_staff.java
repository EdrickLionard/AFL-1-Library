public class dosen_staff {
    private String NIK;
    private String kodeFakDep;
    private String nama;
    private String alamat;
    private String nomorHP;
    private String status;

    public dosen_staff(String NIK, String kodeFakDep, String nama, String alamat, String nomorHP, String status) {
        this.NIK = NIK;
        this.kodeFakDep = kodeFakDep;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHP = nomorHP;
        this.status = status;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getKodeFakDep() {
        return kodeFakDep;
    }

    public void setKodeFakDep(String kodeFakDep) {
        this.kodeFakDep = kodeFakDep;
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