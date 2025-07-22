/*
 Write a program to print the area of prism.
 */
public class prismArea {
    public static void main(String[] args){
        int base_area = 24, base_perimeter = 12, height = 6;
        // Area = (2 * base_area) + (base_perimeter * height)
        int twice_base_area = 2 * base_area;
        System.out.println("The area of prism is " + (twice_base_area + (base_perimeter * height)));
    }
}
