package GUI_JAVA;

import java.util.*;

import javax.swing.*;

public class Main3 {
	public static void main(String[] args) {
		String name, phone, ans;

		ArrayList<String> phones = new ArrayList();
		phones.add("Iphone");
		phones.add("Samsung");
		phones.add("Realme");
		phones.add("Oppo");

		name = JOptionPane.showInputDialog("Enter your brand: " + phones);
		///////////////////////////////////////////////////////
		if (name.equals("Iphone")) {
			ArrayList<String> Iphone = new ArrayList<String>();
			Iphone.add("Iphone 14");
			Iphone.add("Iphone 13");
			Iphone.add("Iphone 12");
			Iphone.add("Iphone 11");

			name = JOptionPane.showInputDialog("Enter kind of Iphone" + Iphone);
			ans = JOptionPane.showInputDialog("Do you want Iphone " + name);
			if (ans.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "You bought " + name);
			} else {
				while (ans.equals("No")) {
					name = JOptionPane.showInputDialog("Choose again: " + Iphone);
					ans = JOptionPane.showInputDialog("Do you want Iphone" + name);
					if (ans.equals("Yes")) {
						JOptionPane.showMessageDialog(null, "You bought Iphone " + name);
					}
				}
			}
		}
		//////////////////////////////////////////////////////////////
		if (name.equals("Samsung")) {

			ArrayList<String> Samsung = new ArrayList<String>();
			Samsung.add("Samsung 14");
			Samsung.add("Samsung 13");
			Samsung.add("Samsung 12");
			Samsung.add("Samsung 11");

			name = JOptionPane.showInputDialog("Enter your kind of Samsung " + Samsung);
			ans = JOptionPane.showInputDialog("Do you want " + name);
			if (ans.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "You bought " + name);
			} else {
				while (ans.equals("No")) {
					name = JOptionPane.showInputDialog("Choose again: " + Samsung);
					ans = JOptionPane.showInputDialog("Do you want " + name);
					if (ans.equals("Yes")) {
						JOptionPane.showMessageDialog(null, "You bought Samsung " + name);
					}
				}
			}
		}

	}
}