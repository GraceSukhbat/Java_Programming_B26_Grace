package day09_scanner;
import java.util.Scanner;
public class ScannerPracticeAngle {
    /* Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter angle number 1: ");
        double num1 = input.nextFloat();
        System.out.println("Enter angle number 2: ");
        double num2 = input.nextFloat();
        System.out.println("Enter angle number 3: ");
        double num3 = input.nextFloat();
        boolean triangle = (num1 + num2 + num3) == 180.0;
        boolean circle = (num1 + num2 + num3) == 360.0;
        System.out.println("Is it triangle? " + triangle);
        System.out.println("Is it circle? " + circle);

//        Scanner keyboard = new Scanner(System.in); // Saim's approach
//        System.out.println("Enter 3 angle numbers");
//        double angle1 = input.nextDouble();
//        double angle2 = input.nextDouble();
//        double angle3 = input.nextDouble();
//        double sum = angle1 + angle2 + angle3;
//        boolean isTriangle = sum == 180;
//        boolean isCircle = sum == 360;



    }

}
