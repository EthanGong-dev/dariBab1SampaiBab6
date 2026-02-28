package geminiQuestion;

import java.util.HashMap;
import java.util.TreeMap;

public class question2 {

	public static void main(String[] args) {
		
		HashMap<String, String> Contact = new HashMap<>();
		
		Contact.put("Zaki", "011");
		Contact.put("Adam", "012");
		Contact.put("Bakri", "013");
		
		TreeMap<String, String> ContactTM = new TreeMap<>(Contact);
		
		System.out.println("HashMap");
		
		for (String i : Contact.keySet()) {
			System.out.println("Nama: " + i + "\nNombor: " + Contact.get(i));
		}
		
		System.out.println("TreeMap");
		
		for (String i : ContactTM.keySet()) {
			System.out.println("Nama: " + i + "\nNombor: " + ContactTM.get(i));
		}
	}
}
