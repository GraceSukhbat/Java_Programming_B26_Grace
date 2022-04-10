package day09_scanner;
import java.util.Scanner;
public class ScannerPracticeEvenOdd {
/*  Ask the user to enter an int number. Determine if the number is even or odd
Print a boolean for both even and odd
 */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = input.nextInt();
    boolean evenNumber = number%2 ==0;
    boolean oddNumber = number%2 ==1; //or you could do boolean oddNumber = number % 2 != 0;

    System.out.println( number + " is even: " + evenNumber);
    System.out.println(number + " is odd: " + oddNumber);

}
}
