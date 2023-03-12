package Inherit;

public class Student extends Person{
	public int score;
	public String dad;
	
	Student(String name , String code, int birthday, int score){
		super(name, code, birthday);
		this.score = score;
	}
	public void score() {
	    System.out.println("Score \t\t: "+ this.score);
	}
	public void oriding() {
		System.out.println("I am Student");
	}
}