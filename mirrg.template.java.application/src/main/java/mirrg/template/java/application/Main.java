package mirrg.template.java.application;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Main
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Template");

		JLabel label = new JLabel("Sample");
		label.setPreferredSize(new Dimension(200, 100));
		frame.add(label);

		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
