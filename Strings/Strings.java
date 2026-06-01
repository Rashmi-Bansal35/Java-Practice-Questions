package Strings;

public class Strings {
    public static void main(String[] args) {

        String obj = new String("Rashmi");

        System.out.println(obj);

        // Returns the hash code of the String.
        System.out.println(obj.hashCode());

        // Concatenating strings using '+' operator.
        System.out.println("Hello " + obj);

        // Accessing a character at a specific index.
        System.out.println(obj.charAt(2));

        // Concatenating strings using concat() method.
        System.out.println(obj.concat(" Bansal"));

        String s1 = "Rashmi";
        String s2 = "Rashmi";

        // String literals are stored in the String Constant Pool (SCP).
        // Since both strings have the same value, s1 and s2 refer to
        // the same object in the SCP.

        // Strings are immutable, meaning their contents cannot be changed
        // after creation. Any modification creates a new String object.

        // For mutable strings, Java provides:
        // 1. StringBuffer (Thread-safe)
        // 2. StringBuilder (Not thread-safe, faster)
    }
}

/*
String Notes:

1. String is a class in Java used to store a sequence of characters.

2. Strings are immutable, meaning once created,
   their contents cannot be modified.

3. String literals are stored in the String Constant Pool (SCP)
   to save memory by reusing existing objects.

4. When two string literals have the same value,
   they point to the same object in the SCP.

   Example:
   String s1 = "Java";
   String s2 = "Java";

   Here, s1 and s2 refer to the same object.

5. Creating a string using 'new' always creates a new object:

   String s3 = new String("Java");

   Even if "Java" already exists in the SCP,
   s3 will refer to a different object.

6. For mutable strings, use:
   - StringBuffer (synchronized / thread-safe)
   - StringBuilder (not synchronized / faster)
*/