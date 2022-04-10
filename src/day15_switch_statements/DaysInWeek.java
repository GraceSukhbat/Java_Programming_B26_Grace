package day15_switch_statements;

import java.util.Scanner;

public class DaysInWeek {
    /*
       Given a day number, find and print the day related to the number

       1- Monday
       2- Tuesday

       6- Saturday
       7- Sunday
    */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a day number between 1-7");
        int num = input.nextInt();
        String day = "";
        switch (num){  //switch (input.nextInt()){ ==> can do this way too
            case 1:
                day = "Monday"; // OR -> System.out.println("Monday"); without declaring String day = "";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not a valid day";
                break;
        }

        System.out.println(day);

    }
}
