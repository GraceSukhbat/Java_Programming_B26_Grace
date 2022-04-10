package day19_string;

import java.util.Scanner;

public class P04CreatingAnEmail {
    /* [Creating an email]
Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
input: JamesBond Secret output: jameret@cybertek.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 strings that are at least 6 character long");
        String str1 = input.next();
        String str2 = input.next();
        int len1 = str1.length();
        int len2 = str2.length();
        String email = "";
        if(len1 >= 6 && len2 >= 6){

            email = (str1.substring(0,4) + str2.substring(len2-3, len2) + "@cybertek.com").toLowerCase();

        } else {
            System.out.println("Invalid data");
        }
        System.out.println(email);

    }
}
