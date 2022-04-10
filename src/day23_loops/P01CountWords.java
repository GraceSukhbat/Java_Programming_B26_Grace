package day23_loops;

import java.util.Scanner;

public class P01CountWords {

    /* Given a sentence determine how many words are in the String.
            Ex:
    Input:
    This has multiple words Output:
            4

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim(); // trimmed the spaces in the beginning and end
        int spaces = 0;
        for (int index = 0; index < str.length() - 1; index++) {
            if (str.charAt(index) == ' ') {
                spaces++;
            }
        }
        System.out.println("Number of words: " + (spaces+1));
    }
}
