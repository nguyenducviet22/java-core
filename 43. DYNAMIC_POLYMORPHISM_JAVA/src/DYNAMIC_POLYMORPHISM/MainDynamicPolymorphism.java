package DYNAMIC_POLYMORPHISM;

import java.util.Scanner;

public class MainDynamicPolymorphism {

	public static void main(String[] args) {

		Animal animal;
		Scanner sc = new Scanner(System.in);
		System.out.println("What animal do you want?");
		System.out.println("1=dog or 2=cat");
		int choice = sc.nextInt();

		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
	}
}
