package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P03FrequencyOfChar {
    /*
    Task 3 : write a program that can find the frequency of character from a String
                                    DO NOT use nested loop

                                    "AABBCCDDEE"  ==> "ABCDE"
                                    output: A2B2C2D2E2
     */

    public static String frequencyOfCharacter(String s) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(s.split("")));
        int count = 0;
        String output = "";

        for (String each : result) {
            if(output.contains(each)){
                continue;
            }
            count = Collections.frequency(result, each);
            output += each + count;

        }
        return output;


    }

    public static void main(String[] args) {
        String str1 = "AABBCCDDEE";
        System.out.println(frequencyOfCharacter(str1));


        // MEHMET's SOLUTION
        String str = "AAABBCDDDDEEE";
        String result = "";             // A3B2C1D4E3

        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split(""))  );
        // in order to be able to use frequency method

        for(String each : list ){
            int frequency = Collections.frequency(list, each);

            if(result.contains(each)) { // to avoid duplicated characters in the result
                continue;
            }

            result += each + frequency;

        }

        System.out.println(result);

    }

}
