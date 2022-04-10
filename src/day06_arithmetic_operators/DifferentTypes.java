package day06_arithmetic_operators;

public class DifferentTypes {

    public static void main(String[] args) {
        //both int = > stay int
        System.out.println(10-5); // int type by default
        System.out.println(10*5);

        // double / int
        System.out.println(10.0 /5); // result is double

        // double / double => double
        System.out.println(10.0 / 5.0);

        // int / double => double
        System.out.println(10 / 5.0);

        System.out.println((int)(10.0 / 5.0));

        System.out.println((int)10.5 / 5); // (int) -> casting (int)10.5 -> 10

        System.out.println((double)10 / 5); // result is double 2.0

        byte b1 = 10;
        byte b2 = 20;

//        byte sum = b1 + b2; this will not work because the values get changed to int during the calculation

        int sum = b1 + b2;

        byte sumByte = (byte)(b1+b2);

        System.out.println(sum); //prints as int
        System.out.println(sumByte); // prints as byte

    }
}
