/*
Create a program to sum all odd numbers from 1 to a specified number N.
*/
package Methods;
import java.util.Scanner;

public class OddNumberSum {
    public static int OddNumbers(int number){
        int sum = 0;
        for(int i = 0; i <= number; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find sum of odd numbers from 1: ");
        int number = input.nextInt();
        int sum = OddNumbers(number);
        System.out.println("The sum of odd numbers is: " +sum);
        input.close();
    }
}
