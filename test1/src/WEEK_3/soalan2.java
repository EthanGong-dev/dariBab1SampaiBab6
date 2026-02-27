//Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_3;

public class soalan2 {

	public static void main(String[] args) {
		
		double stock = 600.00;
		double price = 21.77;
		double paid = 0.02;
		double s_alone = stock*price;
		double commission = s_alone*paid;
		double total = s_alone + commission;
		
		System.out.println("The amount paid for the stock alone without commission is RM" + s_alone + ".");
		System.out.println("The amount of the commission is RM" + commission + ".");
		System.out.println("The total amount paid for the stock plus the commission is RM" + total + ".");

	}

}
