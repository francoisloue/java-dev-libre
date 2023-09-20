package DBTest;

import java.util.LinkedHashMap;

public class Etudiant extends DBInit {
	public String surname;
	public String name;
	public String birthDate;
	public String email;
	public String regNumber;

	public Etudiant(String surname, String name, String birthdate, String email, String regnumb) {
		this.surname=surname;
		this.name=name;
		this.birthDate=birthdate;
		this.email=email;
		this.regNumber=regnumb;
	}
	
	public void addStudient() {
		LinkedHashMap<String,String> toPush = new LinkedHashMap<>();
		toPush.put("nom", this.surname);
		toPush.put("prenom", this.name);
		toPush.put("date_naissance", this.birthDate);
		toPush.put("email", this.email);
		toPush.put("matricule", this.regNumber);
		try {
			DBInit.insertInDatabase("etudiants", toPush);
		} catch(Exception e) {
			System.out.println("error occured -> :" + e);
		}
	}
}
