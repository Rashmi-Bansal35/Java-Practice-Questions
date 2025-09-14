package Loops;
/*
Write a program to check if string is palindrome or not.
*/
import java.util.*;

public class CheckPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] array = A.toCharArray();
        char[] reverse = new char[array.length];
        for(int i = 0; i < array.length; i++){
            reverse[i] = array[array.length - i - 1];
        }
        
        if(Arrays.equals(array, reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        sc.close();
    }
}