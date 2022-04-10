package day09_scanner;

public class ShortCircuit {

    public static void main(String[] args) {
        // System.out.println(5 / 0); this will give you an error

        System.out.println(true || 5/0 == 0); // java is not executing the second part
//        System.out.println(true | 5/0 == 0); error

        System.out.println(false && 5/0 ==0);
//        System.out.println(false & 5/0 ==0); error

        int a = 0;

        System.out.println(false && a++ ==5); // the right side is not execute -> that means a is not post incremented
        System.out.println(a); // 0

        int b = 0;

        System.out.println(false & b++ == 5); //false
        System.out.println(b); //1


    }

}
