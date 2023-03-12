package ANIMATION;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener {

	final int WIDTH = 500;
	final int HEIGHT = 500;
	Image alien;
	Image earth;
	Timer timer;
	int xVilocity = 2;
	int yVilocity = 1;
	int x = 0;
	int y = 0;

	MyPanel() {

		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setBackground(Color.black);
//		this.setOpaque(true);
		alien = new ImageIcon("alien.png").getImage();
		earth = new ImageIcon("earth.png").getImage();
		timer = new Timer(10, this);
		timer.start();

	}

	public void paint(Graphics g) {

		super.paint(g);// paint background

		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(earth, 0, 0, null);
		g2D.drawImage(alien, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (x >= WIDTH - alien.getWidth(null) || x < 0) {
			xVilocity = xVilocity * -1;
		}
		x = x + xVilocity;
		if (y >= HEIGHT - alien.getHeight(null) || y < 0) {
			yVilocity = yVilocity * -1;
		}
		y = y + yVilocity;
		repaint();

	}

}
