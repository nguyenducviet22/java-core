package DESERIALIZATION;

import java.io.Serializable;

public class MyDeserialization implements Serializable {

	String name;
	String password;

	public void sayHello() {
		System.out.println("Hello" + name);
	}

}
