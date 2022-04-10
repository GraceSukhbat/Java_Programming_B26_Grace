package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class P04CountLetters {
    /*  Count Letters
Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
6
     */

    public static int countLetters(ArrayList<String> str, char letter) {
        ArrayList<String> result = new ArrayList<>();
//        int count =0;
//        for (int i = 0; i < str.size(); i++) {
//            result.add(str.get(i));
//
//        }
//        count = Collections.frequency(str, letter);
//        return count;

        int count = 0;
        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.get(i).length(); j++) {
                if (str.get(i).charAt(j) == letter) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("java", "html", "java", "javascript", "selenium"));
        System.out.println(countLetters(input, 'a'));
    }
}
