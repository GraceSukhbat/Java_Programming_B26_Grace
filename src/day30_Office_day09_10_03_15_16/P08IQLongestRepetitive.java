package day30_Office_day09_10_03_15_16;

public class P08IQLongestRepetitive {
      /*
    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

            For Example is str ="abcababcababcab"                 output should be abcab
                           str ="abcdefabcdef"                    output should be abcdef

                           str ="abcdefabcdefabcdefabcdef"    output should be abcdefabcdef
                           str ="abcdefxabcdef"                   output should be "There is no repetitive substring"

         */

    public static void main(String[] args) {
        String word = "abcdefabcdefabcdefabcdef";


        String temp = "";
        String longestOne = "";

        for (int i = 0; i < word.length()/2; i++) { // if we have repetitive String, it will have it at least 2 times in the String
            temp += word.charAt(i);
//            temp = word.substring(0, i+1); another way
            String [] s = word.split(temp); //we have new array based on our temp variable
//            System.out.println(Arrays.toString(s));

            if(s.length == 0 && longestOne.length() < temp.length()){
                longestOne = temp;
            }
        }
        System.out.println(!longestOne.isEmpty()? longestOne: "There is no repetitive substring");
    }
}
