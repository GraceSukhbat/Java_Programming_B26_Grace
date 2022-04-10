package day09_scanner;
import java.util.Scanner;

public class AddNumbers {
     /*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers
     */

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter number 1");
//        int number1 = input.nextInt();
//        System.out.println("Please enter number 1");
//        int number2 = input.nextInt();
//        System.out.println("Please enter number 1");
//        int number3 = input.nextInt();
//
//        System.out.println("Sum of these three numbers is : " + (number1 + number2 + number3));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Hit enter after each number");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("The sum is " +(num1 + num2 + num3));

    }


}
