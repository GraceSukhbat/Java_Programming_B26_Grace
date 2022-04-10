package day04_variables;

public class PrintDate {
    /*
        Task:
            declare and assign 3 variables
            the month number, the day number, and the year number

            print the date in the following format
                month/day/year
     */

    public static void main(String[] args) {
        //do not start a whole number with zero/0 -> it becomes a different number i.e. System.out.println(032); outcome is 26
        int month = 2;
        int day = 5;
        int year = 2022;
        System.out.println(month + "/" + day + "/" + year);
    }
}
