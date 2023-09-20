package InitJava;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userIn = new Scanner(System.in);
		Random rand = new Random();
		int numb = rand.nextInt(100);
		int userLife = 5;
		String userGuess = "101";
		while(Integer.parseInt(userGuess) != numb && userLife > 0) {
			System.out.println("Lifes : "+" ♥ ".repeat(userLife)+" || Guess a number : ");
			userGuess = userIn.nextLine();
			if (Integer.parseInt(userGuess) > numb) {
				System.out.println("Lower");
				userLife -=1;
			} else {
				System.out.println("Higher");
				userLife -=1;
			}
		}
		if (userLife == 0 && Integer.parseInt(userGuess)!= numb) {
			System.out.println("YOU LOOSE. The answer was : "+numb);
		} else {
			System.out.println("GG you win !");
		}
		userIn.close();
	}
}