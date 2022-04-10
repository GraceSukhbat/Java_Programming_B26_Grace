package my_utilities;

public class StringUtil {


    /*
    reverse
    create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /* Fix Format
create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase
     */
    public static String fixFormat(String str1) {
        str1 = str1.trim();
        return str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();
    }

    public static String camelCaseMaker(String words) {
        words = words.toLowerCase(); // Java will
        String camelCase = words.substring(0, 1);
        for (int i = 1; i < words.length(); i++) {
            if (words.charAt(i - 1) == ' ') {
                camelCase += words.substring(i, i + 1).toUpperCase();
            } else {
                camelCase += words.charAt(i);
            }
        }
        camelCase = camelCase.replace(" ", "");
        return camelCase;
    }
    /*
    Frequency of Character
create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
     */

    public static int frequencyOfChar(String str, char letter) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter ) {
                count++;
            }
        }
        return count;
    }
    /*
    Unique Characters
create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.
     */

    public static String uniqueCharacters(String str){
        String unique = "";
        String checked = "";
        for(int i = 0; i < str.length(); i++){
            if(!checked.contains("" + str.charAt(i))){
                int count = StringUtil.frequencyOfChar(str,str.charAt(i));
                checked +=str.charAt(i);

                if(count == 1){
                    unique += str.charAt(i);
                }
            }
        }
        return unique;
    }
/*
Duplicate Characters
create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times
 */

    public static String duplicateChar(String word) {
        String duplicateLetters = "";
        String checked = "";
        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);
            if (!checked.contains("" + letter)) {

                int count = 0;

                for (int j = 0; j < word.length(); j++) {
                    char inner = word.charAt(j);
                    if (letter == inner) {
                        count++;
                    }
                }
                if (count > 1) {
                    checked += letter;
                }
            }
        }
        return checked;
    }

}
