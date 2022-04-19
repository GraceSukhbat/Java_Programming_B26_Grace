package day46_static;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        /*
        Note: A city can only be affected once each day
Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
         */

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

        /*
        i = 0;
        3
        i = 1
        6

         */

        //TODO. Write your code below this line.


        for (int i = 1; i < inhabitants.length; i++) {
            for (int j = 1; j < inhabitants.length; j++) {
                if (inhabitants[j] > 0 && inhabitants[j + 1] == 0) {

                    inhabitants[j] = inhabitants[j] / 2;

                    }
                }
            System.out.println("Day " + i + Arrays.toString(inhabitants));
            }

        }
    }


