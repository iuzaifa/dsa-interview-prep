package leetCode.easy;

public class TribonacciNumber_Q1137 {
    public static void main(String[] args) {

        // Input: n = 25
        // Output: 1389537

        System.out.println(tribonacci(25));
        System.out.println(tribonacci2(25));
    }

    // using loop
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int firstTerm = 0, secondTerm = 0, thirdTerm = 1;

        for (int i = 1; i<= n; i++){
            int temp = firstTerm + secondTerm + thirdTerm; // 1
            //loop 2  == 1, third = 2
            firstTerm = secondTerm; // 0 -> 0
            secondTerm = thirdTerm; // 0 - > 1
            thirdTerm = temp ;      // 1 -> 1


        }
        return secondTerm;



    }


    // recursive method
    public static int tribonacci2(int n){
        if ( n == 0){
            return n;
        }else if (n == 1 || n == 2){
            return 1;
        }
        return tribonacci(n-1) + tribonacci2(n-2) + tribonacci2(n-3);
    }

}
