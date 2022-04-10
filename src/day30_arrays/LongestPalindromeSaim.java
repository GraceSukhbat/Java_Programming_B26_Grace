package day30_arrays;

public class LongestPalindromeSaim {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "kevin", "joe"};
        String longestPalindrome = "";
        // outer loop is iterating through the array
        for(String eachWord : words){  // eachWord == words[i]
            boolean isPalindrome = true;
            // inner loop is iterating through each String element
            for(int i = 0; i <eachWord.length()/2; i++){
                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length()-1 - i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }

        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
        /*
        if(longestPalindrome.isEmpty()){
        System.out.println("No Palindrome");
        } else {
        System.out.println(longestPalindrome);
        }
         */
    }
}
