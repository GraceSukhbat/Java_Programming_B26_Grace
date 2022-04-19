package day45_custom_class;

import day43_custom_classess.P02Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        P02Offer first = new P02Offer("Google", "Texas", 200_000, true, 15);
        System.out.println(first);

        ArrayList <P02Offer> allOffers = new ArrayList<>(); // created an ArrayList that will hold Offer Objects
        allOffers.add(first); // added the first Offer object to the ArrayList

        allOffers.add( new P02Offer("Amazon", "New York", 180_000, true, 15)); // creating an

        System.out.println(allOffers);

        P02Offer [] moreOffers = {
                new P02Offer("Apple","Chicago", 230_000, false, 10),
                new P02Offer("Tesla", "Texas", 250_000, false, 20),
                new P02Offer("Facebook", "Florida", 120_000, true, 10)

        };

        allOffers.addAll(Arrays.asList(moreOffers)); // added the array of Offers into the ArrayList of offers


        allOffers.addAll(Arrays.asList(
                new P02Offer("Discord", "Chicago", 150_000, false, 13),
                new P02Offer("Netflix", "Canada", 170_000, true, 12)
        )); // added Offer objects using the var args of the asList method to add multiple Offer objects at the same time
        System.out.println("------------------------");
        System.out.println(allOffers);

        // create ArrayLists to filter the Offers

        ArrayList<P02Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf( each -> each.salary < 170_000);
        System.out.println("Salaries above 170,000");
        System.out.println(salaries);

        System.out.println("------------------------");

        ArrayList<P02Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf( each -> !each.isFullTime); // each.isFullTime == false
        System.out.println("Only full-time offers");
        System.out.println(fullTime);

    }
}
