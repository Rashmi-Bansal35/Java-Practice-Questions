/*
Create a program that computes the sum of the digits of an integer.
*/

package Methods;
import java.util.Scanner;

public class SumOfDigits {
    public static int Sum(int number){
        int sum = 0;
        while(number != 0){
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int sum = Sum(number);
        System.out.println("The sum of digits is: " +sum);
        input.close();
    }
}
