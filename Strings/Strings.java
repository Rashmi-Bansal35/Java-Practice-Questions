package Strings;

public class Strings {
    public static void main(String[] args){
        String obj = new String("Rashmi");
        System.out.println(obj);
        System.out.println(obj.hashCode()); // Prints hashcode of string
        System.out.println("Hello " + obj); // Conactinating 2 strings
        System.out.println(obj.charAt(2)); // Accessing character from string
        System.out.println(obj.concat(" Bansal")); // Concatinate 2 strings by using concat mehtod

        String s1 = "Rashmi";
        String s2 = "Rashmi";
        // It can be seems like there are 2 different objects 
        // Every string we create is constant and stored in string constant pool, so we can't change data

        // There are 2 type of strings: Mutable -> change & Immutable -> unchange
        // There are 2 objects called StringBuffer & StringBuilder for mutable sttring
    }
}
