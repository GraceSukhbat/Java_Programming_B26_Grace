package day09_scanner;

import java.util.Scanner;

public class FirstScanner { // if you put just Scanner, you will run into error

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("This is your number " + number);


    }

}
