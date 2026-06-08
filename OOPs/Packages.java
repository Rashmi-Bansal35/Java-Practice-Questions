package OOPs;

// Importing all classes from the Class package
import OOPs.Class.*;

// Importing a specific class from the Class package
import OOPs.Class.Employee;

public class Packages {

    public static void main(String[] args) {

        // Creating object of Employee class
        Employee obj = new Employee();

        // Creating object of Calc class
        Calc obj1 = new Calc();

        // System is a class from java.lang package.
        // java.lang package is imported automatically by Java.
        System.out.println("Understanding Packages in Java");
    }
}

/*
=================================================
                    PACKAGES
=================================================
What is a Package?
------------------
A package is a collection of related classes, interfaces, enums, and sub-packages.

In simple words, a package is like a folder that is used to organize Java files.

Example:
OOPs
│
├── Packages.java
│
└── Class
    ├── Employee.java
    └── Calc.java

Here:
- OOPs is a package.
- Class is a sub-package inside OOPs.

=================================================
Why do we use Packages?
=================================================

1. To organize code properly.
2. To avoid naming conflicts.
3. To improve code maintainability.
4. To control access using access modifiers.
5. To reuse existing classes.

=================================================
Accessing a Class from Another Package
=================================================
Suppose Employee.java is in another package.
Without importing it:

Employee obj = new Employee();

Compilation Error

Reason:
Java does not know where Employee class exists.
To use it, we must import it.

Syntax:
import packageName.className;

Example:
import OOPs.Class.Employee;

Now Java can find the Employee class.

=================================================
Importing a Specific Class
=================================================
Example:
import OOPs.Class.Employee;

Only Employee class becomes available.

=================================================
Importing All Classes
=================================================
Example:
import OOPs.Class.*;

The * means:
"Import all classes available in this package."

Now we can use:
Employee obj = new Employee();
Calc obj = new Calc();

without importing them individually.

=================================================
Package Naming Convention
=================================================

Package names are always written in lowercase.
Examples:
java.util
java.lang
java.io
oops
com.company.project

Bad Practice:
Java.Util
MyPackage

Good Practice:
java.util
mypackage

=================================================
Scanner Example
=================================================
When taking input, we write:
import java.util.Scanner;

Breakdown:
java
 └── util
      └── Scanner

Here:
java      → Package
util      → Sub-package
Scanner   → Class

Example:
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

=================================================
Built-in Java Classes and Packages
=================================================
Almost every built-in Java class belongs to some package.

Examples:
Scanner      → java.util
ArrayList    → java.util
File         → java.io
Date         → java.util
Math         → java.lang
String       → java.lang

=================================================
Why Don't We Import String or System?
=================================================
Example:

String name = "Rashmi";
System.out.println(name);

We never write:

import java.lang.String;
import java.lang.System;

Reason:

The java.lang package is imported automatically by the Java compiler.

Internally:
import java.lang.*;

is already available.

=================================================
Types of Import
=================================================

1. Single Class Import
import java.util.Scanner;

Only Scanner class is imported.

-------------------------------------------------

2. Package Import
import java.util.*;

All classes of java.util package become available.

=================================================
Important Note About '*'
=================================================

import java.util.*;
does NOT load all classes into memory.

It simply tells the compiler where to look for classes when they are used.

Classes are loaded only when required.

=================================================
Key Points
=================================================

1. A package is a collection of related classes.

2. Packages help organize code and avoid conflicts.

3. To use a class from another package, we use the import keyword.

4. Single Class Import:
   import java.util.Scanner;

5. Package Import:
   import java.util.*;

6. Package names are written in lowercase.

7. Every built-in Java class belongs to a package.

8. java.lang package is imported automatically.

9. String, System, Math, and Object belong to the java.lang package.

10. '*' imports all classes of a package, but does not load them into memory.
*/