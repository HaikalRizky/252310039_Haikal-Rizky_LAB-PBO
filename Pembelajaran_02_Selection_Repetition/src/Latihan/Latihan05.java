package Latihan;
import java.util.Scanner;

public class Latihan05 {

    static int bacaBaris(Scanner input) {
        while (true) {
            System.out.print("Enter the number of row:");
            String teks = input.nextLine().trim();
            if (teks.matches("\\d{1,2}")) {
                int nilai = Integer.parseInt(teks);
                if (nilai >= 1) {
                    return nilai;
                }
            }
            System.out.println("Masukkan angka 1 sampai 99.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris = bacaBaris(input);
        int total = baris * 2;
        int i = 1;

        while (i <= total) {
            int bintang = (i <= baris) ? baris - i + 1 : i - baris;
            int jarak = 2 * baris + 1 - 2 * bintang;
            StringBuilder garis = new StringBuilder();

            int k = 0;
            while (k < bintang) {
                garis.append("* ");
                k++;
            }
            k = 0;
            while (k < jarak) {
                garis.append("  ");
                k++;
            }
            k = 0;
            while (k < bintang) {
                garis.append("* ");
                k++;
            }

            System.out.println(garis.toString().replaceAll("\\s+$", ""));
            i++;
        }

        input.close();
    }
}