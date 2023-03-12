package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone1 {
	static String name, ans;

	public static void main(String[] args) {

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
		name = sc.nextLine();
		System.out.println("Did you choose " + name + "?");
		ans = sc.nextLine();

		if (ans.equals("Yes")) {
			System.out.println("You bought " + name);
		} else
			while (ans.equals("No")) {
				System.out.println("Choose one again:");
				name = sc.next();
				System.out.println("Did you choose " + name + "?");
				ans = sc.next();
				if (ans.equals("Yes")) {
						System.out.println("You bought " + name);
				} // Chay cho den khi Yes thi thuiii
			}
	}
}
