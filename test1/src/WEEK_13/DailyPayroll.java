//Author's name: Muhammad Arman Arfan bin MOhd Fyrulnizam
//Matric number: BC252713
//Lab No: Group 9

package WEEK_13;

import java.util.Scanner;

public class DailyPayroll {

    public static void main(String[] args) {

        int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        int[] hours = new int[employeeId.length];
        double[] payRates = new double[employeeId.length];
        double[] wages = new double[employeeId.length];

        display(employeeId, hours, payRates);

        System.out.println("\nEmployee Gross Wages:");
        for (int i = 0; i < employeeId.length; i++) {
            wages[i] = getGrossPay(employeeId[i], employeeId, hours, payRates);
            System.out.println("Employee ID: " + employeeId[i] +
                               " | Gross Wages: RM" + wages[i]);
        }
    }

    public static void display(int[] employeeId, int[] hours, double[] payRates) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < employeeId.length; i++) {
            System.out.println("Employee ID: " + employeeId[i]);

            do {
                System.out.print("Hours: ");
                hours[i] = input.nextInt();
            } while (hours[i] < 0);

            do {
                System.out.print("Pay rate: ");
                payRates[i] = input.nextDouble();
            } while (payRates[i] < 6.00);

            System.out.println();
        }
    }

    public static double getGrossPay(int id, int[] employeeId,
                                     int[] hours, double[] payRates) {

        for (int i = 0; i < employeeId.length; i++) {
            if (employeeId[i] == id) {
                return hours[i] * payRates[i];
            }
        }
        return 0.0;
    }
}


