package geeksforgeeks.basicProblems;

import java.util.Arrays;

public class Check_Even_or_Odd {
    public static void main(String[] args) {

//        System.out.println(even_or_Odd(45));
//        System.out.println(Arrays.toString(even_or_Odd(new int[]{3,4,5,6,7,8,9})));
//        System.out.println(Arrays.toString(total_CountEvenAndOdd(new int[]{3,4,5,6,7,8,9})));
        System.out.println(Arrays.toString(oddEvenSort(new int[]{3,4,5,6,7,8,9})));

    }

    // return String
    public static String even_or_Odd(int n) {

        if (n % 2 == 0){
            return "Even";
        }
        return "odd";
    }


    // return String  Array
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

    public static String  [] total_CountEvenAndOdd(int []  numArr) {

        int countO = 0;
        int countE = 0;

        for (int i=0; i< numArr.length; i++){

            if (numArr[i] % 2 == 0){
                countE++;
            }else {
                countO++;
            }

        }

        return new String []{"Total Even: "+countE, "Total Odd: "+countO};

    }


    public static  int[]  oddEvenSort(int []  numArr){

        int [] sorted = new int[numArr.length];
        int j = 0;
        // left Side Even
        for (int i=0; i<numArr.length; i++){
            if (numArr[i] % 2 == 0){
                sorted[j] = numArr[i];
                j++;
            }
        }

        // Right Side odd
        for (int k = 0; k < numArr.length; k++){
            if (numArr[k] % 2 != 0){
                sorted[j] = numArr[k];
                j++;
            }
        }


        return sorted;

    }
}
