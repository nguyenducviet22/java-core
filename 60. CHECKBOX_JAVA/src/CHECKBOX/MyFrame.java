package CHECKBOX;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JCheckBox checkBox = new JCheckBox();
	JButton btn = new JButton();
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(300, 150);
//		this.pack(); cannot setSize???
		this.setVisible(true);
		
		checkBox.setText("I am not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 25));
		
		btn.setText("Submit");
		btn.setFocusable(false);
		btn.addActionListener(this);
		
		this.add(checkBox);
		this.add(btn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btn) {
			System.out.println(checkBox.isSelected());
		}
		
	}

	
}
