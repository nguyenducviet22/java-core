package Inherit;

public class Person {
	public String name;
    public String code;
    public int birthday;
    public String oriding; //Overriding
    
    //Constructor
    Person(String name , String code , int birthday){
        this.name = name;
        this.code = code;
        this.birthday = birthday;
        
    }
    public void name(){
    	System.out.println("Name \t\t: "+ this.name);
    }
    public void code(){
    	System.out.println("Code \t\t: "+ this.code);
    }
    public void year(){
    	System.out.println("year \t\t: "+ this.birthday);
    }
    public void oriding() {
    	System.out.println("I am Person");
    }
}