package recursionImp;

public class FibonacciProblem {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci number using Binet's formula for n=" + n + ": " + fibonacci(n));
    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static long fibonacci(int n) {
        final double PHI = (1 + Math.sqrt(5)) / 2;
        final double PSI = (1 - Math.sqrt(5)) / 2;

        double fib = (Math.pow(PHI, n) - Math.pow(PSI, n)) / Math.sqrt(5);

        return (long) Math.round(fib);
    }
}
