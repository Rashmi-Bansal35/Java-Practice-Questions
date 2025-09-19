package Array;

public class Palindrome {
    public static int[] reverse(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void checkPalindrome(int[] arr, int[] temp){
        boolean result = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != temp[i]){
                result = false;
            }
        }
        if(result){
            System.out.println("The given array is palindrome.");
        }
        else{
            System.out.println("The given array is not palindrome.");
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 91};
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        reverse(arr);
        checkPalindrome(arr, temp);
    }
}
