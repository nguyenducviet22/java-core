package PANELS;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JFrame {

	ImageIcon image = new ImageIcon("th.jpg");
	JLabel label = new JLabel();
	JPanel redPanel = new JPanel();
	JPanel bluePanel = new JPanel();
	JPanel greenPanel = new JPanel();

	MyPanel() {

		label.setIcon(image);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(250, 0, 100, 100);

		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 600, 200);
		redPanel.add(label);
		redPanel.setLayout(null);

		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 200, 600, 200);
//		bluePanel.add(label);
//		bluePanel.setLayout(null);

		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 400, 600, 200);
//		greenPanel.add(label);
//		greenPanel.setLayout(null);

		this.setVisible(true);
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(redPanel);
		this.add(bluePanel);
		this.add(greenPanel);
//		redPanel.add(label);
//		greenPanel.add(label);
	}
}
