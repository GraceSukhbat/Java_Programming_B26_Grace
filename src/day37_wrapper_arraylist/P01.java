package day37_wrapper_arraylist;

public class P01 {
    public static void main(String[] args) {

        /*
        Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true

         */
        String str = "JAVA java";
        int upper = 0, lower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lower++;
            }
        }
        if (upper == lower) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}