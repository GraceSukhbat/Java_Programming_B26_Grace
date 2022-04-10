package day38_arraylist;

import java.util.ArrayList;

public class P04ArrayListLowerAZ {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList
     */
    public static void main(String[] args) {
        ArrayList<Character> charArr = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            charArr.add(i);
        }
        System.out.println(charArr);

        charArr.remove(Character.valueOf('a'));
        charArr.remove(Character.valueOf('e'));
        charArr.remove(Character.valueOf('i'));
        charArr.remove(Character.valueOf('o'));
        charArr.remove(Character.valueOf('u'));
        System.out.println(charArr);
    }
}
