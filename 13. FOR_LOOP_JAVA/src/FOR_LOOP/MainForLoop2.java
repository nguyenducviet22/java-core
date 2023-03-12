package FOR_LOOP;

import java.util.Scanner;

public class MainForLoop2 {
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ...(num): ");
		num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
