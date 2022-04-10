package day34_methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt()));
        /*
        Why can't I do this:
        int number = numberAsWord(input.nextInt());
        in this example: the method returns String, so we must store into a String variable
        String number = numberAsWord(input.nextInt());
         */


    }
    public static String numberAsWord(int number){
        if(number < 1 || number > 10){
            return number + " is an invalid number";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return words[number-1]; // -1 will convert the number to an index

    }
}
