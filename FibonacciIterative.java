public class FibonacciIterative implements Fibonacci {
    int total;
    public int fibonacci(int n){

        if ( n == 0 || n == 1){
            return n;
        }
        else {
            for (int i = n; i > 1; i--) {
                total = fibonacci(n - 1) + fibonacci(n - 2);
//                return n - 1 + n - 2;
            }
        }
        return total;
    }
}
