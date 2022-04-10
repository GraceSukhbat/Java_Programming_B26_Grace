package day09_scanner;

public class OrPractice {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 10;
        int pineapples = 8;

        System.out.println(apples > 1 || oranges < 5); // one of them is true, so the result is true

        System.out.println(apples > 10 || oranges ==10); // false || true -> true

        System.out.println(apples > 4 || oranges !=10 || pineapples < 7); //true || false || false -> true

    }
}
