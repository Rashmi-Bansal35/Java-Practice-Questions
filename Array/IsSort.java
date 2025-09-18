package Array;

public class IsSort {
    public static boolean checkSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 40, 5, 8, 11};
        boolean isSort = checkSort(arr);
        if(isSort){
            System.out.println("The given array is sorted.");
        }
        else{
            System.out.println("The given array is not sorted.");
        }
    }
}
