package topic4a1;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan NO IC anda: ");
		String ic = input.nextLine();
		
		String icClean = ic.replace("-", "");
		Long icPerfect = Long.parseLong(icClean);
		
        System.out.println("Nombor IC Bersih (Long): " + icPerfect);
        
        input.close();

	}

}
