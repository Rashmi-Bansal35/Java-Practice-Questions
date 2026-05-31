package Array;

class Student{
    String name;
    int marks;
    int age;
}

public class ArrayOfObject {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "Rohini";
        s1.marks = 88;
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Shivang";
        s2.marks = 93;
        s2.age = 20;

        Student s3 = new Student();
        s3.name = "Lakshay";
        s3.marks = 89;
        s3.age = 19;

        Student[] students = new Student[3]; // Array of object: Array which hold references of objects
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1); // Prints reference of s1 object

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        for(Student s : students){
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
