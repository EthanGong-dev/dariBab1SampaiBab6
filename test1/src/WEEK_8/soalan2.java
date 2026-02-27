// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_8;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		String user;
		
		System.out.print("Put any input: ");
		user = input.nextLine();
		input.close();
		
		boolean digit = false;
		boolean letter = false;
		
		if ((user.indexOf('0') != -1) || (user.indexOf('1') != -1) || (user.indexOf('2') != -1) || (user.indexOf('3') != -1) || (user.indexOf('4') != -1) || (user.indexOf('5') != -1) || (user.indexOf('6') != -1) || (user.indexOf('7') != -1) || (user.indexOf('8') != -1) || (user.indexOf('9') != -1 )) {
			digit = true;
		}
		
		for (int i = 0; i < user.length(); i++) {
            char ch = user.charAt(i);

            if (Character.isLetter(ch)) {
                letter = true;
            }
        }

		if ((letter == true) && (digit == true)) {
            System.out.println("String is mixed");
        }
		else if (digit == true) {
            System.out.println("String contains digit only");
        } 
        else if (letter == true) {
            System.out.println("String contains letters only");
        } 
	}

}
