// Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
// Matric number: BC252713
// Lab No: Group 9

package WEEK_3;

import java.util.Scanner;

public class soalan4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        String age = input.nextLine();

        System.out.print("Enter the name of a city: ");
        String city = input.nextLine();

        System.out.print("Enter the name of a college: ");
        String college = input.nextLine();

        System.out.print("Enter a profession: ");
        String profession = input.nextLine();

        System.out.print("Enter a type of animal: ");
        String animal = input.nextLine();

        System.out.print("Enter a pet's name: ");
        String petName = input.nextLine();

        System.out.println("\nThere was once a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");

        input.close();
    }
}
