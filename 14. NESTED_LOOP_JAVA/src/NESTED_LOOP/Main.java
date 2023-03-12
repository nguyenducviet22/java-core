package NESTED_LOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter y of columns:");
		int columns = sc.nextInt();
		System.out.println("Enter x of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter symbol to use:");
		String symbol = sc.next();
		
		for (int i = 1; i <= columns; i++) {
			System.out.print(symbol);
			}
		for (int j = 1; j <= rows; j++) {
				System.out.println(symbol);
			}
	}
}