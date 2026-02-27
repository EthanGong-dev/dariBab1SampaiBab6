// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_9;

import java.util.Scanner;

public class soalan1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int q, correct=0, count=0;
		String ans;
		
		System.out.println("WELCOME TO THE QUIZ\n\n\n");
		
		for (q=1; q<=5; q++) {
			switch(q) {
			case 1:
				System.out.println("Who is th the one can do a 7 black flash in a row?\n");
				System.out.println("A.Gojo\nB.Yuji\nC.Hakari\nD.Todo");
				ans = input.nextLine();
				count++;
				
				if(ans.equals("B")) {
					System.out.println("Correct!\n");
					correct ++;
				}
				else {
					 System.out.println("Incorrect!\n");
		             System.out.println("Correct answer: B.Yuji\n");
				}
			break;
			case 2:
				System.out.println("Which body Sukuna enter to kill Gojo Satoru?\n");
				System.out.println("A.Megumi\nB.Yuji\nC.Hana\nD.Nobara");
				ans = input.nextLine();
				count++;
				
				if(ans.equals("A")) {
					System.out.println("Correct!\n");
					correct ++;
				}
				else {
					 System.out.println("Incorrect!\n");
		             System.out.println("Correct answer: A.Megumi\n");
				}
			break;
			case 3:
				System.out.println("What technique does Satoru Gojo famously use?\n");
				System.out.println("A.Black Flash\nB. Domain Amplification\nC. Limitless\nD. Simple Domain");
				ans = input.nextLine();
				count++;
				
				if(ans.equals("C")) {
					System.out.println("Correct!\n");
					correct ++;
				}
				else {
					 System.out.println("Incorrect!\n");
		             System.out.println("Correct answer: C. Limitless\n");
				}
			break;
			case 4:
				System.out.println("What type of curse is Mahito?\n");
				System.out.println("A.Disaster Curse\nB.Special Grade Tool\nC.Shikigami\nD.Vengeful Spirit");
				ans = input.nextLine();
				count++;
				
				if(ans.equals("A")) {
					System.out.println("Correct!\n");
					correct ++;
				}
				else {
					 System.out.println("Incorrect!\n");
		             System.out.println("Correct answer: A.Disaster Curse\n");
				}
			break;
			case 5:
				System.out.println("What is Sukuna also known as?\n");
				System.out.println("A.King of Sorcerers\nB.Demon Lord\nC.Curse Slayer\nD.King of Curses");
				ans = input.nextLine();
				count++;
				
				if(ans.equals("D")) {
					System.out.println("Correct!\n");
					correct ++;
				}
				else {
					 System.out.println("Incorrect!\n");
		             System.out.println("Correct answer: D.King of Curses\n");
				}
			break;
			}
		}
		
		 double percentage = (correct * 100.0) / count;
		
		System.out.println("===== QUIZ RESULT =====");
	    System.out.println("Correct answers   : " + correct);
	    System.out.println("Incorrect answers : " + (count - correct));
	    System.out.println("Percentage        : " + percentage + "%");

	    input.close();
	}

}
