package EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter x:");
			int x = sc.nextInt();
			System.out.println("Enter y:");
			int y = sc.nextInt();
			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("Enter a number");
		} catch (Exception e) {
			System.out.println("Something has wrong");
		} finally {
			System.out.println("This will always print");
			sc.close();
		}
	}
}
