package NESTED_LOOP;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x columns:");
		int columns = sc.nextInt();
		System.out.println("Enter y rows");
		int rows = sc.nextInt();
		System.out.println("Enter symbol to use:");
		String symbol = sc.next();
		
		for (int i = 0; i < columns; i++) {
			System.out.println();
			for (int j = 0; j < rows; j++) {
				System.out.print(symbol);
			}
		}
	}
}
