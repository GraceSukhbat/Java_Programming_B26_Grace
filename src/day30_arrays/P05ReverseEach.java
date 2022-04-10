package day30_arrays;

import java.util.Arrays;

public class P05ReverseEach {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String [] arr = str.split(" ");
        String reverseWord = "";
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length()-1; j >= 0; j--) {
                reverseWord += arr[i].charAt(j) + " " ;
            }
        }
        System.out.println(reverseWord);
    }
}
