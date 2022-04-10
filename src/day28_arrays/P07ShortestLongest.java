package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07ShortestLongest {
    /* Shortest and Longest words from String array
• Write a program that can return the shortest string element from a String array
• Write a program that can return the longest string element from a String array
     */
    public static void main(String[] args) {
        String [] arr = {"Take", "Grace", "Ryo", "Stanley"};
        String shortest = arr[0];
        String longest = arr[0];

        for (int i = 0; i < arr.length; i++) {

                if (arr[i].length() > longest.length()) {
                    longest = arr[i];
                }
                if( arr[i].length() < shortest.length()) {
                    shortest = arr[i];
                }
            }
            System.out.println(shortest);
            System.out.println(longest);


    }
}
