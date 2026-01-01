/* Create a class called Calculator which has different add methods. Overload the methods with different parameter. */
package Experiments;
import java.util.Scanner;

class Calculator{
    public static int addNumbers(int a, int b){
        return a+b;
    }

    public static int addNumbers(int a, int b, int c){
        return a+b+c;
    }

    public static int addNumbers(int a, int b, int c, int d){
        return a+b+c+d;
    }
}

public class Experiment4 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int sumOf2Numbers = Calculator.addNumbers(num1, num3);
        int sumOf3Numbers = Calculator.addNumbers(num4, num1, num2);
        int sumOf4Numbers = Calculator.addNumbers(num4, num1, num2, num3);

        System.out.println("Result from 2 parameter method: " + sumOf2Numbers);
        System.out.println("Result from 3 parameter method: " + sumOf3Numbers);
        System.out.println("Result from 4 parameter method: " + sumOf4Numbers);

        input.close();
    }
}
