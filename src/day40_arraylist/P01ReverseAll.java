package day40_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

import static my_utilities.StringUtil.reverse;

public class P01ReverseAll {
    /*  Reverse All
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
     */
    public static ArrayList<String> reverseAll(ArrayList<String> list){
        ArrayList<String> reversedWords = new ArrayList<>();
        for (String each : list) {

//            String eachReversed = "";
//            for (int i = each.length()-1; i >= 0 ; i--) {
//
//                eachReversed +=each.charAt(i);
//            }
            reversedWords.add(StringUtil.reverse(each)); // called the reverse method from StringUtil to reverse each word, each element, then we are adding the reversed word into the "reversedWords" ArrayList
        }
        return reversedWords;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));

        System.out.println(reverseAll(ArrayListWithMethods.getDayOfWeek()));
    }
}
