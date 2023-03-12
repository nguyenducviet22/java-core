package DRAG_AND_DROP;

import javax.swing.JFrame;

public class MyDragAndDrop extends JFrame {
	
	DragPanel dragPanel = new DragPanel();

	MyDragAndDrop(){
		
		this.setTitle("Drag and Drop");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(dragPanel);
		
	}
}
