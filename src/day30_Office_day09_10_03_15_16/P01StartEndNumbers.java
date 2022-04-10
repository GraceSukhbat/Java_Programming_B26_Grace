package day30_Office_day09_10_03_15_16;

import java.util.Arrays;

public class P01StartEndNumbers {
    /*   Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].
                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]
     */
    public static void main(String[] args) {
        int start = 5;
        int end = 10;
        int [] arr = new int[end-start];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start++;
        }
        System.out.println(Arrays.toString(arr));

        // Increase all value of element by 1
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        System.out.println(Arrays.toString(arr));

        // Do the same thing with for each loop

        for (int each : arr) {
            each +=1; // each is a temporary variable, does not affect the array
            System.out.print(each +" ");
        }
        System.out.println(Arrays.toString(arr));


    }
}
