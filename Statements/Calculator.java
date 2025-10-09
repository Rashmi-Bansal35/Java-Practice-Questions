package Statements;
import java.util.Scanner;

public class Calculator {
    char character;
    double num1, num2;

    Calculator(char character, double num1, double num2){
        this.character = character;
        this.num1 = num1;
        this.num2 = num2;
    }

    public static Calculator userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'a' for add, 's' for subtract, 'm' for multiply, 'd' for division: ");
        String str = input.nextLine().toLowerCase();
        char character = str.charAt(0);
        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.close();
        return new Calculator(character, num1, num2);
    }

    public static void performCalculation(){
        Calculator calc = userInput();
        switch (calc.character) {
            case 'a':
                System.out.println("Result: " + (calc.num1 + calc.num2));
                break;
            case 's':
                System.out.println("Result: " + (calc.num1 - calc.num2));
                break;
            case 'm':
                System.out.println("Result: " + (calc.num1 * calc.num2));
                break;
            case 'd':
                if (calc.num2 != 0) {
                    System.out.println("Result: " + (calc.num1 / calc.num2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
    public static void main(String[] args){
        performCalculation();
    }
}
