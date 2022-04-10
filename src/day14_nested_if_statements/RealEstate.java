package day14_nested_if_statements;

import java.util.Scanner;

public class RealEstate {
    /*
    We are buying a house
        ask the user for their budget (single number, max)
        Find the area that the user's budget fits into and provide all the information of the neighborhood
        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget". If the budget is more than 300,000 print "Too much money for this agency"
        Data based on neighborhood name:
            name - Oaks
            average price - 55,000 - 75,000
            rating - 3.5
            gated - no
            allow pets - yes

            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Highland
            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 - 201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is not in any range print: "No available houses"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your maximum budget");
        int maxBudget = input.nextInt();
        String name = "", range = "";
        double rating = 0;
        boolean gated= false, allowPets = false, isAvailable = true;

        if(maxBudget > 0 && maxBudget < 300000) {
            System.out.println("Let's see if there is any houses");
            if (maxBudget >= 55_000 && maxBudget <= 75_000) {
                name = "Oaks";
                range = "55,000 - 75,000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            } else if (maxBudget >= 80_000 && maxBudget <= 100_000) {
                name = "Hill";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPets = true;
            } else if (maxBudget >= 120_000 && maxBudget <= 150_000) {
                name = "Highland";
                range = "120,000 - 150,000";
                rating = 4.5;
                gated = true;
                allowPets = false;
            } else if (maxBudget >= 160_000 && maxBudget <= 201_000) {
                name = "Canyon";
                range = "160,000 - 201,000";
                rating = 4.8;
                gated = true;
                allowPets = true;
            } else {
                System.out.println("No available houses");
                isAvailable = false;
            }

            if(isAvailable) { // added this if condition to define if this string needs to be printed or not. for example 110000
                String ad = name + " neighborhood price ranges between " + range + " and has " + rating + " rating";
                ad += "\nGated: " + (gated ? "Yes" : "No");
                ad += "\n" + (allowPets ? "They allow pets" : "They don't allow pets");

                System.out.println(ad);
            }

        } else {
            if (maxBudget < 0){
                System.out.println("Your budget cannot be less than 0");
            } else {
                System.out.println("Too much money for this agency");
            }

        }








    }
}
