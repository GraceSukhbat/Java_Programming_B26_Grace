package day25_practice;

import java.util.Scanner;

public class P03SpaceProgramSaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        String fixed = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' ') {
                fixed += "_ ";
            } else {
                fixed += str.charAt(i) + " ";
            }

        }

        System.out.println(fixed.trim());

    }
}
