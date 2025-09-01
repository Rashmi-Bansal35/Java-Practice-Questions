import java.util.Scanner;
public class seats {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of seats: ");
        int total_seats = input.nextInt();
        int seats_in_row = total_seats/20;
        int seats_in = (total_seats % 20)/5;
        int remaining_seats = total_seats % 5;
        System.out.println("The number of seats is " +seats_in_row+ " rows, " +seats_in+ 
        "  and " +remaining_seats+ " remaining.");
        input.close();
    }
}
