package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] nums = {4, 10, 30, 100};

        System.out.println(Arrays.binarySearch(nums, 4)); // 0
        System.out.println(Arrays.binarySearch(nums, 100)); // 3
        System.out.println(Arrays.binarySearch(nums, 200)); // -5 --> would be in position 4, so 4+1 = 5 and negative because it was not the array so -5
        System.out.println(Arrays.binarySearch(nums, 6)); // -2 --> would be in position 1, so 1+1 = 2 and negative because it was not the array so -5

    }
}
