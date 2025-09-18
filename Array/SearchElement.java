package Array;
import java.util.Scanner;

public class SearchElement {
    public static int[] search(int[][] arr, int find){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == find){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        System.out.print("Enter an element you want to find in array: ");
        int find = input.nextInt();
        int[] result = search(arr, find);
        if(result[0] != -1){
            System.out.println("Element found at row: " +result[0]+ ", column: " +result[1]);
        }
        else{
            System.out.println("Element not found in array.");
        }
        input.close();
    }
}
