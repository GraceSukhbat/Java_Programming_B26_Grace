package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
     String year = "2022";

        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year +1));  // (year +1) --> 20221 concatenating

        int numYear = Integer.parseInt(year); // taking String year and converting it into Integer

        System.out.println("This year " + numYear);
        System.out.println("Next year will be " + (numYear +1));


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String str = input.nextLine(); // assume that the input is in this format: I am x years old
        // in 5 years you will be $ageIn5Years

        String agePart = str.split(" ")[2];
        /*
        String [] arr = str.split(" ");
        String agePart = arr[2];
         */
        int age = Integer.parseInt(agePart);
        System.out.println("In 5 years, you will be " + (age + 5));
    }
}
/*
I am x years old
I am 10 years old
str.split(" ") --> String array {"I", "am", "10", "years", "old"} --> arr[2] --> 10
 */