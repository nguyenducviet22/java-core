package GUI_JAVA;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel {

	Border border = BorderFactory.createLineBorder(Color.green, 5);

	public void showLabels() {
//	MyLabel() {
		this.setText("Hello, Duc Viet");
//		this.setIcon(image0);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.TOP);
		this.setForeground(Color.red);
//		this.setForeground(new Color(0, 0, 0));
		this.setFont(new Font("MV Boli", Font.PLAIN, 20));
		this.setIconTextGap(10);
		this.setBackground(Color.white);
		this.setOpaque(true);
		this.setBorder(border);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setBounds(0, 0, 250, 250);
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("Main");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
//		frame.add(label);

		ImageIcon image0 = new ImageIcon("th1.jpg");
		this.setIcon(image0);
//		ImageIcon image = new ImageIcon("th.jpg");
//		this.setIconImage(image.getImage());
//		this.getContentPane().setBackground(new Color(0, 0, 0));
	}
}
