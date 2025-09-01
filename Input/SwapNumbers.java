/*
To write a Java program that accepts two numbers from the user, swaps them 
without using a temporary variable, and displays the result. 
 */
import java.util.Scanner;

public class SwapNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int firstNo = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNo = input.nextInt();
        System.out.println("\nBefore Swap: ");
        System.out.println("1st number: " +firstNo+ "\n2nd number: " +secondNo);
        firstNo = firstNo + secondNo;
        secondNo = firstNo - secondNo;
        firstNo -= secondNo;
        System.out.println("\nAfter Swap: ");
        System.out.println("1st number: " +firstNo+ "\n2nd number: " +secondNo);
        input.close();
    }
} 
