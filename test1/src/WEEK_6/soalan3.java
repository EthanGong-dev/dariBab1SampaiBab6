// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_6;

import java.util.Scanner;

public class soalan3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int year, month, day;
		int h, q, m, j, k;
		
		System.out.print("Enter year: ");
		year = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		month = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31: ");
		day = input.nextInt();
		
		input.close();
		
		//Calculation
		
		q = day;
		m = month;
		j = year/100;
		k = year%100;
		
		if((m==1) || (m==2)) {
			if (m==1) {
				m = 13;
			}
			else if (m==2) {
				m = 14;
			}
			
			year -= 1;
			j = year/100;
			k = year%100;
			
			h = (q + (26*(m + 1)/10) + k + (k/4) + (j/4) + (5*j))%7;
		}
		else {
			h = (q + (26*(m + 1)/10) + k + (k/4) + (j/4) + (5*j))%7;
		}
		
		System.out.print("Day of the week is ");
		
		switch (h) {
		case 0:
		System.out.print("Saturday");
		case 1:
		System.out.print("Sunday");
		case 2:
		System.out.print("Monday");
		case 3:
		System.out.print("Tuesday");
		case 4:
		System.out.print("Wednesday");
		case 5:
		System.out.print("Thursday");
		case 6:
		System.out.print("Friday");
		}

	}

}
