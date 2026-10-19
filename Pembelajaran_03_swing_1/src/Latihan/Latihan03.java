package Latihan;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();

        // 1. INPUT DAN VALIDASI FULLNAME
        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:", "Form Input Fullname", JOptionPane.QUESTION_MESSAGE);
        
        if (fullname == null || fullname.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Menghentikan eksekusi jika validasi gagal
        }

        // 2. INPUT DAN VALIDASI USIA
        String strUsia = JOptionPane.showInputDialog(null, "Masukkan Usia:", "Form Input Usia", JOptionPane.QUESTION_MESSAGE);
        
        if (strUsia == null || strUsia.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int usia;
        try {
            usia = Integer.parseInt(strUsia.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. INPUT DAN VALIDASI ALAMAT
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:", "Form Input Alamat", JOptionPane.QUESTION_MESSAGE);
        
        if (alamat == null || alamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (alamat.trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 4. JIKA SEMUA KONDISI TERPENUHI, SIMPAN KE OBJECT BIODATA
        biodata.setFullname(fullname.trim());
        biodata.setUsia(usia);
        biodata.setAlamat(alamat.trim());

        // 5. TAMPILKAN KOTAK DIALOG INFO DENGAN SELURUH INFORMASI
        String info = "--- INFORMASI BIODATA ---" +
                      "\nFullname : " + biodata.getFullname() +
                      "\nUsia     : " + biodata.getUsia() + " tahun" +
                      "\nAlamat   : " + biodata.getAlamat();

        JOptionPane.showMessageDialog(null, info, "Informasi Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}