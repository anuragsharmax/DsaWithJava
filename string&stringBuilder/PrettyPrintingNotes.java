/*
Pretty Printing – Complete Notes (Java)

What is Pretty Printing:
Pretty printing means printing output in a formatted, readable, and controlled way.
Instead of plain printing, we decide how numbers, text, spacing, and alignment appear.

Why pretty printing is needed:
- Exact output formatting (important in CP and exams)
- Clean and readable output
- Control over decimal places
- Alignment of data (tables, reports)

println vs printf:
println() prints data as-is and moves to next line automatically.
printf() prints formatted output and does NOT move to next line unless specified.

printf syntax:
System.out.printf("format string", values);

Format string contains placeholders starting with %.
Values are filled in order.

Most used format specifiers:
%d → integer
%f → floating-point (float/double)
%.2f → floating-point with 2 decimal places
%s → String
%c → character
%b → boolean
%n → new line (preferred over \n)

Important rule:
printf does NOT add a new line automatically.

Why lecturers use printf:
- Competitive programming requires exact formatting
- Professional output looks clean
- Avoids manual string concatenation

*/

public class PrettyPrintingNotes {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        double pi = 3.14159;
        String name = "Anurag";

        // Normal printing
        System.out.println("a = " + a + ", b = " + b);

        // Pretty printing with printf
        System.out.printf("a = %d, b = %d%n", a, b);

        // Printing double values
        System.out.printf("Value of pi: %f%n", pi);
        System.out.printf("Pi with 2 decimals: %.2f%n", pi);
        System.out.printf("Pi with 4 decimals: %.4f%n", pi);

        // Printing String and character
        System.out.printf("Name: %s%n", name);
        System.out.printf("First letter: %c%n", name.charAt(0));

        // Multiple values in one printf
        System.out.printf("Name: %s, Age: %d, Score: %.1f%n", "Alex", 21, 89.7);

        // Width and alignment
        // %10d → right aligned, width 10
        // %-10d → left aligned, width 10
        System.out.printf("%10d%n", 123);
        System.out.printf("%-10d%n", 123);

        // Table-like output
        System.out.printf("%-10s %-10d%n", "Apple", 50);
        System.out.printf("%-10s %-10d%n", "Banana", 30);

        // Boolean printing
        boolean status = true;
        System.out.printf("Status: %b%n", status);

        // No new line issue
        System.out.printf("Hello");
        System.out.printf("World%n");

        // Correct way
        System.out.printf("Hello%n");
        System.out.printf("World%n");

        // Common mistake: printf without newline
        System.out.printf("This is one line ");
        System.out.printf("continued here%n");

        // Using format() (same as printf)
        System.out.format("Formatted number: %.2f%n", 12.3456);
    }
}

/*
Important interview points:
- printf prints formatted output, println prints plain output
- printf does not add newline automatically
- %n is preferred over \n for portability
- %.2f is used to control decimal precision
- Used heavily in competitive programming for exact output

One-line interview answer:
Pretty printing is formatting output using printf to control alignment, spacing, and precision.

Golden rules:
- Use println for simple output
- Use printf when format matters
- Always remember %n for new line
*/
