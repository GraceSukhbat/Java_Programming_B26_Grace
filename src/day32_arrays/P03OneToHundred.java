package day32_arrays;

import java.util.Arrays;

public class P03OneToHundred {
    public static void main(String[] args) {
        int[][] nums = new int [10][10];
        int total =1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = total;
                total++;
            }
        }
        System.out.println(Arrays.deepToString(nums));

    }
}
