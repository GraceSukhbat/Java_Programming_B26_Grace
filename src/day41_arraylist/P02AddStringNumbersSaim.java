package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P02AddStringNumbersSaim {
    /* String numbers to sum
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */
    public static ArrayList<Integer> sumFromString(ArrayList<String> list){

        ArrayList<Integer> sums = new ArrayList<>();
        for(String each : list){ // goes through every element of the ArrayList from parameters
            int currentSum = getCurrentSum(each);

            sums.add(currentSum);
        }
        return sums;
    }

    public static int getCurrentSum(String each) {
        int currentSum = 0;
        for(String eachDigit : each.split("")){ // converting the String 'each' to an array by split with an empty space, it means 'each' String will be separated by each character as separate String elements
            // "123" --> ["1", "2", "3"
            currentSum += Integer.parseInt(eachDigit);

        }
        return currentSum;
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(sumFromString(str));
    }

}
