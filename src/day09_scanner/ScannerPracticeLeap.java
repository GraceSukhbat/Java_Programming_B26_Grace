package day09_scanner;
import java.util.Scanner;
public class ScannerPracticeLeap {
    /* create a class LeapYear
create a main method
create a Scanner object
Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4, or divisible by 100 but not 400. Print true or false.
Hint: use remainder operator
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        boolean isLeap = year % 4 == 0 || (year %100==0 && year %400 !=0); //() to group
        System.out.println(year + " is a leap year: " + isLeap);

    }

}
