package Array;
import java.util.Scanner;

public class OccurrenceOfElement {
    public static void occurrence(int element){
        int count = 0;
        int[] arr = {37, 1, 33, 2, 2, 90, 10, 40, 10, 42, 2};
        for(int i = 0; i < arr.length; i++){
            if(element == arr[i]){
                count += 1;
            }
        }
        System.out.println("The occurrence of element is: " +count);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find number of occurrence: ");
        int element = input.nextInt();
        occurrence(element);
        input.close();
    }
}
