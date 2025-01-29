package recursion;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Fibonacci_Number fn = new Fibonacci_Number();
        System.out.println(fn.fib(4));
    }

    public int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fib(n-1) + fib(n - 2);
    }
}
