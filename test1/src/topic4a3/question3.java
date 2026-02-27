package topic4a3;

import java.util.*;

public class question3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int umur;
		
		System.out.print("Umur anda: ");
		umur = input.nextInt();
		input.close();
		
		if (umur < 18) {
			throw new ArithmeticException("Budak bawah umur!");
		}
		else {
			System.out.println("Anda bole masuk.");
		}
		
	}

}
