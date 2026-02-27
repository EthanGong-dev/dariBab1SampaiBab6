// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_12;

import java.util.Scanner;

public class soalan1 {
	
     public static String generate(){
		
		int generator = (int) (1+(Math.random()*3));
		String comp = "";

		switch (generator){
		case 1:
			comp = "rock";
			break;
		case 2:
			comp = "paper";
			break;
		case 3:
			comp = "scissors";
			break;
		}
		
		return comp;
	}		

	public static String yours() {
		
		Scanner input = new Scanner (System.in);
		String yours;
		
		System.out.print("What is your choice: ");
		yours = input.nextLine();
		
		return yours;  
	}
	
	public static void dispComp(String Comp) {
		System.out.println("The computer choose: " + Comp);
	}
	
	public static int winner(String yours, String comp) {

	    if (yours.equals(comp)) {
	        System.out.println("Draw!");
	        return 1;
	    }

	    if (yours.equals("rock") && comp.equals("scissors") ||
	        yours.equals("scissors") && comp.equals("paper") ||
	        yours.equals("paper") && comp.equals("rock")) {
	        
	        System.out.println("You win!");
	        return 0;
	    } 
	    else {
	        System.out.println("Computer win!");
	        return 0;
	    }
	}

	
	public static void main(String[] args) {
		
		int again = 1;
		
		do {
			String comp = generate();
			String yours = yours();
			dispComp(comp);
			again = winner(yours, comp);
		} while (again == 1);

	}
		
	

}
