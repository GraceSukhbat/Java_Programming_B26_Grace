package day42_custom_classes;

public class UsingCar {
    public static void main(String[] args) {

        P02Car carOne = new P02Car();
        carOne.model = "Toyota";
        carOne.year = 2022;
        carOne.color = "white";
        carOne.fuelLevel = 85.0;

        System.out.println(carOne);
        carOne.drive();
        carOne.fillTank();
        carOne.isLow();
    }
}