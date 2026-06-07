package OOPs;

// Parent / Super / Base Class
class Calc {

    // Method to add two numbers
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method to subtract two numbers
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Child / Sub / Derived Class
// UpdatedCalc inherits properties and methods of Calc
// This is an example of Single-Level Inheritance
class UpdatedCalc extends Calc {

    // Method to multiply two numbers
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    // Method to divide two numbers
    public double div(int n1, int n2) {

        // Division by zero is not allowed
        if (n2 == 0) {
            System.out.println("Division by zero is not defined.");
            return 0;
        }

        // Type casting is required to get decimal results
        return (double) n1 / n2;
    }
}

// AdvCalc inherits UpdatedCalc
// This is an example of Multi-Level Inheritance
class AdvCalc extends UpdatedCalc {

    // Method to calculate power
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        // Creating object of UpdatedCalc
        UpdatedCalc obj = new UpdatedCalc();

        // Methods inherited from Calc class
        int r1 = obj.add(4, 2);
        int r2 = obj.sub(6, 2);

        // Methods of UpdatedCalc class
        int r3 = obj.multi(4, 2);
        double r4 = obj.div(6, 2);

        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);

        // Creating object of AdvCalc
        AdvCalc advObj = new AdvCalc();

        // AdvCalc can access methods of all parent classes
        double r5 = advObj.power(2, 3);

        System.out.println("Power: " + r5);
    }
}

/*
=========================================
                INHERITANCE
=========================================

HAS-A Relationship:
-------------------
Example:
A Car has an Engine.

This relationship is generally achieved using objects.

Example:
class Engine { }

class Car {
    Engine e = new Engine();
}

Here, Car HAS-A Engine.

-----------------------------------------

IS-A Relationship:
------------------
Example:
A Fortuner is a Car.

This relationship is achieved using inheritance.

Example:
class Car { }

class Fortuner extends Car { }

Here, Fortuner IS-A Car.

-----------------------------------------

What is Inheritance?
--------------------
Inheritance is the process of acquiring the properties and behaviors (fields and methods) of one class into another class.
It promotes:
1. Code Reusability
2. Maintainability
3. Extensibility

-----------------------------------------

Real-Life Example:
------------------
Suppose we develop a simple calculator.
Later, we want to create an advanced calculator with more features.
Instead of rewriting all the existing methods, we can inherit the basic calculator and add new functionality.

Example:

Calc
 ├─ add()
 └─ sub()

UpdatedCalc
 ├─ multi()
 └─ div()

AdvCalc
 └─ power()

This avoids code duplication.

-----------------------------------------

Types of Classes in Inheritance:
--------------------------------

Parent Class:
-------------
The class whose properties and methods are inherited.
Other names:
- Super Class
- Base Class
Example:
class Calc { }

Child Class:
------------
The class that inherits properties and methods from another class.
Other names:
- Sub Class
- Derived Class
Example:
class UpdatedCalc extends Calc { }

-----------------------------------------

How to Inherit?
---------------
Use the 'extends' keyword.

Syntax:
class Child extends Parent {
    // additional code
}

-----------------------------------------

Single-Level Inheritance:
-------------------------
One child class inherits one parent class.

A
│
└── B

Example:

class A {
    void show() { }
}

class B extends A {
    void display() { }
}

Object of B can access:
obj.show();
obj.display();

-----------------------------------------

Multi-Level Inheritance:
------------------------
A class inherits another child class.

A
│
└── B
     │
     └── C

Example:
class A {
    void x() { }
}

class B extends A {
    void y() { }
}

class C extends B {
    void z() { }
}

Object of C can access:
obj.x();
obj.y();
obj.z();

-----------------------------------------

Multiple Inheritance:
---------------------
A class inherits from more than one class.

      c
     / \
    /   \
   B     A
    
Java does NOT support Multiple Inheritance
through classes.
Reason:
-------
Ambiguity Problem

Example:
class A {
    void show() {
        System.out.println("A");
    }
}

class B {
    void show() {
        System.out.println("B");
    }
}

class C extends A, B { } // Not Allowed

Now if:
C obj = new C();
obj.show();

The compiler cannot decide whether to call
A's show() method or B's show() method.
This confusion is called the Ambiguity Problem.
Therefore, Java does not support Multiple Inheritance through classes.

-----------------------------------------

Important Note:
---------------
Java supports Multiple Inheritance through Interfaces 


-----------------------------------------

Key Points:
-----------
1. Inheritance represents an IS-A relationship.
2. Use the 'extends' keyword for inheritance.
3. It promotes code reusability.
4. Single-Level and Multi-Level inheritance are supported.
5. Multiple inheritance through classes is not supported.
6. Multiple inheritance is possible through interfaces.
*/