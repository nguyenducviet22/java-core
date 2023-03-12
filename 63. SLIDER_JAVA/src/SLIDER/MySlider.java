package SLIDER;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MySlider implements ChangeListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JSlider slider = new JSlider(0, 100, 50);

	MySlider() {

		slider.setPreferredSize(new Dimension(100, 400));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 20));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);

		label.setText(slider.getValue() + "ºC");
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));

		panel.add(label);
		panel.add(slider);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(slider.getValue() + "ºC");

	}

}
