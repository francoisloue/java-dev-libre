package JavaSwing;

import javax.swing.*;

public class FirstLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("window");
        f.setSize(800,800);
        JPanel panel = new JPanel();
        JLabel jLabel1 = new JLabel("ME WHEN");
        ImageIcon fallingBear = new ImageIcon("bearfall.png");
        panel.add(jLabel1);
        JLabel jLabel4 = new JLabel("BEAR FALL",fallingBear,SwingConstants.CENTER);
        panel.add(jLabel4);
        f.getContentPane().add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}

}
