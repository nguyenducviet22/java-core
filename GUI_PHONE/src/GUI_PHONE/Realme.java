package GUI_PHONE;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Realme {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Realme");
	
	Realme(){
		
		label.setBounds(0, 0, 100, 50);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Realme");
		
		frame.add(label);
		
	}
}
