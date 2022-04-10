package day18_string;

import java.util.Scanner;

public class P03Title {
    /* create a class Title
        ask the user to enter their name including titles
        use the following titles to determine how to refer to the person as
handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result
 titles:
                Mr or Mister
                Ms or Miss or Madam
                Dr
            and some titles can come after a name:
                Sr
                Jr
        Based on both starting and ending titles print the following messages:
                Mr or Mister: Hello Sir
                Ms or Miss or Madam: Hello Ma'am
                Dr: Hello Doctor
                Sr: Nice to meet you Senior
                Jr: Nice to meet you Junior
        Note: It is possible to have both beginning and ending titles, one of them, or none of them
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name including titles");
        String fullName = input.nextLine();
        fullName = fullName.toLowerCase();
        String message = "Hello";
        if(fullName.startsWith("mr") || fullName.startsWith("mister")){
            message = "Hello Sir";
        } else if (fullName.startsWith("ms") || fullName.startsWith("miss") || fullName.startsWith("madam")){
            message = "Hello Ma'am";
        } else if (fullName.startsWith("dr")){
            message = "Hello Doctor";
        }
        if(fullName.endsWith("sr")){
            message = message + " Nice to meet you Senior";
        } else if(fullName.endsWith("jr")){
            message = message + " Nice to meet you Junior";
        }
        System.out.println(message);
    }

    }

