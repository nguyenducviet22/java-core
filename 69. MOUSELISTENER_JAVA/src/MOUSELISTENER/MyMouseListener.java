package MOUSELISTENER;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener extends JFrame implements MouseListener {
	
	JLabel label = new JLabel();
	
	MyMouseListener(){
		
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.add(label);
		this.setVisible(true);
//		this.add(label);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("You clicked the mouse");
//		label.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("You pressed the mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("You released the mouse");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("You entered the mouse");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("You exited the mouse");
		label.setBackground(Color.red);
	}

}
