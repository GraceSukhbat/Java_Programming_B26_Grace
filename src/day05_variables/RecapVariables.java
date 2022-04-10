package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {

        //declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;
    // We can't print variables because they don't have a value assigned
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentInClass);

        // Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        System.out.println(numberOfCoffeeCups + " # " + totalStudentInClass);
        System.out.println(numberOfCoffeeCups + " \t " + totalStudentInClass);// we use concatenation to print the values of two variables at the same time

        //Declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("\nThis is my temperature: " + temperature);
        System.out.println("It is day " + javaDays + " of java class");

    }

}
