package day18_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        /* ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:
        java is bad
        quit
        have fun
        crying
    if there is a bad phrase in the message print:
        message failed to send
    otherwise print:
    $message sent
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine(); // input.nextLine().toLowerCase().trim(); => chaining
        message = message.toLowerCase();
        message= message.trim();

        if(message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying")){

            System.out.println("message failed to send");
        } else {
            System.out.println(message + " was sent");
        }

    }
}
