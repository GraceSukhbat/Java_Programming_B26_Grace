package day19_string;

public class P01RemoveFirstAndLast {
    /* [Remove first and last]
Given two words. Print the first word without its first character then print the second word without its last character.
Input:
apple banana
Output: pple banan
     */

    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, word2.length()-1));

    }
}
