package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_phone2 {
	public static void main(String[] args) {
		String name;
		String ans;
		ArrayList<String> phones = new ArrayList<String>();

		phones.add("Iphone");
		phones.add("Samsung");
		phones.add("Nokia");
		phones.add("OPPO");

		phones.set(2, "Realme");

		for (int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i));// forget 1
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose phone:");
		name = sc.next();
		////////////////////////////////////////////////////////////////////
		if (name.equals("Iphone")) {
			System.out.println("We have:");

			ArrayList<String> Iphone = new ArrayList<String>();
			Iphone.add("Iphone 14");
			Iphone.add("Iphone 13");
			Iphone.add("Iphone 12");
			Iphone.add("Iphone 11");

			for (int i = 0; i < Iphone.size(); i++) {
				System.out.println(Iphone.get(i));
			}

			sc.nextLine();
			System.out.println("Which Iphone do you want?");
			name = sc.nextLine();
			System.out.println("Do you want " + name + "?");
			ans = sc.next();
			if (ans.equals("Yes")) {
				System.out.println("You bought this " + name);
			} else
				while (ans.equals("No")) {
					sc.nextLine();
					System.out.println("Choose one again:");
					name = sc.nextLine();
					System.out.println("Do you want " + name + "?");
					ans = sc.next();
					if (ans.equals("Yes")) {
						System.out.println("You bought this " + name);
					}
				}
		}
		/////////////////////////////////////////////////////////////////////////
		if (name.equals("Samsung")) {
			System.out.println("We have:");

			ArrayList<String> Samsung = new ArrayList<String>();
			Samsung.add("Samsung 2");
			Samsung.add("Samsung 3");
			Samsung.add("Samsung 4");
			Samsung.add("Samsung 5");

			for (int i = 0; i < Samsung.size(); i++) {
				System.out.println(Samsung.get(i));
			}

			sc.nextLine();
			System.out.println("Which Samsung do you want?");
			name = sc.nextLine();
			System.out.println("Do you want " + name + "?");
			ans = sc.next();
			if (ans.equals("Yes")) {
				System.out.println("You bought this " + name);
			} else
				while (ans.equals("No")) {
					sc.nextLine();
					System.out.println("Choose one again:");
					name = sc.nextLine();
					System.out.println("Do you want " + name + "?");
					ans = sc.next();
					if (ans.equals("Yes")) {
						System.out.println("You bought this " + name);
					}

				}
		}
	}
}