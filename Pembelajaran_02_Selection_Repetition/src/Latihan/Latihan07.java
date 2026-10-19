package Latihan;
import java.util.Scanner;

public class Latihan07 {

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
        resto resto = new resto();
        String lagi;

        do {
            resto.chooseMenu(input);
            lagi = tanyaUlang(input);
        } while (lagi.equals("y"));

        System.out.println("Terimakasih telah memesan.");

        input.close();
    }
}
