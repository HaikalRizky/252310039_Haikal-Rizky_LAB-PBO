package ProgramPenghitungRataRata;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Quiz {
    public static void main(String[] args) {
        int totalData = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan total data:"));

        ArrayList<Integer> angka = new ArrayList<>();
        int jumlah = 0;

        for (int i = 0; i < totalData; i++) {
            int n = Integer.parseInt(
                    JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1) + ":"));
            angka.add(n);
            jumlah += n;
        }

        double rataRata = jumlah / angka.size();

        JOptionPane.showMessageDialog(null, "Rata-rata = " + rataRata);
    }
}