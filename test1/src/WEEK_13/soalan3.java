//Author's name: Muhammad Arman Arfan bin MOhd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_13;

import java.util.Scanner;

public class soalan3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int[] values;
		boolean fact = false;
		
		System.out.print("Enter the number of values: ");
		x = input.nextInt();

		values = new int[x];
		
		fact = isConsecutiveFour(values);
		
		if (fact == true) {
			System.out.print("The list has consecutive fours");
		}
		else {
			System.out.print("The list has no consecutive fours");
		}
	}
	
	public static boolean isConsecutiveFour(int[] values) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int count = 0;
		
		System.out.print("Enter the values: ");
		
		for (int i = 0; i < values.length; i++) {
			number = input.nextInt();
			
			values[i] = number;
		}
		
		for (int j = 1; j < values.length; j++) {

            if (values[j] == values[j - 1]) {
                count++;
                
                if (count == 4) {
                    return true;
                }
            } 
            
            else {
                count = 1;
            }
        }

        return false;
    }

}