package geminiQuestion;

import java.util.Scanner;
import java.util.InputMismatchException;

public class question1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
            try {
                System.out.print("Masukkan umur (nombor): ");
                int umur = input.nextInt(); 
                System.out.println("Umur kau: " + umur);
                break; 
            } 
            catch (InputMismatchException e) {
                System.out.println("Sila masukkan nombor sahaja!");
                input.next();
            }
        }
        input.close();
		
	}

}