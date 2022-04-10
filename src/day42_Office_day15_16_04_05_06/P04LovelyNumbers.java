package day42_Office_day15_16_04_05_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P04LovelyNumbers {

    /* IQ --> Task 4 :
    We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').

                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.
     */
    public static int lovelyNumber(int number){
        String s = String.valueOf(number);
        ArrayList<String> result = new ArrayList<>(Arrays.asList(s.split("")));
        for(String each : result) {
            if(Collections.frequency(result, each) >=3){
                return 0;
            }
            }
        return 1;
        }

    public static void main(String[] args) {

        System.out.println(lovelyNumber(0));
        System.out.println(lovelyNumber(100));
        System.out.println(lovelyNumber(111));
        System.out.println(lovelyNumber(99922));
    }
    }


