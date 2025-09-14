/*
Write a function that calculates the factorial of a given number.
*/

package Methods;
import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int number){
        int factorial = 1;
        for (int i = 2; i <= number; i ++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print it's factorial: ");
        int number = input.nextInt();
        int factorial = calculateFactorial(number);
        System.out.println("The factorial is: " +factorial);
        input.close();
    }
}
