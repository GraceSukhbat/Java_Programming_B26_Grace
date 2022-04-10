package day32_arrays;

import java.util.Arrays;

public class P02Multiply {
    public static void main(String[] args) {
        /* Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation
Ex:
	{1, 2, 3}
	{2, 5, 10}
	{0, 3, 20}
		x
	{10, 4, 3}
	{5, 2, 7}
	{100, 20, 5}
Output:
	{10, 8, 9}
	{10, 10, 70}
	{0, 60, 100}
         */
        int[][] arr1 = {{1, 2, 3},
                        {2, 5, 10},
                        {0, 3, 20}};
        int[][] arr2 = {{10, 4, 3},
                        {5, 2, 7},
                        {100, 20, 5}};
        int [][] output = new int[arr1.length][arr1.length];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1.length; j++) {
                output[i][j]=arr1[i][j]*arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(output));

    }
}
