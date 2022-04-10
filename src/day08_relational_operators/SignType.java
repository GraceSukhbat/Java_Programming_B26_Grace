package day08_relational_operators;

public class SignType {

    /*
    Task:
    Declare and assign a number
    I want to know the sign of the number
        is the number positive
        is the number negative
        is the number 0
     */
    public static void main(String[] args) {
        int number = 10;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number ==0;

        System.out.println(number + "is positive: " + positive);
        System.out.println(number + "is negative: " + negative);
        System.out.println(number + "is zero: " + zero);

    }

}
