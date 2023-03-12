package PHONES_WEB;

import java.util.ArrayList;

public class SmartPhones {
	String name, ans;

	public void showPhones() {

		ArrayList<String> phones = new ArrayList<String>();

		phones.add("Iphone");
		phones.add("Samsung");
		phones.add("Nokia");
		phones.add("OPPO");

		phones.set(2, "Realme");

		for (int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i));// forget 1
		}
	}
}
