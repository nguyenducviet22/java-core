package DGRAPHICS;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	Image image;
	
	MyPanel(){
		
		image = new ImageIcon("rocket.jpg").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, null);
		
		g2D.setPaint(Color.red);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(0, 0, 500, 500);
		
		g2D.drawRect(0, 0, 200, 100);
		g2D.fillRect(0, 150, 200, 100);
		
		g2D.fillArc(0, 300, 200, 200, 0, 180);
		g2D.setPaint(Color.blue);
		g2D.fillArc(0, 300, 200, 200, 180, 180);
		
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.drawPolygon(xPoints, yPoints, 3);
		
		g2D.setFont(new Font("Ink Free", Font.BOLD, 30));
		g2D.drawString("Duc Viet ne", 50, 50);
		
		
		
	}

}
