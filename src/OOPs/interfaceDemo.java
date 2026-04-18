package OOPs;

/*

1. WHAT IS INTERFACE?
-Interface = Contract (what must be done)
- It defines method signatures
- Does NOT define how they work (except default/static)

Think:
Interface = "Rules"
Class = "Implementation"


2. WHY INTERFACE?
-Java does NOT support multiple inheritance with classes

    class A {}
    class B {}
    class C extends A, B  ---------->> NOT ALLOWED

Solution → Interface

    class C implements A, B  ----------->>> ALLOWED


3. KEY FEATURES
- Methods are by default: public + abstract
- Variables are: public + static + final
- Supports multiple inheritance
- Supports runtime polymorphism


4. TYPES OF METHODS
- Abstract → no body
- Default → has body (Java 8+)
- Static → belongs to interface


5. RUNTIME POLYMORPHISM
Reference type = Interface
Object type = Class

Method call depends on OBJECT


6. IMPORTANT RULE
Interface = capability (what you can do)
Class = identity (what you are)

*/


// -- INTERFACE 1 --
interface Role {

    // Abstract method
    void role();

    // Default method (can have implementation)
    default void greet() {
        System.out.println("Hello from Role interface");
    }

    // Static method (called using interface name)
    static void info() {
        System.out.println("This is a Role interface");
    }
}


// -- INTERFACE 2 --
interface Coder {

    void code();
}


// -- CLASS IMPLEMENTING MULTIPLE INTERFACES --
class TechStudent implements Role, Coder {

    String name;
    int age;

    TechStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing Role
    @Override
    public void role() {
        System.out.println("I am a Tech student");
    }

    // Implementing Coder
    @Override
    public void code() {
        System.out.println("I write Java code");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


// -- ANOTHER CLASS --
class Faculty implements Role {

    @Override
    public void role() {
        System.out.println("I am a teacher");
    }
}


/*
DIAMOND PROBLEM IN INTERFACE

Problem:
Two interfaces have SAME default method

    interface A → greet()
    interface B → greet()

Class implements both → ambiguity

Java forces you to resolve it explicitly
*/


// -- INTERFACE A --
interface A {

    default void show() {
        System.out.println("From Interface A");
    }
}


// -- INTERFACE B --
interface B {

    default void show() {
        System.out.println("From Interface B");
    }
}


// -- CLASS RESOLVING DIAMOND PROBLEM --
class Demo implements A, B {

    /*
    ERROR if not overridden:
    class Demo inherits unrelated defaults for show() from A and B

    Solution:
    Override and specify which one to use
    */

    @Override
    public void show() {

        // Choose one explicitly
        A.super.show();

        // OR you can call both:
        // A.super.show();
        // B.super.show();
    }
}


// -- MAIN CLASS --
public class interfaceDemo {

    public static void main(String[] args) {

        /*
        RUNTIME POLYMORPHISM
        */

        Role r1 = new TechStudent("Anurag", 20);
        Role r2 = new Faculty();

        r1.role();  // TechStudent
        r2.role();  // Faculty


        /*
        DOWNCASTING
        */

        TechStudent t = (TechStudent) r1;
        t.code();
        t.display();


        /*
        DEFAULT METHOD
        */

        r1.greet();


        /*
        STATIC METHOD
        */

        Role.info();


        /*
        DIAMOND PROBLEM DEMO
        */

        Demo d = new Demo();
        d.show();  // From Interface A
    }
}