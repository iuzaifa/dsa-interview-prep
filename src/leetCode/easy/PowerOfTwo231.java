package leetCode.easy;

public class PowerOfTwo231 {
    public static void main(String[] args) {

        int x = 16, y = 8, z = 4;

        System.out.println("X : " + isPowerOfTwo(x));
        System.out.println("Y : " + isPowerOfTwo(y));
        System.out.println("Z : " + isPowerOfTwo(z));
    }

    public static boolean isPowerOfTwo(int n) {


        if ( n < 1){
            return false;
        } else if (n == 1) {
            return true;
        }else {
            while (n % 2 == 0){
                n = n / 2;
            }
            if (n == 1){
                return true;
            }else return false;
        }


    }
}
