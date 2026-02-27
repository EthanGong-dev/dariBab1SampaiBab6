package topic4a1;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gaji anda pada bulan ini: RM");
		String gaji = input.nextLine();
		
		input.close();
		
		Double gajiInt = (Double.parseDouble(gaji) + 500);
		
		System.out.println("Gaji baru anda: RM" + gajiInt);

	}

}
