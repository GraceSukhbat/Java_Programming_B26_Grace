package day19_string;

import java.util.Scanner;

public class P02MiddleChar {
    /* [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String str = input.next();
        int strLength = str.length();
        if (strLength % 2 == 0) {
            System.out.println(str.substring(strLength / 2 - 1, strLength / 2 + 1));
        } else {
            System.out.println(str.substring(strLength / 2 , strLength/2+1));

        }
    }
}