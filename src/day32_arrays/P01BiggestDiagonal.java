package day32_arrays;

import java.util.Arrays;

public class P01BiggestDiagonal {
    /*
    Given a 2D array with values:

	{3, 5, 1}
	{1, 6, 10}
	{5, 21, 10}

Calculate and find the biggest diagonal

	if an array was

	a b c
	d e f
	g h i

	aei and ceg would be the diagonals
     */
    public static void main(String[] args) {
        int[][] nums = {
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };
        int sum = 0;
        int sum1 = 0;
        int[] newArr = new int[nums.length];
        int[] newArr1 = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {

            sum += nums[i][i];
            sum1 += nums[i][j];
            newArr[i] = nums[i][i];
            newArr1[i] = nums[i][j];
        }
        if (sum > sum1) {
            System.out.println("Biggest diagonal is " + Arrays.toString(newArr) + " total is: " + sum);
        } else {
            System.out.println("Biggest diagonal is " + Arrays.toString(newArr1) + " total is: " + sum1);
        }

    }

}
