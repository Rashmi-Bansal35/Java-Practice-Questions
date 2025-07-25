/*
Write a program to perform open the door program.
*/

package Statements;
import java.util.Scanner;

public class doorOpen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int door_password = 311207;
        System.out.print("Password: ");
        int entered_password = input.nextInt();

        if (door_password == entered_password){
            System.out.println("Unlocked");
        }
        else{
            System.out.println("Try Again!");
        }
        input.close();
    }
}
