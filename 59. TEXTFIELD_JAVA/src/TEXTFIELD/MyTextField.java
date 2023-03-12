package TEXTFIELD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextField extends JFrame implements ActionListener {

	JButton btn = new JButton("Submit");
	JTextField textField = new JTextField();

	MyTextField() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);

		btn.addActionListener(this);

		textField.setPreferredSize(new Dimension(350, 40));
		textField.setText("Delete and enter username");
		textField.setFont(new Font("Consolas", Font.PLAIN, 20));
		textField.setForeground(Color.red);
		textField.setBackground(Color.lightGray);
		textField.setCaretColor(Color.black);
		
		this.add(textField);
		this.add(btn);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			System.out.println("Welcome " + textField.getText());
		}

	}

}
