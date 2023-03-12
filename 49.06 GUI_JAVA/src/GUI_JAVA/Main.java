package GUI_JAVA;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {// RESIZE THE IMAGE???

		JLabel label = new JLabel();
		
		ImageIcon dabIcon = new ImageIcon("Phone 11.jpg");

		Image dabImage = dabIcon.getImage();
//		Image modifiedImage = dabImage.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		Image modifiedImage = dabImage.getScaledInstance(10, 20, Image.SCALE_SMOOTH);
		dabIcon = new ImageIcon(modifiedImage);
		label.setIcon(dabIcon);

		JOptionPane.showMessageDialog(null, "Hello", "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);

//		String name = JOptionPane.showInputDialog("Enter your name");
//		JOptionPane.showMessageDialog(null, "Hello "+ name);
//		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//		JOptionPane.showMessageDialog(null, "You are "+age+ " years old");
//		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//		JOptionPane.showMessageDialog(null, "You are "+height+ " m tall");
	}
}
