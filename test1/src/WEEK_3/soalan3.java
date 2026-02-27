//Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_3;

import java.util.Scanner;

public class soalan3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double purchase;
		
		System.out.print("Enter the amount of your purchase (RM): ");
		purchase = input.nextDouble();
		
		input.close();
		
		double state = 0.04, county = 0.02;
		double s_tax = purchase*state;
		double c_tax = purchase*county;
		double t_tax = s_tax + c_tax;
		double total = purchase + t_tax;
		
		System.out.println("The amount of your purchase is RM " + purchase + ".");
		System.out.println("The state sales tax is RM" + s_tax + ".");
		System.out.println("The county sales tax is RM" + c_tax + ".");
		System.out.println("The total sales tax is RM" + t_tax + ".");
		System.out.println("The total of the sale is RM" + total + ".");
     
	}

}
