package geminiQuestion;

import java.util.*;
import java.util.stream.*;

public class question1 {

	public static void main(String[] args) {
		
		List<Double> senaraiBaki = Arrays.asList(100.0, 1500.0, 50.0, 3000.0, 450.0);
		
		List<Double> bakiKaya = senaraiBaki.stream()
	            .filter(b -> b > 500)             // 1. TAPIS: Ambil yang > 500
	            .sorted()                         // 2. SUSUN: Ikut nilai (Kecil ke Besar)
	            .collect(Collectors.toList());    // 3. SIMPAN: Masukkan dalam List baru

	        System.out.println("Baki VIP: " + bakiKaya);
		
	}

}
