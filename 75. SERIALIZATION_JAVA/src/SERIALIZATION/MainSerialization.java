package SERIALIZATION;

import java.io.*;


public class MainSerialization {

	public static void main(String[] args) throws IOException {
		
		MySerialization user = new MySerialization();
		
		user.name = "Viet";
		user.password = "I<3U";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
		objOut.writeObject(user);
		objOut.close();
		fileOut.close();
		
		System.out.println("object info saved");
				
	}
}
