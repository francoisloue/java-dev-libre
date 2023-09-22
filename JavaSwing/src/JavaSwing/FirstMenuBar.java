package JavaSwing;

import javax.swing.*;

public class FirstMenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("window");
		f.setSize(300,100);
		JButton b = new JButton();
		f.getContentPane().add(b);
		JMenuBar menuBar = new JMenuBar();
		f.setJMenuBar(menuBar);
		JMenu menu = new JMenu("Fichier");
		JMenuItem menuItem = new JMenuItem("ouvrir");
		menu.add(menuItem);
		menuBar.add(menu);
		f.setVisible(true);
		}

}
