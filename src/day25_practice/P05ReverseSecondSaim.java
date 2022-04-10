package day25_practice;

import java.util.Scanner;

public class P05ReverseSecondSaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine().trim(); // to get rid of possible spaces in the beginning or ending of the String

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" "); // str.indexOf(" ", firstSpace +1);

        String middleWord = str.substring(firstSpace + 1, lastSpace);
        String reverse = "";

        for(int i = middleWord.length()-1; i >= 0; i--){
            reverse += middleWord.charAt(i);
        }

        System.out.println(str.substring(0,firstSpace +1) + reverse + str.substring(lastSpace));

        // str = str.replace(middleWord, reverse);
        // System.out.println(str);

    }
}
