package POLYMORPHISM;

public class MainPolymorphism {

	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();

		Vehicle[] vehicle = { car, bicycle, boat };

		for (Vehicle x : vehicle) {
			x.go();
		}

	}

}
