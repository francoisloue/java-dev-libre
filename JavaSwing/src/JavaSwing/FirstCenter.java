package JavaSwing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class FirstCenter {
	public static void main(String[] args) {
		JFrame f = new JFrame("window");
		f.setSize(300,100);
		JButton b = new JButton("Button");
		f.getContentPane().add(b);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2 - f.getWidth()/2, dim.height/2 - f.getHeight()/2);
		f.setVisible(true);
		}
}
