package Latihan;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan_01 {
    public static void main(String[] args) {
        // Inisialisasi ArrayList 2D untuk Matriks A dan B
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();

        // Input data Matriks A (Ordo 2x2)
        JOptionPane.showMessageDialog(null, "Input Nilai untuk Matriks A (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "Masukkan Matriks A [" + i + "][" + j + "]:");
                matrixA.get(i).add(Integer.parseInt(input));
            }
        }

        // Input data Matriks B (Ordo 2x2)
        JOptionPane.showMessageDialog(null, "Input Nilai untuk Matriks B (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixB.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "Masukkan Matriks B [" + i + "][" + j + "]:");
                matrixB.get(i).add(Integer.parseInt(input));
            }
        }

        // Menyusun tampilan output Matriks A dan B
        StringBuilder output = new StringBuilder("=== HASIL MATRIX ===\n\nMatriks A:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(matrixA.get(i).get(j)).append("  ");
            }
            output.append("\n");
        }

        output.append("\nMatriks B:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(matrixB.get(i).get(j)).append("  ");
            }
            output.append("\n");
        }

        // Tampilkan output via Message Dialog
        JOptionPane.showMessageDialog(null, output.toString());
    }
}