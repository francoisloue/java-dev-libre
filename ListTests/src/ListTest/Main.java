package ListTest;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		for(int numb : list) {
			if (numb%2==0) {
				//list.remove(list.indexOf(numb));
				//list.addLast(numb);
			}
		}
		System.out.println(list);
	}

}

