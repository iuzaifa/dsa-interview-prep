package leetCode.easy;

public class FibonacciNumber_Q509 {
    public static void main(String[] args) {

        System.out.println(fibonacci(3));
//        System.out.println(fib(3) + "-----");
    }


    public static int fibonacci(int n) {

        if ( n <= 1){
            return n;
        }

        return fibonacci(n -1) + fibonacci(n- 2);
    }


    public static int fib(int n) {

        if ( n <= 1){
            return n;
        }
        int one = 1;
        int zero = 0;
        int i = 2;
        int fibo = 0;

        while ( i <= n){
            fibo = one + zero;
            zero = one;
            one = fibo;
            i++;
        }
        return fibo;
    }

}

