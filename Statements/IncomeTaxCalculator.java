/*
To write a Java program that calculates income tax based on income and gender 
using if statements and follows different tax slabs for general and women.
 */
package Statements;
import java.util.Scanner;

public class IncomeTaxCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter gender (M for male, F for female): ");
        char gender = input.next().charAt(0);

        System.out.print("Enter income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (gender == 'M'|| gender == 'm'){
            if (income <= 180000){
                tax = 0;
            }
            else if (income <= 500000){
                tax = (income - 180000) * 0.1;
            }
            else if (income <= 800000){
                tax = 32000 + (income - 500000) * 0.2;
            }
            else if (income > 800000){
                tax = 32000 + 60000 + (income - 800000) * 0.3;
            }
        }
        else if (gender == 'F' || gender == 'f'){
            if (income <= 190000){
                tax = 0;
            }
            else if (income <= 500000){
                tax = (income - 190000) * 0.1;
            }
            else if (income <= 800000){
                tax = 31000 + (income - 500000) * 0.2;
            }
            else if (income > 800000){
                tax = 31000 + 60000 + (income - 800000) * 0.3;
            }
        }
        else{
            System.out.println("Invalid gender entered.");
        }

        System.out.println("Tax to be paid: " +tax);
        input.close();
    }
}