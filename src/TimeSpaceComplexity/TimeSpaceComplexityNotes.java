package TimeSpaceComplexity;

public class TimeSpaceComplexityNotes {
}
/*

Time complexity measures how runtime grows with input size, not actual seconds
Focus is on growth rate as n increases, constants and hardware are ignored
Input size depends on problem
array -> n = length
string -> n = characters
integer -> n = number of bits, not value
matrix -> n*m
tree -> n = nodes
graph -> V + E
###General rule for time complexity
count how many times the core operation runs as a function of input size
Constant time O(1)
runtime does not change with input size
*/
class ConstantExample {
    int getFirst(int[] arr) {
        return arr[0];
    }
}
/*
Linear time O(n)
single loop over input
*/
class LinearExample {
    int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
/*
Quadratic time O(n^2)
nested loops over same input
*/
class QuadraticExample {
    int countPairs(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                c++;
            }
        }
        return c;
    }
}
/*
Logarithmic time O(log n)
input is reduced by a factor each step
*/
class LogExample {
    int countSteps(int n) {
        int c = 0;
        while (n > 1) {
            n = n / 2;
            c++;
        }
        return c;
    }
}
/*
Linearithmic time O(n log n)
common in divide and conquer algorithms like merge sort and quick sort average case
Exponential time O(2^n)
recursion with two calls reducing by 1
*/
class ExponentialExample {
    int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
/*
Factorial time O(n!)
appears in permutation problems
extremely fast growth, impractical for large n
Recursion time complexity rule
time = number of recursive calls * work per call
never pre-count future calls inside one call
Space complexity measures memory usage as input grows
includes input space + auxiliary space
in practice, when asked, space complexity means auxiliary space unless stated otherwise
Auxiliary space = extra memory used by algorithm excluding input
includes variables, extra arrays, recursion call stack
Constant auxiliary space O(1)
fixed number of variables
*/
class ConstantSpace {
    int max(int a, int b) {
        return a > b ? a : b;
    }
}
/*
Linear auxiliary space O(n)
extra array or recursion depth n
*/
class LinearSpace {
    int[] copy(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
/*
Recursion space example
*/
class RecursionSpace {
    int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
/*
Divide recursion space example
*/
class DivideRecursionSpace {
    int logFact(int n) {
        if (n <= 1) return 1;
        return n * logFact(n / 2);
    }
}
/*
Iteration vs recursion
iteration usually uses O(1) auxiliary space
recursion uses O(depth) auxiliary space due to call stack
In-place algorithms
modify input without using extra space
auxiliary space O(1)
*/
class InPlaceExample {
    void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
/*
Sorting space comparison
merge sort -> O(n) auxiliary space due to temp array
insertion sort -> O(1) auxiliary space
heap sort -> O(1) auxiliary space
total space is O(n) for all due to input, but comparison is based on auxiliary space
Big O notation -> upper bound, worst case
Big Omega -> lower bound, best case
Big Theta -> tight bound, exact growth
small o -> strictly smaller growth
small omega -> strictly larger growth
Order of growth I remember
1 < log n < n < n log n < n^2 < n^3 < 2^n < n!
###### keep remember
counting constants in Big O
ignoring recursion stack space
mixing input space with auxiliary space
saying heap sort space is O(n) in interviews
using value of integer instead of number of bits for complexity
Interview rule I follow
when asked time complexity -> Big O
when asked space complexity -> auxiliary space
if total space is needed, mention explicitly
*/
