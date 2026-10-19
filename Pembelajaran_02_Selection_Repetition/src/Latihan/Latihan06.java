package Latihan;
import java.util.Scanner;

public class Latihan06 {

    static String tanyaUlang(Scanner input) {
        while (true) {
            System.out.print("Apakah anda akan memesan kembali ? (y/n) : ");
            String jawab = input.nextLine().trim().toLowerCase();
            if (jawab.equals("y") || jawab.equals("n")) {
                return jawab;
            }
            System.out.println("Masukkan hanya y atau n.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lagi;

        do {
            System.out.println("\nMenu Sarapan:");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Bubur Ayam");
            System.out.println("3. Soto Ayam");
            System.out.print("Pilih menu : ");
            String pilihan = input.nextLine().trim();

            switch (pilihan) {
                case "1":
                    System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
                    break;
                case "2":
                    System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
                    break;
                case "3":
                    System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
                    break;
                default:
                    System.out.println("Maaf menu yang anda masukan salah.");
            }

            lagi = tanyaUlang(input);
        } while (lagi.equals("y"));

        input.close();
    }
}