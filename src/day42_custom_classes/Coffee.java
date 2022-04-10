package day42_custom_classes;

public class Coffee {
    /*

    Create a coffee class with these instance variables:
         price, size(oz), brand, types

         ex types: black, cappuccino, latte, mocchiato....

    instance methods:

        - make a toString to print all the information of the coffee objects

        - drink(): print: drinking $type of coffee

        - refill(amount in oz): print refilling x oz
            add the number of oz to the total size

     */

    String brand;
    double price;
    double size;
    String type;


    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void drink(){
        System.out.println("I'm drinking " + type);
        size -= 1.5;
    }
    public void refill(double amount){
        System.out.println("refilling " + amount + " oz of " + type);
        size += amount;
    }
    /*
    public void refill(double size){ // size is a local variable here.
        System.out.println("refilling " + size + " oz of " + type);
        size += size; // this updates the local size from the parameter, not the instance size


    }
     */



}
