package day19_string;

import java.util.Scanner;

public class P05ReplaceProgram {
    /* [ Replace program]
Given a String message with some text and a number (1-3) replace certain characters from the String message.
When the number is:
1: replace 'a' with 'e' 2: replace 's' with 'r' 3: replace 'o' with 'z'
Ex:
message: java class is fun number: 1
Output: jeve cless is fun
Ex:
message: java class is fun number: 2
Output: java clarr ir fun
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with some text and a number between 1-3");
        String str = input.nextLine();
        int number = input.nextInt();
        if(number == 1){
            System.out.println(str.replace('a', 'e'));
        } else if(number == 2){
            System.out.println(str.replace('s', 'r'));
        } else if(number == 3){
            System.out.println(str.replace('o', 'z'));
        } else {
            System.out.println("Invalid input");
        }




    }
}
