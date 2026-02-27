// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_7;

import java.util.Scanner;

public class soalan5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String pass;
		
		System.out.println("Welcome to Amazon website");
		System.out.println("-------------------------");
		System.out.println("Please create your own password and your password must be include with these terms:");
		System.out.println("a. The password should be at least six characters long.\r\n"
				+ "b. The password should at least one uppercase and at least one lowercase letter.\r\n"
				+ "c. The password should have at least one digit.");

		System.out.print("\n\nEnter your password: ");
		pass = input.nextLine();
		
		input.close();
		
		boolean length = false;
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		
		if (pass.length() >= 6) {
			length = true;
		}
		if (!pass.equals(pass.toLowerCase())) {
                upper = true;
        }
		if (!pass.equals(pass.toUpperCase())) {
                lower = true;
        }
		if ((pass.indexOf('0') != -1) || (pass.indexOf('1') != -1) || (pass.indexOf('2') != -1) || (pass.indexOf('3') != -1) || (pass.indexOf('4') != -1) || (pass.indexOf('5') != -1) || (pass.indexOf('6') != -1) || (pass.indexOf('7') != -1) || (pass.indexOf('8') != -1) || (pass.indexOf('9') != -1 )) {
            	digit = true;
		}
		
		if ((length == true) && (upper == true) && (lower == true) && (digit==true)) {
			System.out.print("Valid password");
		}
		else {
			System.out.print("Invalid Password");			
		}
		
	}

}
