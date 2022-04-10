package day07_unary_operators;

import java.sql.SQLOutput;

public class Letters {
    public static void main(String[] args) {

        // Task: define a character. print the next four characters on new lines

        char letter1 ='A';
        System.out.println("Original " +letter1++); //post-increment
        System.out.println("Next four: ");
        System.out.println(letter1++);
        System.out.println(letter1++);
        System.out.println(letter1++);
        System.out.println(letter1++);
    }

}
