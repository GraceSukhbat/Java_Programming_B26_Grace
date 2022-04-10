package day23_loops;

public class CountLetter {
    public static void main(String[] args){
          /*

            Given a String we want to count how many 'a' characters we have

            Challenge: adjust so that we can check for not only 'a' but any character

         */

        String str = "abbcaa";
        char letter = 'a';
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(count);

    }
}
