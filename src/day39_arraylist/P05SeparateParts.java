package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P05SeparateParts {
    /*
    Separate Parts
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
Ex:
str = "ABCD123$%#@&456EFG!" list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> digits = new ArrayList<>();
        ArrayList<String> specialCharacters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)) || Character.isLowerCase(str.charAt(i))){

                letters.add(str.valueOf(str.charAt(i)));
            } else if(Character.isDigit(str.charAt(i))){
                digits.add(str.valueOf(str.charAt(i)));
            } else {
                specialCharacters.add(str.valueOf(str.charAt(i)));
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialCharacters);
    }
}
