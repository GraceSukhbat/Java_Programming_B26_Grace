package day08_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int h = 5;
        int p = h; // p gets assigned the value of h, which is 5
        // p = 5
        h++;

        System.out.println("h " + h);
        System.out.println("p " + p); // h and p are two separate variables, you assign p the value of h, then you update h

        int k = h++; // post increment, get the value first, which is 6 and assign it to the new variable k, so k has the value of 6. then h adds one
        System.out.println("h " + h); // 7
        System.out.println("k " + k); // 6

        int g = ++h; // pre increment, which means it increments 1 right away, then it assigns the value from h to the new variable g
        System.out.println("h " + h); // 8
        System.out.println("g " + g); // 8

    }
}
