package InitJava;

import java.util.Scanner;
import java.util.Random;

public class Game {
	private int nbLife;
	private int numbLimit;
	private int randNumb;
	protected String Difficulty;
	private Random rand = new Random();
	
	public Game(String difficulty) {
		this.Difficulty = difficulty;
		switch(this.Difficulty) {
		case("Easy"):
			this.nbLife=10;
			this.numbLimit=50;
		case("Medium"):
			this.nbLife=7;
			this.numbLimit=75;
		case("Hard"):
			this.nbLife=5;
			this.numbLimit=100;
		}
		this.randNumb = rand.nextInt(this.numbLimit);
	}
	
	public boolean GameRound(Scanner userInput) {
		System.out.println("Please enter a number to guess : \n");
		int userGuess = Integer.parseInt(userInput.nextLine()); 
		while(userGuess != this.randNumb && this.nbLife > 0) {
			
		}
		return false;
	}
}
