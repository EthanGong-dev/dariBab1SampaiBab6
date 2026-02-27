package topic4a2;

import java.util.ArrayList;
import java.util.HashSet;

public class question1 {

	public static void main(String[] args) {
		
		ArrayList<String> bakul = new ArrayList<>();
		
		bakul.add("Susu");
		bakul.add("Roti");
		bakul.add("Susu");
		bakul.add("Telur");
		
		System.out.println(bakul);
		
		HashSet<String> bakulHS = new HashSet<>(bakul);
		
		System.out.println(bakulHS);
		
	}

}
