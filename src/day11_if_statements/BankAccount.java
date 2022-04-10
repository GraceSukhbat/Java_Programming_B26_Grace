package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the account balance");
        double accountBalance = input.nextDouble();
        System.out.println("Please enter the amount to withdraw");
        double withdrawAmount = input.nextDouble();

        double remainingBalance = accountBalance - withdrawAmount; // accountBalance -= withdrawAmount
        if (withdrawAmount < accountBalance){
            System.out.println("The remaining balance is $" + remainingBalance);
        }else{
            System.out.println("The remaining balance is $" + (remainingBalance - 100) + " because overdraft fee of $100 applied");

        }

    }

}
