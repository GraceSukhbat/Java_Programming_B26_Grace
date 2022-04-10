package day30_Office_day09_10_03_15_16;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // toCharArray
        String name = "Cydeo";
        char[] chars = name.toCharArray(); // char array
        // shortcut ---> ALT + ENTER --> Introduce Local Variable
        System.out.println(Arrays.toString(chars));
        // (chars[0] +"") // to use String methods

        // Split

        String[] split = name.split(""); // String array
        System.out.println(Arrays.toString(split));
        split[0].toLowerCase(); // you can use String methods

        String a = "a b c a b c a b c";
        String[] abc = a.split(" ");
        System.out.println(Arrays.toString(abc));

        // Hint for Interview Task
        a = "abcabcabc";
        String[] abcs = a.split("abc");
        System.out.println(Arrays.toString(abcs));
        System.out.println(abcs.length);

    }
}
