package Latihan;
import java.util.Locale;
import java.util.Scanner;

public class Latihan01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan suhu dalam Celcius : ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        System.out.println("=====================================");
        System.out.println("        KONVERSI SUHU");
        System.out.println("=====================================");
        System.out.printf(Locale.US, "Celcius    : %.2f C%n", celcius);
        System.out.printf(Locale.US, "Fahrenheit : %.2f F%n", fahrenheit);
        System.out.printf(Locale.US, "Reamur     : %.2f R%n", reamur);
        System.out.printf(Locale.US, "Kelvin     : %.2f K%n", kelvin);

        scanner.close();
    }
}