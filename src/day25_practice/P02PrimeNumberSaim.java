package day25_practice;

import java.util.Scanner;

public class P02PrimeNumberSaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        boolean isPrime = number >= 2;

        // this loop is tyring to check if our number is evenly divisible by value from 2 to the number

        for(int i = 2; i < number; i++){

            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }

    }
}
