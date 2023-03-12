package FILE;

import java.io.File;

public class MainFile {

	public static void main(String[] args) {
		
		File file = new File("secret_message.txt");
		
		if (file.exists()) {
			System.out.println("The file exists");
		} else {
			System.out.println("The file doesn't exist");
		}
	}
}
