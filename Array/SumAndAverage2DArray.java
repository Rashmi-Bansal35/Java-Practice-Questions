package Array;

public class SumAndAverage2DArray {
    public static int sum(int[][] arr){
        int add = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                add += arr[i][j];
            }
        }
        return add;
    }

    public static double average(int add, int totalElements){
        double avg = add / totalElements;
        return avg;
    }
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int totalElements = arr.length * arr[0].length;
        int add = sum(arr);
        double avg = average(add, totalElements);
        System.out.println("The sum of array is: " +add+ ".\nThe average of array is: " +avg);
    }
}
