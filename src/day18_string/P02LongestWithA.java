package day18_string;

import java.util.Scanner;

public class P02LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word 1");
        String word1 = input.next().toLowerCase();
        int len1 = word1.length();
        System.out.println("Please enter word 2");
        String word2 = input.next().toLowerCase();
        int len2 = word2.length();
        System.out.println("Please enter word 3");
        String word3 = input.next().toLowerCase();
        int len3 = word3.length();
        String longestWord = "";
        boolean isValid = true;

//        if (word1.contains("a") && word2.contains("a") && word3.contains("a")) {
//            if ((len1 > len2 && len1 > len3)) {
//                longestWord = word1;
//            } else if (len2 > len1 && len2 > len3) {
//                longestWord = word2;
//            } else {
//                longestWord = word3;
//            }
//        } else if (word1.contains("a") && word2.contains("a")) {
//            if (len1 > len2) {
//                longestWord = word1;
//            } else {
//                longestWord = word2;
//            }
//        } else if (word1.contains("a") && word3.contains("a")) {
//            if (len1 > len3) {
//                longestWord = word1;
//            } else {
//                longestWord = word3;
//            }
//        } else if (word2.contains("a") && word3.contains("a")) {
//            if (len2 > len3) {
//                longestWord = word2;
//            } else {
//                longestWord = word3;
//            }
//        } else if (word1.contains("a")) {
//            longestWord = word1;
//        } else if (word2.contains("a")) {
//            longestWord = word2;
//        } else if (word3.contains("a")) {
//            longestWord = word3;
//        } else {
//            System.out.println("no words with \"a\"");
//            isValid = false;
//        }
//        if(isValid) {
//            System.out.println("the longest word is: " + longestWord);
//        }

        if(word1.contains("a") && word1.length() > longestWord.length()){
            longestWord = word1;
        }
        if(word2.contains("a") && word2.length() > longestWord.length()){
            longestWord = word2;
        }
        if(word3.contains("a") && word3.length() >  longestWord.length()){
            longestWord = word3;
        }
            System.out.println(longestWord.isEmpty() ? "No single largest word with a" : longestWord + " is the longest word with a"); //ternary

        /*
        if(longestWord.isEmpty()){
        System.out.println("No single largest word with a")
        } else {
        System.out.println(longestWord + " is the longest word with a")
        }
         */

    }
}
