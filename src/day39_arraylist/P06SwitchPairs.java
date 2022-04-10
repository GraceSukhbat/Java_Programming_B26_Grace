package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P06SwitchPairs {
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
        ArrayList<String> switched = new ArrayList<>();
        for (int i = 0; i < words.size(); i+=2) {
           switched.add(words.get(i+1));
           switched.add(words.get(i));

        }
        System.out.println(switched);
    }
}
