package PHONES_WEB;

import java.util.ArrayList;
import java.util.Scanner;

public class Realme {
	public void showRealmes() {
		String name, ans;

		System.out.println("We have:");

		ArrayList<String> Realme = new ArrayList<String>();
		Realme.add("Realme 2");
		Realme.add("Realme 3");
		Realme.add("Realme 4");
		Realme.add("Realme 5");

		for (int i = 0; i < Realme.size(); i++) {
			System.out.println(Realme.get(i));
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Which Realme do you want?");
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
