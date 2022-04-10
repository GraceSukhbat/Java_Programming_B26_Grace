package day29_arrays;

import java.util.Arrays;

public class P04LongestPalindrome {
    public static void main(String[] args) {

        String [] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "kevin", "joe"};
        String [] reverse= new String[str.length];
        String reversedWord = "";
        String biggest = "";
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                reversedWord += str[i].charAt(j);
            }
            reverse[i] = reversedWord;
            reversedWord = "";

            if (str[i].equals(reverse[i])) {
                if (reverse[i].length() > biggest.length()) {
                    biggest = reverse[i];
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No palindrome");
        }
        System.out.println(biggest);
    }
}
