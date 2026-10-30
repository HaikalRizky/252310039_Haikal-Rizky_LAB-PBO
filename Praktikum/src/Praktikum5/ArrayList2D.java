package Praktikum5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
	public static void main (String[] args) {
		ArrayList<ArrayList<Integer>> angka = new ArrayList<>();
		angka.add(new ArrayList<Integer>()); // menambahkan row
		// akses ke paling baru + menambah nilai
		angka.getLast().add(10);
		
		// input langsung 
		angka.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		
		// output satu
		System.out.println(angka.get(0).get(0));
		
		// output semua
		for (int i = 0; i < angka.size(); i++) {
			for (int j = 0; j < angka.get(i).size(); j++) {
				System.out.print(angka.get(i).get(j)+ " ");
			}
			System.out.println();
	}

}
}
