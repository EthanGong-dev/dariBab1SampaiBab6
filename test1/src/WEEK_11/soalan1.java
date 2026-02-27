// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_11;

import java.util.Scanner;

public class soalan1 {
	
	public static void main(String[] args) {
		
		String dev_num = delivery_number();
		double price = fee();
		result(dev_num, price);		
	}

	//a.
	public static String delivery_number() {
		
		Scanner input = new Scanner (System.in);
		
		boolean pass;
		int year, month, delivery_num;
		
		do { 
			pass = true;
			System.out.print("Year: ");
			year = input.nextInt();
			
			
			if (year <= 2000 || year >=2010) {
				System.out.println("You need to put it between 2001 and 2009 only.");
				pass = false;
			}
		} while (pass == false);
		
		//month
		do {
			pass = true;
			System.out.print("Month: ");
			month = input.nextInt();
			
			
			if (!(month >= 1 && month <= 12)) {
				System.out.println("Invalid month");
				pass = false;
			}
		} while (pass == false);

		//delivery number
		do {
			pass = true;
			System.out.print("Delivery Number: ");
			delivery_num = input.nextInt();
			
			
			if (!(delivery_num >= 1 && delivery_num <= 999)) {
				System.out.println("Invalid delivery number");
				pass = false;
			}
		} while (pass == false);
		
		
		//Delivery Number 6-digit
		int yearDigit;
		
		yearDigit = (year - 2000);
			
		String sixdigit;
		sixdigit = String.format("%02d%02d%03d", yearDigit, month, delivery_num);

		
		return sixdigit;
	}
	
	
	//b.
	public static double fee() {
		
		Scanner input = new Scanner (System.in);
		
		boolean pass;
		double weight, fee=0;
		int distance;
		
		do {
			pass = true;
			System.out.print("Package Weight: ");
			weight = input.nextDouble();
			
			
			if (!(weight >= 0.1 && weight <= 100)) {
				System.out.println("Invalid package weight");
				pass = false;
			}
		} while (pass == false);
		
		//area
		do {
			pass = true;
			System.out.print("Are the delivery will be local (1) or long distance (2): ");
			distance = input.nextInt();
			
			
			if (!(distance >= 1 && distance <= 2)) {
				System.out.println("Invalid input");
				pass = false;
			}
		} while (pass == false);
		
		switch (distance) {
		case 1: 
			if (weight < 5) {
				fee = 12.00;
			}
			else if (weight >= 5 && weight <= 20) {
				fee = 16.50;
			}
			else {
				fee = 20.00;
			}
			break;
		case 2:
			if(weight < 5) {
				fee = 35.00;
			}
			else {
				fee = 47.95;
			}
			break;
		default:
		}
		
		return fee;
	}
	
	public static void result(String dev_num, double price) {
		
		System.out.print("Delivery Number: ");
		System.out.print(dev_num);
		
		System.out.print("\nDelivery Fee: RM" );
		System.out.printf("%1.2f", price);
	}
	

}
