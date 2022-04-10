package day30_arrays;

public class ReverseMiddle {
    public static void main(String[] args) {
        /*  Have a sentence with 3 words
            reverse the middle word
            ex:
                java always fun
            output:
                    java syawla fun
         */

        String str = "java always fun";
        String [] words = str.split(" ");
        String reversed = "";
        char [] middleWord = words[1].toCharArray();
        for(int i = middleWord.length -1; i>=0; i--){
            reversed +=middleWord[i];
        }

        System.out.println(words[0] + " " + reversed + " " + words[2]);

        // my approach
//        for (int i = 0; i < words.length; i++) {
//
//            if(i==1){
//                for (int j = words[i].length()-1; j >= 0; j--) {
//                    reversed += words[i].charAt(j);
//                }
//            }
//        }
//        System.out.println(words[0] + " " + reversed + " " + words[2]);


    }
}
