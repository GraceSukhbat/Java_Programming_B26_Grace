package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P02FourOrLess {
    /*
    Four or less
Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut” Output:
[ tree, loop, cat ]
     */
    public static void main(String[] args) {
        String[] arr = {"apples", "tree", "loop", "cat", "animal", "shortcut"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> newWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).length() <= 4)
                newWords.add(words.get(i));
        }
        System.out.println(newWords);
    }

}

