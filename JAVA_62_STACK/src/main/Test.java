package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> st = new Stack<String>();
//		st.push("values"); put values into stack
//		st.pop(); take values out and delete from stack
//		st.peek(); take values out but do not delete from stack
//		st.clear(); delete all values from stack
//		st.contains("values"); check "values" whether exist or not
		
		System.out.println("Enter a chain of words: ");
		String words = sc.nextLine();
		for (int i = 0; i < words.length(); i++) {
			st.push(words.charAt(i) + "");
		}
		System.out.println("Reverse string: ");
		for (int i = 0; i < words.length(); i++) {
			System.out.print(st.pop());
		}
		System.out.println();
		
		Stack<Integer> in = new Stack<Integer>();
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		while (number>0) {
			int remain = number%2;
			in.push(remain);
			number = number/2;
		}
		System.out.println("So nhi phan: ");
		for (int i = 0; i < words.length(); i++) {
			System.out.print(in.pop());
		}
	}
}
