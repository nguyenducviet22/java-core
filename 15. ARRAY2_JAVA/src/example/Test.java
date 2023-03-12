package example;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arrA = {1, 6, 2, 4, 7, 3, 8, 5, 9};
		int[] arrB = new int[5];
		
		System.out.println("Origanal: " + Arrays.toString(arrA));
		//re-arrange
		Arrays.sort(arrA);
		System.out.println("After re-arranging:" + Arrays.toString(arrA));
		//search
		System.out.println(Arrays.binarySearch(arrA, 4));
		System.out.println(Arrays.binarySearch(arrA, -1));
		//fill values
		Arrays.fill(arrB, 5);
		System.out.println(Arrays.toString(arrB));
	}

}
