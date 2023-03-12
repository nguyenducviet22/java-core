package PROGRESSBAR;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyProgressBar extends JFrame {

//	JProgressBar progress = new JProgressBar();
	JProgressBar progress = new JProgressBar(0, 100);

	MyProgressBar() {

		progress.setValue(0);
		progress.setBounds(0, 0, 500, 50);
		progress.setStringPainted(true);
		progress.setFont(new Font("MV Boli", Font.BOLD, 20));
		progress.setForeground(Color.red);
		progress.setBackground(Color.black);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(progress);
		fill();
	}

	public void fill() {

		int counter = 100;
//		while (counter <= 100) {
		while (counter > 0) {

			progress.setValue(counter);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter -= 1;
		}
		progress.setString("Done");
	}

}
