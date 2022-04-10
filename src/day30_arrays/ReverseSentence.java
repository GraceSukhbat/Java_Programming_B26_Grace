package day30_arrays;

import java.util.Arrays;

public class ReverseSentence {
    /*
    Given a sentence
       today is monday
    reverse the sentence
        monday is today
     */
    public static void main(String[] args) {
        String str = "today is monday";
        String [] str2 = str.split(" ");
        String reversed = "";

        for(int i = str2.length-1; i>=0; i--){
            reversed += str2[i] + " ";
        }
        System.out.println(reversed.trim());
    }
}
