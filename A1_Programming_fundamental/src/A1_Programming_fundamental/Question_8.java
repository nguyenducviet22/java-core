package A1_Programming_fundamental;

import java.util.Scanner;

public class Question_8 {
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = sc.nextInt();
		result = Square.calcSquare(x);
		System.out.println("The square of " + x + " is " + result);
	}
}

class Square {
	public static int calcSquare(int x) {
		int result = (int) Math.pow(x, 2);
		return result;
	}
}