package day33_methods;

public class P01OddNumbers {
    /* create a method that can print odd numbers between 1-100 in the same line separated by space
create a method that can print even numbers between 1-100 in the same line separated by space

     */
    public static void oddNumbers(int numbers) {
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void evenNumbers(int numbers) {
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oddNumbers(100);
        evenNumbers(100);
    }
}
