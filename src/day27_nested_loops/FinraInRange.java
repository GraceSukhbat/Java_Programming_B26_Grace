package day27_nested_loops;

import java.util.Scanner;

public class FinraInRange {

    public static void main(String[] args) {

        /* FINRA ---> similar to Fizzbuzz
1. Write a method which prints out the numbers from 1 to 100
but
                for numbers which are a multiple of 3, print "FIN" instead of the number
                for numbers which are a multiple of 5, print "RA" instead of the number.
                for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,

                    ex:
                        input : 100
                        output:
                            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ..........91 92 FIN 94 RA FIN 97 98 FIN RA
         */
        Scanner input = new Scanner (System.in);
        System.out.println("enter your stopping point");
        int stop = input.nextInt();

        for(int i = 1; i <= stop; i++){

            String str = "";

            if(i % 3 == 0){
                str += "FIN";
            }
            if(i % 5 == 0){
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
//            System.out.println(str.isEmpty() ? i : str);
        }

    }
}
