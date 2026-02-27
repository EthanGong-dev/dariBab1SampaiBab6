// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_7;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		char letter;
		
		System.out.print("Enter a letter: ");
		letter = input.next().charAt(0);
		
		input.close();
		
		if ((letter >= 'a') && (letter <= 'z') || (letter >= 'A') && (letter <= 'Z')) {
			if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u') || (letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')) {
				System.out.print(letter + " is a vowel");
		}
			else {
				System.out.print(letter + " is a consonant");
			}
		}
		else {
			System.out.print(letter + " is an invalid input");
		}
			

	}

}
