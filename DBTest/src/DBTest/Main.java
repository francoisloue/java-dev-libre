package DBTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	int userChoice=0;
	String userInput="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main test = new Main();
		test.Menu();
		
	}
	
	public void SeeStudentMenu() {
		System.out.println("Choose an option :\n 1 -> See every Students\n 2 -> Specific Student Data\n 0 -> Return to menu");
		while(userChoice !=0) {
			this.userChoice=this.scan.nextInt();
			switch(this.userChoice) {
			case(1):
				DBInit.DisplayAll();
				SeeStudentMenu();
			case(2):
				System.out.println("Quel paramètre recherchez vous ? -> :");
				String key=this.scan.next();
				System.out.println("Quelle valeur recherchez vous ? -> :");
				String value=this.scan.next();
				try {
				String[] params = new String[2];
				params[0]=key;
				params[1]=value;
				ArrayList<ArrayList<String>> singleDisplay = new ArrayList<ArrayList<String>>();
				ArrayList<String> colName = new ArrayList<String>(Arrays.asList("id", "nom", "prenom", "data_naissance", "email", "matricule"));
				singleDisplay.add(colName);
				for(LinkedHashMap<String, String> stud : DBInit.getStudentWithParam(params)) {
					Collection<String> temp = stud.values();
					ArrayList<String> values = new ArrayList<String>(temp);
					singleDisplay.add(values);	
				}
				System.out.println(formatAsTable(singleDisplay));
				} catch(Exception e) {
					System.out.println(e);
					break;
				}
				SeeStudentMenu();
			case(0):
				break;
			}
		}
		Menu();
	}
	
	public void Menu() {
		System.out.println("Choose an option :\n1 -> See Students Data\n2 -> Add a new Student\n3 -> Change a Student Data (Work In Progress (j'ai la flemme de le faire))\n4 -> Delete a Student from DB\n5 -> Exit");
		while(this.userChoice!=-1) {
			this.userChoice=this.scan.nextInt();
			switch(this.userChoice) {
			case(1):
				SeeStudentMenu();
			case(2):
				AddStudentMenu();
			case(3):
				Menu();
			case(4):
				DeleteStudentMenu();
			case(5):
				System.out.println("Thank's for using student+");
				System.exit(0);
			}
				
		}
		this.scan.close();
		}
	
	public void AddStudentMenu() {
		System.out.println("Student surname -> :\n");
		String surname=this.scan.next();
		System.out.println("Student name -> :\n");
		String name=this.scan.next();
		System.out.println("Student birth date (format YYYY-MM-DD) -> :\n");
		String birthDate=this.scan.next();
		System.out.println("Student email -> :\n");
		String email=this.scan.next();
		System.out.println("Student regestration number -> : \n");
		String regNumb=this.scan.next();
		Etudiant newStud = new Etudiant(surname, name, birthDate, email, regNumb);
		newStud.addStudient();
		System.out.println("NewStudent created !");
		Menu();
	}
	
	public void DeleteStudentMenu() {
		DBInit.DisplayAll();
		System.out.println("Type student to delete ID -> :");
		String id = scan.next();
		String[] params = new String[]{"id", id};
		System.out.println("Are you sure to delete Y/N :\n"+DBInit.getStudentWithParam(params));
		switch(scan.next()) {
		case("Y"):
			DBInit.removeStudent(Integer.parseInt(id));
		case("N"):
			break;
		}
		Menu();
	}
	
	public static String formatAsTable(ArrayList<ArrayList<String>> rows) {
		int[] maxLengths = new int[rows.get(0).size()];
	    for (ArrayList<String> row : rows) {
	        for (int i = 0; i < row.size(); i++) {
	            maxLengths[i] = Math.max(maxLengths[i], row.get(i).length());
	        }
	    }
	    StringBuilder formatBuilder = new StringBuilder();
	    for (int maxLength : maxLengths) {
	        formatBuilder.append("%-").append(maxLength + 2).append("s");
	    }
	    String format = formatBuilder.toString();
	    StringBuilder result = new StringBuilder();
	    for (ArrayList<String> row : rows) {
	        result.append(String.format(format, row.toArray(new String[0]))).append("\n");
	    }
	    return result.toString();
	}
}
