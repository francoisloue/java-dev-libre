package JavaSwing;

import javax.swing.*;

public class FirstIcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("window");
		f.setSize(300,100);
		JButton b = new JButton("Test Icon");
		f.getContentPane().add(b);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		ImageIcon image = new ImageIcon("prank.png");
		f.setIconImage(image.getImage());
		f.setVisible(true);
	}

}
