package day27_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {
        /*
        [IQ] Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates
         */
        String str = "AAABCCDEEF";
        String checked = "";
        for(int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            if (!checked.contains("" + letter)) {

                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    char inner = str.charAt(j);
//                System.out.println(letter + " - " + inner);
                    if (letter == inner) {
                        count++;
                    }
                }

                if (count > 1) { // count >= 2 or count !=1
                    System.out.print(letter);
                }
                checked += letter;

            }
        }

    }
}

/*
        String str = "AAABCCDEEF";
        String checked = "";
        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);
            if(checked.contains("" + letter)){
                continue;
            }
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);
//                System.out.println(letter + " - " + inner);
                if(letter == inner){
                    count++;
                }
            }

            if(count > 1){ // count >= 2 or count !=1
                System.out.print(letter);
            }
            checked+=letter;

        }
 */