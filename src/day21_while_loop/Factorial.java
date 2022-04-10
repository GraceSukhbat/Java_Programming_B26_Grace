package day21_while_loop;

public class Factorial {
    public static void main(String[] args) {

        int a = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1
        // repeated action: multiply the numbers by one less than it
        // stopping point: number gets to 1
        while(a > 1){
            System.out.println(result + " * " + a);
            result *= a;
            a--;

        }

        System.out.println(result);


    }
}
