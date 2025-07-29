/*
Write a program to print table of any number.
 */
package Loops;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print it's table: ");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
        input.close();
    }
}
