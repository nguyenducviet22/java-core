package LABEL;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JFrame {
	
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	ImageIcon image = new ImageIcon("th1.jpg");
	JLabel label = new JLabel();

	MyLabel() {
		
		label.setText("Hello, Duc Viet");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(Color.red);
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setIconTextGap(10);
		label.setBackground(Color.white);
		label.setOpaque(true); //display Background Color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(00, 00, 250, 250);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
//		this.setLayout(null);
		this.setVisible(true);
		this.add(label);
	}
}
