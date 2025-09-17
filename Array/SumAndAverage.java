package Array;
import java.util.Scanner;

public class SumAndAverage {
    public static int[] input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = input();
        int addition = sum(arr);
        double average = (double)addition / arr.length;
        System.out.println("Sum: " +addition);
        System.out.println("Average: " +average);
    }
}
