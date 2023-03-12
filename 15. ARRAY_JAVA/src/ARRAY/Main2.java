package ARRAY;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String[] cars = new String[4]; // {"Camaro", "Corvette", "Tesla", "BMW"};

		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
		cars[3] = "BMW";

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("What kinds of cars do you want to choose:");
		String car = sc.next();

		System.out.println("You bought this " + car + " car. Congratulations!!!");
	}
}
