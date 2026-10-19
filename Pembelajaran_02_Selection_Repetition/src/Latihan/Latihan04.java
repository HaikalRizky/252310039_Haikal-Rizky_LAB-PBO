package Latihan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Latihan04 {

    static final long NPM = 252310041L;

    static int bacaFaktor(Scanner input) {
        while (true) {
            System.out.print("Masukkan nilai faktor (minimal 20) : ");
            String teks = input.nextLine().trim();
            if (teks.matches("\\d{1,9}")) {
                int nilai = Integer.parseInt(teks);
                if (nilai >= 20) {
                    return nilai;
                }
            }
            System.out.println("Nilai faktor tidak boleh kurang dari 20, silakan ulangi.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ascending = NPM % 2 == 0;
        int n = bacaFaktor(input);

        List<Integer> faktor = new ArrayList<>();
        for (int i = 1; (long) i * i <= n; i++) {
            if (n % i == 0) {
                faktor.add(i);
                if (i != n / i) {
                    faktor.add(n / i);
                }
            }
        }

        Collections.sort(faktor);
        if (!ascending) {
            Collections.reverse(faktor);
        }

        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < faktor.size(); i++) {
            if (i > 0) {
                hasil.append(", ");
            }
            hasil.append(faktor.get(i));
        }

        System.out.println((ascending ? "ASC" : "DESC") + ": Faktor " + n + " adalah " + hasil);

        input.close();
    }
}