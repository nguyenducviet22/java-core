package COLORCHOOSER;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyColorChooser extends JFrame implements ActionListener{
	
	JLabel label = new JLabel("Nguyen Duc Viet");
	JButton btn = new JButton("Choose color");
	
	MyColorChooser(){
		
		btn.addActionListener(this);
		
		label.setBackground(Color.black);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setOpaque(true);
		
		this.add(btn);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "COLOR", Color.red);
			
			label.setForeground(color);
//			label.setBackground(color);
		}
		
	}

}
