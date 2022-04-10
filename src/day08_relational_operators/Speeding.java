package day08_relational_operators;

import java.sql.SQLOutput;

public class Speeding {
    /*
    declare 3 variables:
        current speed, speed limit, speeding boolean

        print
        "Are you speeding? " true/false
     */
    public static void main(String[] args) {
        int current = 45;
        int speedLimit = 50;
        boolean speeding =  current > speedLimit;
        System.out.println("Are you speeding? " +speeding);

        int a =1;
        int b = -a-- + a++ / -a-- * --a;
        System.out.println(a);
        System.out.println(b);

        int A = 50;
        int B = --A + A++ + A-- + A++;

        System.out.println(A);
        System.out.println(B);

        int X = 4;
        int Y = X * 4 - X++;

        System.out.println(X);
        System.out.println(Y);

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;

        System.out.println(t);
        System.out.println(p);

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;

        System.out.println("R = " + R);
        System.out.println("W = " + W);

        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;
        System.out.println("M = " + M);
        System.out.println( "N = " + N);
        System.out.println("U = " + U);

    }

}
