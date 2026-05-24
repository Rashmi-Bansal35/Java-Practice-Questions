package Array;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args){
        // Create object of Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the size of array
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        // Create an array and prompt the values
        int[] arr = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        // Prompt the user to enter value they want to delete
        System.out.print("Enter the value you want to delete: ");
        int delete = input.nextInt();

        int position = -1;
        
        // Find the index of element
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == delete){
                position = i;
            }
        }

        // Shift the elements
        for (int i = position; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        // Display the array
        System.out.println("After deletion: ");
        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }

        // Close the Scanner
        input.close();
    }
}
