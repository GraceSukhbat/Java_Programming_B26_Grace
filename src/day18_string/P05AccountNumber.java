package day18_string;

import java.util.Scanner;

public class P05AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter account number");
        String accountNum = input.nextLine();
        int accountLength = accountNum.length();
        if (accountNum.isEmpty()) {
            System.out.println("Empty input given");
        } else if (accountNum.startsWith("2") && accountLength == 7) {
            System.out.println("Valid 7-digit account number");
        } else if (accountNum.startsWith("2") && accountLength != 7) {
            System.out.println("Invalid 7-digit account number");
        } else if (accountNum.startsWith("5") && accountLength == 10) {
            System.out.println("Valid 10-digit account number");
        } else if (accountNum.startsWith("5") && accountLength != 10) {
            System.out.println("Invalid 10-digit account number");
        } else {
            System.out.println("Invalid account number");
        }
    }
}