package Array;

public class Reverse {
    public static int[] reverse(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] newArr = reverse(arr);
        System.out.println("The reverse array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
