package PHONES_WEB;

import java.util.ArrayList;
import java.util.Scanner;

public class Iphone {
	public void showIphones() {
		String name, ans;

		System.out.println("We have:");

		ArrayList<String> Iphone = new ArrayList<String>();
		Iphone.add("Iphone 14");
		Iphone.add("Iphone 13");
		Iphone.add("Iphone 12");
		Iphone.add("Iphone 11");

		for (int i = 0; i < Iphone.size(); i++) {
			System.out.println(Iphone.get(i));
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Which Iphone do you want?");
		name = sc.nextLine();
		System.out.println("Do you want " + name + "?");
		ans = sc.next();
		if (ans.equals("Yes")) {
//		if (ans == "Yes") {//how to use "=="???
			System.out.println("You bought this " + name);
		} else
			while (ans.equals("No")) {
//			while (ans == "No") {
				sc.nextLine();
				System.out.println("Choose one again:");
				name = sc.nextLine();
				System.out.println("Do you want " + name + "?");
				ans = sc.next();
				if (ans.equals("Yes")) {
//				if (ans == "Yes") {
					System.out.println("You bought Iphone " + name);
				}
			}
	}
}