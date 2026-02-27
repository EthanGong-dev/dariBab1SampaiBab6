// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_5;

import java.util.Scanner;

public class soalan1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int w;
		double cost=0;
		
		System.out.print("Enter package weight (g): ");
		w = input.nextInt();
		
		input.close();
		
		if ((w > 0) && (w <= 200)) {
			cost = 25.00;
		}
		else if ((w > 200) && (w <= 400)) {
			cost = 45.00;
		}
		else if ((w > 400) && (w <= 1000)) {
			cost = 75.00;
		}
		else if ((w > 1000) && (w <= 2000)) {
			cost = 150.00;
		}
		
		if((w > 0) && (w <=2000)) {
			System.out.println("The cost of shipping is: $" + cost);
		}
		else {
			System.out.println("The package cannot be shipped.");
		}
		
	}

}
