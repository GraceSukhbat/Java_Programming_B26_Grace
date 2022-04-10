package day08_relational_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int b = 14;

        b = b + 10;

        b +=10; // this code is the same as --> b = b + 10;

        int count = 0;
        count +=5; // count = count + 5
        System.out.println(count);
        count -=10; // count = count - 10;
        System.out.println(count);
        count *=2;
        System.out.println(count);
    }
}
