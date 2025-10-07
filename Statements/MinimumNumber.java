package Statements;
import java.util.Scanner;

public class MinimumNumber {
    public static void userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        findMin(a, b);
        input.close();
    }

    public static void findMin(double num1, double num2){
        if(num1 < num2){
            System.out.println(num1+ " is smaller than " +num2);
        }
        else{
            String msg = (num1 == num2)?"Both numbers are equal":(num2+ " is smaller than " +num1);
            System.out.println(msg);
        }
    }

    public static void main(String[] args){
        userInput();
    }
}
