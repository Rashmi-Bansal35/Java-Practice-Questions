package Methods;
import java.util.Scanner;

public class Palindrome {
    public static int reverse(int number){
        int reverse = 0, digit = 0;
        while(number != 0){
            digit = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += digit;
        }
        return reverse;
    }
    
    public static boolean CheckPalindrome(int number){
        boolean palindrome = false;
        int reverse = reverse(number);
        if(reverse == number){
            palindrome = true;
        }
        return palindrome;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check it is palindrome or not: ");
        int number = input.nextInt();
        boolean palindrome = CheckPalindrome(number);
        if(palindrome == true){
            System.out.println("The number is palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
        input.close();
    }
}
