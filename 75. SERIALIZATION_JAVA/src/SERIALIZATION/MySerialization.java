package SERIALIZATION;

import java.io.Serializable;

public class MySerialization implements Serializable{

	String name;
	String password;

	public void sayHello() {
		System.out.println("Hello" + name);
	}

}
