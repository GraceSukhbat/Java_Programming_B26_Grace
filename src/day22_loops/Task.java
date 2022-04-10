package day22_loops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int max = 0;
        int min = 0;

        while (count < 5) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            count ++;

            if (count == 1) {
                min = num;
                max = num;
                System.out.println(min);
            }

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Biggest number is " + max + "\nSmallest number is " + min);
    }
}
