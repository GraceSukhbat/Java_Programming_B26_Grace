package day33_methods;

import java.util.Scanner;

public class P03PositiveNegative {
    /* create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void posNegZero (int number) {
        if(number > 0){
            System.out.println(number + " is a positive number");
        } else if(number < 0){
            System.out.println(number + " is a negative number");
        } else{
            System.out.println(number + " is a zero");
        }
        }

    public static void main(String[] args) {
        posNegZero(100);
        posNegZero(0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check");
        posNegZero(input.nextInt());
    }
}
