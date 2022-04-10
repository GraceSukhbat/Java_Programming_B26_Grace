package day05_variables;

public class CellPhone {

     /*
	create a class CellPhone
	create a main method
	declare and assign these variables:
		brand, model, color, price, storage, hasCamera, sim(char A, B, C)
	Print all the variables
		sample data: apple, iphone 12, gold, 1000.99, 128, true, A
     */

    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone12 Pro";
        String color = "Gold";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("My phone is an " + brand + ", " + model + " and it came in the " + color + " color. I paid $" + price + " for "+ storage + "gb.");
        System.out.println("It has a camera " + hasCamera + " and a sim type " + sim);

    //approach 2 with String variable:

        String fullMessage = "My phone is an " + brand + ", " + model + " and it came in the " + color + " color. I paid $" + price + " for "+ storage + "gb. \nIt has a camera " + hasCamera + " and a sim type " + sim;
        System.out.println(fullMessage); // the point it that we can print the message easily

    }
}
