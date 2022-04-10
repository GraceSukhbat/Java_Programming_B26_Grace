package Day12_if_statements;

import java.util.Scanner;

public class Biggest {
    /*
        declare and assign 3 int variables
        between the 3 numbers find the print the biggest one
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Use enter after each number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

//        int num1 = 100; // hard coded variables
//        int num2 = 110;
//        int num3 = 125;
        if(num1 > num2 && num1 > num3){
            System.out.println("The biggest number is " +num1);
        } else if (num2 > num1 && num2 >num3){
            System.out.println("The biggest number is " + num2);
        } else { // instead of else if, we can assume that if num1 and num2 are false, num3 is the biggest number
            System.out.println("The biggest number is " + num3);
        }


    }
}
