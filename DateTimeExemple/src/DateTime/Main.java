package DateTime;

import java.time.Year;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static int GetAgeWithDate(Scanner scan) {
		System.out.println("Please enter your birth date : \n");
		int year = Year.now().getValue();
		int birthDate = Integer.parseInt(scan.nextLine());
		return year-birthDate;
	}
	public static int GetDeathDate(Scanner scan) {
		Random rand = new Random();
		System.out.println("Please enter your birth date : \n");
		int osef = Year.now().getValue()-Integer.parseInt(scan.nextLine());
		return (Year.now().getValue()+rand.nextInt(100-osef)-Year.now().getValue());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		int death = GetDeathDate(Scan);
		System.out.println("You'll die in "+death+" years");

	}

}
 