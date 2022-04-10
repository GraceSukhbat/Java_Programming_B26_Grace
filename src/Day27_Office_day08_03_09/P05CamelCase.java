package Day27_Office_day08_03_09;

public class P05CamelCase {
    public static void main(String[] args) {
        /*
        Task 05 :  Camel Case

				Given a String of words that follow Camel Case convention.

				Every word, except the first word, begin with an uppercase letter.
				The other characters of the word will be lowercase


				-  Find and print each word in the given String.

						Input:  neverGiveUp
						Output: Never
								Give
								Up
         */
        String str = "neverGiveUp";
        String word = "";
        String camelCase = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (each >= 'A' && each <= 'Z') {
                camelCase += word.toUpperCase().charAt(0) + word.substring(1) + "\n";

                word = "";
            }
            word+= each;
            if( i == str.length()-1){
                camelCase += word.toUpperCase().charAt(0) + word.substring(1);
            }
        }

        System.out.println(camelCase);



//        String str = "neverGiveUp";
//        String temp = "";
//        String res = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
//                res += temp.toUpperCase().charAt(0) + temp.substring(1) + "\n";
//                temp = "";
//                System.out.println(res);
//            }
//            temp += str.charAt(i);
//        }
//
//        System.out.println("\n---------RESULT---------");
//        res +=  temp.toUpperCase().charAt(0) + temp.substring(1) + "\n";
//        System.out.println(res);
//    }


    }
}