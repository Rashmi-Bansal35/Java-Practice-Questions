package Strings;

public class StringBufferObject {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // Default capacity of StringBuffer is 16 characters.
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer("Rashmi");

        // Capacity = String length + 16
        // Here: 6 + 16 = 22
        System.out.println(sb2.capacity());

        // Returns the number of characters currently stored.
        System.out.println(sb2.length());

        // Appends text at the end.
        System.out.println(sb2.append(" Bansal"));

        // Converts StringBuffer to String.
        String str = sb2.toString();

        // Deletes character at the specified index.
        System.out.println(sb2.deleteCharAt(3));

        // Inserts text at the specified index.
        System.out.println(sb2.insert(2, " Java "));

        // Sets the length of the StringBuffer.
        // If the new length is greater than the current length,
        // null characters (\u0000) are added at the end.
        sb2.setLength(14);

        // StringBuffer vs StringBuilder
        // StringBuffer  -> Thread-safe (synchronized)
        // StringBuilder -> Not thread-safe (faster)
    }
}