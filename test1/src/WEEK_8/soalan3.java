// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_8;

import java.util.Scanner;

public class soalan3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String user;
		
		System.out.print("Enter any string: ");
		user = input.nextLine();
		
		int choice;

        System.out.println("\n=== STRING MENU ===");
        System.out.println("1. Character at specified index");
        System.out.println("2. Compare string with new string");
        System.out.println("3. Count total characters");
        System.out.println("4. Count letters only");
        System.out.println("5. Count digits only");
        System.out.println("6. Swap lowercase and uppercase");
        System.out.println("7. Replace character");
        System.out.println("8. Delete character or substring");
        System.out.println("9. Insert character or string");

        System.out.print("Enter choice: ");
        choice = input.nextInt();
        input.nextLine();
        
        switch (choice) {
        case 1:
        	int index=0;
        	System.out.print("Enter any index: ");
        	index = input.nextInt();
        	input.nextLine();
        	
        	if ((index >= 0) && (index < user.length())) {
        		System.out.println("Character at index " + index + ": " + user.charAt(index));
            } else {
                System.out.println("Invalid index.");
            }
            break;
        case 2:
        	System.out.print("Enter new string to compare: ");
            String newUser = input.nextLine();
            
            if (user.equals(newUser)) {
                System.out.println("It is equal");
            }
            else {
            	System.out.println("It is not equal");
            }
            break;
        case 3:
        	int count = 0;
        	count = user.length();
        	System.out.println("There are " + count + " characters in this string.");
        	break;
        case 4:
        	int letterCount = 0;
            for (int i = 0; i < user.length(); i++) {
                if (Character.isLetter(user.charAt(i))) {
                    letterCount++;
                }
            }
            System.out.println("Total letters: " + letterCount);
            break;
        case 5:
        	int digitCount = 0;
            for (int i = 0; i < user.length(); i++) {
                if (Character.isDigit(user.charAt(i))) {
                    digitCount++;
                }
            }
            System.out.println("Total digits: " + digitCount);
            break;
        case 6:
        	for (int i = 0; i < user.length(); i++) {
        		if (Character.isUpperCase(user.charAt(i))) {
        			Character.toLowerCase(user.charAt(i));
        		}
        		else if (Character.isLowerCase(user.charAt(i))) {
        			Character.toUpperCase(user.charAt(i));
        		}
        	}
        	break;
        case 7:
        	System.out.print("Enter character to replace: ");
            char oldChar = input.nextLine().charAt(0);

            System.out.print("Enter new character: ");
            char newChar = input.nextLine().charAt(0);

            System.out.println("New string: " + user.replace(oldChar, newChar));
            break;
        case 8:
        	System.out.print("Enter character or substring to delete: ");
            String deleteSub = input.nextLine();

            System.out.println("New string: " + user.replace(deleteSub, ""));
            break;
        case 9:
        	  System.out.print("Enter character or string to insert: ");
              String insertStr = input.nextLine();

              System.out.print("Enter position to insert at: ");
              int pos = input.nextInt();
              input.nextLine();

              if (pos < 0 || pos > user.length()) {
                  System.out.println("Invalid position.");
              } else {
                  String newString =
                      user.substring(0, pos) + insertStr + user.substring(pos);
                  System.out.println("After insertion: " + newString);
              }
              break;
        default:
        	System.out.print("Invalid Input");
        	break;
        }

	}

}
