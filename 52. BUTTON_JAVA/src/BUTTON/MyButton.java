package BUTTON;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton extends JFrame implements ActionListener{

	JButton btn = new JButton();

	MyButton() {

		btn.setBounds(150, 100, 200, 50);
		btn.addActionListener(this);
		btn.setText("I am not a robot");
		btn.setFocusable(false);

		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(btn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			System.out.println("poo");
		}
		
	}

}
