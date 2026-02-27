//Author's name: Muhammad Arman Arfan bin Mohd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_3;

import java.util.Scanner;

public class soalan1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, height, length, area, volume;
        
        System.out.print("What is the base for triangle in cm: ");
        base = input.nextDouble();

        System.out.print("What is the height for triangle in cm: ");
        height = input.nextDouble();
        
        System.out.print("What is the length for triangle in cm: ");
        length = input.nextDouble();
        
        input.close();

        area = (1.0/2.0)*(base)*(height);
        volume = (area)*(length);
        
        System.out.println("The area of triangle is " + area + "cm.");
        System.out.println("The volume of triangle is " + volume + "cm.");        
    }
}
