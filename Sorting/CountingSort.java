package Sorting;

public class CountingSort {
    public static void main(String[] args){
        int[] array = {1, 2, 4, 5, 2, 2, 7};
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        for (int i = 1; i <= max; i++){
            count[i] += count[i - 1];
        }
        int[] output = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        for (int i = 0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}
