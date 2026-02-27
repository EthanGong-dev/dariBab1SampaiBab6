// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_7;

import java.util.Scanner;

public class soalan3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int year, days = 0;
		String month;
				
		System.out.print("Enter a year: ");
		year = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter a month: ");
		month = input.nextLine();
		
		input.close();
		
		switch (month) {
		case "Jan":
		case "Mar": 
		case "May": 
		case "Jul":
        case "Aug": 
        case "Oct":
        case "Dec":
        	days = 31;
        	break;
        case "Apr": 
        case "Jun": 
        case "Sep": 
        case "Nov":
            days = 30;
            break;
        case "Feb":
        	if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                days = 29;
            else
                days = 28;
            break;
		}
		
		if(days != 0) {
		    System.out.print(month + " " + year + " has " + days + " day");
		}
		else {
			System.out.print(month + " is not a correct month name");
		}
		
	}

}
