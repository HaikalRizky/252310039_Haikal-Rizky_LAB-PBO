package Latihan;
import java.util.Locale;
import java.util.Scanner;

public class Latihan10 {

    static final String PIN = "123";
    static long saldo = 1000000;

    static String rupiah(long angka) {
        return "Rp " + String.format(Locale.US, "%,d", angka).replace(',', '.') + ",-";
    }

    static long bacaNominal(Scanner input, String label) {
        while (true) {
            System.out.print(label);
            String teks = input.nextLine().trim();
            if (teks.matches("\\d{1,12}")) {
                long nilai = Long.parseLong(teks);
                if (nilai > 0) {
                    return nilai;
                }
            }
            System.out.println("Nominal harus berupa angka lebih dari 0.");
        }
    }

    static boolean kembaliKeMenu(Scanner input) {
        while (true) {
            System.out.print("Kembali ke menu ? (y/n) : ");
            String jawab = input.nextLine().trim().toLowerCase();
            if (jawab.equals("y")) {
                return true;
            }
            if (jawab.equals("n")) {
                return false;
            }
            System.out.println("Masukkan hanya y atau n.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan PIN : ");
            if (input.nextLine().trim().equals(PIN)) {
                break;
            }
            System.out.println("PIN salah, silakan coba lagi.");
        }

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            String menu = input.nextLine().trim();

            switch (menu) {
                case "1":
                    System.out.println("Saldo anda : " + rupiah(saldo));
                    break;
                case "2": {
                    long setor = bacaNominal(input, "Masukkan nominal setor tunai : ");
                    saldo += setor;
                    System.out.println("Setor tunai berhasil. Saldo anda : " + rupiah(saldo));
                    break;
                }
                case "3": {
                    long tarik = bacaNominal(input, "Masukkan nominal tarik tunai : ");
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil. Saldo anda : " + rupiah(saldo));
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;
                }
                case "4":
                    System.out.println("Anda memilih keluar.");
                    break;
                default:
                    System.out.println("Menu yang anda masukan salah.");
                    continue;
            }

            lanjut = kembaliKeMenu(input);
        }

        System.out.println("Terimakasih telah menggunakan ATM.");

        input.close();
    }
}