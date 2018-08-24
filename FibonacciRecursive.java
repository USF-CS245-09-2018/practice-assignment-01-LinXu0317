public class FibonacciRecursive implements Fibonacci {
    int total;
    public int fibonacci(int n) {

        if (n == 0 || n == 1) {
            total = n;
        } else {
            total = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return total;
    }
}
