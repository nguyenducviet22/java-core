package GUI_JAVA;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	JLabel label = new JLabel();

	public void showMyFrame() {
//	MyFrame() { 
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Main");
//		this.setResizable(false);
		this.add(label); // Why???

		ImageIcon image = new ImageIcon("th.jpg");
		this.setIconImage(image.getImage());
		// this.getContentPane().setBackground(Color.blue);
		this.getContentPane().setBackground(new Color(0, 0, 0));
	}
}