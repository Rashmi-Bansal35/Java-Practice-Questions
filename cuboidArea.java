/*
 Write a program to print the area of cuboid.
 */
public class cuboidArea {
    public static void main(String[] args){
        int length = 3, width = 7, height = 9;
        
        // Area = 2(l*w + w*h + h*l)
        int area = 2 * ((length * width) + (width * height) + (height * length));
        System.out.println("The area of cuboid is " + area);
    }
}
