package SwingGuessingGame;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameUI extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -6543155255653918012L;
	
	private  JFrame frame = new JFrame("Guessing Game");
	private  JButton inputButton = new JButton("Send");
    private  JTextArea editTextArea = new JTextArea("Type Here!");
    private  ButtonGroup group = new ButtonGroup();
    private JPanel diffPanel = new JPanel();
    private JPanel gamePanel = new JPanel();

    private JRadioButton buttonEasy;
	private JRadioButton buttonMedium;
	private JRadioButton buttonHard;
	private JButton selectDifficulty;
	
	private  CardLayout card;
    
    GameUI() {
    	frame.getContentPane();
    	card = new CardLayout(30,20);
    	
    	frame.setLayout(card);
    	
    	buttonEasy  = new JRadioButton("Easy");
    	buttonMedium = new JRadioButton("Medium");
    	buttonHard  = new JRadioButton("Hard");
    	
    	selectDifficulty = new JButton("Select");
    	selectDifficulty.addActionListener(this);
    	
    	group.add(buttonEasy);
    	group.add(buttonMedium);
    	group.add(buttonHard);
    	diffPanel.add(buttonEasy);diffPanel.add(buttonMedium);diffPanel.add(buttonHard);diffPanel.add(selectDifficulty);
    	
    }
    
    public void actionPerformed(ActionEvent e) {
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
