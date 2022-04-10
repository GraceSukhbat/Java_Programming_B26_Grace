package day33_methods;

public class P05EachChar {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */
    public static void word (String eachChar){
        for (int i = 0; i < eachChar.length(); i++) {
            System.out.println(eachChar.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        word("Java");
        word("Program");
        word("Genius");
    }
}
