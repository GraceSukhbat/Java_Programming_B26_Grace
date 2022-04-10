package day24_loops;

import java.util.Scanner;

public class P04MultiplyEnd {
    /* Multiply End [String, Loops]
Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
Ex:
            Input:
			Hello?
			3
		    Output:
			Hello????
Ex:
		    Input:
			java
			5
		    Output:
			javaaaaaa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = input.nextLine();
        System.out.println("How many times do you want to repeat the ending?");
        int num = input.nextInt();
        for(int i= 0; i <num; i++){

            str += str.charAt(str.length()-1);
        }
        System.out.println(str);

    }
}
