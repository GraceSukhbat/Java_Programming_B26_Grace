package day23_loops;

public class P02CharactersInString {
    /* Given a String print the ascii value codes for each character
Ex:
Input:
“java” Output:
106 97 118 97
     */
    public static void main(String[] args) {
        String str = "java";

        for(int i = 0; i < str.length(); i++){
            System.out.print((int)str.charAt(i) + " ");
        }
        // int value = s.charAt(i);
    }
}
