package day33_methods;

import java.util.Scanner;

public class P04TriangleCircle {
    /* Create a method that will that accepts three numbers. Check if the three
numbers equal to 180.
If they are equal to 180 print: "This is a triangle"
If they are equal to 360 print: "This is a circle"
     */
    public static void shapeChecker(int num1, int num2, int num3){
        if(num1 + num2 + num3 == 180){
            System.out.println("This is a triangle");
        }
        if(num1 + num2 + num3 == 360){
            System.out.println("This is a circle");
        }
    }

    public static void main(String[] args) {
        shapeChecker(90, 40, 50);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check");
        shapeChecker(input.nextInt(), input.nextInt(), input.nextInt());
    }
}
