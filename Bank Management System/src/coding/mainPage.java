package coding;

import java.util.*;

class Intro {	
	String bankName = "FrostBank"; //Name for bank
	String introBank = "Welcome to " + bankName; //introduction
	int lengthIntro = introBank.length();
	
	public void displayIntro()
	{
		System.out.println(introBank);		
		for (int i = 1; i <= lengthIntro; i++) {
			System.out.print("-");
		}
	}
	
}

class question {
	
	Scanner input = new Scanner(System.in);
	int haveAcc;
	
	public void ask() {
		System.out.print("\n\nDo you already have an account? ( 1-Yes / 2-No )");
		
		do {
			haveAcc = input.nextInt();
			input.nextLine(); //reset input
			
			if (haveAcc == 2) {
				registerAcc();
			}
		} while (haveAcc != 1 || haveAcc != 2);
	}
}

public class mainPage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Intro i = new Intro();
		i.displayIntro();	
		
		question q = new question();
		q.ask();

	}

}
