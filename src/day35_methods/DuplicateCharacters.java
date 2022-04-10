package day35_methods;

public class DuplicateCharacters {
    /*
    Duplicate Characters
create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times
Hint: use your frequency method to do some of the work
Ex:
    Input:
		aaaaabcccdeeff
    Output:
		acef
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
