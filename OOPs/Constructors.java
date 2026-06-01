package OOPs;

class Human1 {
    private int age;
    private String name;

    // Constructor:
    // It has the same name as the class and does not have a return type.
    // It is automatically called whenever an object is created.

    // Default Constructor
    public Human1() {
        age = 18;
        name = "Joe";
        System.out.println("in constructor");
    }

    // Parameterized Constructor
    // Used to initialize an object with custom values.
    public Human1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Human1 person1 = new Human1();

        // Values are assigned by the default constructor.
        System.out.println(person1.getName() + " : " + person1.getAge());

        Human1 person2 = new Human1(18, "Rashmi");

        // Values are assigned by the parameterized constructor.
        System.out.println(person2.getName() + " : " + person2.getAge());
    }
}

/*
Constructor Notes:

1. A constructor is a special member of a class used to initialize objects.

2. The constructor name must be exactly the same as the class name.

3. Constructors do not have a return type, not even void.

4. A constructor is automatically invoked when an object is created.

5. A Default Constructor initializes objects with predefined values.

6. A Parameterized Constructor initializes objects with values provided by the user.

7. Constructors can be overloaded, meaning a class can have multiple
   constructors with different parameter lists.
*/