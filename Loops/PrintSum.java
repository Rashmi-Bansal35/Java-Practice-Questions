/*
Write a program to print sum of all digits from 50 to 60.
*/
package Loops;

public class PrintSum {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 50; i <= 60; i++){
            sum += i;
        }

        System.out.println("The sum is " +sum);
    }
}
