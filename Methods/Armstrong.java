package Methods;
import java.util.Scanner;

public class Armstrong {
    public static int digits(int number){
        int count = 0, digit1 = 0;
        while(number != 0){
            digit1 = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }

    public static boolean armstrong(int number){
        int calculate = 0, digit = 0, temp = number;
        int numberOfDigits = digits(number);
        while(number != 0){
            digit = number % 10;
            number /= 10;
            calculate += (int)Math.pow(digit, numberOfDigits);
        }
        if(temp == calculate){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check it's armstrong or not: ");
        int number = input.nextInt();
        boolean isArmstrong = armstrong(number);
        if(isArmstrong){
            System.out.println("The number is armstrong.");
        }
        else{
            System.out.println("The number is not armstrong.");
        }
        input.close();
    }
}
