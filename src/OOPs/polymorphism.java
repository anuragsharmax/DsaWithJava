package OOPs;

// --BASE CLASS --
class BasePerson {

    String name;
    int age;

    BasePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void role() {
        System.out.println("I am a person");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



// -- CHILD CLASS --
class Student extends BasePerson {

    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void role() {
        System.out.println("I am a student");
    }

    void showRoll() {
        System.out.println("Roll No: " + rollNo);
    }
}



// -- GRAND CHILD CLASS --
class CSEStudent extends Student {

    int marks;

    CSEStudent(String name, int age, int rollNo, int marks) {
        super(name, age, rollNo);
        this.marks = marks;
    }

    @Override
    void role() {
        super.role();
        System.out.println("I am a CSE student");
    }

    void showMarks() {
        System.out.println("Marks: " + marks);
    }
}



// -- OVERLOADING CLASS --
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}



// -- MAIN CLASS --
public class polymorphism {

    public static void main(String[] args) {

        // Runtime Polymorphism
        BasePerson p1 = new Student("Anurag", 20, 101);
        BasePerson p2 = new CSEStudent("Rahul", 21, 102, 95);

        System.out.println("---- Runtime Polymorphism ----");

        p1.role();
        p2.role();


        // Downcasting
        Student s = (Student) p1;
        s.showRoll();

        CSEStudent c = (CSEStudent) p2;
        c.showMarks();


        // Compile-Time Polymorphism
        System.out.println("\n---- Compile-Time Polymorphism ----");

        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 4));
        System.out.println(calc.add(2.5, 3.5));
    }
}