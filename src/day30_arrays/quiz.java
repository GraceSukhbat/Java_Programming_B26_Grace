package day30_arrays;

import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {
        int i = 0;
        do{
            i++;
            System.out.println(i + " ");
        }while (i<=4);

int [] num1 = new int [3];
int [] num2 = {1, 2, 3, 4};
        num1=num2;
        System.out.println(Arrays.toString(num2));

    }
}
