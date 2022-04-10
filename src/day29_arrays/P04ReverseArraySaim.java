package day29_arrays;

import java.util.Arrays;

public class P04ReverseArraySaim {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];
        for (int i = arr.length-1, j = 0; i >= 0 ; i--, j++) {
            reverse[j] = arr [i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));

    }
}
