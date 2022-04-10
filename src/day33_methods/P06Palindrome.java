package day33_methods;

public class P06Palindrome {
    /*
    create a method that will accept a String and find if it is Palindrome or not
     */
    public static void palindromeChecker(String word){
        boolean isPalindrome = true;
        for (int i = 0; i < word.length()/2; i++) {

            if(word.charAt(i) != word.charAt(word.length()-1 -i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? word + " is palindrome" : "Not palindrome");
    }

    public static void main(String[] args) {
        palindromeChecker("java");
        palindromeChecker("racecar");
        palindromeChecker("anna");
    }
}
