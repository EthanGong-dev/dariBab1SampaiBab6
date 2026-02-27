// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_9;

public class soalan2 {

	public static void main(String[] args) {
		
		int i, j, sum=0;
		
		for (i=1; i<=1000; i++) {
			sum = 0;
			for (j=1; j<=i/2; j++) {
				if(i%j == 0) {
					sum += j;
				}				
			}
	        if(sum == i && i != 0) {
	        	System.out.print(i + " ");
	        }
		}

	}

}
