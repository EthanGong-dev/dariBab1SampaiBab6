// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_11;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double sales;
		
		do {
			double commission;
			
			System.out.print("Enter the sales amount: ");
			sales = input.nextDouble();
			
			if(sales !=0) {
			    commission = computeCommission(sales);
			    printCommission (commission);
		    }
			else {
				System.out.print("Good bye!");
				System.exit(0);
			}

	      } while (sales != 0);
	}
	
	public static double computeCommission(double salesAmount) {
		
		double commission;
		
		if (salesAmount >= 0.01 && salesAmount <= 5000) {
			commission = salesAmount*0.06;
		}
		else if (salesAmount >= 5000.01 && salesAmount <= 10000) {
			commission = salesAmount*0.08;
		}
		else {
			commission = salesAmount*0.10;
		}
		
		return commission;
	}
	
	public static void printCommission (double commission) {
		
		System.out.printf("Commission received:    %1.2f", commission);
		System.out.print("\n\n");
	}

}
