// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_6;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double service=0;
		int checks=0, base=20;
		
		System.out.print("How many checks you already written within this month: ");
		checks = input.nextInt();
		
		input.close();
		
		if (checks < 20) {
			service = 0.2*checks;
		}
		else if ((checks >= 20) && (checks < 40)) {
			service = 0.06*checks;
		}
		else if ((checks >= 40) && (checks < 60)) {
			service = 0.04*checks;
		}
		else {
			service = 0.02*checks;
		}
		
		System.out.println("Your bank's service fees for this month is RM" + (service + base) + ".");

	}

}
