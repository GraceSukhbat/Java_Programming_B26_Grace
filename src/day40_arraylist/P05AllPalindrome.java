package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P05AllPalindrome {
    /* All Palindrome
Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity
Ex:
Input:
"Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
Anna, Racecar, Level, Eye
     */

    public static ArrayList<String> allPalindrome(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        boolean isPalindrome = true;
        for (String each : words) {
            for (int j = 0; j < each.length() / 2; j++) {


                if (each.charAt(j) == each.charAt(each.length() - 1 - j)) {
                    result.add(each);
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }

            System.out.println(isPalindrome ? each + " is palindrome" :  each + " is not palindrome");
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(input));
    }

}
