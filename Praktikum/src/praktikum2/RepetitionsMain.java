package praktikum2;

import java.util.Scanner;

public class RepetitionsMain {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int number;
			int a=0;
			
			System.out.print("Enter the number of looping:");
			number = input.nextInt();
			
			//Looping number
			System.out.println("]n==USE WHILE==");
			while (a < number) {
					System.out.print(a);
					a++;
			}
			
			System.out.println("==USE DO WHILE==");
			int b = 0;
			do {
					System.out.print(b);
					b++;
			}while (b<number);
			
			System.out.println("\n==USE FOR==");
			for (int c = 0; c<number; c++) {
					System.out.print(c);
			}
			
			input.close();
	}

}
