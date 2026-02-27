// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_6;

import java.util.Scanner;

public class soalan1 {

	public static void main(String[] args) {
		
		int typep, minutes, min = 0;
        double prices = 0, add = 0, totalprice = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your input for these two questions.");
        System.out.println("1 = Gold, 2 = Platinum, 3 = Titanium");

        System.out.print("\nPackage type: ");
        typep = input.nextInt();

        System.out.print("Minutes used: ");
        minutes = input.nextInt();
        
        input.close();

        System.out.println("\n\n<<< Bill Description >>>");
        System.out.print("\nPackage:");

        if (typep == 1) {
            System.out.print(" Gold");
            prices = 80;
            if (minutes > 450) {
            	min = 450;
                add = (minutes - 450) * 0.4;
            }
            totalprice = prices + add;

        } 
        else if (typep == 2) {
            System.out.print(" Platinum");
            prices = 120;
            if (minutes > 900) {
                min = 900;
                add = (minutes - 900) * 0.2;
            }
            totalprice = prices + add;

        } 
        else if (typep == 3) {
            System.out.print(" Titanium");
            prices = 160;
            totalprice = prices;

        } 
        else {
            System.out.print(" You just put a wrong input.");
        }

        System.out.println("\n\n" + min + " minutes: RM" + prices);
        System.out.println((minutes - min) + " minutes: RM" + add);
        System.out.println("Total charges: RM" + totalprice);
        
        double p1, p2, p3;
        double pri1=0, pri2=0, pri3=0;
        
        p1 = 80 + (minutes - 450) * 0.4;
        
        p2 = 120 + (minutes - 900) * 0.2;
        
        p3 = 160;
        
        if (typep == 1) {
        	
        	pri1 = p1 - p2;
        	pri2 = p1 - p3;
        	
        	if (p1 > p2) {
        		System.out.println("You will saved by RM" + (pri1) + " if you buy the Package 2.");
        	}
        	
        	if (p1 > p3) {
        		System.out.println("You will saved by RM" + (pri2) + " if you buy the Package 3.");
        	}
        }
        
        else if (typep == 2) {
        	
        	pri3 = p2 - p3;
        	
        	if (p2 > p3) {
        		System.out.println("You will saved by RM" + (pri3) + " if you buy the Package 3.");
        	}
        }
        
    }

}
