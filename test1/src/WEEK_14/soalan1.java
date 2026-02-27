//Author's name: Muhammad Arman Arfan bin MOhd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_14;

import java.util.Scanner;

public class soalan1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char[] answer = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
		char[] studentAnswer = new char[answer.length];
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print((i + 1) + ". ");
			
			do {
		           studentAnswer[i] = Character.toUpperCase(input.next().charAt(0));
			} while(studentAnswer[i] != 'A' && studentAnswer[i] != 'B' && studentAnswer[i] != 'C' && studentAnswer[i] != 'D' );
			
		}
		
		int correct = totalCorrect(answer, studentAnswer);
		int incorrect = totalIncorrect(answer, studentAnswer);
		boolean pass = passed(correct);
		
		System.out.println("Correct: " + correct);
		System.out.println("Incorrect: " + incorrect);
		if (pass == true) {
			System.out.println("You past the test!");
		}
		else {
			System.out.println("You do not pass the test.");
		}
		questionsMissed(answer, studentAnswer);

	}
	
	public static boolean passed(int correct) {
		
		if (correct < 15) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static int totalCorrect(char[] answer, char[] studentAnswer) {
		
		int correctCount = 0;
		
		for (int i =0; i < answer.length; i++) {
			if (answer[i] == studentAnswer[i]) {
				correctCount++;
			}
		}
		
		return correctCount;
	}

	
    public static int totalIncorrect(char[] answer, char[] studentAnswer) {
    	
        int incorrectCount = 0;
		
		for (int i =0; i < answer.length; i++) {
			if (answer[i] != studentAnswer[i]) {
				incorrectCount++;
			}
		}
		
		return incorrectCount;
		
	}

    public static void questionsMissed(char[] answer, char[] studentAnswer) {
		
    	int[] missed = new int[answer.length];
    	
    	for (int i =0; i < answer.length; i++) {
			if (answer[i] != studentAnswer[i]) {
				missed[i] = (i + 1);
			}
		}
    	
    	System.out.println("You just miss these question: ");
    	
    	for (int j =0; j < answer.length; j++) {
    		if (missed[j] != 0) {
			System.out.print(missed[j] + " ");
		    }
	    }
    }
}
