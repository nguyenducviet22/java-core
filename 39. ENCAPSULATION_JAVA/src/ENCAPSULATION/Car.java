package ENCAPSULATION;

public class Car {

	private String name;
	private String model;
	private int year;

	Car(String name, String model, int year) {
		this.setName(name);;
		this.setModel(model);;
		this.setYear(year);;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	public void copy(Car car1) {
		this.setName(car1.name);
		;
		this.setModel(car1.model);
		;
		this.setYear(car1.year);;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
