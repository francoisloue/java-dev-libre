package InitJava;

public class MultiDimTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tableau = {
				{"Un","Deux","Trois"},
				{"Quatre","Cinq","Six"},
				{"Sept","Huit","Neuf"}
		};
		String res = "";
		for (String[] i : tableau) {
			for (String j :i) {
				res += j+" ";
			}
			System.out.println(res);
			res = "";
		}
	}

}
