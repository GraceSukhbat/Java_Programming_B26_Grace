package day39_Office_day13_14_03_29_30;

import java.util.Arrays;

public class P02Fibonacci {
    /* Task 2 : Fibonacci
                Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
                Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21

				            index           Values
                                 0               0
                                 1               1
                                 2               1    index0+index1
                                 3               2    index1+index2
                                 4               3    index2+index3
                                 5               5    index3+index4
                                 6               8    index4+index5
                                 7               13   index5+index6
                                 8               21   index6+index7
     */
    public static int [] Fibonacci(int number){
        int [] fibonacci = new int[number+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        return fibonacci;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Fibonacci(8)));
        fibo(8);


    }public static void fibo(int number){

        // MEHMET's Array solution:

        int[] fibo=new int[number+1];

        //System.out.println(fibo[8]);

        fibo[0]=0;
        fibo[1]=1;

        for (int i = 2; i < fibo.length; i++) {

            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));
    }
}
