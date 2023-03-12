package GENERICS;

public class MainGenericsMethods {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3 };
		Character[] charArray = { 'a', 'b', 'c' };
		String[] stringArray = { "Viet", "Son" };

		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));

	}

	public static <Thing> void displayArray(Thing[] array) {
		for (Thing thing : array) {
			System.out.print(thing + " ");//First
		}
		System.out.println();//Later
	}
	
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[1];
	}

}
