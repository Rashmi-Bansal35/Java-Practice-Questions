/* 
Write a program to print grades based on percentage:
A -> above 90%              B -> above 75%
C -> above 60%              D -> above 33%          F -> below 33%
*/
package Statements;
import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        float marks = scanner.nextFloat();

        if (marks >= 90.0){
            System.out.println("Grade: A\nExcellent! You did a fantastic job. Keep up the the great work!");
        }
        else if(marks >= 75.0){
            System.out.println("Grade: B\nGreat work! You're doing well - a liitle more effort and you'll reach the top!");
        }
        else if(marks >= 60.0){
            System.out.println("Grade: C\nYou passed! Nice effort, but there's room to improve. Keep going!");
        }
        else if(marks >= 33.0){
            System.out.println("Grade: D\nYou just passed. Focus more and study smarter next time!");
        }
        else{
            System.out.println("Grade: F\nYou failed.");
        }
        scanner.close();
    }
}
