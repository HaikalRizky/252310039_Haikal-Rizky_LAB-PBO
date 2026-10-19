package Latihan;
public class Biodata {
    private String fullname;
    private int usia;
    private String alamat;

    // Method untuk menyimpan value atribut (Setter)
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method untuk mengambil value atribut (Getter)
    public String getFullname() {
        return fullname;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }
}