package leetCode.easy;

import java.util.Arrays;
import java.util.OptionalInt;

public class Maximum_Product_of_Two_Elements_in_an_Array_Q1464 {

    public static void main(String[] args) {
        int [] arr = {2,3,4,5};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int y = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1 ; j<nums.length; j++ ){
                if (nums[i] > nums[j]){
                     y =nums[i];
                }
            }
        }


        return y;

    }
}
