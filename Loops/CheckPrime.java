/*
Write a program to check number is prime or not. 
*/
package Loops;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
            }
        }
        if (!isPrime){
            System.out.println(num+ " is not a prime number.");
        }
        else{
            System.out.println(num+ " is a prime number.");
        }
        input.close();
    }
}
