package LOGICAL_OPERATORS_JAVA;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		//||: or
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are playing the game");
		String button = sc.next();
		
		if (button.equals("q") || button.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You are playing the game");
		}
	}
}
