package day23_loops;

public class P06BiggestSubstring {
    public static void main(String[] args) {
        /* Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
         */
        String s = "aaabbbcccccddddee";
        String sub = "";
        String biggest = "";
        for(int i= 0; i < s.length()-1; i++){
            sub+= s.charAt(i);
            if(s.charAt(i) != s.charAt(i+1)){
                if(sub.length() > biggest.length()){
                    biggest = sub;
                }
                sub = ""; // resets this String for the next substring
            }

        }
        System.out.println(biggest);

        /*
        go through each char in a loop
        look for each substring, which is repeating chars Ex: aaa
        check next character to see if it is a different one
        then check if it is the biggest substring
         */

    }
}
