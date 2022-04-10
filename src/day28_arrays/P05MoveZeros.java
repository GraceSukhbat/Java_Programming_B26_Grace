package day28_arrays;

import java.util.Arrays;

public class P05MoveZeros {

    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 0, 1, 0 };
        int[] arrMoved = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j <arrMoved.length; j++) {
                    if(arrMoved[j] ==0){
                        arrMoved [j] = arr [i];
                       break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arrMoved));

    }
}
