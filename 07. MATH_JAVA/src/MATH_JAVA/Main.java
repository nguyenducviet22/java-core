package MATH_JAVA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side x");
		double x = sc.nextDouble();
		System.out.println("Enter side y");
		double y = sc.nextDouble();
		
		double z = Math.sqrt(x*x+y*y);
		
		System.out.println("z is: "+z);
	}
}
