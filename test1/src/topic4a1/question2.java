package topic4a1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Apa nama anda: ");
		String nama = input.nextLine();
		
		input.close();
		
		String namaPerfect = nama.toUpperCase().trim();
		
		System.out.println("Nama anda ialah " + namaPerfect);
		
	}

}
