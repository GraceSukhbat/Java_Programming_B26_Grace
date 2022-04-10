package day33_methods;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class CountNumbers {
    /*
     count up to a certain number
        start from 0
        all the numbers until the number input

        method(5) --> 0 1 2 3 4 5

        method(10) --> 0 1 2 3 ... 10
     */
    public static void count(int numbers) {
        for (int i = 0; i <= numbers; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        count(15);
        count(10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        count(input.nextInt());
    }
}
