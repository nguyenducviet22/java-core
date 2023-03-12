package OPEN_GUI_WINDOW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton btn = new JButton("New Window");

	LaunchPage() {

		btn.setBounds(100, 160, 200, 40);
		btn.setFocusable(false);
		btn.addActionListener(this);

		frame.add(btn);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.dispose();

		if (e.getSource() == btn) {
			NewWindow newWindow = new NewWindow();

		}

	}
}
