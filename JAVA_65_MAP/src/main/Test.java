package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------");
			System.out.println("1. Put a word");
			System.out.println("2. Remove a word");
			System.out.println("3. Search a word");
			System.out.println("4. Print all words");
			System.out.println("5. Count all words");
			System.out.println("6. Delete all words");
			System.out.println("0. Exit the program");
			System.out.println("Choose one: ");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Enter the word: ");
				String word = sc.nextLine();
				System.out.println("Enter the meaning: ");
				String meaning = sc.nextLine();
				tm.putWord(word, meaning);
			} else if (choice == 2 || choice == 3) {
				System.out.println("Enter the word: ");
				String word = sc.nextLine();
				if (choice == 2) {
					tm.removeWord(word);
				} else {
					System.out.println("This word means " + tm.searchWord(word));
				}
			}
			if (choice == 4) {
				tm.printAllWords();
			} else if (choice == 5) {
				System.out.println("The number of words are: " + tm.countWord());
			} else if(choice ==6) {
				tm.deleteAll();
			}

		} while (choice != 0);
	}

}
