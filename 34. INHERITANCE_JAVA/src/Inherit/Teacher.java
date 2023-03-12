package Inherit;

public class Teacher extends Person{
	public int salary;
	public String oriding;

    Teacher(String name, String code, int birthday, int salary) {
        super(name, code, birthday);
        this.salary = salary;
    }
    public void salary() {
		System.out.println("Salary \t\t: "+ this.salary);
	}
    public void oriding() {
    	System.out.println("I am Teacher");
    }
}