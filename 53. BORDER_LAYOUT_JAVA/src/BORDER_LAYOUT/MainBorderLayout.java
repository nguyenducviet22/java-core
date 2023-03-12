package BORDER_LAYOUT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainBorderLayout {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BorderLayout());

		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.pink);

		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);

		// ---------------------------------

		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		panel10.setLayout(new BorderLayout());

		panel6.setBackground(Color.yellow);
		panel7.setBackground(Color.blue);
		panel8.setBackground(Color.green);
		panel9.setBackground(Color.red);
		panel10.setBackground(Color.pink);

		panel6.setPreferredSize(new Dimension(70, 70));
		panel7.setPreferredSize(new Dimension(70, 70));
		panel8.setPreferredSize(new Dimension(70, 70));
		panel9.setPreferredSize(new Dimension(70, 70));
		panel10.setPreferredSize(new Dimension(70, 70));

		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.WEST);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.SOUTH);
		panel5.add(panel10, BorderLayout.CENTER);

		// ------------------------------

		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();
		panel15.setLayout(new BorderLayout());

		panel11.setBackground(Color.red);
		panel12.setBackground(Color.green);
		panel13.setBackground(Color.blue);
		panel14.setBackground(Color.yellow);
		panel15.setBackground(Color.pink);

		panel11.setPreferredSize(new Dimension(40, 40));
		panel12.setPreferredSize(new Dimension(40, 40));
		panel13.setPreferredSize(new Dimension(40, 40));
		panel14.setPreferredSize(new Dimension(40, 40));
		panel15.setPreferredSize(new Dimension(40, 40));

		panel10.add(panel11, BorderLayout.NORTH);
		panel10.add(panel12, BorderLayout.WEST);
		panel10.add(panel13, BorderLayout.EAST);
		panel10.add(panel14, BorderLayout.SOUTH);
		panel10.add(panel15, BorderLayout.CENTER);
		
		//------------------------------
		
		JPanel panel16 = new JPanel();
		JPanel panel17 = new JPanel();
		JPanel panel18 = new JPanel();
		JPanel panel19 = new JPanel();
		JPanel panel20 = new JPanel();

		panel16.setBackground(Color.yellow);
		panel17.setBackground(Color.blue);
		panel18.setBackground(Color.green);
		panel19.setBackground(Color.red);
		panel20.setBackground(Color.pink);

		panel16.setPreferredSize(new Dimension(10, 10));
		panel17.setPreferredSize(new Dimension(10, 10));
		panel18.setPreferredSize(new Dimension(10, 10));
		panel19.setPreferredSize(new Dimension(10, 10));
		panel20.setPreferredSize(new Dimension(10, 10));

		panel15.add(panel16, BorderLayout.NORTH);
		panel15.add(panel17, BorderLayout.WEST);
		panel15.add(panel18, BorderLayout.EAST);
		panel15.add(panel19, BorderLayout.SOUTH);
		panel15.add(panel20, BorderLayout.CENTER);

	}

}
