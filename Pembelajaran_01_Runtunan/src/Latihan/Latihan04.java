package Latihan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan04 {

    static final String GARIS_SAMA = "======================================================";
    static final String GARIS_STRIP = "------------------------------------------------------";
    static final String NAMA_PRODUK = "ROTI ENAK";
    static final int HARGA_SATUAN = 6300;

    static String rupiah(long angka) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols(Locale.US);
        simbol.setGroupingSeparator('.');
        return new DecimalFormat("#,###", simbol).format(angka);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(GARIS_SAMA);
        System.out.println("                 TOKO SERBAGUNA IBIK");
        System.out.println(GARIS_SAMA);
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = scanner.nextInt();

        if (qty <= 0) {
            System.out.println("Jumlah produk harus lebih dari 0.");
            scanner.close();
            return;
        }

        long total = (long) HARGA_SATUAN * qty;
        int diskonPersen = Math.min((qty / 3) * 5, 100);
        long potongan = total * diskonPersen / 100;
        long subTotal = total - potongan;

        String waktu = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", Locale.ENGLISH));

        System.out.println(waktu);
        System.out.printf("%-14s %-5s %-16s %s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println(GARIS_SAMA);
        System.out.printf("%-14s %-5d %-16s %s%n",
                NAMA_PRODUK + ".", qty, "Rp " + rupiah(HARGA_SATUAN) + ",-", "Rp " + rupiah(total));
        System.out.println(GARIS_STRIP);
        System.out.println("Diskon     : " + diskonPersen + "%");
        System.out.println("Sub Total  : Rp " + rupiah(subTotal) + ",-");

        scanner.close();
    }
}