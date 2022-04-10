package day16_review;

import java.util.Scanner;

public class Retake {
    /*  create a class Retake
declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
If it is the first attempt -> subtract 10%
If it is the second attempt -> subtract 20%
If it is the third attempt -> subtract 35%
Based on the retake attempt number calculate the final grade
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was the grade?");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it?");
        int attemptNumber = input.nextInt();
        boolean validAttempts = attemptNumber <4 && attemptNumber > 0; // or assign true
        if (attemptNumber == 1){
            grade = grade - (int)(grade * 0.1); //grade = grade - (grade * 10 / 100);
        } else if (attemptNumber == 2) {
            grade -= grade *0.2; // we don't need to cast it as shorthand method is handling the conversion from double to int
        } else if (attemptNumber == 3) {
            grade *= 0.65;
        } else{
            System.out.println("Not valid attempt number");
            //if you do it by assigning true by default, then here you would use validAttempts = false;
    }
        if(validAttempts) {
            System.out.println("Final grade: " + grade);
        }


}

}
