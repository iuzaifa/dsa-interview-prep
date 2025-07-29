package freeStyleCode;

import java.util.Arrays;


// check odd even number

public class oddEven {
    public static void main(String[] args) {

        int []arr = {2,4,5,6,7,8,9,66,77,88,99,9,87,65,43,23,45};
        System.out.println(Arrays.toString(oddEvenDigit(arr)));
    }

    public static boolean [] oddEvenDigit(int [] arr ){
        int length = arr.length;
        boolean[] odEven = new boolean[length];

        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                odEven[i] = true;
            }else {
                odEven[i] = false;
            }
        }

        return odEven;

    }
}
