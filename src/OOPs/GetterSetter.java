package OOPs;

/*
    Getter & Setter Revision Notes

    1) We make variables private to protect data.
    2) Getter -> used to read value.
    3) Setter -> used to modify value safely.
    4) This allows validation before updating.
*/

public class GetterSetter {

    static class Student {

        private int age;   // hidden from outside
        private String name;

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age
        public void setAge(int age) {
            if(age > 0) {          // validation
                this.age = age;    // this.age -> instance variable
            } else {
                System.out.println("Invalid age");
            }
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            if(name != null && !name.isEmpty()) {
                this.name = name;
            }
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(20);
        s1.setName("Anurag");

        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        s1.setAge(-10);  // will show "Invalid age"
    }
}
