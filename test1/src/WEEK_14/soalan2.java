//Author's name: Muhammad Arman Arfan bin MOhd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_14;

import java.util.Scanner;

public class soalan2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int rows = 0;
		int cols = 0;
		
        System.out.print("Enter the number of rows and columns of the array: ");
        rows = input.nextInt();
        cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] result = locateSmallest(array);

        System.out.println(
            "The location of the smallest element is at (" 
            + result[0] + ", " + result[1] + ")"
        );

	}
	
	public static int[] locateSmallest(double[][] a) {
        int[] location = new int[2]; // [row, column]
        double smallest = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < smallest) {
                    smallest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

}
