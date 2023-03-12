package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jPanelTop = new JPanel();
//		jPanelTop.setSize(300, 200);
		JPanel jPanelBottom = new JPanel();
//		jPanelBottom.setSize(300, 300);

		JTextField jText = new JTextField();
		jPanelTop.add(jText);

		JButton jBtn00 = new JButton("00");
		JButton jBtn0 = new JButton("0");
		JButton jBtn1 = new JButton("1");
		JButton jBtn2 = new JButton("2");
		JButton jBtn3 = new JButton("3");
		JButton jBtn4 = new JButton("4");
		JButton jBtn5 = new JButton("5");
		JButton jBtn6 = new JButton("6");
		JButton jBtn7 = new JButton("7");
		JButton jBtn8 = new JButton("8");
		JButton jBtn9 = new JButton("9");
		JButton jBtnDel = new JButton("C");
		JButton jBtnBSpace = new JButton("CE");
		JButton jBtnDot = new JButton("./,");
		JButton jBtnPercent = new JButton("%");
		JButton jBtnAdd = new JButton("+");
		JButton jBtnSubtract = new JButton("-");
		JButton jBtnTimes = new JButton("*");
		JButton jBtnDevide = new JButton("/");
		JButton jBtnEqual = new JButton("=");

		jPanelBottom.setLayout(new GridLayout(5, 4));
		jPanelBottom.add(jBtnDel);
		jPanelBottom.add(jBtnPercent);
		jPanelBottom.add(jBtnBSpace);
		jPanelBottom.add(jBtnDevide);
		jPanelBottom.add(jBtn7);
		jPanelBottom.add(jBtn8);
		jPanelBottom.add(jBtn9);
		jPanelBottom.add(jBtnTimes);
		jPanelBottom.add(jBtn4);
		jPanelBottom.add(jBtn5);
		jPanelBottom.add(jBtn6);
		jPanelBottom.add(jBtnSubtract);
		jPanelBottom.add(jBtn1);
		jPanelBottom.add(jBtn2);
		jPanelBottom.add(jBtn3);
		jPanelBottom.add(jBtnAdd);
		jPanelBottom.add(jBtn00);
		jPanelBottom.add(jBtn0);
		jPanelBottom.add(jBtnDot);
		jPanelBottom.add(jBtnEqual);

		this.setLayout(new BorderLayout());
		this.add(jPanelTop, BorderLayout.NORTH);
		this.add(jPanelBottom, BorderLayout.CENTER);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}