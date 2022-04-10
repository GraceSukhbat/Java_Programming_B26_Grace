package day38_arraylist;

import java.util.ArrayList;

public class P03ArraylistUpperAZ {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters from A-Z
Print the ArrayList of all the characters
     */
    public static void main(String[] args) {

        ArrayList<Character> charArr = new ArrayList<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            charArr.add(i);

        }
        System.out.println(charArr);
    }
}
