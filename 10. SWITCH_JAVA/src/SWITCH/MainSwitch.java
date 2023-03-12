package SWITCH;

import java.util.Scanner;

public class MainSwitch {// a statement that allow a variable to be tested for equality against a list of
							// values

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day:");
		String day = sc.nextLine();

		switch (day) {
		case "Monday":
			System.out.println("It is Monday");
			break;
		case "Tuesday":
			System.out.println("It is Tuesday");
			break;
		case "Wednesday":
			System.out.println("It is Wednesday");
			break;
		case "Thursday":
			System.out.println("It is Thursday");
			break;
		default:
			break;
		}
	}
}
