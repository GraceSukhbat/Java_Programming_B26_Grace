package day18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNow";
        System.out.println(str.toUpperCase()); //SNOW
        System.out.println(str.toLowerCase()); //snow
        System.out.println(str); // is still sNow because String is immutable

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        int a = 4;
        a++;
        a+=5;
        System.out.println(a);

        String word2 = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word+="new text"; // word = word + "next text" --> reassigned, created new String object
        System.out.println(word);

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(old);
        System.out.println(newValue);










    }
}
