package day07_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTV = 100;

        System.out.println("Person comes into the store and bought a TV");
        System.out.println("Number of TVs now: " + --numberOfTV);
        System.out.println("Person comes into the store and bought a TV");
        System.out.println("Number of TVs now: " + --numberOfTV);
        System.out.println("Person comes into the store and put TV into their cart");
        System.out.println("Numbers of TVs in the store: " + numberOfTV--);
        System.out.println("Person bought it. now I have: " + numberOfTV);

        System.out.println("I get a shipment");
        numberOfTV = numberOfTV + 13;
        System.out.println("TVs in stock: " + numberOfTV);


    }
}
