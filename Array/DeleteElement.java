package Array;
import java.util.Scanner;

public class DeleteElement {
    public static void printArray(int[] arr){
        System.out.println("The array is: ");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] +" "); 
            }
            System.out.println();
    }

    public static int[] newArray(int delete, int[] arr){
        int[] arr1 = new int[arr.length-1];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != delete){
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {12, 34, 67, 49, 22, 40, 12, 64, 90};
        printArray(arr);
        System.out.print("Enter an element you want to delete in this array: ");
        int delete = input.nextInt();
        int[] updatedArray = newArray(delete, arr);
        System.out.println("The updated array is: ");
        for(int i = 0; i < updatedArray.length; i++){
            System.out.print(updatedArray[i] +" ");
        }
        input.close();
    }
}
