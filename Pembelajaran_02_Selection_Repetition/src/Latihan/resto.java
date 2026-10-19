package Latihan;
import java.util.Locale;
import java.util.Scanner;

public class resto {

    private long Harga;

    public void chooseMenu(Scanner input) {
        System.out.println("\nMenu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu : ");
        String teks = input.nextLine().trim();
        int menu = teks.matches("\\d{1,2}") ? Integer.parseInt(teks) : 0;

        String nama;
        switch (menu) {
            case 1:
                nama = "Nasi Goreng";
                break;
            case 2:
                nama = "Bubur Ayam";
                break;
            case 3:
                nama = "Soto Ayam";
                break;
            default:
                nama = "";
        }

        Long harga = getPrices(menu);

        if (harga > 0) {
            String rupiah = String.format(Locale.US, "%,d", harga).replace(',', '.');
            System.out.println("Anda memesan " + nama + " dengan harga Rp " + rupiah + ",-");
        } else {
            System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private Long getPrices(int menu) {
        switch (menu) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
        }
        return Harga;
    }
}