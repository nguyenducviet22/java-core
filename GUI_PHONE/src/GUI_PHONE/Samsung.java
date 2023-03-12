package GUI_PHONE;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Samsung {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("We have: ");
	JButton btn1 = new JButton("Samsung 14");
	JButton btn2 = new JButton("Samsung 13");
	JButton btn3 = new JButton("Samsung 12");
	JButton btn4 = new JButton("Samsung 11");
	
	Samsung(){
		
		label.setBounds(0, 0, 100, 50);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setVisible(true);
		frame.setTitle("Samsung");
		
		frame.add(label);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
	}
}
