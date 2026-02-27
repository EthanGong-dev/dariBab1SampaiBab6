package CHATGPT;

import java.util.ArrayList;
import java.util.LinkedList;

public class soalanArrayList_LinkedListpart3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> number1 = new ArrayList<Integer>();
		LinkedList<Integer> number2 = new LinkedList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			number1.add(i + 1);
			number2.add(i + 1);
		}
		
		int i = 50;
		
		System.out.println("This is from LinkedList: " + number2.get(i));
		System.out.println("This is from ArrayList: " + number1.get(i));
		
	}

}
