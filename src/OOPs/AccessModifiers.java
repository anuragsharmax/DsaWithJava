package OOPs;

/*
    Access modifiers control visibility of variables, methods, and classes.

    1) private
       - Accessible only inside the same class.
       - Not accessible outside the class.
       - Mostly used to protect data (encapsulation).

    2) default (no modifier)
       - Accessible only inside same package.
       - Not accessible outside package.

    3) protected
       - Accessible inside same package.
       - Also accessible in subclasses (even in different package).

    4) public
       - Accessible from anywhere.

    Order of restriction:
       private  -> most restricted
       default
       protected
       public   -> least restricted

    Important for DSA:
    In LinkedList:
       head should be private.
       Methods like insert(), delete() should be public.

    So outside code cannot directly modify head.
*/

public class AccessModifiers {

    // Example class to test access levels
    static class Student {

        private String name;     // only inside this class
        int rollNo;              // default (same package)
        protected int age;       // same package + subclass
        public String college;   // accessible everywhere

        // public method to set name (since name is private)
        public void setName(String name) {
            this.name = name;
        }

        // public method to get name
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        // s1.name = "Anurag";  // Error (private variable)

        s1.rollNo = 10;        //  allowed (same package)
        s1.age = 20;           //  allowed (same package)
        s1.college = "ABC";    //  allowed (public)

        s1.setName("Anurag");  //  allowed through method

        System.out.println("Name: " + s1.getName());
        System.out.println("RollNo: " + s1.rollNo);
        System.out.println("Age: " + s1.age);
        System.out.println("College: " + s1.college);
    }
}
