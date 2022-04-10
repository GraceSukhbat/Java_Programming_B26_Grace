package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02AverageNumber {
    /* Average Number from Array
Given an int array calculate the average number -> Make it flexible so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of array elements");
        int numbers = input.nextInt();
        int[] arr = new int[numbers];
        int total = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number");
            arr [i] = input.nextInt();
            total += arr[i];

        }

        System.out.println(total/numbers);

    }
}
