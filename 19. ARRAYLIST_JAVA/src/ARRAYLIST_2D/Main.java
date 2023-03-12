package ARRAYLIST_2D;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> foodList = new ArrayList();
		foodList.add("rice");
		foodList.add("vegies");
		foodList.add("meat");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("soda");
		drinkList.add("juice");
		
		ArrayList<String> kitchenList = new ArrayList();
		kitchenList.add("pan");
		kitchenList.add("pot");
		kitchenList.add("spoon");
		kitchenList.add("chopticks");
		
		groceryList.add(foodList);
		groceryList.add(drinkList);
		groceryList.add(kitchenList);
		
		System.out.println(groceryList.get(1).get(0));
	}
}
