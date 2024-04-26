public class cd {
    private String kodeCD;
    private String kategoriCD;
    private int tahunTerbit;

    // Constructor
    public cd(String kodeCD, String kategoriCD, int tahunTerbit) {
        this.kodeCD = kodeCD;
        this.kategoriCD = kategoriCD;
        this.tahunTerbit = tahunTerbit;
    }

    // Getters and setters
    public String getKodeCD() {
        return kodeCD;
    }

    public void setKodeCD(String kodeCD) {
        this.kodeCD = kodeCD;
    }

    public String getKategoriCD() {
        return kategoriCD;
    }

    public void setKategoriCD(String kategoriCD) {
        this.kategoriCD = kategoriCD;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // toString method to represent CD object as a string
    @Override
    public String toString() {
        return "CD{" +
                "kodeCD='" + kodeCD + '\'' +
                ", kategoriCD='" + kategoriCD + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }
}
