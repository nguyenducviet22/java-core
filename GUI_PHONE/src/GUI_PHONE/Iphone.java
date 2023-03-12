package GUI_PHONE;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Iphone {

	JFrame frame = new JFrame();
	
	JLabel label = new JLabel();
	
	JButton btn1 = new JButton("Iphone 11");
	JButton btn2 = new JButton("Iphone 12");
	JButton btn3 = new JButton("Iphone 13");
	JButton btn4 = new JButton("Iphone 14");
	
	ImageIcon img1 = new ImageIcon("Iphone 11.jpg");
//	ImageIcon img2 = new ImageIcon("Iphone 12.jpg");
//	ImageIcon img3 = new ImageIcon("Iphone 13.jpg");
//	ImageIcon img4 = new ImageIcon("Iphone 14.jpg");

	Iphone() {
		
		label.setText("We have: ");
		label.setBounds(0, 0, 100, 50);
		
		label.setIcon(img1);
		
		Image img01 = img1.getImage();
		Image modifiedImage = img01.getScaledInstance(10, 20, java.awt.Image.SCALE_SMOOTH);
		img1 = new ImageIcon(modifiedImage);
		
		btn1.setBounds(50, 50, 100, 50);
		btn1.setFocusable(false);

		btn2.setBounds(150, 50, 100, 50);
		btn2.setFocusable(false);
		
		btn3.setBounds(250, 50, 100, 50);
		btn3.setFocusable(false);
		
		btn4.setBounds(350, 50, 100, 50);
		btn4.setFocusable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setVisible(true);
		frame.setTitle("Iphone");
		
		frame.add(label);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
	}
}
