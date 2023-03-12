package GUI_JAVA;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Main2 {
	public static void main(String[] args) {
		ImageIcon image0 = new ImageIcon("th1.jpg");
		
		Border border = BorderFactory.createLineBorder(Color.green, 5);

		JLabel label = new JLabel();
		label.setText("Hello, Duc Viet");
		label.setIcon(image0);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(Color.red);
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setIconTextGap(10);
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(0, 0, 250, 250);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("Main");
//		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		frame.add(label);
		

		ImageIcon image = new ImageIcon("th.jpg");
		frame.setIconImage(image.getImage());
//		frame.getContentPane().setBackground(Color.blue);
		frame.getContentPane().setBackground(new Color(0, 0, 0));

//		MyFrame myFrame = new MyFrame();
//		MyLabel myLabel = new MyLabel();
//		
//		myFrame.showMyFrame();
//		myLabel.showLabels();
	}
}