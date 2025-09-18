package Array;

public class MinMax {
    public static int min(int arr[]){
        int minimum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static int max(int arr[]){
        int maximum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args){
        int[] arr = {1, 34, 23, 90, 67, 48, 39, 50, 55, 3, 84, 61};
        int minimum = min(arr);
        int maximum = max(arr);
        System.out.println("The maximum value in array is: " +maximum+ "\nThe minimum value in array is: " +minimum);
    }
}
