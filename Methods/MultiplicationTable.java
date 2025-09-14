/* Develop a program that prints the multiplication Table for a given number. */

package Methods;
import java.util.Scanner;

public class MultiplicationTable {
    public static void table(int number){
        for(int i = 1; i < 11; i++){
            System.out.printf("\n%d x %d = %d", number, i, number * i);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print it's table: ");
        int number = input.nextInt();
        table(number);
        input.close();
    }
}
