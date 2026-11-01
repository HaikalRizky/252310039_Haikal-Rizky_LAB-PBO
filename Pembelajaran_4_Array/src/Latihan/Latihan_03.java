package Latihan;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan_03 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dataSiswa = new ArrayList<>();

        // Input 3 data sesuai tabel soal
        for (int i = 0; i < 3; i++) {
            ArrayList<String> baris = new ArrayList<>();
            
            String nama = JOptionPane.showInputDialog(null, "Masukkan Nama Lengkap (Data ke-" + (i + 1) + "):");
            String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat (Data ke-" + (i + 1) + "):");
            String noTelp = JOptionPane.showInputDialog(null, "Masukkan No Telp (Data ke-" + (i + 1) + "):");

            baris.add(nama);
            baris.add(alamat);
            baris.add(noTelp);

            dataSiswa.add(baris);
        }

        // Tampilkan data dalam tabel/list
        StringBuilder output = new StringBuilder("=== DATA SISWA ===\n\n");
        for (int i = 0; i < dataSiswa.size(); i++) {
            output.append("Data ke-").append(i + 1).append(":\n")
                  .append("Nama    : ").append(dataSiswa.get(i).get(0)).append("\n")
                  .append("Alamat  : ").append(dataSiswa.get(i).get(1)).append("\n")
                  .append("No Telp : ").append(dataSiswa.get(i).get(2)).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}