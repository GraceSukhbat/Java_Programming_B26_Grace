package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        /*
        Task:

        declare and assign a gift card with 200
        buy 2 items.
        buy 1 item for x price and subtract from your gift card
        buy 1 item for x price and subtract from your gift card
        print the remaining balance of you gift card
         */

        double giftCard = 100;
        double item1 = 20;
        double item2 = 30.50;
        System.out.println("buy item 1 for $20");
        giftCard -= 20;
        System.out.println("buy item 2 for $30");
        giftCard -=item2;

        System.out.println("Gift card balance is now: " + giftCard);




    }
}
