package geminiQuestion;

import java.util.*;

public class question1 {

	public static void main(String[] args) {
		
		List<Integer> hargaBarang = Arrays.asList(50, 100, 10, 500, 25);

        hargaBarang.sort((a, b) -> b - a); 

        System.out.println("Harga (Mahal -> Murah): " + hargaBarang);
		
	}

}
