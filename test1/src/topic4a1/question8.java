package topic4a1;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan 3 bahan masakan secara berasingan: ");

		StringBuilder[] bahanSB = new StringBuilder[3]; 
		
		for (int i = 0; i < bahanSB.length; i++) {
			bahanSB[i] = new StringBuilder(input.nextLine().trim().toLowerCase());
		}
		
		if (bahanSB[1].charAt(3) != 'a') {
			bahanSB[1].setCharAt(3, 'a');
		}
		
		input.close();
		StringBuilder resepi = new StringBuilder();
		
		for (int i = (bahanSB.length - 1); i >= 0; i--) {
			if (i == 0) {
				resepi.append(bahanSB[i] + ".");
			}
			else {
				resepi.append(bahanSB[i] + ", ");
			}	
		}
		
		System.out.println("Resepi: " + resepi);
		
	}

}
