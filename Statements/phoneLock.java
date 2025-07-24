/*
Write a program to perform phone lock program.
*/

package Statements;
import java.util.Scanner;

public class phoneLock {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int password = 3112;
        System.out.print("Enter password to unlock the phone: ");
        int unlockPassword = input.nextInt();
        if (password == unlockPassword){
            System.out.println("Phone Unlocked");
        }
        else{
            System.out.println("Wrong Password. Try Again!");
        }
        input.close();
    }
}
