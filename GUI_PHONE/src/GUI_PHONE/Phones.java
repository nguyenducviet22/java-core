package GUI_PHONE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Phones implements ActionListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton btn1 = new JButton("Iphone");
	JButton btn2 = new JButton("Samsung");
	JButton btn3 = new JButton("Realme");
	JButton btn4 = new JButton("OPPO");

	Phones() {
		
		label.setText("Choose one:");
		label.setBounds(0, 0, 100, 100);

		btn1.setBounds(0, 0, 200, 50);//Cannot use the bounds when have Flowlayout
		btn1.setFocusable(false);
		btn1.addActionListener(this);
		
		btn2.setBounds(100, 100, 200, 50);
		btn2.setFocusable(false);
		btn2.addActionListener(this);
		
		btn3.setBounds(100, 100, 200, 50);
		btn3.setFocusable(false);
		btn3.addActionListener(this);
		
		btn4.setBounds(100, 100, 200, 50);
		btn4.setFocusable(false);
		btn4.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));//!!!
		frame.setVisible(true);
		frame.setBackground(Color.red);
//		frame.add(new JButton("Iphone"));
//		frame.add(new JButton("Samsung"));
//		frame.add(new JButton("Realme"));
//		frame.add(new JButton("OPPO"));
		
		frame.add(label);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.dispose();
		
		if (e.getSource() == btn1) {
			Iphone iphone = new Iphone();
		}
		
		if (e.getSource() == btn2) {
			Samsung samsung = new Samsung();
		}
		
		if (e.getSource() == btn3) {
			Realme realme = new Realme();
		}
		
		if (e.getSource() == btn4) {
			OPPO oppo = new OPPO();
		}

	}
}
