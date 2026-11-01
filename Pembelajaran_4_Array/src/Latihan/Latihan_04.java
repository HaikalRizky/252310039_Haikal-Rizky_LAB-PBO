package Latihan;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan_04 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dataSiswa = new ArrayList<>();

        // Input 3 data
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

        // Pengurutan Ascending berdasarkan Nama (Indeks ke-0) menggunakan Bubble Sort
        for (int i = 0; i < dataSiswa.size() - 1; i++) {
            for (int j = 0; j < dataSiswa.size() - i - 1; j++) {
                String nama1 = dataSiswa.get(j).get(0);
                String nama2 = dataSiswa.get(j + 1).get(0);

                if (nama1.compareToIgnoreCase(nama2) > 0) {
                    // Tukar posisi baris
                    ArrayList<String> temp = dataSiswa.get(j);
                    dataSiswa.set(j, dataSiswa.get(j + 1));
                    dataSiswa.set(j + 1, temp);
                }
            }
        }

        // Tampilkan data yang sudah terurut Ascending
        StringBuilder output = new StringBuilder("=== DATA SISWA (ASCENDING BY NAMA) ===\n\n");
        for (int i = 0; i < dataSiswa.size(); i++) {
            output.append(i + 1).append(". ").append(dataSiswa.get(i).get(0)).append("\n")
                  .append("   Alamat  : ").append(dataSiswa.get(i).get(1)).append("\n")
                  .append("   No Telp : ").append(dataSiswa.get(i).get(2)).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}