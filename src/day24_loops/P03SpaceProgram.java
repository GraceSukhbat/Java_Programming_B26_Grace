package day24_loops;

import java.util.Scanner;

public class P03SpaceProgram {
    public static void main(String[] args) {

        /* Space program [String, Loops]
Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore
	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            if(str.contains(" ")){
                newStr += str.replace(" ", "_").charAt(i) + " ";
            } else {
                    newStr  += str.charAt(i) + " ";
            }
        }
        System.out.println(newStr);
}
}