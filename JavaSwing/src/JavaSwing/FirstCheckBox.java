package JavaSwing;

import javax.swing.*;

public class FirstCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("window");
		f.setSize(300,300);
		JPanel panel = new JPanel();
		JCheckBox button1 = new JCheckBox("Button 1");
		panel.add(button1);
		f.getContentPane().add(panel);
		f.setVisible(true);
	}

}
