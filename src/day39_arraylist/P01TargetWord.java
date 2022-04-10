package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P01TargetWord {
    /* Target word
Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
Ex: Input: "java”, ”html”, “css”, “java”, “javascript”, “selenium
Target: java Output:
2
     */
    public static void main(String[] args) {
        String [] arr = {"java", "html", "css", "java", "javascript", "selenium"};
        String target = "java";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
        if(words.get(i).equals(target)){
            count++;
        }
        }
        System.out.println(count);
    }
}
