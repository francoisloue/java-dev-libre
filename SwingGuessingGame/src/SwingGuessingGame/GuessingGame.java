package SwingGuessingGame;

import java.util.Random;

public class GuessingGame implements GameSet {
	
	private static Random rand = new Random();
	private static int toGuess;
	
	public static void StartGame(int level) {
		// TODO Auto-generated method stub
		switch(level) {
		case(1):
			toGuess = rand.nextInt(0,10);
		case(2):
			toGuess = rand.nextInt(0,25);
		case(3):
			toGuess = rand.nextInt(0,50);
		}
	}

	@Override
	public boolean checkGuess(int guess) {
		if (toGuess==guess) {
			return true;
		}
		return false;
	}
	
}
