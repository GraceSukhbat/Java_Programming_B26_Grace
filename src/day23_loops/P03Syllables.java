package day23_loops;

public class P03Syllables {
    public static void main(String[] args) {
        /* Given a String separated by dashes calculate how many syllables the words are
        Ex:
        Input:
        ja-va Output:
        2
         */

        String str = "ja-va-va";
        int count = 1;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-'){
                count++;
                }

            }
        System.out.println(count);
        }

    }



