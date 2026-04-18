package OOPs;

/*
====================== INHERITANCE (FULL REVISION) ======================

Inheritance = One class acquires properties and behavior of another class

WHY?
- Code reuse
- Logical hierarchy
- Maintainability

KEY TERMS:
- Parent class / Superclass
- Child class / Subclass
- "extends" keyword

-----------------------------------------------------------------------
TYPES OF INHERITANCE IN JAVA:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance
4. Multiple Inheritance (via interfaces only)
5. Hybrid Inheritance (combination using interfaces)

NOTE:
Java DOES NOT support multiple inheritance with classes (diamond problem)
-----------------------------------------------------------------------
*/

public class Inheritance {

    /*
    SINGLE INHERITANCE

    One parent → one child
    */

    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    /*
    2. MULTILEVEL INHERITANCE

    Grandparent → Parent → Child
    */

    static class LivingBeing {
        void breathe() {
            System.out.println("Breathing...");
        }
    }

    static class Mammal extends LivingBeing {
        void walk() {
            System.out.println("Walking...");
        }
    }

    static class Human extends Mammal {
        void speak() {
            System.out.println("Speaking...");
        }
    }

    /*
    3. HIERARCHICAL INHERITANCE

    One parent → multiple children
    */

    static class Vehicle {
        void start() {
            System.out.println("Vehicle starts");
        }
    }

    static class Car extends Vehicle {
        void drive() {
            System.out.println("Car is driving");
        }
    }

    static class Bike extends Vehicle {
        void ride() {
            System.out.println("Bike is riding");
        }
    }

    /*
    4. MULTIPLE INHERITANCE (INTERFACE)

    Java does NOT allow:
        class A extends B, C

    Instead, we use interfaces
    */

    interface Camera {
        void clickPhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class Smartphone implements Camera, MusicPlayer {
        public void clickPhoto() {
            System.out.println("Photo clicked");
        }

        public void playMusic() {
            System.out.println("Music playing");
        }
    }

    /*
    5. HYBRID INHERITANCE

    Combination of:
    - Multilevel + Multiple (via interfaces)

    Example:
    */

    interface Engine {
        void engineStart();
    }

    static class Machine {
        void powerOn() {
            System.out.println("Machine powered on");
        }
    }

    static class CarMachine extends Machine implements Engine {
        public void engineStart() {
            System.out.println("Engine started");
        }
    }

    /*
    MAIN METHOD (TEST ALL)
    */

    public static void main(String[] args) {

        System.out.println("----- SINGLE INHERITANCE -----");
        Dog d = new Dog();
        d.eat();   // inherited
        d.bark();  // own

        System.out.println("\n----- MULTILEVEL INHERITANCE -----");
        Human h = new Human();
        h.breathe(); // from LivingBeing
        h.walk();    // from Mammal
        h.speak();   // own

        System.out.println("\n----- HIERARCHICAL INHERITANCE -----");
        Car c = new Car();
        Bike b = new Bike();
        c.start();  // from Vehicle
        c.drive();
        b.start();  // from Vehicle
        b.ride();

        System.out.println("\n----- MULTIPLE INHERITANCE (INTERFACE) -----");
        Smartphone s = new Smartphone();
        s.clickPhoto();
        s.playMusic();

        System.out.println("\n----- HYBRID INHERITANCE -----");
        CarMachine cm = new CarMachine();
        cm.powerOn();      // from Machine
        cm.engineStart();  // from Engine
    }
}