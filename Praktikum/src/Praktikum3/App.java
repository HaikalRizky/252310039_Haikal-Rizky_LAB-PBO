package Praktikum3;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama, npm;
		int umur;
		
		int confirm = 0;
		
		do {
			nama = jop.showInputDialog(
					null, 
					"Masukkan nama anda",
					"Input",
					JOptionPane.QUESTION_MESSAGE
					);
			confirm = jop.showConfirmDialog(
					null, 
					"Apakah anda yakin nama anda " + nama
					);
			if (confirm == 2) {
				return;
			}
		} while (confirm != 0);
		
		npm = jop.showInputDialog(
				null, 
				"Input NPM", 
				"242310010"
				);
		
		umur = Integer.parseInt(jop.showInputDialog(null, "Input umur"));
		
		String output = "Nama: " + nama + "\n" +
						"NPM: " + npm + "\n" +
						"Umur: " + umur;
		
		jop.showMessageDialog(null, output, "Biodata", jop.WARNING_MESSAGE);
	}
}