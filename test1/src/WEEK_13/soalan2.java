//Author's name: Muhammad Arman Arfan bin MOhd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_13;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int i=0;
		int[] number = new int[50];
		int value;

		System.out.print("Enter the integers between 1 and 50: ");
		
		do {
			value = input.nextInt();
			
			if (value >= 1 && value <= 50) {
				number[i] = value;
				i++;
			}
		} while (value != 0);

		int count = 0;
		
		for (int j = 1; j <= 50; j++) {
			
			count = 0;
              
			for (int x = 0; x <= i; x++) {

				if (number[x] == j) {
					count++;
				}

		    }
			
			if (count == 1) {
				System.out.println(j + " occurs " + count + " time");
			}
			else if (count > 1 && count < 51){
			System.out.println(j + " occurs " + count + " times");
		    }
       }
}
}
