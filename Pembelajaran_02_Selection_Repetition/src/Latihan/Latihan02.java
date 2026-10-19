package Latihan;
import java.util.Scanner;

public class Latihan02 {

    static long bacaNpm(Scanner input) {
        while (true) {
            System.out.print("Masukkan NPM : ");
            String teks = input.nextLine().trim();
            if (teks.matches("\\d{1,18}")) {
                long npm = Long.parseLong(teks);
                if (npm > 0) {
                    return npm;
                }
            }
            System.out.println("NPM harus berupa angka bulat positif.");
        }
    }

    static long pembagiTerkecil(long n) {
        if (n % 2 == 0) {
            return 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long npm = bacaNpm(input);

        if (npm < 2) {
            System.out.println("Bukan termasuk bilangan prima karena kurang dari 2");
        } else {
            long pembagi = pembagiTerkecil(npm);
            if (pembagi == npm) {
                System.out.println("Termasuk bilangan PRIMA");
            } else {
                System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan " + pembagi);
            }
        }

        input.close();
    }
}