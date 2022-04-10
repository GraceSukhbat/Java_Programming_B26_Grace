package day10_scanner;

import java.util.Scanner;

public class Apartment {
    /* Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String address, ownerName, ownersPhoneNumber;
        int numberOfUnits, numberOfWasherAndDryer, lengthOfLease, totalNumberOfResidents, numberOfFloors, numberOfParkingSpots;
        double avgsizeOfUnit, monthlyRent, numberOfReviewStars;
        boolean allowsPets, hasPool, nearGasStation, hasBasement, unitsAvailable, hasAirConditioning, wheelChairAccessibility;
        System.out.println("Please enter your address");
        address = input.nextLine();
        System.out.println("Please enter the name of the owner");
        ownerName = input.nextLine();
        System.out.println("Please enter " + ownerName + "'s phone number");
        ownersPhoneNumber = input.nextLine();
        System.out.println("Please enter the number of units");
        numberOfUnits = input.nextInt();
        System.out.println("Please enter the number of washers and dryers");
        numberOfWasherAndDryer = input.nextInt();
        System.out.println("Please enter the length of the lease");
        lengthOfLease = input.nextInt();
        System.out.println("Please enter the total number of residents");
        totalNumberOfResidents = input.nextInt();
        System.out.println("Please enter the number of floors");
        numberOfFloors = input.nextInt();
        System.out.println("Please enter the number of parking spots");
        numberOfParkingSpots = input.nextInt();
        System.out.println("Please enter the average size of the units");
        avgsizeOfUnit = input.nextDouble();
        System.out.println("Please enter the monthly rent");
        monthlyRent = input.nextDouble();
        System.out.println("Please enter the number of review stars");
        numberOfReviewStars = input.nextDouble();
        System.out.println("Do they allow pets?");
        allowsPets = input.nextBoolean();
        System.out.println("There is a pool:");
        hasPool = input.nextBoolean();
        System.out.println("There is a gas station nearby: ");
        nearGasStation = input.nextBoolean();
        System.out.println("There is a basement");
        hasBasement = input.nextBoolean();
        System.out.println("There are available units:");
        unitsAvailable = input.nextBoolean();
        System.out.println("There is air conditioner:");
        hasAirConditioning = input.nextBoolean();
        System.out.println(" It is wheelchair accessible:");
        wheelChairAccessibility = input.nextBoolean();

        double monthlyRentAfter3Years = monthlyRent * 0.9;
        double monthlyRentAfter6Years = monthlyRent *0.8;
        int avgNumberOfResidents = totalNumberOfResidents / numberOfUnits;
        int avgParkingSpot = numberOfParkingSpots / numberOfUnits;
        int avgNumberOfUnitsPerFloor = numberOfUnits / numberOfFloors;
        System.out.println("Monthly rent after 3 years is $" + monthlyRentAfter3Years + "\nMonthly rate after 6 years is $" + monthlyRentAfter6Years);





    }

}
