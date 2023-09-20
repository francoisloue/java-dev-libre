package DBTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	Scanner scan = new Scanner(System.in);
	int userChoice=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main test = new Main();
		test.Menu();
		
	}
	
	public void SeeAllMenu() {
		System.out.println("Choose an option :\n 1 -> See every Students\n 2 -> Specific Student Data\n 0 -> Return to menu");
		while(userChoice !=0) {
			this.userChoice=this.scan.nextInt();
			switch(this.userChoice) {
			case(1):
				String display="";
				ArrayList<ArrayList<String>> toDisplay = new ArrayList<ArrayList<String>>();
				ArrayList<String> colName = new ArrayList<String>();
				toDisplay.add(colName);
				for(LinkedHashMap<String, String> stud : DBInit.getAllStudent(DBInit.DB)) {
					Collection<String> temp = stud.values();
					ArrayList<String> values = new ArrayList<String>(temp);
					toDisplay.add(values);
					 	
				}
				System.out.println(display);
				SeeAllMenu();
			case(0):
				break;
			}
		}
		Menu();
	}
	
	public void Menu() {
		System.out.println("Choose an option :\n1 -> See Students Data\n2 -> Add a new Student\n3 -> Change a Student Data\n4 -> Delete a Student from DB\n5 -> Exit");
		while(this.userChoice!=-1) {
			this.userChoice=this.scan.nextInt();
			switch(this.userChoice) {
			case(1):
				SeeAllMenu();
			}
		}
		this.scan.close();
		}
}
