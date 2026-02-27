// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_12;

import java.util.Scanner;

public class soalan2 {
	
	public static String comp() {
		
		int generator = (int) (Math.random()*5);
		String colour = "";

		switch (generator){
		case 0:
			 colour = "Red";
			 break;
		case 1:
			colour = "Green";
			break;
		case 2:
			colour = "Blue";
			break;
		case 3:
			colour = "Orange";
			break;
		case 4:
			colour = "Yellow";
			break;
		}
		
		return colour;
	}
	
	public static String yours() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your guess: ");
		String guess = input.nextLine();
		
		return guess;
	}
	
	public static int count(String comp, String yours, int correct) {

		System.out.println("The selected colour is " + comp);
		
		if (yours.equals(comp)) {
	        correct++;
	    }

		return correct;
	}

	public static void main(String[] args) {
		
		int correct=0;
		
		for(int i=1; i <= 10; i++) {
			
			String colour = comp();
			String yours = yours();
			correct = count(colour, yours, correct);
		}
		
		System.out.println("You have " + correct + " times that your predict for the colour are true.");
	}

}
