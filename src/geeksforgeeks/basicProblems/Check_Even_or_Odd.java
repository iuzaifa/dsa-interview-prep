package geeksforgeeks.basicProblems;

import java.util.Arrays;

public class Check_Even_or_Odd {
    public static void main(String[] args) {

//        System.out.println(even_or_Odd(45));
        System.out.println(Arrays.toString(even_or_Odd(new int[]{3,4,5,6,7,8,9})));

    }

    public static String even_or_Odd(int n) {

        if (n % 2 == 0){
            return "Even";
        }
        return "odd";
    }


    public static String [] even_or_Odd(int []  numArr) {
        String [] oe = new String[numArr.length];

        for (int i = 0; i < numArr.length; i++){
            if (numArr[i] % 2 == 0){
                oe[i] = numArr[i] + ": Even";
            }else {
                oe[i] = numArr[i] + ": odd";
            }
        }

        return oe;
    }

}
