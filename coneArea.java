/*
 Write a program to print the area of cone.
 */
public class coneArea {
    public static void main(String[] args){
        int slant_height = 12,  radius = 6;
        
        // Area = 3.14 * radius * (radius + slant_height)
        int result = radius * (radius + slant_height);
        System.out.println("The area of cone is " + 3.14 * result);
    }
}
