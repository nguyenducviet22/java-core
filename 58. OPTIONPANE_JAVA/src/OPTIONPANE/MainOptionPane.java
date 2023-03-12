package OPTIONPANE;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainOptionPane {

	public static void main(String[] args) {

		JOptionPane optPane = new JOptionPane();

//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some questions", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some warning info", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some errors", "title", JOptionPane.ERROR_MESSAGE);
//
//		JOptionPane.showConfirmDialog(null, "Are you sure???", "title", JOptionPane.YES_NO_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name?");
//		System.out.println("Hello " + name + " , have a happy day:))");
		
		String[] responses = {"Alright", "Definitely", "True"};
		ImageIcon icon = new ImageIcon("Iphone 14.jpg");
		JOptionPane.showOptionDialog(null, 
				"You are awesome", 
				"secret message", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.WARNING_MESSAGE, 
				icon, 
				responses, 
				0);
	}
}
