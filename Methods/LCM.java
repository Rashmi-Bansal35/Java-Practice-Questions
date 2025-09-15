package Methods;
import java.util.Scanner;

public class LCM {
    public static int calculateLCM(int firstNumber, int secondNumber){
        for(int i = 1; i <= secondNumber; i++){
            int factor = firstNumber * i;
            if(factor % secondNumber == 0){
                return factor;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = input.nextInt();
        int lcm = calculateLCM(firstNumber, secondNumber);
        System.out.println("The lCM is: " +lcm);
        input.close();
    }    
}
