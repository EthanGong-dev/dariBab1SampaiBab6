// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_5;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int w1=0,w2=0;
		double p1=0,p2=0, rate=0;
		
		System.out.print("Enter weight and price for package 1: ");
		w1 = input.nextInt();
		p1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		w2 = input.nextInt();
		p2 = input.nextDouble();
		
		input.close();
		
		rate = w1/w2;
		p1 = p1/rate;
		
		if (p1 < p2){
			System.out.print("Package 1 has better price.");
		}
		else {
			System.out.print("Package 2 has better price.");
		}

	}

}
