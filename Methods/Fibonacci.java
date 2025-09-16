package Methods;
import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciSeries(int term){
        int firstTerm = 0, secondTerm = 1;
        int nextTerm = 0;
        System.out.print(firstTerm +"\n"+ secondTerm +"\n");
        int i = 3;
        while(i != term){
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
            System.out.println(nextTerm);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int term = input.nextInt();
        fibonacciSeries(term);
        input.close();
    }
}
