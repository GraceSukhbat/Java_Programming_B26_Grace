package day26_nested_loops;

import java.util.Scanner;

public class P03PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        String primeNumbers = "";

        for(int i = 2; i <= number; i++){ // the purpose of this loop is to check all the numbers from 2 to the value the range variable

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number

            for(int j = 2; j < i; j++){

                if(i % j == 0){
                    count++;
                }

            } // end of inner loop

            if(count == 0){
                System.out.print(i + ", ");
            }

        }

                        /*
                    i = 5

                    j = 2; j < 5; j++
                        i % j
                        5 % 2
                        5 % 3
                        5 % 4

                    =====

                    i = 6
                    j = 2; j < 6; j++
                        i % j
                        6 % 2 --> count++;
                        6 % 3 --> count++;
                        6 % 4
                        6 & 5

                 */

    }
}