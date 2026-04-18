package OOPs;

/*


Encapsulation = Data hiding + Controlled access

We do NOT allow direct access to variables.
Instead, we use methods (getters/setters) to control how data is used.

WHY?
- Prevent invalid data
- Maintain control over object state
- Improve code safety and maintainability
*/

public class Encapsulation {

    /*
    static nested class:
    - Does NOT depend on Encapsulation object
    - Can be created directly inside static main()
    */
    static class Student {

        /*
        private variables:
        - Cannot be accessed directly from outside class
        - Forces user to use getter/setter
        */
        private int age;
        private String name;

        /*
        == GETTER ==
        Purpose:
        - To READ the value safely
        - No modification happens here
        */
        public int getAge() {
            return age;
        }

        /*
        == SETTER ==
        Purpose:
        - To MODIFY value with control
        - We can apply validation before updating

        IMPORTANT:
        - 'this.age' → instance variable
        - 'age' → parameter (local variable)
        */
        public void setAge(int age) {

            // Validation logic → prevents invalid state
            if (age > 0) {
                this.age = age;   // update only if valid
            } else {
                System.out.println("Invalid age");
            }
        }

        // Getter for name (read-only access)
        public String getName() {
            return name;
        }

        /*
        Setter for name:
        - Prevent null or empty values
        - Ensures object always stays in valid state
        */
        public void setName(String name) {

            // Validation: name should not be null or empty
            if (name != null && !name.isEmpty()) {
                this.name = name;
            }
        }
    }

    public static void main(String[] args) {

        /*
        Object creation:
        - Memory allocated in heap
        - Default values:
            age = 0
            name = null
        */
        Student s1 = new Student();

        /*
        Using setter instead of direct access:
        - Ensures validation happens
        */
        s1.setAge(20);
        s1.setName("Anurag");

        /*
        Using getter to read values
        */
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        /*
        Trying invalid input:
        - Setter prevents wrong data
        - Object state remains unchanged
        */
        s1.setAge(-10);  // will show "Invalid age"
    }
}