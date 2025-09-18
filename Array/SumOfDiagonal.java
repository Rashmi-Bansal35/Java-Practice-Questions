package Array;

public class SumOfDiagonal {
    public static int elementSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = elementSum(arr);
        System.out.println("The sum of diagonal elements is: " +sum);
    }
}
