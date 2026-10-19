package Latihan;

import javax.swing.JOptionPane;

public class Validasi03 {
    public static void main(String[] args) {
        // Perulangan utama program
        while (true) {
            Biodata biodata = new Biodata();

            // ==========================================
            // 1. FORM INPUT & VALIDASI FULLNAME
            // ==========================================
            String fullname = "";
            while (true) {
                fullname = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan Fullname:", 
                    "Form Input Fullname", 
                    JOptionPane.QUESTION_MESSAGE
                );

                // Jika menekan tombol CANCEL atau Close (x)
                if (fullname == null) {
                    if (konfirmasiKeluar()) {
                        System.exit(0); // Program Selesai
                    } else {
                        continue; // Kembali mengisi form isian Fullname
                    }
                }

                // Validasi field tidak boleh kosong
                if (fullname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Field fullname tidak boleh kosong", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue; // Ulangi input Fullname
                }

                break; // Lolos validasi Fullname
            }

            // ==========================================
            // 2. FORM INPUT & VALIDASI USIA
            // ==========================================
            int usia = 0;
            while (true) {
                String strUsia = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan Usia:", 
                    "Form Input Usia", 
                    JOptionPane.QUESTION_MESSAGE
                );

                // Jika menekan tombol CANCEL atau Close (x)
                if (strUsia == null) {
                    if (konfirmasiKeluar()) {
                        System.exit(0); // Program Selesai
                    } else {
                        continue; // Kembali mengisi form isian Usia
                    }
                }

                // Validasi field tidak boleh kosong
                if (strUsia.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Field usia tidak boleh kosong", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue; // Ulangi input Usia
                }

                // Validasi harus numerik
                try {
                    usia = Integer.parseInt(strUsia.trim());
                    break; // Lolos validasi Usia
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Isian usia harus angka", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            // ==========================================
            // 3. FORM INPUT & VALIDASI ALAMAT
            // ==========================================
            String alamat = "";
            while (true) {
                alamat = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan Alamat:", 
                    "Form Input Alamat", 
                    JOptionPane.QUESTION_MESSAGE
                );

                // Jika menekan tombol CANCEL atau Close (x)
                if (alamat == null) {
                    if (konfirmasiKeluar()) {
                        System.exit(0); // Program Selesai
                    } else {
                        continue; // Kembali mengisi form isian Alamat
                    }
                }

                // Validasi field tidak boleh kosong
                if (alamat.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Field alamat tidak boleh kosong", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue; // Ulangi input Alamat
                }

                // Validasi minimum 10 karakter
                if (alamat.trim().length() < 10) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Masukan alamat minimum 10 karakter", 
                        "Warning", 
                        JOptionPane.WARNING_MESSAGE
                    );
                    continue; // Ulangi input Alamat
                }

                break; // Lolos validasi Alamat
            }

            // ==========================================
            // 4. SIMPAN DATA & TAMPILKAN HASIL
            // ==========================================
            biodata.setFullname(fullname.trim());
            biodata.setUsia(usia);
            biodata.setAlamat(alamat.trim());

            String info = "--- INFORMASI BIODATA ---" +
                          "\nFullname : " + biodata.getFullname() +
                          "\nUsia     : " + biodata.getUsia() + " tahun" +
                          "\nAlamat   : " + biodata.getAlamat();

            // Menampilkan dialog info seluruh isian
            JOptionPane.showMessageDialog(
                null, 
                info, 
                "Informasi Biodata", 
                JOptionPane.INFORMATION_MESSAGE
            );

            // Setelah klik OK pada dialog info, tanyakan apakah ingin keluar
            if (konfirmasiKeluar()) {
                break; // Selesai / Keluar dari perulangan utama
            }
            // Jika memilih No, perulangan `while (true)` utama akan mengulang dari form Fullname
        }
    }

    /**
     * Helper Method untuk menampilkan kotak dialog konfirmasi keluar
     * @return true jika pengguna memilih YES, false jika memilih NO
     */
    private static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(
            null,
            "Apakah anda ingin keluar ?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        return pilihan == JOptionPane.YES_OPTION;
    }
}