package OOPs;

// Parent Class
class P {

    // Default Constructor
    public P() {
        // Every constructor internally calls the constructor
        // of its parent class using super().
        // Since P does not explicitly extend any class,
        // it extends Object class by default.
        super();

        System.out.println("in P");
    }

    // Parameterized Constructor
    public P(int n) {
        super();

        System.out.println("in P int");
    }
}

// Child Class
class Q extends P {

    // Default Constructor
    public Q() {

        // Calls the constructor of the parent class.
        // Since no argument is passed, it calls P().
        super();

        System.out.println("in Q");
    }

    // Parameterized Constructor
    public Q(int n) {

        // Calls another constructor of the same class.
        // Control goes to Q().
        this();

        System.out.println("in Q int");
    }
}

public class ThisAndSuperMethods {

    public static void main(String[] args) {

        // Creating object using parameterized constructor
        Q obj = new Q(2);

        /*
         * At first, we may think:
         *
         * Since we are calling Q(2),
         * Java should call:
         *
         * P(int)
         * Q(int)
         *
         * But this is NOT what happens.
         *
         * Constructor execution depends on
         * this() and super() calls.
         *
         * Execution Flow:
         *
         * Q(int)
         *   ↓ this()
         * Q()
         *   ↓ super()
         * P()
         *
         * Output:
         * in P
         * in Q
         * in Q int
         */

        System.out.println("----------------");

        // Creating object using default constructor
        Q obj1 = new Q();

        /*
         * Execution Flow:
         *
         * Q()
         *   ↓ super()
         * P()
         *
         * Output:
         * in P
         * in Q
         */
    }
}

/*
=================================================
                THIS() AND SUPER()
=================================================

Output:
-------

in P
in Q
in Q int
----------------
in P
in Q

=================================================
Why does the Parent Constructor execute first?
=================================================
Whenever we create an object of a child class, Java first executes the constructor of the parent class.

Reason:
Every constructor has a super() call as its first statement, whether we write it or not.

Example:
public Q() {
    super();     // inserted automatically by compiler
}

super() calls the constructor of the immediate parent class.

=================================================
What is super()?
=================================================
super() is used to call the constructor of the parent (super) class.

Example:
super();      // calls default constructor

super(10);    // calls parameterized constructor

Example:
class P {
    public P(int n){
        System.out.println("P int");
    }
}

class Q extends P {
    public Q(){
        super(10);
    }
}

Output:
P int

=================================================
What is this()?
=================================================
this() is used to call another constructor of the same class.

Example:
class Q {

    public Q(){
        System.out.println("Default");
    }

    public Q(int n){
        this();
        System.out.println("Parameterized");
    }
}

Output:
Default
Parameterized

=================================================
Understanding the Confusion
=================================================
When we create:

Q obj = new Q(2);

As beginners we might think:
"Since the child's parameterized constructor is called, the parent's parameterized constructor should also be called."

Expected Output:
in P int
in Q int

But actual output is:
in P
in Q
in Q int

Why?
Because Java follows constructor chaining.
Q(int) contains:
this();

So Java first calls Q().
Q() contains:
super();

So Java calls P().
Execution Flow:

Q(int)
   ↓
  Q()
   ↓
  P()

Therefore P() executes instead of P(int).
=================================================
How to Call Parent's Parameterized Constructor?
=================================================

public Q(int n){
    super(n);
    System.out.println("in Q int");
}

Execution Flow:
Q(int)
   ↓
P(int)

Output:
in P int
in Q int

=================================================
Important Rules
=================================================
Rule 1:
this() and super() must be the first statement
inside a constructor.

Correct:
public Q(){
    super();
}

Incorrect:
public Q(){
    System.out.println("Hello");
    super();      // Compile Time Error
}

-------------------------------------------------

Rule 2:
We cannot use both this() and super() inside the same constructor.

Wrong:
public Q(){
    this();
    super();      // Compile Time Error
}

Reason:
Both must be the first statement.

=================================================
Object Class Concept
=================================================
Every class in Java directly or indirectly
inherits from Object class.

Example:
class P { }

Internally becomes:
class P extends Object { }
Inheritance Chain:

Q → P → Object
Therefore when constructors execute,
Java eventually reaches the Object constructor.

=================================================
Key Points
=================================================

1. super() calls the parent class constructor.

2. this() calls another constructor of the same class.

3. If not written explicitly,
   compiler automatically inserts super().

4. Constructor execution starts from the top
   of the inheritance hierarchy and moves downward.

5. Every Java class ultimately inherits from Object.

6. Constructor chaining depends on this() and super(),
   not on whether the constructor is parameterized.

7. this() and super() must always be the first statement
   in a constructor.
*/