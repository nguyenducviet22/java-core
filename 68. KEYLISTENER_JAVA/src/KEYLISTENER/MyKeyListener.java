package KEYLISTENER;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyListener extends JFrame implements KeyListener {

	JLabel label = new JLabel();
	ImageIcon image = new ImageIcon("rocket.jpg");

	MyKeyListener() {

		label.setBounds(0, 0, 500, 500);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		label.setIcon(image);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);
		this.setVisible(true);
		this.addKeyListener(this);
		this.add(label);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX() - 10, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 'd':
			label.setLocation(label.getX() + 10, label.getY());
			break;
		case 's':
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37:
			label.setLocation(label.getX() - 10, label.getY());
			break;
		case 38:
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 39:
			label.setLocation(label.getX() + 10, label.getY());
			break;
		case 40:
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());

	}

}
