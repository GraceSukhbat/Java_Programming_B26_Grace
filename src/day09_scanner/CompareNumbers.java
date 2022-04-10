package day09_scanner;
import java.util.Scanner;

public class CompareNumbers {
    /*
        create a Scanner object
        ask the user to enter 2 numbers
        check if the numbers are equal to each other
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = input.nextInt();
        System.out.println("Please enter the second number");
        int number2 = input.nextInt();

        System.out.println("Are the numbers equal? " + (number1 == number2));
    }


}
