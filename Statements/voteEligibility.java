/*
Write a program to check eligibility for voting.
*/

package Statements;
import java.util.Scanner;

public class voteEligibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 18){
            System.out.println("You are not eligible for voting.");
        }
        else{
            System.out.println("You are eligible for voting.");

        input.close();
        }
    }
}
