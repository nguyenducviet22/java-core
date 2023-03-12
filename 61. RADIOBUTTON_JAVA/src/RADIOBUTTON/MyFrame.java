package RADIOBUTTON;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton banhMiBtn = new JRadioButton("Banh mi");
	JRadioButton phoBtn = new JRadioButton("Pho");
	JRadioButton banhXeoBtn = new JRadioButton("Banh xeo");
	ButtonGroup group = new ButtonGroup();
	ImageIcon phoIcon = new ImageIcon("pho.jpg");
	ImageIcon banhMiIcon = new ImageIcon("banhmi.jpg");
	ImageIcon banhXeoIcon = new ImageIcon("banhxeo.jpg");

	MyFrame() {
		
		group.add(banhMiBtn);
		group.add(banhXeoBtn);
		group.add(phoBtn);
		
		banhMiBtn.addActionListener(this);
		phoBtn.addActionListener(this);
		banhXeoBtn.addActionListener(this);
		
		phoBtn.setIcon(phoIcon);
		banhMiBtn.setIcon(banhMiIcon);
		banhXeoBtn.setIcon(banhXeoIcon);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 100);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(banhMiBtn);
		this.add(banhXeoBtn);
		this.add(phoBtn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == banhMiBtn) {
			System.out.println("you ordered banh mi");
		} else if (e.getSource() == banhXeoBtn) {
			System.out.println("you ordered banh xeo");
		} else if (e.getSource() == phoBtn) {
			System.out.println("you ordered pho");
		}

	}

}
