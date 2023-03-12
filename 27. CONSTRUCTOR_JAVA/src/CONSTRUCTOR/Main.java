package CONSTRUCTOR;

public class Main {
	public static void main(String[] args) {
		
		Human human1 = new Human("Viet", 18, 1.65);
		Human human2 = new Human("Son", 18, 1.7);
		
		System.out.println(human2.name);
		
		human2.eat();
		human1.drink();
	}
}