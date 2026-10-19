package Latihan;
import java.util.Locale;
import java.util.Scanner;

public class Latihan09 {

    static students myBio = new students();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan NPM          : ");
        Integer npm = myBio.getNPM(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Masukkan Nama Lengkap : ");
        String fullname = myBio.getFullname(scanner.nextLine());

        System.out.print("Masukkan Nama Kelas   : ");
        String className = myBio.getClassName(scanner.nextLine());

        System.out.print("Masukkan Semester     : ");
        Integer semester = myBio.getSemester(scanner.nextInt());

        System.out.print("Masukkan IPK (cth 3.75): ");
        Float gpa = myBio.getGPA(scanner.nextFloat());

        System.out.println();
        System.out.println("=========== DATA MAHASISWA ===========");
        System.out.println("NPM          : " + npm);
        System.out.println("Nama Lengkap : " + fullname);
        System.out.println("Nama Kelas   : " + className);
        System.out.println("Semester     : " + semester);
        System.out.println("IPK          : " + gpa);

        scanner.close();
    }
}