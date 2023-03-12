package OVERLOADED;

import java.util.Scanner;

public class Main_OVERLOADED {
	public static void main(String[] args) {
		System.out.println("Sum of " + overloadedMethod(1, 2, 4));
	}

	static int overloadedMethod(int a, int b) {
		System.out.println("This is overloaded method 1");
		return a + b;
	}

	static int overloadedMethod(int a, int b, int c) {
		System.out.println("This is overloaded method 2");
		return a + b + c;
	}

	static int overloadedMethod(int a, int b, int c, int d) {
		System.out.println("This is overloaded method 3");
		return a + b + c + d;
	}
}
