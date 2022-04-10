package day09_scanner;
import java.util.Scanner;
public class ScannerPracticeRevenue {
    /* Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price: ");
        Double price = input.nextDouble();
        System.out.println("Enter a quantity: ");
        int quantity = input.nextInt();

        System.out.println("The revenue is $" + (price * quantity));
        // System.out.println("The revenue is $" + ( input.nextDouble() * input.nextInt())); you can use your values right away but the variables are not reusable

    }
}
