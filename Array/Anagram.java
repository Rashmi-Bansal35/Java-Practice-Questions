package Array;
/*
Write a program to check if two strings are Anagram.
*/
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()){
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            for(int i = 0; i < a.length() - 1; i++){
                for(int j = 0; j < a.length() - 1; j++){
                    if(aArray[j] > aArray[j+1]){
                        char temp = aArray[j];
                        aArray[j] = aArray[j+1];
                        aArray[j+1] = temp;
                    }
                }
            }
            for(int i = 0; i < b.length() - 1; i++){
                for(int j = 0; j < b.length() - 1; j++){
                    if(bArray[j] > bArray[j+1]){
                        char temp = bArray[j];
                        bArray[j] = bArray[j+1];
                        bArray[j+1] = temp;
                    }
                }
            }
            String sortedA = new String(aArray);
            String sortedB = new String(bArray);
            if(sortedA.equals(sortedB)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}