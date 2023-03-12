package DGRAPHICS;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyPanel panel = new MyPanel();
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
		
	}

}
