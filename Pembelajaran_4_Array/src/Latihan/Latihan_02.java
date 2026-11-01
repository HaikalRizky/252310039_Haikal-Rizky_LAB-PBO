package Latihan;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan_02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixC = new ArrayList<>();

        // Input Matriks A
        JOptionPane.showMessageDialog(null, "Input Nilai untuk Matriks A (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "Masukkan Matriks A [" + i + "][" + j + "]:");
                matrixA.get(i).add(Integer.parseInt(input));
            }
        }

        // Input Matriks B
        JOptionPane.showMessageDialog(null, "Input Nilai untuk Matriks B (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixB.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "Masukkan Matriks B [" + i + "][" + j + "]:");
                matrixB.get(i).add(Integer.parseInt(input));
            }
        }

        // Perkalian Matriks C = A * B
        for (int i = 0; i < 2; i++) {
            matrixC.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                int total = 0;
                for (int k = 0; k < 2; k++) {
                    total += matrixA.get(i).get(k) * matrixB.get(k).get(j);
                }
                matrixC.get(i).add(total);
            }
        }

        // Menyusun tampilan hasil
        StringBuilder output = new StringBuilder("=== PERKALIAN MATRIX (C = A * B) ===\n\nMatriks C:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(matrixC.get(i).get(j)).append("  ");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
