package DESERIALIZATION;

import java.io.*;

public class MainDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		MyDeserialization user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\NGUYEN DUC VIET\\eclipse-workspace\\76. SERIALIZATION_JAVA\\UserInfo.ser");
		ObjectInputStream objIn = new ObjectInputStream(fileIn);
		user = (MyDeserialization) objIn.readObject();
		objIn.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	}

}
