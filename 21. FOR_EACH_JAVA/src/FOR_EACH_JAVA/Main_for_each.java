package FOR_EACH_JAVA;

import java.util.ArrayList;

public class Main_for_each {
	public static void main(String[] args) {
//		String[] animals = {"cat", "dog", "rat"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		
		for (String animal : animals) {
			System.out.println(animal);
		}
	}
}
