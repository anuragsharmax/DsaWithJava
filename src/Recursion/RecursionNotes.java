package Recursion;

public class RecursionNotes {
}


// Recursion means a function calling itself to solve a smaller version of the same problem
// Works only if there is a clear stopping point, otherwise infinite calls -> stack overflow

// Every recursive solution needs three things:
// 1) base case -> where recursion stops
// 2) recursive call -> function calls itself
// 3) progress -> input must move toward base case

// General recursive structure I keep in mind
/*
returnType f(input) {
    if (base condition) return baseAnswer;
    return f(smallerInput);
}
*/

// Base case is not optional
// Without base case, recursion never stops
// Wrong base case is as bad as no base case

// Example: factorial
class Factorial {
    int fact(int n) {
        // base case: smallest valid input, answer already known
        if (n == 0) return 1;
        // recursive case: reduce problem size
        return n * fact(n - 1);
        // if n is not reduced, stack overflow happens
    }
}

// Call flow for fact(3):
// fact(3) -> 3 * fact(2)
// fact(2) -> 2 * fact(1)
// fact(1) -> 1 * fact(0)
// fact(0) -> 1
// stack unwinds and values return back

// Important rule I follow:
// one recursive call = one logical step
// never pre-count future work inside one call

// Example: sum of first n numbers
class Sum {
    int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}

// Recursion uses call stack
// Each function call occupies stack memory
// Max number of active calls = recursion depth

// Time complexity of recursion depends on number of calls
// f(n) = f(n-1) -> O(n)
// f(n) = f(n/2) -> O(log n)
// f(n) = 2f(n/2) -> O(n)
// f(n) = f(n-1) + f(n-2) -> O(2^n)

// Space complexity of recursion is mainly due to call stack
// This is auxiliary space, not input space
// f(n) = f(n-1) -> O(n) auxiliary space
// f(n) = f(n/2) -> O(log n) auxiliary space

// Iteration vs recursion:
// iteration usually O(1) auxiliary space
// recursion usually O(depth) auxiliary space
// recursion improves clarity, not performance

// Tail recursion: recursive call is the last statement
// No work is done after recursive call returns
class TailSum {
    int sum(int n, int acc) {
        if (n == 0) return acc;
        return sum(n - 1, acc + n);
        // in some languages/compiler this can be optimized
        // in Java, no guaranteed tail call optimization
    }
}

// Common mistakes I must avoid:
// missing base case
// wrong base condition
// not reducing input
// doing multiple logical steps in one recursive call
// double counting steps
// assuming recursion is always better than loop

// Backtracking is recursion with choices
// multiple recursive calls + undoing work
// used in permutations, combinations, N-Queens, Sudoku

// Interview rules I follow:
// always explain base case first
// explain how input reduces
// mention time complexity and auxiliary space
// if recursion not required, iterative solution is preferred
// space complexity usually means auxiliary space unless stated otherwise

