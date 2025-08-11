package leetCode.easy.hard;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays_4 {
    public static void main(String[] args) {

        int [] xArr = {1,2};
        int [] yArr = {3,4};

        System.out.println(findMedianSortedArrays(xArr, yArr));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = 0;
        int [] merge = new int[nums1.length +  nums2.length];

        for (int j = 0; j < nums1.length +  nums2.length; j++){
            if (j < nums1.length) {
                merge[j] = nums1[j];
            } else {
                merge[j] = nums2[j - nums1.length];
            }
            sum += merge[j];
        }


        Arrays.sort(merge);
        int l = merge.length;

        double res = 0;

        if ( l % 2 == 1){
            res =  sum + 1 / l;

        }else {
            res =  sum / l;

        }
        return res;
    }
}
