package ARRAY_2D;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int i;
		int j;
		String[][] cars = new String[3][3];

		cars[0][0] = "A";
		cars[0][1] = "B";
		cars[0][2] = "C";
		cars[1][0] = "D";
		cars[1][1] = "E";
		cars[1][2] = "F";
		cars[2][0] = "G";
		cars[2][1] = "H";
		cars[2][2] = "I";

		for (i = 0; i < cars.length; i++) {
			System.out.println();
			for (j = 0; j < cars.length; j++) {
				System.out.print(cars[i][j]);
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("You need to choose a letter. Click any key to continue");
		String letter = sc.next();

		while (i.isBlank()) {
			System.out.println("Enter the number of the row:");
			i = sc.nextInt();
		}
		while (j.isBlank()) {
			System.out.println("Enter the number of the column:");
			j = sc.nextInt();
		}
		System.out.println(cars[i][j]);
	}
}
