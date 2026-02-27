// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_5;

import java.util.Scanner;

public class soalan3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number=0, aftercal=0;
		
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		
		input.close();
		
		aftercal = number%2;
		
		switch (aftercal) {
			case 0:
				System.out.println(number + " is even number.");
				break;
			case 1:
				System.out.println(number + " is odd number.");
				break;
		}

	}

}
