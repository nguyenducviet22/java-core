package A1_Programming_fundamental;

import java.util.Scanner;

public class Question_6 {
	public static double x, y, z;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value x: ");
		x = sc.nextDouble();
		System.out.print("Enter value y: ");
		y = sc.nextDouble();
		calculateValue(x, y);
		System.out.print("The value of z is " + z);
	}

	public static double calculateValue(double x, double y) {
		z = ((0.2 + Math.pow(x, 2) + y) / (3 * x + Math.pow(y, 5))) + 4.2;
		return z;
	}
}