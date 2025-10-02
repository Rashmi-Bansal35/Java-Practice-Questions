package Classes_and_Objects;

public class Course {
    static int maxCapacity = 50;
    String courseName;
    int enrollment;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollment--;
    }

    public static void main(String[] args){
        Course course1 = new Course("Human ethics");
        Course course2 = new Course("3D printing");
        course1.enrollStudent("Rohini");
        System.out.println(course1.enrollment);
        course2.enrollStudent("Akshit");
        course2.enrollStudent("Khushi");
        System.out.println(course2.enrollment);
        course2.unenrollStudent("Akshit");
        System.out.println(course2.enrollment);
    }
}
