package JavaSwing;

import javax.swing.*;
import java.awt.event.*;

public class FirstEvent extends JFrame {
	
	public FirstEvent() {
		super("App title");
		WindowListener windowListener = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(windowListener);
		JButton button = new JButton("My button");
		JPanel panel = new JPanel();
		panel.add(button);
		setContentPane(panel);
		setSize(200,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new FirstEvent();
	}

}
