package ENCAPSULATION;

public class MainEncapsulation {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Camaro", 2021);
		Car car2 = new Car("Vinfast", "Luxury", 2022);
		
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getName());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getName());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		

//		car1.setName("Vinfast");
//		car1.setModel("Luxury");
//		car1.setYear(2022);
//
//		System.out.println(car1.getName());
//		System.out.println(car1.getModel());
//		System.out.println(car1.getYear());

	}
}
