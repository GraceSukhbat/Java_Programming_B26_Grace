package day30_Office_day09_10_03_15_16;

import java.util.Arrays;

public class P06MultipleOf10 {
    public static void main(String[] args) {
        int [] newArray = {5, 4, 40, 1, 60, 2, 30, 34, 70, 43, 2, 80, 67};
        int number = 0;
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] % 10 == 0){
                number= newArray [i] / 10;
            }
            if(number > 0){
                newArray[i] = number *10;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
