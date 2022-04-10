package day28_arrays;

import java.util.Arrays;

public class P04ReverseArray {
    /* Reverse Array
Write a program that will reverse the order of any given array
Ex: Input:
[1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int [] arrReversed = new int[arr.length];
        for (int i = arr.length-1; i>= 0 ; i--) {
            arrReversed [i] = arr [arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrReversed));
    }
}
