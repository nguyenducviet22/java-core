package ARRAYLIST;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("pho");
		food.add("banhmi");
		
		food.set(0, "bun");
		food.remove(1);
		food.clear();
		
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		 
	}
}
