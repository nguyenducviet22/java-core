package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("----------------");
			System.out.println("1. Add a ticket");
			System.out.println("2. Delete a ticket");
			System.out.println("3. Check whether or not a ticket exists");
			System.out.println("4. Delete all tickets");
			System.out.println("5. Count all tickets");
			System.out.println("6. Print all tickets");
			System.out.println("7. Draw the winner");
			System.out.println("0. Exit the program");
			System.out.println("Choose one: ");
			choice = sc.nextInt();
			sc.nextLine();
			//HashSet
//			if(choice == 1 || choice == 2 || choice == 3) {
//				System.out.println("Enter ticket code: ");
//				String value = sc.nextLine();
//				if (choice == 1) {
//					hs.addTicket(value);
//				} else if (choice == 2) {
//					hs.deleteTicket(value);
//				} else {
//					System.out.println("The result is exist: " + hs.checkExist(value));
//				}
//			} else if(choice == 4) {
//				hs.deleteAll();
//			} else if(choice == 5) {
//				System.out.println("The number of tickets are: " + hs.countTiclet());
//			} else if(choice ==6) {
//				hs.printTicket();
//			} else if(choice ==7) {
//				System.out.println("The won ticket code are: " + hs.drawTicket());
//			}
			//End HashSet
			//TreeSet
			if(choice == 1 || choice == 2 || choice == 3) {
				System.out.println("Enter ticket code: ");
				String value = sc.nextLine();
				if (choice == 1) {
					ts.addTicket(value);
				} else if (choice == 2) {
					ts.deleteTicket(value);
				} else {
					System.out.println("The result is exist: " + ts.checkExist(value));
				}
			} else if(choice == 4) {
				ts.deleteAll();
			} else if(choice == 5) {
				System.out.println("The number of tickets are: " + ts.countTiclet());
			} else if(choice ==6) {
				ts.printTicket();
			} else if(choice ==7) {
				System.out.println("The won ticket code are: " + ts.drawTicket());
			}
			//End TreeSet
		} while (choice != 0);
	}

}
