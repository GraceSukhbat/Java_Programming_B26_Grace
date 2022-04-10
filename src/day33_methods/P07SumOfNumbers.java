package day33_methods;

public class P07SumOfNumbers {
    /* Create a method that accept an int array. Take the sum of all the numbers and print the result
     */
    public static void sumOfNumbers ( int [] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Total of all elements in the array is: " + sum);
    }

    public static void main(String[] args) {
        int [] numbers = { 50, 0, 10, 500, 20, 40, 124};
        sumOfNumbers(numbers);
    }
}
