package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P06KeepLongString {
    /*
    Keep Long Strings
Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings
@param int - max number of characters
@return - ArrayList of Strings
Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
Max number: 4
Output: {“three, “four”, “five”
     */

    public static ArrayList<String> removeLongString(ArrayList<String> words, int number) {
        ArrayList<String> result = new ArrayList<>();
        words.removeIf(each -> each.length() < number);
        return words;
//        for (String each : words) {
//
//            if (each.length() >= number) {
//                result.add(each);
//            }
//        }
//        return result;
    }

        public static void main (String[]args){
            ArrayList<String> input = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
            System.out.println(removeLongString(input, 4));
        }
    }
