// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_4;

import java.util.Scanner;

public class Soalan2 {

	public static void main(String[] args) {
		
		String code, master="";
        int sem, credit, prices=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your input for these questions given.");
        
        System.out.print("\nCode Program: ");
        code = input.next();
        
        System.out.print("Semester No: ");
        sem = input.nextInt();
        
        System.out.print("Credit Hours Registered: ");
        credit = input.nextInt();
        
        input.close();
        
        switch (code){
        case "MCS":
        	master = "Master of Computer Science";
        	if(sem==1) {
        		prices = 1250;
        	}
        	else {
        		prices = 1000;
        	}
        	
        	prices = prices + (250*credit);
        	break;
        
        case "ME":
        	master = "Master of Environment";
        	if(sem==1) {
        		prices = 1400;
        	}
        	else {
        		prices = 1100;
        	}
        	
        	prices = prices + (250*credit);
        	break;
        
        case "MPM":
        	master = "Master in Plantation Management";
        	if(sem==1) {
        		prices = 1250;
        	}
        	else {
        		prices = 1000;
        	}
        	
        	prices = prices + (275*credit);
        	break;
        
        case "MEOH":
        	master = "Master of Environmental and Occupational Health";
        	if(sem==1) {
        		prices = 1250;
        	}
        	else {
        		prices = 1000;
        	}
        	
        	prices = prices + (350*credit);
            break;
        }
             
        System.out.println("\n<<<Total Tuition Fees for Semester " + sem + ">>>");
        System.out.println("Master Program: " + master);
        System.out.println("Semester No: " + sem);
        System.out.println("Credit Hours: " + credit);
        System.out.println("Total Tuition Fees: RM" + prices);

	
	}
}
