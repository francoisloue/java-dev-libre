package JavaSwing;

import javax.swing.*;

public class FirstTextForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("window");
        f.setSize(400,400);
        JPanel panel = new JPanel();
        JTextField text = new JTextField("Info svp");
        panel.add(text);
        f.getContentPane().add(panel);
        f.setVisible(true);
	}

}
