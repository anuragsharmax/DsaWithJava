package OOPs;

/*
    Topic: Constructor

    What I am understanding:

    1. Constructor initializes object data.
    2. It runs automatically when object is created.
    3. Constructor name must match class name.
    4. It does not have any return type.
    5. 'this' keyword refers to current object.

    Good Design Principle:
    Always initialize important fields inside constructor.
*/

public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student("Anurag", 1, 94.5);
        Student s2 = new Student("Ramesh", 2, 88.0);

        s1.display();
        s2.display();
    }

    public static class Student {

        String name;
        int rno;
        double percentage;

        // Parameterized constructor
        public Student(String name, int rno, double percentage) {

            // this.variable refers to instance variable
            // parameter refers to local variable
            this.name = name;
            this.rno = rno;
            this.percentage = percentage;
        }

        // Method added for better clarity
        public void display() {
            System.out.println(
                    "Name: " + name +
                            ", Roll No: " + rno +
                            ", Percentage: " + percentage
            );
        }
    }
}
