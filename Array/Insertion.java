package Array;
public class Insertion {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 5;
        arr[3] = 8;
        arr[4] = 10;

        int insert = 43;
        int position = 3;
        for (int i = arr.length - 1; i > position-1; i--){
            arr[i] = arr[i-1];
        }
        arr[position - 1] = insert;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
