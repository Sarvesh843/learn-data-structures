package core.recursion;

public class Factorial {
    /**
     * A factorial of a number is written as:
     * f(n) = n*(n-1) * (n-2) * (n-3) *....*1
     * <p>
     * Write a recursive program to find factorial of n.
     */
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
