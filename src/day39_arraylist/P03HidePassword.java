package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P03HidePassword {
    /* Hide Password
Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
     */
    public static void main(String[] args) {
        String[] arr = {"one", "hi", "hold"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> newWords = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String replaced = "";
            for (int j = 0; j < words.get(i).length(); j++) {
                replaced += "*";
            }
            newWords.add(replaced);
        }
        System.out.println(newWords);
    }
}

