package day45_Office_day15_16_04_12_13.customClasses;

public class UseBankAccount {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount("Grace's BOA checking", "123456789", 90000);
        account1.deposit(2000);
        account1.checkBalance();
        account1.withdraw(-5000);
        account1.checkBalance();
        System.out.println(account1);
    }
}
