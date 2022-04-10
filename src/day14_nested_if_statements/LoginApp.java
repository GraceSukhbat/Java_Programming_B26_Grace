package day14_nested_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /*
    inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234
declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234
outputs:
    when the pin code and ssn match the expected print:
        Authentication successful
    when the pin code or ssn are not correct print:
        Authentication failed
    when the pin code was not correct print:
        incorrect pin code
    when the ssn is not correct print:
        invalid ssn
     */
        System.out.println("Please enter your 4-digit pin code");
        int actualPin = input.nextInt();
        System.out.println("Please enter your last 4 digits of SSN");
        int actualSSN = input.nextInt();

    int expectedPin = 1552;
    int expectedSSN = 1234;

    if(actualPin == expectedPin && actualSSN == expectedSSN){
        System.out.println("Authentication successful");

    } else {
            System.out.println("Authentication failed");
        if(actualPin != expectedPin){
            System.out.println("incorrect pin code");
        }
        if(actualSSN != expectedSSN){
            System.out.println("incorrect SSN");
        }

    }


    }
}
