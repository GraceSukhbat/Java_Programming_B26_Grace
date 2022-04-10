package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number between 1-12");
        int number = input.nextInt(); // 4
        String [] months = {"January", "February","March","April","May","June","July","August","September","October","November","December", };
        System.out.println(months[number-1]);
        // months[3] which is number 4 from input that's why we are subtracting 1.

    }
}
