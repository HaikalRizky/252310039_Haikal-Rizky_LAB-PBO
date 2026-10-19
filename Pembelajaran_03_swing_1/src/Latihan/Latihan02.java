package Latihan;
import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        // Membuat instance/objek dari class Biodata
        Biodata biodata = new Biodata();

        // 1. Input Data menggunakan Kotak Dialog (showInputDialog)
        String fullname = JOptionPane.showInputDialog(
            null, 
            "Masukkan Fullname:", 
            "Form Input Fullname", 
            JOptionPane.QUESTION_MESSAGE
        );

        String strUsia = JOptionPane.showInputDialog(
            null, 
            "Masukkan Usia:", 
            "Form Input Usia", 
            JOptionPane.QUESTION_MESSAGE
        );

        String alamat = JOptionPane.showInputDialog(
            null, 
            "Masukkan Alamat:", 
            "Form Input Alamat", 
            JOptionPane.QUESTION_MESSAGE
        );

        // Konversi input usia (String) ke tipe data integer
        int usia = Integer.parseInt(strUsia);

        // 2. Menyimpan value ke dalam atribut class Biodata menggunakan method setter
        biodata.setFullname(fullname);
        biodata.setUsia(usia);
        biodata.setAlamat(alamat);

        // 3. Menyusun string output
        String info = "--- DATA BIODATA ---" +
                      "\nFullname : " + biodata.getFullname() +
                      "\nUsia     : " + biodata.getUsia() + " tahun" +
                      "\nAlamat   : " + biodata.getAlamat();

        // 4. Menampilkan data dengan Kotak Dialog (showMessageDialog)
        JOptionPane.showMessageDialog(
            null, 
            info, 
            "Detail Biodata", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}