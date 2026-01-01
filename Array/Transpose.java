/* For a given matrix of n*m print its transpose*/
package Array;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        input.nextLine();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        int[][] transpose = new int[rows][cols]; 

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose: ");
        for (int i = 0; i < cols; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }

        input.close();
    }
}
