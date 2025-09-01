/*
To develop a Java program that accepts the total number of eggs as input from the 
user and calculates the equivalent number of gross (1 gross = 144 eggs), dozen (1 dozen 
= 12 eggs), and the remaining eggs, then displays the result.
 */
import java.util.Scanner;

public class EggCalculater{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of eggs: ");
        int totalEggs = input.nextInt();
        int eggs_in_gross = totalEggs / 144;
        int eggs_in_dozen = (totalEggs % 144) / 12;
        int remainingEggs = totalEggs % 12;

        System.out.println("The number of eggs is " +eggs_in_gross+ " gross, " +eggs_in_dozen+ 
        " dozen and " +remainingEggs+ " remaining.");
        input.close();
    }
}
