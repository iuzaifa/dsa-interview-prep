package leetCode.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArray_FormOfInteger_Q989 {
    public static void main(String[] args) {

        int [] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm_Brute_force_approach(arr, k));
        System.out.println(addToArrayForm(arr, k));
    }

    public static List<Integer> addToArrayForm_Brute_force_approach(int[] num, int k) {

        List<Integer> integers = new ArrayList<>();
        String s = "";
        for (int i : num){
            s += String.valueOf(i);
        }
        String sum = String.valueOf(new BigInteger(s).add(new BigInteger(String.valueOf(k))));
        for (char ch = 0;  ch < sum.length(); ch++){
            char c = sum.charAt(ch);
            integers.add(Character.getNumericValue(c));
        }
        return integers;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        LinkedList<Integer> integers = new LinkedList<>();

        int l = num.length-1; // its start with end of array l -1, mest array's last element;

        while (l >= 0 || k > 0){
            if ( l >= 0){
                k += num[l];
            }
            integers.addFirst( k % 10);
            k /= 10;
            l--;

        }
        return integers;


    }



}
