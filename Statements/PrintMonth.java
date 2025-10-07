package Statements;
import java.util.Scanner;

public class PrintMonth {
    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1-12: ");
        int number = input.nextInt();
        input.close();
        return number;
    }

    public static String monthName(){
        int num = userInput();
        String month = "";
        switch (num) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                return "Invalid Input";
        }
        return month;
    }
    public static void main(String[] args){
        String value = monthName();
        System.out.println("The month of the year is " +value);
    }
}
