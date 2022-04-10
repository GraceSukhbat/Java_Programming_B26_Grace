package day15_switch_statements;

import java.util.Scanner;

public class PracticeTaskDaysInMonth {
    /* Days In Month (slightly different version than before)
Write a program that will accept a month name and outputs how many days are in that month
data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a month name to see how many days are in that month");
        String monthName = input.next();
        String days = "";
        switch (monthName){
            case "February":
                days = "28 days";
                break;
            case "April": case "June": case "September": case "November":
                days = "30 days";
                break;
            case "January": case "March": case "May": case "July": case "August": case "October": case "December":
                days = "31 days";
                break;
            default:
                days = "Invalid entry";
        }
        System.out.println(days);

    }
}
