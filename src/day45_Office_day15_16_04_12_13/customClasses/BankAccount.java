package day45_Office_day15_16_04_12_13.customClasses;

public class BankAccount {
    /*
     ======= Task 2 =======
      	className --- > BankAccount   (instance vs Local  Var | instance Methods | Constr)

              fields / attributes / data that can have are:
                      1. AccountHolder, 2. AccountNumber, 3. Balance

              Methods (Actions)
                  1. CheckBalance,   2. deposit,  3. withdraw

              requirements:
                  1. user should be able to deposit money into their account --> deposit(double amount);
                      1.1 if the amount is less than or equal to 0
                               "Depositing amount can not be zero or negative"
                  2. user should be able to withdraw money from their account --> withdraw(double amount);
                      2.1 if the withdrawing account is greater than available balance
                                "Insufficient balance"
                      2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
                                "Withdrawing amount can not be negative or zero"
                  3. user should be able to see their balance --> checkBalance();
                      Example Output :
                              As of today , "+$accountName+"'  available balance is: "+$availableBalance
     */

    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Depositing amount can not be zero or negative");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        } else if(amount <=0){
            System.out.println("Withdrawing amount can not be negative or zero");
        } else {
            balance -= amount;
        }
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){

        System.out.println("As of today, " + accountHolder + " account's available balance is $" + balance);
    }
}
