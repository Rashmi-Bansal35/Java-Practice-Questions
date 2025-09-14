package Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int[] arr1 = {10, 2, 38, 4};
        int arr2[] = new int[4];
        arr2[0] = 2;
        arr2[1] = 4;
        arr2[2] = 3;
        arr2[3] = 8;
        for(int i = 0; i < 4; i++){
            System.out.println(arr1[i]);
        }

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
