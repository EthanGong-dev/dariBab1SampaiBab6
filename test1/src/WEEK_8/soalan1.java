// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_8;

import java.util.Scanner;

public class soalan1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int Pass = 0;
		String user, major="", ranking="";
		
		System.out.print("Enter two characters: ");
		user = input.nextLine();
		user.toUpperCase();
		
		input.close();
		
		  if (user.length() != 2) {
	            Pass = 1;
	            return;
	        }
		
		if ((Character.toUpperCase(user.charAt(0)) == 'I') || (Character.toUpperCase(user.charAt(0)) == 'C') || (Character.toUpperCase(user.charAt(0)) == 'A')){
			if (Character.toUpperCase(user.charAt(0)) == 'I') {
				major = "Information Systems";
			}
			else if (Character.toUpperCase(user.charAt(0)) == 'C') {
				major = "Computer Science";
			}
			else {
				major = "Accounting";
			}
		}
		else {
			Pass = 1;
		}
		
		switch (user.charAt(1)) {
		case '1':
			ranking = "Freshman";
			break;
		case '2':
			ranking = "Sophomore";
			break;
		case '3':
			ranking = "Junior";
			break;
		case '4':
			ranking = "Senior";
			break;
		default:
			Pass = 1;
			break;
		}

		if (Pass == 0) {
			System.out.println(major + " " + ranking);
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
