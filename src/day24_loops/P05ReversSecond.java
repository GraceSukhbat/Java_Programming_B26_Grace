package day24_loops;

public class P05ReversSecond {
    /* Reverse only second word [String, Loops]
Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Output:
	I evol java

     */
    public static void main(String[] args) {
        String str = "I love java";
        String secondWord = "";
        secondWord = str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
        String reverse = "";

        for(int i = secondWord.length()-1; i >=0; i--){

            reverse += secondWord.charAt(i);
        }
        System.out.println(str.replace(secondWord, reverse));

    }
}
