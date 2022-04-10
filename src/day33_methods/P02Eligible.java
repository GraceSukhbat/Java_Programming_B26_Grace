package day33_methods;

import java.util.Scanner;

public class P02Eligible {
    /* create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */
    public static void age (int number){
        if(number > 18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You must be 18 years or older to vote");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        age(input.nextInt());
    }
}
