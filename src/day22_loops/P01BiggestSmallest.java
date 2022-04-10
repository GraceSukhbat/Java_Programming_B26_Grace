package day22_loops;

import java.util.Scanner;

public class P01BiggestSmallest {

    /*
write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int attempt = 1;
        int input ;
        int biggestNum;
        int smallestNum;

        System.out.println("Enter number " + attempt);
        input = scan.nextInt();
        biggestNum = input;
        smallestNum = input;

        do {
            attempt++;
            System.out.println("Enter number " + attempt);
            input = scan.nextInt();

            if (input > biggestNum) {

                biggestNum = input;
            }
            if (input < smallestNum) {
                smallestNum = input;
            }


        } while (attempt <= 4);


        System.out.println("Smallest: " + smallestNum);
        System.out.println("Biggest: " + biggestNum);

    }

}
