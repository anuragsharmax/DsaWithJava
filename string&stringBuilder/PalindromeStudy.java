
public class PalindromeStudy {
    /*
    String palindrome logic.
    Rules:
    - Ignore non-alphanumeric characters
    - Ignore case
    If either rule is skipped, symmetry comparison becomes invalid.

    Regex used:
    [^a-zA-Z0-9]
    [] defines a set, order does not matter
    ^ inside [] means NOT
    This removes everything except letters and digits
    If ^ is moved outside [], meaning changes completely and logic breaks.

    toLowerCase():
    'A' and 'a' are different characters in ASCII.
    Without converting case, case-insensitive palindrome fails.

    Two pointers:
    Palindrome is symmetric, so comparing both ends is sufficient.
    If a mismatch happens once, it will never recover later.
    */
    public static boolean isStringPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /*
    Number palindrome logic.
    Interview expectation: do NOT convert number to string.

    Negative numbers:
    -121 becomes 121- when reversed, symmetry is impossible.
    So any x < 0 is false.

    Numbers ending with 0:
    10 -> reverse becomes 01 -> 1
    A number cannot start with 0.
    So x % 10 == 0 && x != 0 must be rejected early.
    If this condition is removed, logic may still work for some cases but reasoning becomes weak.

    Core idea:
    If a number is palindrome, first half equals reversed second half.

    Why reverse only half:
    - Avoid overflow
    - Avoid unnecessary work
    - Preserve symmetry logic

    Loop condition x > reversed:
    Stops exactly when half of digits are processed.
    Continuing further destroys the half comparison logic.

    reversed / 10:
    Used for odd length numbers.
    Middle digit does not affect palindrome, dividing removes it.
    */
    public static boolean isNumberPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return x == reversed || x == reversed / 10;
    }

    /*
    Common mistakes:
    - Using string conversion for number palindrome and calling it optimal
    - Forgetting zero-ending rule
    - Not understanding why reversed/10 exists
    - Thinking regex order matters
    - Thinking ^ always means NOT

    Interview insight:
    Palindrome problems are symmetry problems.
    Remove noise, compare meaningfully, stop early.
    If I can explain stopping conditions and edge cases clearly, solution is solid.
    */
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isStringPalindrome("race a car"));
        System.out.println(isNumberPalindrome(121));
        System.out.println(isNumberPalindrome(-121));
        System.out.println(isNumberPalindrome(10));
    }
}
