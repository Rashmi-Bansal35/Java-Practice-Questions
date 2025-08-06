/*
Write a program to print pattern:
i)  1 2 3      ii) A B C      iii) 1 2 3
    4 5 6          A B C           1 2 3
    7 8 9          A B C           1 2 3
 */

package Loops;
import java.util.Scanner;

public class SquarePattern{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of pattern: ");
        int size = input.nextInt();
        int count = 1;
        System.out.println("\n\nPattern (i)");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.print("\n");
        }

        System.out.println("\n\nPattern (ii)");
        for(int i = 0; i < size; i++){
            char ch = 'A';
            for(int j = 0; j < size; j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.print("\n");
        }

        System.out.println("\n\nPattern (iii)");
        for(int i = 0; i < size; i++){
            int var = 1;
            for(int j = 0; j < size; j++){
                System.out.print(var +" ");
                var++;
            }
            System.out.print("\n");
        }

        input.close();
    }
}