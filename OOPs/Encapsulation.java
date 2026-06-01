package OOPs;

class Human {

    // Instance variables are kept private to achieve encapsulation.
    // They can be accessed or modified only through public methods.
    private int age;

    // Private instance variable
    private String name;

    // Setter method
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method
    public int getAge() {
        return age;
    }

    // Setter method
    public void setName(String name) {
        // 'this' refers to the current object
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.setName("Rashmi");
        obj.setAge(11);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

/*
Encapsulation Notes:

1. Encapsulation is the process of binding data (variables)
   and methods together into a single unit (class).

2. Data members are usually declared private to prevent
   direct access from outside the class.

3. Public getter and setter methods provide controlled
   access to private data.

4. Encapsulation improves data security and maintainability.

5. Validation logic can be added inside setter methods
   before updating the data.

Example:
public void setAge(int age) {
    if(age > 0) {
        this.age = age;
    }
}
*/