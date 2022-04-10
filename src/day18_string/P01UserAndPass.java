package day18_string;

import java.util.Scanner;

public class P01UserAndPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username");
        String username = input.next();
        System.out.println("Please enter a password");
        String password = input.next();
        boolean isValid = true;

        if(password.length() >= 5){
            if(password.contains(username)){
                System.out.println("Invalid password, username should not be in it");
                password+= "password";
            } else{
                System.out.println("Valid password");
            }

        } else {
            System.out.println("Password cannot be less than 5 characters");
            isValid = false;
        }
        if(isValid){
            System.out.println("Your username is: " + username + "\npassword is: " + password);
        }
    }
}
