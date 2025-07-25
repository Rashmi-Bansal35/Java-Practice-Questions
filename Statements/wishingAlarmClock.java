/*
Write a program to perform clock wishing alarm.
*/
package Statements;
import java.util.Scanner;

public class wishingAlarmClock {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hour(0-23): ");
        int time = input.nextInt();

        if (time < 12){
            System.out.println("Good Morning...");
        }
        else if(time < 17){
            System.out.println("Good Afternoon...");
        }
        else if(time < 20){
            System.out.println("Good Evening...");
        }
        else if(time < 24){
            System.out.println("Good Night...");
        }
        else{
            System.out.println("Invalid Input!!");
        }
        input.close();
    }
}
