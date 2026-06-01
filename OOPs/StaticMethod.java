package OOPs;

class Mobile1{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // A static method belongs to the class, not to any object.
    // Therefore, it can directly access only static members.
    public static void show1(){
        System.out.println("in static method");
    }

    // Indirect way to access non-static variables inside a static method:
    // pass an object reference and access the instance variables through it.
    public static void print(Mobile1 obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
public class StaticMethod {
    public static void main(String[] args){
        Mobile1 obj1 = new Mobile1();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        Mobile1.name = "Smartphone";

        Mobile1 obj2 = new Mobile1();
        obj2.brand = "IPhone";
        obj2.price = 1500;
        Mobile1.name = "Smartphone";

        Mobile1.show1();
        Mobile1.print(obj1);
    }
}

/*
Static Method Notes:

1. Static methods belong to the class rather than individual objects.

2. A static method can directly access only static variables and static methods.

3. Non-static (instance) variables belong to objects, so a static method
   cannot access them directly because it has no object context (no 'this' reference).

4. To access instance variables inside a static method, pass an object reference
   as a parameter and access the variables through that object.

5. The main() method is static because the JVM must be able to call it
   directly without creating an object of the class first.
*/