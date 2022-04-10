package day39_arraylist;

import java.util.ArrayList;

public class P04UpperLower {
    /*  Get Uppercase or Lowercase
Write a program that can extract the uppercase and lowercase characters from a String and store them into separate ArrayLists of Characters
Ex:
str = “heLLoWoRlD list1: {h, e, o, o, l} list2: {L, L, W, R, D}
     */
    public static void main(String[] args) {

        String str = "heLLoWoRlD";

        ArrayList<Character> up = new ArrayList<>();
        ArrayList<Character> low = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            int index = 0;
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                up.add(index, each);
                index++;
            } else if (Character.isLowerCase(each)) {
                low.add(index, each);
                index++;
            }

        }

        System.out.println(up);
        System.out.println(low);
    }
}
