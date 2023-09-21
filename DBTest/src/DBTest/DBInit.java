package DBTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class DBInit {
	
	public static Connection DB = DBconnect("jdbc:mysql://localhost:3306/JavaTest", "root");
	Main func = new Main();
	
	public static void main(String[] args) {
		try {
		} catch(Exception e) {
			System.out.println("error -> : "+e);
		}
	}
	
	public static Connection DBconnect(String URL, String user) {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, user, "");
			return connection;
		} catch (Exception e) {
			System.out.println("connection failure ! -> " + e)  ;
		}
		return null;
	}
	
	public static ArrayList<LinkedHashMap<String, String>> getAllStudent(Connection DB) {
        ArrayList<LinkedHashMap<String, String>> listOfStudents = new ArrayList<LinkedHashMap<String, String>>();
        try {
            Statement st = DB.createStatement();
            String req = "SELECT * FROM etudiants";
            ResultSet res = st.executeQuery(req);
            while(res.next()) {
            	LinkedHashMap<String,String> prenoms = new LinkedHashMap<String,String>();
                prenoms.put("id",res.getString("id"));
                prenoms.put("nom",res.getString("nom"));
                prenoms.put("prenom",res.getString("prenom"));
                prenoms.put("date_naissance",res.getString("date_naissance"));
                prenoms.put("email",res.getString("email"));
                prenoms.put("matricule",res.getString("matricule"));
                listOfStudents.add(prenoms);
            }
            return listOfStudents;
        } catch (Exception e) {
            System.out.println("error trying to fetch data from DB -> "+e);
        }
        return null;
	}
	
	public static int insertInDatabase(String table, LinkedHashMap<String,String> data) {
		try {
			Connection DB = DBconnect("jdbc:mysql://localhost:3306/JavaTest", "root");
			Set<String> keys = data.keySet();
			Collection<String> values = data.values();
			String req = "INSERT INTO "+table+" ("+String.join(",", keys)+") VALUES ('"+String.join("', '", values)+"')";
			PreparedStatement st = DB.prepareStatement(req);
			int res = st.executeUpdate();
			DB.close();
			return res;
		} catch(Exception e) {
			System.out.println("Error occured -> : "+e);
		}
		return 0;
	}
	
	public static void removeStudent(int toRemoveID) {
		try {
			Connection DB = DBconnect("jdbc:mysql://localhost:3306/JavaTest", "root");
			String req = "DELETE FROM etudiants WHERE id= "+toRemoveID;
			PreparedStatement st = DB.prepareStatement(req);
			int res = st.executeUpdate();
			DB.close();
		} catch(Exception e) {
			System.out.println("Error occured -> : "+e);
		}
	}
	
	public static ArrayList<LinkedHashMap<String,String>> getStudentWithParam(String[] params) {
		try {
			Connection DB = DBconnect("jdbc:mysql://localhost:3306/JavaTest", "root");
			ArrayList<LinkedHashMap<String, String>> listOfStudents = new ArrayList<LinkedHashMap<String, String>>();
			Statement st = DB.createStatement();
			String req = "SELECT * FROM etudiants WHERE "+params[0]+"='"+params[1]+"'";
			ResultSet res = st.executeQuery(req);
			while(res.next()) {
				LinkedHashMap<String,String> prenoms = new LinkedHashMap<String,String>();
				prenoms.put("id",res.getString("id"));
				prenoms.put("nom",res.getString("nom"));
				prenoms.put("prenom",res.getString("prenom"));
				prenoms.put("date_naissance",res.getString("date_naissance"));
				prenoms.put("email",res.getString("email"));
				prenoms.put("matricule",res.getString("matricule"));
				listOfStudents.add(prenoms);
				}
			return listOfStudents;
			} catch (Exception e) {
				System.out.println("error trying to fetch data from DB -> "+e);
				}
		return null;
		}
	
	public static void DisplayAll() {
		ArrayList<String> colName = new ArrayList<String>(Arrays.asList("id", "nom", "prenom", "data_naissance", "email", "matricule"));
		ArrayList<ArrayList<String>> toDisplay = new ArrayList<ArrayList<String>>();
		toDisplay.add(colName);
		for(LinkedHashMap<String, String> stud : DBInit.getAllStudent(DBInit.DB)) {
			Collection<String> temp = stud.values();
			ArrayList<String> values = new ArrayList<String>(temp);
			toDisplay.add(values);	
		}
		System.out.println(Main.formatAsTable(toDisplay));
	}
}
 