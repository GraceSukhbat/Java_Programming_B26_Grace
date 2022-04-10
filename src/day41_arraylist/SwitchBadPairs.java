package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchBadPairs {
      /*
    Switch Pairs
Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
The given ArrayList will always have an even number of elements so each element will always have a single pair.
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs: "Cat" and "in"
"the" and "hat"
Output: {"in", "Cat", "hat", "the”}
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        for (int i = 0; i < words.size(); i+=2) {

            String temp = words.get(i); // "Cat"
            words.set(i, words.get(i+1));// storing "in" to position i which is 0
            words.set(i+1, temp);
        }
        System.out.println(words);
    }
}
