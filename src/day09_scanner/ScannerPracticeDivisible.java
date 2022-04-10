package day09_scanner;
import java.util.Scanner;
public class ScannerPracticeDivisible {
    /* Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
    Ex:
    Enter a number
    65
    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean isDivisible2 = number%2 ==0;
        boolean isDivisible3 = number%3 ==0;
        boolean isDivisible5 = number%5 ==0;
        System.out.println(number + " is divisible by 2: " + isDivisible2);
        System.out.println(number + " is divisible by 3: " + isDivisible3);
        System.out.println(number + " is divisible by 5: " + isDivisible5);

    }
}
