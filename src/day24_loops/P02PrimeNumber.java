package day24_loops;

import java.util.Scanner;

public class P02PrimeNumber {
    /* [IQ] Prime number [Loops]
Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
Input:
		11
Output:
		prime
Ex:
Input:
		10
Output:
		not prime
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and check to see if it is a prime number");
        int number = input.nextInt();
        int count = 0;
        for(int i =1; i<= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

            if(count > 2){
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }


    }
}
