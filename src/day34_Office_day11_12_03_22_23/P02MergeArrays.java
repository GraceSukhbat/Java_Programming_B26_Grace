package day34_Office_day11_12_03_22_23;

import java.util.Arrays;

public class P02MergeArrays {
    /*
    Task 2 :   Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */
    public static void mergeTwoArrays(int [] arr1, int[] arr2){


        int [] newArr = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each : arr1){
            newArr[i++]=each;
        }

        for (int each : arr2) {
            newArr[i++]= each;
        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));


        // my approach
//        int [] newArr = new int[arr1.length + arr2.length];
//        newArr = Arrays.copyOf(arr1, arr1.length + arr2.length);
//
//        for (int i = 0; i < arr2.length; i++) {
//            newArr[arr1.length +i] =arr2[i];
//        }
//        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        mergeTwoArrays(new int[] {1, 2, 3, 4}, new int [] {5, 6});
    }
}
