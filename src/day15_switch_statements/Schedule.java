package day15_switch_statements;

import java.util.Scanner;

public class Schedule {
     /* Task:
            Ask the user to enter which day it is
            print which class we have on that day, and the time of the class
            show if there is office hours
            topic with instructor at time
            challenge:
                make each day flexible
                    monday
                    Monday
                    mon
                 reduce repeating code
         */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("What day do you want to know about?");
        String day = input.nextLine();
        String schedule = "";
        switch (day){
            case "Monday": case "mon": case "Mon": case "MONDAY":
            case "monday":
                schedule = "We have Java class with Saim at 7 pm EST";
                break;
            case "Tuesday":
            case "Wednesday":
                schedule = "We have Java class with Saim at 7 pm EST and office at 5:30 pm EST";
                break;
            case "Thursday":
                schedule = "We have soft skills with Nadir at 7 pm EST";
                break;
            case "Friday":
                schedule = "Today is day off, or as Nadir says soft skill studying day";
                break;
            case "Saturday":
            case"Sunday":
                schedule = "We have full day of Java class with Saim from 10 am EST to 5 pm EST";
                break;
            default:
                schedule = "Not a valid day";

        }

        System.out.println(schedule);
    }
}
