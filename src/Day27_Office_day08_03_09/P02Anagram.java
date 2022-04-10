package Day27_Office_day08_03_09;

public class P02Anagram {
    public static void main(String[] args) {
        /*
        Task 04 : Anagram
Given two Strings determine if they are anagram or not. Strings are anagram if they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man
                 -> anagram
                 Hint: look up and use replaceFirst() method
         */

        String a = "a gentleman";
        String b = "elegant man";
        // removed all the spaces from the Strings
        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        if(a.length() == b.length()) { // this is the precondition to check anagram or not
            for (int i = 0; i < a.length(); i++) {

                char each = a.charAt(i);
                b = b.replaceFirst(each + "", "");

            }

            if (b.isEmpty()) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }

    }
}
