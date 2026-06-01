package OOPs;

class Mobile {
    String brand;
    int price;

    // Static variable belongs to the class, not to individual objects.
    // It is shared among all objects of the class.
    // If its value changes, the change is reflected for all objects.
    // It should preferably be accessed using the class name.
    static String name;

    // Instance method because it is not declared as static.
    // It can access both instance and static variables directly.
    public void print() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "iPhone";
        obj2.price = 1500;
        Mobile.name = "Smartphone";

        obj1.print();
        obj2.print();
    }
}

/*
Static Variable Notes:

1. A static variable belongs to the class rather than individual objects.

2. Only one copy of a static variable is created in memory,
   and all objects share that same copy.

3. Static variables should be accessed using the class name
   (e.g., Mobile.name) for better readability.

4. If one object modifies a static variable, the updated value
   becomes visible to all other objects.

5. Instance methods can directly access both instance variables
   and static variables.
*/