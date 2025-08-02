package leetCode.easy;

import java.util.Arrays;

public class TwoSum_Q1 {
    public static void main(String[] args) {

        int[] arr = {0,5,5,11};
        int target =  10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

//        for (int i=0; i<nums.length; i++){
//            for (int j=1+i; j<nums.length; j++){
//                System.out.println( i + " - "+  j);
//
//                if (nums[i] + nums[j] == target){
//                    return new int[]{i , j};
//                }
//            }
//        }


        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[] { j - i, j, };
                }
            }
        }

        return new int[]{0, 0};


    }
}
