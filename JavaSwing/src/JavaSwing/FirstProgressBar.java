package JavaSwing;

import javax.swing.*;

public class FirstProgressBar extends JFrame {
	
	static JFrame f;
	 
    static JProgressBar b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a frame
        f = new JFrame("ProgressBar demo");
 
        // create a panel
        JPanel p = new JPanel();
 
        // create a progressbar
        b = new JProgressBar();
 
        // set initial value
        b.setValue(0);
 
        b.setStringPainted(true);
 
        // add progressbar
        p.add(b);
 
        // add panel
        f.add(p);
 
        // set the size of the frame
        f.setSize(500, 500);
        f.setVisible(true);
 
        fill();
	}
	
	public static void fill() {
		int i = 0;
        try {
            while (i <= 100) {
                // fill the menu bar
                b.setValue(i + 5);
 
                // delay the thread
                Thread.sleep(1000);
                i += 5;
            }
        }
        catch (Exception e) {
        }
	}

}
