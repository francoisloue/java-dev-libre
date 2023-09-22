package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class FirstButtonGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Window");
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		JRadioButton button1 = new JRadioButton("Button 1");
		JRadioButton button2 = new JRadioButton("Button 2");
		group.add(button1);
		group.add(button2);
		panel.add(button1);
		panel.add(button2);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
	}

}
