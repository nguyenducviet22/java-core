package MENUBAR;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu extends JFrame implements ActionListener {

	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	ImageIcon image = new ImageIcon("file.jpg");

	MyMenu() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		loadItem.setIcon(image);
		
		loadItem.setMnemonic(KeyEvent.VK_L); //l for load
		saveItem.setMnemonic(KeyEvent.VK_S); //s for save
		exitItem.setMnemonic(KeyEvent.VK_E); //e for exit
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); //Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + h for help
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == loadItem) {
			System.out.println("You loaded a file");
		}
		if (e.getSource() == saveItem) {
			System.out.println("You saved a file");
		}
		if (e.getSource() == exitItem) {
			System.exit(0);
		}
	}

}
