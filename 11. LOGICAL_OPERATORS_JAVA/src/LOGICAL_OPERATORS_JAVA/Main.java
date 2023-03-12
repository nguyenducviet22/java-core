package LOGICAL_OPERATORS_JAVA;

public class Main {
	public static void main(String[] args) {
		//&&: and
		
		int temp = 100;
		if (temp > 32) {
			System.out.println("It is hot outside");
		} else if (temp >= 20 && temp <= 32) {
			System.out.println("It is warm outside");
		} else {
			System.out.println("It is cold outside");
		} 
	}
}
