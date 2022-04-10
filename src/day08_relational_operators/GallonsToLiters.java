package day08_relational_operators;

public class GallonsToLiters {
    /*
    create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters
     */
    public static void main(String[] args) {
        double gallon = 3.78541;
        gallon *= 10;
        System.out.println("10 gallons equal to " +gallon + " liters");
        gallon *=2;
        System.out.println("20 gallons equal to " +gallon + " liters");
    }
}
