package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*  Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letter
            ex: james
                bond
                JB
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next().toUpperCase();
        System.out.println("Please enter your last name");
        String lastName = input.next().toUpperCase();
        char firstLetter = firstName.charAt(0);
        char lastLetter = lastName.charAt(0);
        System.out.println("Initials: " + firstLetter + lastLetter);
//        System.out.println("" + firstName.charAt(0) + lastName.charAt(0)); --> another approach



    }
}
