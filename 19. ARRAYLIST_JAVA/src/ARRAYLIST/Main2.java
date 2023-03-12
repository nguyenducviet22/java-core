package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String name;
		String ans;
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Camaro");
		cars.add("Corvette");
		cars.add("Tesla");
		cars.add("BMW");

		cars.set(0, "Vinfast");

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose one:");
		name = sc.next();
		System.out.println("Did you choose " + name + "?");
		ans = sc.next();
		if (ans.equals("Yes")) {
			System.out.println("You bought this " + name + " car. Congratulations");
		} else
			while (ans.equals("No")) {
				System.out.println("Choose one again:");
				name = sc.next();
				System.out.println("Did you choose " + name + "?");
				ans = sc.next();
				if (ans.equals("Yes")) {
					System.out.println("You bought this " + name + " car. Congratulations");
				}
			}
	}
}