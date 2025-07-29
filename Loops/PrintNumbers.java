/*
Write a program to print 200 to 150 even and odd numbers.
 */
package Loops;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'O' for odd and 'E' for even: ");
        char num = input.next().charAt(0);

        switch (num){
            case 'O':
                System.out.println("Odd numbers: ");
                for(int i = 199; i >= 150; i -= 2){
                    System.out.println(i);
                }
                break;
            case 'E':
                System.out.println("Even numbers: ");
                for(int i = 200; i >= 150; i -= 2){
                    System.out.println(i); 
                }
                break;
            default:
                System.out.println("Invalid Input!");
        }
        input.close();
    }
}
