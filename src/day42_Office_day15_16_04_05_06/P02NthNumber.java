package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P02NthNumber {
    /*
    Task 2 : write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5

                    			output:
                    				4
     */

    public static int nThNumber(ArrayList<Integer> numbers, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            numbers.removeIf(each -> Collections.max(numbers) == each);
        }
        return Collections.max(numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2, 3, 4, 5, 6, 7, 7 ,8, 8));
        System.out.println(nThNumber(input, 3));
    }
}
