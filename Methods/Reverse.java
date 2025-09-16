package Methods;
import java.util.Scanner;

public class Reverse {
    public static int findReverse(int number){
        int reverse = 0, digit = 0;
        while(number != 0){
            digit = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += digit;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int reverse = findReverse(number);
        System.out.println("The reverse of " +temp+ " is " +reverse);
        input.close();
    }
}
