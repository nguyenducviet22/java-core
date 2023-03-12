package COMBOBOX_;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	String[] animals = {"dog", "cat", "bird"};
	JComboBox comboBox = new JComboBox(animals);
	
	MyFrame(){
		
		comboBox.addActionListener(this);
		comboBox.addItem("horse");
		comboBox.insertItemAt("pig", 0);
		comboBox.setSelectedIndex(0);
		comboBox.removeItem("cat");
		comboBox.removeItemAt(1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(300, 300);
//		this.pack(); for what???
		this.setVisible(true);
		this.add(comboBox);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
		
	}

}
