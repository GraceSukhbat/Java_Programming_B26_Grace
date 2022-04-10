package day28_arrays;

public class MaxMin {

    public static void main(String[] args) {

        int[] numbers = {500, 120, -80, 90, 250, -10};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);

    }
}
