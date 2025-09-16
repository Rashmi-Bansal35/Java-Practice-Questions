package Methods;
import java.util.Scanner;

public class GCD {
    public static int least(int firstNumber, int secondNumber){
        if(firstNumber < secondNumber){
            return firstNumber;
        }
        else{
            return secondNumber;
        }
    }

    public static int calculateGCD(int firstNumber, int secondNumber){
        int gcd = 1;
        int least = least(firstNumber, secondNumber);
        for(int i = 2; i <= least; i++){
            if(firstNumber % i == 0 && secondNumber % i == 0){
                gcd = i;
            }
        }
        return gcd;
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
