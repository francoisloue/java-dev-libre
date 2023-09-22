package JavaSwing;

import java.awt.event.*;

import javax.swing.*;

public class FirstActionEventButton {

    public static void main(String[] args) {
        JFrame f= new JFrame("window");
        f.setSize(400,400);

        JPanel panel = new JPanel();

        JButton btn = new JButton("BTN 1");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("test");

            }
        });

        panel.add(btn);

        f.getContentPane().add(panel);
        f.setVisible(true);
    }

}
