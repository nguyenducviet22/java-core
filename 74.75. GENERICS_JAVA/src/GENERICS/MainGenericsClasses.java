package GENERICS;

public class MainGenericsClasses {

	public static void main(String[] args) {
		
		MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
		MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,2.2);
		MyGenericClass<Character,String> myChar = new MyGenericClass<>('a',"Son");
		MyGenericClass<String,Character> myString = new MyGenericClass<>("Viet",'t');
		//open MyGenericClass to change hehe!!!

		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
	}

}
