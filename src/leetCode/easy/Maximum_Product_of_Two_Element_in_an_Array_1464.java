package leetCode.easy;

public class Maximum_Product_of_Two_Element_in_an_Array_1464 {
    public static void main(String[] args) {

        int [] arr = {3,4,5,2 };

        System.out.println(maxProduct(arr));


    }

    public static int maxProduct(int[] nums) {

        int max = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int x = (nums[i] - 1) *  (nums[j] -1);
                if (x > max ){
                    max = x;
                }
            }

        }

        return  max;
    }
}
