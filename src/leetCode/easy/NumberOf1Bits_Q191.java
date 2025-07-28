package leetCode.easy;

public class NumberOf1Bits_Q191 {
    public static void main(String[] args) {

        int x = 11, y = 128, z = 2147483645;


        System.out.println(hammingWeight(z));
    }

    public static int hammingWeight(int n) {
        String s = getIntoBytes(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = Character.getNumericValue(s.charAt(i));
            if (x == 0) {
                continue;
            }
            count++;
        }
        return count;
    }

    public static String getIntoBytes(int x) {
        String result = "";
        while (x > 0) {
            int mod = x % 2;
            result = mod + result;
            x = x / 2;

        }
        return result;
    }
}
