package Array;
import java.util.Scanner;

public class Cash {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of cash: ");
        int cash = input.nextInt();
        System.out.print("Enter the amount of what you purchase: ");
        int purchase = input.nextInt();
        int change = cash - purchase;
        int[] notes = {1000, 500, 200, 100, 50, 20, 10};
        System.out.println("Amount left: ");
        if(change != 0){
            for(int note: notes){
                if(change >= note){
                    int count = change/note;
                    change %= note;
                    System.out.println(count+ " x " +note);
                }
                if(change == 0){
                    break;
                }
            }
        }
        else {
            System.out.println("Not enough balance");
        }
        input.close();
    }
}
