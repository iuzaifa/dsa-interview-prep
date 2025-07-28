package leetCode.easy;

public class PalindromeNumber_Q9 {
    public static void main(String[] args) {
        int x = 121, y = -121, z = 10; // check what if Palindrome or not

        System.out.println(isPalindrome(z));
        System.out.println(isPalindrome2(x));

    }


    // method 1 to solve the Palindrome
    public static boolean isPalindrome(int x) {
        int x2 = x;
        int n = 0;
        if (x < 0){
            return false;
        }
        while (x > 0){
            int r = x % 10;
            n = n * 10 + r;
            x /= 10;

        }
        return n == x2;
    }

    // method 2 to solve the Palindrome
    public static boolean isPalindrome2(int x) {
        int or = Math.abs(x);
        int resverse = 0;

        while( x != 0){
            int rem = x % 10;
            resverse = resverse * 10 + rem;
            x /= 10;
        }

        return resverse == or;
    }
}
