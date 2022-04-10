package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P08RemoveDuplicates {
    /* Remove Duplicates
Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int each : numbers) {
            int count = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == each) {
                    count++;
                }
            }

            if (count == 1) {
                result.add(each);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(input));
    }
}
