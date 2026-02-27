package CHATGPT;

import java.util.LinkedList;

public class soalanArrayList_LinkedListpart2 {

	public static void main(String[] args) {
		
		LinkedList<String> nama = new LinkedList<String>();
		
		nama.add("Ali");
		nama.add("Abu");
		nama.add("Siti");
		
		nama.addFirst("Amin");
		
		for (String i : nama) {
			System.out.println(i);
		}
	}

}
