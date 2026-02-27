// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_7;

import java.util.Scanner;

public class soalan4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		String s1, s2;
		
		System.out.print("Enter string s1: ");
		s1 = input.nextLine();
		
		System.out.print("Enter string s2: ");
		s2 = input.nextLine();
		
		input.close();
		
		if (s1.startsWith(s2)) {
			System.out.print(s2 + " is a prefix of " + s1);
		}
		else {
			System.out.print(s2 + " is not a prefix of " + s1);
		}
	}

}
