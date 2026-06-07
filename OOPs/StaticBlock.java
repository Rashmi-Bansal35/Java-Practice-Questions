package OOPs;

class Company {

    String brand;
    int employee;

    // Static variable belongs to the class and is shared by all objects.
    static String field;

    // Static block executes only once when the class is loaded into memory.
    // It is commonly used to initialize static variables.
    static {
        field = "IT";
        System.out.println("static block");
    }

    // Constructor executes every time an object is created.
    public Company() {
        brand = "TCS";
        employee = 1000;
        System.out.println("Constructor");
    }

    public void print() {
        System.out.println(brand + " : " + employee + " : " + field);
    }
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

        // Loads the Company class into memory.
        // Loading the class triggers the static block.
        Class.forName("OOPs.Company");

        Company c1 = new Company();

        c1.brand = "Cognizant";
        c1.employee = 1200;

        c1.print();

        Company c2 = new Company();
    }
}

/*
Static Block Notes:

1. Class loading happens only once during program execution.

2. When a class is loaded, all static variables and static blocks
   are initialized before any object is created.

3. A static block executes only once, regardless of how many objects
   of the class are created.

4. Constructors execute every time a new object is created.

5. Static blocks are mainly used for initializing static data.

Execution Order:

    Class Loading
          ↓
    Static Variables Initialization
          ↓
    Static Block Execution
          ↓
    Object Creation
          ↓
    Constructor Execution

6. If no object is created and the class is never loaded,
   the static block will not execute.

7. Class.forName("ClassName") can be used to explicitly load a class,
   which causes its static block to execute.

8. Class.forName() throws ClassNotFoundException,
   so it must be handled using try-catch or throws.

Naming Canvenetions:
1. Camel Case: The first word starts with a lowercase letter, and each subsequent word starts with an uppercase letter. 
    Example: showMyMarks()

2. Snake Case: Words are separated using underscores (_).
    Example: show_my_marks

1. Classes and Interfaces → PascalCase
   Example: Student, Runnable
2. Variables and Methods → camelCase
   Example: studentName, showMarks()
3. Constants → UPPER_CASE
   Example: PI, MAX_VALUE
4. Packages → lowercase
   Example: java.util, oops
5. Java prefers Camel Case over Snake Case.
*/