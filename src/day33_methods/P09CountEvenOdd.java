package day33_methods;

import java.util.Arrays;

public class P09CountEvenOdd {
    public static void countEvenOdd(int [] arr1){
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 ==0){
                countEven++;

            } else {
                countOdd++;
            }
        }
        int result [] = {countEven, countOdd};
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 7};
        countEvenOdd(numbers);
    }
}
