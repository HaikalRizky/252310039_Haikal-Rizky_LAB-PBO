package Latihan;
import java.util.Locale;
import java.util.Scanner;

public class Latihan03 {

    static final double PI = Math.PI;
    static int jumlahPerhitungan = 0;

    static double garisPelukisKerucut(double r, double t) {
        jumlahPerhitungan++;
        return Math.sqrt(r * r + t * t);
    }

    static double kelilingAlasKerucut(double r) {
        jumlahPerhitungan++;
        return 2 * PI * r;
    }

    static double luasPermukaanKerucut(double r, double t) {
        jumlahPerhitungan++;
        double s = garisPelukisKerucut(r, t);
        return PI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        jumlahPerhitungan++;
        return PI * r * r * t / 3;
    }

    static void hitungTabung(double r, double t) {

        double kelilingAlas = 2 * PI * r;
        double luasPermukaan = 2 * PI * r * (r + t);
        double volume = PI * r * r * t;
        jumlahPerhitungan += 3;

        System.out.printf(Locale.US, "Keliling alas   : %.2f%n", kelilingAlas);
        System.out.printf(Locale.US, "Luas permukaan  : %.2f%n", luasPermukaan);
        System.out.printf(Locale.US, "Volume          : %.2f%n", volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===== SEGITIGA KERUCUT =====");
        System.out.print("Masukkan jari-jari alas (r) : ");
        double rKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi (t)         : ");
        double tKerucut = scanner.nextDouble();

        double s = garisPelukisKerucut(rKerucut, tKerucut);
        double kelilingAlas = kelilingAlasKerucut(rKerucut);
        double luas = luasPermukaanKerucut(rKerucut, tKerucut);
        double volume = volumeKerucut(rKerucut, tKerucut);

        System.out.printf(Locale.US, "Garis pelukis   : %.2f%n", s);
        System.out.printf(Locale.US, "Keliling alas   : %.2f%n", kelilingAlas);
        System.out.printf(Locale.US, "Luas permukaan  : %.2f%n", luas);
        System.out.printf(Locale.US, "Volume          : %.2f%n", volume);

        System.out.println();
        System.out.println("===== TABUNG =====");
        System.out.print("Masukkan jari-jari alas (r) : ");
        double rTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi (t)         : ");
        double tTabung = scanner.nextDouble();

        hitungTabung(rTabung, tTabung);

        System.out.println();
        System.out.println("Total method perhitungan yang dipanggil : " + jumlahPerhitungan);

        scanner.close();
    }
}