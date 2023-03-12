package PHONES_WEB;

import java.util.ArrayList;
import java.util.Scanner;

public class OPPO {
	public void showOPPOs() {
		String name, ans;

		System.out.println("We have:");

		ArrayList<String> OPPO = new ArrayList<String>();
		OPPO.add("OPPO 2");
		OPPO.add("OPPO 3");
		OPPO.add("OPPO 4");
		OPPO.add("OPPO 5");

		for (int i = 0; i < OPPO.size(); i++) {
			System.out.println(OPPO.get(i));
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Which OPPO do you want?");
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
