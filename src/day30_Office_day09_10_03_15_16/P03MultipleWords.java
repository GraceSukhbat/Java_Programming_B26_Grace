package day30_Office_day09_10_03_15_16;

import java.util.Arrays;

public class P03MultipleWords {
    /*  Task 03 : Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
     */
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] split = words.split(", ");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            if(split[i].contains(" ")){
                System.out.println(split[i]);
            }
        }
        // Mehmet approach:
        for (String eachWord:split) {
            if(eachWord.contains(" ")){
                System.out.println(eachWord);

            }
        }

    }
}
