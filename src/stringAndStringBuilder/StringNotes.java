/*
What is String:
String is an immutable sequence of characters.
Once created, a String object cannot be changed.

Where String is stored:
- String literals are stored in String Constant Pool (inside heap)
- String objects created using new are stored in heap (outside pool)

String creation cases:

Case 1: String s = "Java";
- JVM checks String Pool
- If "Java" exists → reuse
- Else → create in pool
- Only one object created
- Memory efficient

Case 2: String s = new String("Java");
- "Java" literal goes to String Pool (if not already)
- new String("Java") creates a new object in heap
- Two objects exist
- Not memory efficient
- Avoid in real code

Memory behavior:
Stack stores reference, heap stores actual object.

== vs equals():
== checks reference (memory address)
equals() checks content
Always use equals() for String comparison.

Why String is immutable:
- String Pool safety
- Security (classpath, files, URLs)
- Thread safety
- HashMap key stability
- Performance via caching

String concatenation:
Every modification creates a new object.
Concatenation inside loops is slow.

Use StringBuilder when string changes frequently.

Common interview traps:
- Using == instead of equals()
- Thinking String changes in place
- Using new String unnecessarily
*/
package stringAndStringBuilder;
public class StringNotes {
    public static void main(String[] args) {

        // String literal
        String a = "Java";
        String b = "Java";

        // new String
        String c = new String("Java");

        // Reference comparison
        System.out.println(a == b); // true (same pool object)
        System.out.println(a == c); // false (heap vs pool)

        // Content comparison
        System.out.println(a.equals(c)); // true

        // Immutability proof
        String s = "Hello";
        s.concat(" World");
        System.out.println(s); // Hello (unchanged)

        // Correct way
        s = s.concat(" World");
        System.out.println(s); // Hello World

        // Important String methods
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.substring(0,5));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("World"));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World"));
        System.out.println(s.replace('o','x'));

        // split()
        String data = "java,dsa,oops";
        String[] arr = data.split(",");
        for(String part : arr){
            System.out.println(part);
        }

        // String vs StringBuilder
        String slow = "";
        for(int i=0;i<5;i++){
            slow = slow + i;
        }
        System.out.println(slow);

        StringBuilder fast = new StringBuilder();
        for(int i=0;i<5;i++){
            fast.append(i);
        }
        System.out.println(fast.toString());
    }
}

/*
One-line interview answers:
- String is immutable in Java.
- String literals are stored in String Constant Pool.
- new String creates a separate heap object.
- == compares reference, equals() compares content.
- Use StringBuilder for frequent modifications.

Golden rule:
Never use == for String comparison.
Avoid new String unless required.
*/
