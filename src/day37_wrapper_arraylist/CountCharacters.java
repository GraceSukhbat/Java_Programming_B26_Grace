package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {
    /*
    given some string, count the number of uppercase letter, lowercase letter, numbers, and other characters
    aP3d572&*jd@jdJU
     */

    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";
        int upper = 0, lower = 0, number = 0, other = 0;
        String upperCaseChars = "";
        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);

            if(Character.isUpperCase(letter)){
                upper++;
                upperCaseChars += letter;
            } else if(Character.isLowerCase(letter)){
                lower++;
            } else if(Character.isDigit(letter)){
                number++;
            } else{
                other++;
            }

        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Uppercase letters: " + Arrays.toString(upperCaseChars.toCharArray()));
        System.out.println("Lowercase: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Other: " + other);
    }
}
