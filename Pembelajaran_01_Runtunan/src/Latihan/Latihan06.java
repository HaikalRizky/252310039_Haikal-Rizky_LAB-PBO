package Latihan;
import java.util.Scanner;

public class Latihan06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Usia      : ");
        int usia = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Masukkan Firstname : ");
        String firstname = scanner.nextLine().trim();

        System.out.print("Masukkan Lastname  : ");
        String lastname = scanner.nextLine().trim();

        System.out.print("Masukkan NPM       : ");
        String npm = scanner.nextLine().trim();

        String hasil = String.valueOf(usia)
                .concat(firstname)
                .concat(lastname)
                .concat(npm);

        System.out.println("Output : " + hasil);

        scanner.close();
    }
}