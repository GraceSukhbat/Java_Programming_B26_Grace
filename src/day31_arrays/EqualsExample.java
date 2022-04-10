package day31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        System.out.println(a==b); // false --> comparing the memory locations of two different objects
        System.out.println(Arrays.equals(a,b)); // true
        System.out.println(a == c); // true --> pointing to the same array object
        // System.out.println(a.equals(b)); This method is not Arrays.equals()

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));  // false


    }
}
