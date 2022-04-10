package day15_switch_statements;

import java.util.Scanner;

public class Starbucks {
      /* Declare price and calories variables
    Ask the user to enter which size drink they want
    Based on the drink size determine the price and calories of the order
    Data:
            size: tall
            price: 2.50
            calories: 100
            size: grande
            price: 4.00
            calories: 150
            size: venti
            price: 4.50
            calories: 200
     */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Starbucks. What size of coffee would you like?");
        String size = input.nextLine();
        int calories =0;
        double price =0;
        boolean validOrder = true; // by making it true, I pick that all orders are valid, when I have and invalid order I will change the value

        switch (size){
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We don't have that size");
                validOrder = false;
        }

        if(validOrder){
            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");
        }

    }
}
