// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_8;

import java.util.Scanner;

public class soalan4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String c1, c2, c3;
		
		System.out.print("Enter the first country: ");
        c1 = input.nextLine();

        System.out.print("Enter the second country: ");
        c2 = input.nextLine();

        System.out.print("Enter the third country: ");
        c3 = input.nextLine();
        
        input.close();
        
        String u1, u2, u3;
        
        if ((c1.charAt(0) < c2.charAt(0)) && (c1.charAt(0) < c3.charAt(0))) {
        	u3 = c1;
        	if ((c2.charAt(0) < c3.charAt(0))) {
        		u2 = c2;
        		u1 = c3;
        	}
        	else {
        		u2 = c3;
        		u1 = c2;
        	}
        }
        else if ((c2.charAt(0) < c1.charAt(0)) && (c2.charAt(0) < c3.charAt(0))) {
        	u3 = c2;
        	if ((c1.charAt(0) < c3.charAt(0))) {
        		u2 = c1;
        		u1 = c3;
        	}
        	else {
        		u2 = c3;
        		u1 = c1;
        	}      
        }
        else {
        	u3 = c3;
        	if ((c1.charAt(0) < c2.charAt(0))) {
        		u2 = c1;
        		u1 = c2;
        	}
        	else {
        		u1 = c1;
        		u2 = c2;
        	}
        }
        
        System.out.println("The three countries in descending order are " + u1 + " " + u2 + " " + u3);

	}

}
