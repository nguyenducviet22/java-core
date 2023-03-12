package GENERICS;

public class MyGenericClass <Thing, Thing2> {//MainGenericsClass
//public class MyGenericClass <Thing extends Number, Thing2 extends Number> {
	
	Thing x;//First value
	Thing2 y;//Second value
	
	MyGenericClass(Thing x, Thing2 y){
		this.x = x;
		this.y = y;
	}
	public Thing getValue() {
		return x;
	}
}
