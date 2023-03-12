package PHONES_WEB;

import java.util.ArrayList;
import java.util.Scanner;

public class Samsung {
	public void showSamsungs() {
		String name, ans;

		System.out.println("We have:");

		ArrayList<String> Samsung = new ArrayList<String>();
		Samsung.add("Samsung 2");
		Samsung.add("Samsung 3");
		Samsung.add("Samsung 4");
		Samsung.add("Samsung 5");

		for (int i = 0; i < Samsung.size(); i++) {
			System.out.println(Samsung.get(i));
		}

		Scanner sc = new Scanner(System.in);
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
