package day09_scanner;
import java.util.Scanner;
public class ScannerPracticeRateCal {
    /* write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary");
        double salary = input.nextDouble();
        System.out.println("Enter the number of hours you work in a week");
        int hoursInWeek = input.nextInt();
        double hourlyRate = salary / (hoursInWeek * 52);
        System.out.println("With the annual salary of $" + salary + " and working for " + hoursInWeek + " hours a week, your hourly rate is: $" + hourlyRate);
    }

}
