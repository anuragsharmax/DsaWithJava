package OOPs;

/*
    Topic: Static Keyword

    What I am understanding here:

    1. Static variables belong to the class, not to individual objects.
    2. Only ONE copy of a static variable exists in memory.
    3. It is shared across all objects.
    4. If we modify it from one object, it affects all.

    Here:
    - 'count' is static.
    - Every time a new Info object is created,
      constructor runs and count increases.
    - So count works like an object counter.
*/

public class Static {

    // main method MUST be public static
    public static void main(String[] args) {

        Info p1 = new Info("Anurag", 19);
        System.out.println(p1.name + " and its count is " + Info.count);

        Info p2 = new Info("Ramesh", 20);
        System.out.println(p2.name + " and its count is " + Info.count);

        Info p3 = new Info("Suresh", 21);
        System.out.println(p3.name + " and its count is " + Info.count);

        // Best practice: access static variable using class name
        System.out.println("Total objects created: " + Info.count);
    }

    public static class Info {

        String name;
        int age;

        // Shared among all objects
        static int count = 0;

        public Info(String name, int age) {
            this.name = name;
            this.age = age;

            // Incrementing shared counter
            count++;
        }
    }
}
