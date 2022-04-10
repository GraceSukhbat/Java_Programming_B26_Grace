package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P03RemoveBadPairs {
    /*
    Remove Bad Pairs
Create a method that will accept an Integer ArrayList and check for
bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger than
the second number. Remove any bad pairs for the ArrayList and return
the ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of
elements, so each number always has one pair
@param nums - Given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {3, 4, 6, 1, 1, 10, 8, 7};
Output: {3, 4, 1, 10};
Bad pairs that were removed:
6, 1
8, 7
     */

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += 2) {
            if (numbers.get(i) < numbers.get(i + 1)) {
                result.add(numbers.get(i));
                result.add(numbers.get(i+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(removeBadPairs(input));
    }
}