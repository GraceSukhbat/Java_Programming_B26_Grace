package day45_custom_class;

import day38_arraylist.P01;
import day44_custom_classes.P01Food;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        P01Food apples = new P01Food("Apples");
        System.out.println(apples);

        P01Food chips = new P01Food("Lays", 2);
        System.out.println(chips);

        chips.unitPrice = 1.99;
        chips.calculatePrice();

        P01Food chicken = new P01Food("Chicken", 3, 5.99);
        System.out.println(chicken);
        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        P01Food [] allFood = {apples, chips, chicken, null}; // new Food [4]
        System.out.println(allFood[2]);

        allFood[3] = new P01Food("Fish", 4, 3.55); // making a new Food object assigning it into the array in index 3

        System.out.println(Arrays.toString(allFood));

        // calculate the total price of the shopping list

        double totalPriceAll = 0;
        for( P01Food each : allFood){ // each == allFood[i]
            // why is P01Food the first thing in the for each loop? it is the datatype of each element
            totalPriceAll += each.totalPrice;
        }
        System.out.println(totalPriceAll);


    }
}
