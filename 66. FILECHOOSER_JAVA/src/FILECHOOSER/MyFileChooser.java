package FILECHOOSER;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFileChooser extends JFrame implements ActionListener{
	
	JButton btn = new JButton("Select File");
	
	MyFileChooser(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		btn.addActionListener(this);
		
		this.add(btn);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.showOpenDialog(null);//select file to open
			fileChooser.showSaveDialog(null);//select file to save
		}
		
	}

}
