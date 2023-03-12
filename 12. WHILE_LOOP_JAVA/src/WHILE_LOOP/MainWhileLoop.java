package WHILE_LOOP;

import java.util.Scanner;

public class MainWhileLoop {
	public static void main(String[] args) {
		// while loop= executes a block of code as long as its condition remains true
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
//		int n = Integer.parseInt(age); can not convert String into age

		while (name.isBlank()) {
			System.out.println("Enter your name:");
			name = sc.nextLine();
		}
		do {
			System.out.println("Enter your age:");
			age = sc.nextInt();
		}
		while (age > 0);
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println(age + 5);
	}
}