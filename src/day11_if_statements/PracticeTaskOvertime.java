package day11_if_statements;

public class PracticeTaskOvertime {
    /*  create a double variable for your hourly rate
create a double variable for the number of hours worked
calculate your net pay, with consideration of overtime pay
if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
(if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */

    public static void main(String[] args) {
        double hourlyRate = 10;
        double  numberOfHoursWorked = 39;
        double netPay = hourlyRate * numberOfHoursWorked;
        double overtimePay = netPay + (numberOfHoursWorked -40)* hourlyRate *1.5;
        if(numberOfHoursWorked < 40){
            System.out.println("Your net pay is $" + netPay);
        }else{
            System.out.println("Your net pay including overtime is $" + overtimePay);
        }
    }

}
