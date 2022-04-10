package day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.brand = "Starbucks";
        drink1.price = 4.50;
        drink1.size = 8.0;
        drink1.type = "latte";
        System.out.println(drink1);

        drink1.drink();
        drink1.drink();
        drink1.drink();

        drink1.refill(4);

        System.out.println(drink1);



    }

}
