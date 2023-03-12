package Split;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String s ="Hello everyone, my name is Harry. Nice to meet you";
		
		String[] arrA = s.split(" ");
		System.out.println(Arrays.toString(arrA));
		
		String[] arrB = s.split(",");
		System.out.println(Arrays.toString(arrB));
		
		String[] arrC = s.split("\\.|\\,");
		System.out.println(Arrays.toString(arrC));
		
		String fullName = "Harry Poter";
		String[] arrD = fullName.split(" ");
		System.out.println(Arrays.toString(arrD));
		System.out.println("First Name: " + arrD[arrD.length-1]);
	}
}
