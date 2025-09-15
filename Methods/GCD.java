package Methods;
import java.util.Scanner;

public class GCD {
    public static int calculateGCD(int firstNumber, int secondNumber){
        
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = input.nextInt();
        int gcd = calculateGCD(firstNumber, secondNumber);
        System.out.println("The GCD is: " +gcd);
        input.close();
    }
}
