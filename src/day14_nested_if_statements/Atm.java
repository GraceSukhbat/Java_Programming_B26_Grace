package day14_nested_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to ATM ***\nPlease insert your card and enter your pin code");
        int pinCode = input.nextInt();

        int expectedPin = 2342;

        if(pinCode == expectedPin){

            System.out.println("Logged in");
            System.out.println("Select an option");
            System.out.println("\t1) Check Balance");
            System.out.println("\t2) Withdraw");
            System.out.println("\t3) Deposit");
            int option = input.nextInt();
            if(option == 1){
                System.out.println("Your balance is: $" +1_000_000);
            } else if(option ==2) {
                System.out.println("How much do you want to withdraw?");
                double money = input.nextDouble();
                System.out.println("Withdrawing " + money);
            } else if(option ==3){
                System.out.println("Please deposit the money");
            } else{
                System.out.println("Invalid selecting. Exiting account");
            }

        } else {
            System.out.println("Invalid pin code. Please try again");
        }






    }
}
