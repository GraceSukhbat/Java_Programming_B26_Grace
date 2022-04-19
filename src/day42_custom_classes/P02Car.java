package day42_custom_classes;

public class P02Car {

    /*
    Create a class Car
create instance variables:
    model, year, color, fuel level (percent number)
create instance methods:
    - toString(): [return String]
        returns all the information of the Car objects
    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount
    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100
    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false
Create a separate class to create Car objects and test the methods created
     */

    String model;
    int year;
    String color;
    double fuelLevel;


    public void drive(){
        System.out.println("Driving " + model);
        fuelLevel -=5;
    }
    public void fillTank(){
        System.out.println("filling tank");
        fuelLevel = 100;
        System.out.println("fuel level is at: " + fuelLevel + "%");
    }
    public boolean isLow(){
        return fuelLevel <25;
    }

    public String toString() {
        return "Model: " + model +
                "\nYear: " + year +
                "\nColor: " + color +
                "\nFuel Level: " + fuelLevel + "%" +
                "\n" + (isLow() ? "Tank is Low" : "Keep on driving");
    }
}
