package Strings;

public class StringBufferObject {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        // It gives a capacity of 16 bytes which is called buffer size
        System.out.println(sb.capacity()); // Prints the capacity

        StringBuffer sb2 = new StringBuffer("Rashmi");
        // Gives actual buffer size + our input length so that if there is no continous memory available in memory during changes it doesn't have to rellocate the data

        System.out.println(sb2.length()); // Prints length of stringBuilder
        System.out.println(sb2.append(" Bansal")); // Appends the stringBuilder

        String str = sb2.toString(); // Coverts from stringBuilder to string

        System.out.println(sb2.deleteCharAt(3)); // Deletes character from specific location

        System.out.println(sb.insert(2, " Java ")); // Inserts character or word at specific location

        sb2.setLength(14); // Sets length if less than specidied length then null

        // Difference in StringBuilder & StringBuffer
        // StringBuffer -> Thread Safe
        // StringBuilder -> Not Thread Safe

    }
}
