/*
Create a program to check whether a given number is prime.
*/

package Methods;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean CheckPrime(int number){
        boolean prime = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime or not: ");
        int number = input.nextInt();
        boolean prime = CheckPrime(number);
        if(!prime){
            System.out.println("The given number is not prime.");
        }
        else{
            System.out.println("The given number is prime.");
        }
        input.close();
    }
}
