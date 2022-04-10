package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P02StringNumbersToSum {
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
    public static ArrayList<Integer> StringNumbersToSum(ArrayList<String> num){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            String [] arr = num.get(i).split("");

            Integer sum = 0;
            for (int j = 0; j < arr.length; j++) {

                sum +=Integer.parseInt(arr[j]);
            }
            result.add(sum);
        }
        
    return result;
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(StringNumbersToSum(str));
    }

}
