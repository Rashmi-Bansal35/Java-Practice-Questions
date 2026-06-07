package OOPs;

// Class A
class A {

    // Constructor
    public A() {
        System.out.println("Object created");
    }

    // Method
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObject {

    public static void main(String[] args) {

        // Reference variable declaration
        A obj;

        // Object creation and assigning its reference to obj
        obj = new A();

        // Calling method using reference variable
        obj.show();

        // Anonymous Object
        // Object is created but no reference is stored
        // Constructor will execute but object cannot be reused
        new A();

        // Anonymous Object used immediately
        // Constructor executes and then show() method is called
        new A().show();
    }
}

/*
=========================================
            ANONYMOUS OBJECT
=========================================

Object:
-------
An object is an instance of a class.

Example:
A obj = new A();

Here:
- A -> Class Name
- obj -> Reference Variable
- new A() -> Object Creation

-----------------------------------------
Reference Variable:
-------------------
A reference variable stores the address/reference of an object.

Example:

A obj = new A();

obj refers to the created object.
Using the reference variable we can:
- Access methods
- Access variables
- Reuse the same object multiple times

Example:

obj.show();
obj.show();
obj.show();

-----------------------------------------

Anonymous Object:
-----------------
An object that does not have any reference variable is called an Anonymous Object.

Example:

new A();

No variable is storing the reference of this object.
Therefore it cannot be reused later.

-----------------------------------------
Why Use Anonymous Objects?
--------------------------
When an object is required only once, creating a separate reference variable is unnecessary.

Example:
new A().show();

The object is created, the method is called, and then the object becomes eligible for Garbage Collection.

-----------------------------------------
Execution of this Program:
--------------------------

1. A obj;
   -> Reference variable created.

2. obj = new A();
   -> Object created.
   Output:
   Object created

3. obj.show();
   Output:
   in A show

4. new A();
   -> Anonymous object created.
   Output:
   Object created

5. new A().show();
   -> Anonymous object created.
   -> show() method called.
   Output:
   Object created
   in A show

-----------------------------------------
Key Points:
-----------
1. Anonymous objects do not have a reference variable.
2. They are generally used for one-time operations.
3. They cannot be reused after creation.
4. They help reduce unnecessary variable creation.
5. After use, they become eligible for Garbage Collection.
*/