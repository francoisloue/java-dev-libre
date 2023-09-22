package JavaSwing;

import javax.swing.*;

public class FirstJavaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("First swing App");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hello Swing !");
		frame.add(label);
		frame.setVisible(true);
	}

}
