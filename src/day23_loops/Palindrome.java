package day23_loops;

public class Palindrome {
    public static void main(String[] args) {

        /*
        Palindrome: it is the same reading from the beginning and the end.
        ex: mom
            racecar
            anna
            madam
        Task: check if a word is palindrome
         */
        String word = "take";
        String reverse="";
        int len = word.length()-1;
        System.out.println(len);

        for(int i =len; i >= 0; i--){

            reverse+=word.charAt(i);
            System.out.println(reverse);

        }

        if(word.equals(reverse)){
            System.out.println("original word: " + word + " is the same as reversed word: " + reverse +  " = Palindrome");
        } else {
            System.out.println("original word: " + word + " is NOT the same as reversed word: " + reverse + " = NOT Palindrome");
        }



    }
}
