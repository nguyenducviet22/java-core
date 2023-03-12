package Inherit;

public class Main {
	public static void main(String[] args) {
		
//		Person Human = new Person("Hello", "H003", 2030);
		
		Student StudentOne = new Student("Peter", "ST001", 2004, 10);
		
		Teacher TeacherOne = new Teacher("Mr Harry", "TC002", 1979, 20000000);
		
		//Constructor
		StudentOne.name();
		StudentOne.code();
		StudentOne.year();
//		StudentOne.score();
		
		TeacherOne.name();
		TeacherOne.code();
		TeacherOne.year();
//		TeacherOne.salary();
		
		//Overriding
		StudentOne.oriding();
		TeacherOne.oriding();
    }
}