package METHOD_JAVA;

import java.util.Scanner;

public class Main_method {
//	public static void main(String[] args) {
//		int c = 3, d = 5;
//		multiply(4, 5);
//		int z = add(c, d);
//		System.out.println(z);
//		welcome();
//	}
//
//	public static void multiply(int a, int b) {
//		System.out.println(a * b);
//	}
//
//	public static int add(int c, int d) {
//		int z = c + d;
//		return z;
//	}
//
//	public static void welcome() {
//		System.out.println("Welcome!!!");
//	}

	public static void main(String args[]) {
		int num1 = getNum();
		int num2 = getNum();
		int num3 = getNum();
//		getNum(num1, num2, num3);
		int total = num1 + num2 + num3;
		System.out.println("Total = " + total);
	}

	public static int getNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int z = sc.nextInt();
		return z;
	}
}