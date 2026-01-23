/*
What is StringBuilder:
StringBuilder is a mutable sequence of characters.
Unlike String, it allows modification of the same object without creating new objects.

Why StringBuilder is needed:
String is immutable, so every modification creates a new object in heap which is slow and memory costly.
StringBuilder solves this by modifying the same object.

When to use StringBuilder:
- When string content changes frequently
- Concatenation inside loops
- Performance-sensitive string operations
For fixed or constant strings, use String.

String vs StringBuilder:
String → immutable, slower for modifications
StringBuilder → mutable, faster, same object reused

Thread safety:
StringBuilder is NOT thread-safe.
StringBuffer is thread-safe but slower.
For DSA, CP, and interviews → use StringBuilder.

Memory behavior:
StringBuilder object is stored in heap.
Append/insert modifies the same object, no new object created.

Most important rule:
If you are changing a string multiple times → use StringBuilder.
*/

public class StringBuilderNotes {
    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // append() → adds at the end
        sb.append(" World");
        System.out.println(sb); // Hello World

        // insert(index, value) → inserts at specific position
        sb.insert(5, ",");
        System.out.println(sb); // Hello, World

        // delete(start, end) → deletes characters from start to end-1
        sb.delete(5, 6);
        System.out.println(sb); // Hello World

        // deleteCharAt(index) → deletes single character
        sb.deleteCharAt(5);
        System.out.println(sb); // HelloWorld

        // reverse() → reverses the content
        sb.reverse();
        System.out.println(sb); // dlroWolleH

        // reverse again to restore
        sb.reverse();

        // length() → number of characters
        System.out.println(sb.length()); // 10

        // charAt(index) → character at index
        System.out.println(sb.charAt(0)); // H

        // setCharAt(index, char) → replace character at index
        sb.setCharAt(0, 'h');
        System.out.println(sb); // helloWorld

        // substring(start) → returns String, not StringBuilder
        String sub1 = sb.substring(5);
        System.out.println(sub1); // World

        // substring(start, end)
        String sub2 = sb.substring(0, 5);
        System.out.println(sub2); // hello

        // convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println(finalString);

        // convert String to StringBuilder
        String s = "Java";
        StringBuilder sb2 = new StringBuilder(s);
        sb2.append(" DSA");
        System.out.println(sb2); // Java DSA

        // capacity() → internal buffer size
        System.out.println(sb2.capacity());

        // ensureCapacity(minCapacity) → increases capacity if needed
        sb2.ensureCapacity(50);
        System.out.println(sb2.capacity());

        // clear StringBuilder (no direct clear method)
        sb2.setLength(0);
        System.out.println(sb2); // empty output
    }
}

/*
Important Interview Points:
- StringBuilder is mutable, String is immutable
- StringBuilder is faster than String for multiple modifications
- append() inside loop should always use StringBuilder
- substring() returns a String, not StringBuilder
- StringBuilder is not thread-safe
- Default capacity is 16 + initial string length
- Use setLength(0) to clear StringBuilder

One-line interview answer:
StringBuilder is used to efficiently modify strings without creating multiple objects in memory.
*/
