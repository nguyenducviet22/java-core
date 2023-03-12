package PHONES_WEB;

import java.util.Scanner;

public class Main_phone_web {
	static String name;

	public static void main(String[] args) {

		SmartPhones SPhones = new SmartPhones();
		SPhones.showPhones();

		Iphone Iphones = new Iphone();// Why do we delete static keyword in showIphone method???

		Samsung Samsungs = new Samsung();
		
		Realme Realmes = new Realme();

		OPPO OPPOs = new OPPO();

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one:");
		name = sc.nextLine();

		switch (name) {
		case "Iphone":// Where is the difference nameClass.nameMethod between nameVar.nameMethod?
			Iphones.showIphones();// This is nameVar.nameMethod
			break;

		case "Samsung":
			Samsungs.showSamsungs();
			break;

		case "Realme":
			Realmes.showRealmes();
			break;

		case "OPPO":
			OPPOs.showOPPOs();
			break;

		default:
			break;
		}
	}
}
