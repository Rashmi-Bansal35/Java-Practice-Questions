package Methods;
import java.util.Scanner;

public class Palindrome {
    public static boolean CheckPalindrome(int number){
        boolean palindrome = false;
        int reverse = 0, temp = number;
        while(number != 0){
            
        }
        if(reverse == temp){
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
