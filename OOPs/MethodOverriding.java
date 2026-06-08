package OOPs;

// Parent Class
class BasicMath {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Child Class
class Maths extends BasicMath {

    // Overriding add() method of parent class
    @Override
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

    // If sub() is not overridden,
    // parent class implementation will be used.
}

public class MethodOverriding {

    public static void main(String[] args) {

        Maths obj = new Maths();

        System.out.println(obj.add(3, 2));
        System.out.println(obj.sub(6, 4));
    }
}

/*
=========================================
           METHOD OVERRIDING
=========================================

Method Overriding occurs when a child class provides its own implementation of a method that already exists in the parent class.

Requirements:
--------------
1. Inheritance must exist.
2. Method name must be same.
3. Parameters must be same.
4. Return type should be same (or compatible).

In this Program:
----------------
- Maths inherits BasicMath.
- add() is overridden in Maths.
- sub() is not overridden, so the parent
  class implementation is used.

Output:
-------
6
2

Explanation:
------------
obj.add(3, 2)
→ Child class method executes.
→ Result = 3 + 2 + 1 = 6

obj.sub(6, 4)
→ Parent class method executes.
→ Result = 2

Method Overriding vs Method Overloading:
----------------------------------------

Method Overriding:
Same method name + Same parameters + Different implementation

Method Overloading:
Same method name + Different parameters

Benefits:
---------
1. Runtime Polymorphism
2. Code Reusability
3. Flexibility
4. Specialized behavior in child classes

@Override Annotation:
----------------------
Used to indicate that a method is overriding a parent class method.

Benefits:
- Improves readability.
- Helps the compiler detect mistakes.

Key Points:
-----------
1. Overriding requires inheritance.
2. Child class replaces parent method behavior.
3. @Override annotation is recommended.
4. Method selection happens at runtime.
*/