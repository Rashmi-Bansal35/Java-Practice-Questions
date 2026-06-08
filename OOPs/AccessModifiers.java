package OOPs;

import OOPs.Class.*;

public class AccessModifiers {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        // Cannot access directly if the variable
        // is not declared as public.
        // System.out.println(e1.domain);

        // Public methods can be accessed from outside the class.
        e1.info("Rahul", "01A", 30000);

        // Accessible because it is public.
        System.out.println(e1.noOfEmployees);

        // Not accessible if it is private/default
        // System.out.println(e1.noOfUsers);
    }
}

/*
=========================================
           ACCESS MODIFIERS
=========================================
Access Modifiers control the visibility and accessibility of classes, variables, methods, and constructors.

Java provides four access modifiers:
1. public
2. private
3. default (no modifier)
4. protected

=========================================
Accessibility Table
=========================================

                    Public  Private  Default  Protected

Same Class            Yes      Yes      Yes       Yes

Same Package          Yes      No       Yes       Yes

Same Package
Subclass              Yes      No       Yes       Yes

Different Package
Subclass              Yes      No       No        Yes

Different Package
Non-Subclass          Yes      No       No        No

=========================================
1. Public
=========================================

Accessible from anywhere in the project.

Can be accessed:
✓ Same class
✓ Same package
✓ Different package
✓ Subclass
✓ Non-subclass

Example:
public int marks;

=========================================
2. Private
=========================================

Accessible only inside the same class.
Cannot be accessed directly outside the class.

Example:
private int salary;

To access private variables, we generally use Getter and Setter methods.

Benefits:
---------
1. Data Hiding
2. Security
3. Encapsulation

=========================================
3. Default (Package-Private)
=========================================
When no access modifier is specified, Java treats it as default access.

Example:

int age;

Accessible only within the same package.

Not accessible from another package.

=========================================
4. Protected
=========================================

Accessible:

✓ Same class
✓ Same package
✓ Subclass in different package

Not Accessible:

✗ Different package non-subclass

Protected is mainly used in inheritance.

=========================================
Understanding this Program
=========================================

Employee e1 = new Employee();
If a variable inside Employee is not public, it cannot be accessed directly.

Example:

e1.domain;
This gives an error if domain is private, protected, or default and the access rules are not satisfied.
However, public methods can still be used.

Example:

e1.info(...);

This is a common practice because data is hidden and methods provide controlled access.

=========================================
Best Practices
=========================================
Classes:
--------
Usually public

Example:
public class Employee

-----------------------------------------

Instance Variables:
-------------------
Usually private

Example:
private int salary;

Reason:
Data should not be modified directly.

-----------------------------------------

Methods:
--------
Usually public

Example:
public void display()

Protected methods are used when access is required only within inheritance hierarchies.

-----------------------------------------

Constants:
----------
Usually public static final

Example:
public static final double PI = 3.14;

=========================================
Real World Principle
=========================================
Hide data and expose behavior.

Bad Practice:
-------------
obj.salary = -10000;

Good Practice:
--------------
obj.setSalary(10000);

The class decides whether the value is valid before storing it.

=========================================
Key Points
=========================================
1. Access Modifiers control visibility.
2. Java provides:
   - public
   - private
   - default
   - protected
3. private gives maximum data security.
4. default allows access only within the same package.
5. protected is mainly used for inheritance.
6. public allows access from anywhere.
7. Variables are usually private.
8. Methods are usually public.
9. Classes are generally public.
10. Access Modifiers help achieve Encapsulation and Data Hiding.
*/