package Latihan;
import java.util.Scanner;

public class Latihan07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap : ");
        String namaLengkap = scanner.nextLine();

        String hasil = namaLengkap.replaceAll("[aiueoAIUEO]", "X");

        System.out.println("Sebelum : " + namaLengkap);
        System.out.println("Sesudah : " + hasil);

        scanner.close();
    }
}