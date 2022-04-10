package day07_unary_operators;

import org.w3c.dom.ls.LSOutput;

public class IncrementExample {

    public static void main(String[] args) {

        int x = 0;
        System.out.println(x); // 0

        System.out.println(x + 1); // 0 + 1 = 1
        System.out.println(x); // 0

        x = x + 1;
        System.out.println(x); // 1 -> x 's value is updated to 1

        x++; // post-increment
        System.out.println(x); // 2

        ++x; // pre-increment
        System.out.println(x); // 3

        System.out.println(++x); // because it is pre-incrementing, it will add 1 right away so 4 is printed

        System.out.println(x++); //statement is run first because it is a post increment, we will see 4

        System.out.println(x); // 5


    }
}
