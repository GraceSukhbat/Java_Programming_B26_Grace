package day15_switch_statements;

import java.util.Scanner;

public class PracticeTaskHotel {
    /* Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)
Use those two information to determine the price and room type for the hotel based on the below data:
	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How many days are you staying at Hilton Hotel?");
        int numOfDays = input.nextInt();
        System.out.println("How many people are staying in the room?");
        int numOfPeople = input.nextInt();
        String roomType = "";
        int price = 0;
        boolean isValid = true;
        switch (numOfPeople){
            case 1:
                roomType = "Single Room";
                price = numOfDays * 100;
                break;
            case 2:
                roomType = "Double Room";
                price = numOfDays * 125;
                break;
            case 3: case 4:
                roomType = "Large Room";
                price = numOfDays * numOfPeople * 150;
                break;
            case 5: case 6: case 7:
                roomType = "Suite";
                price = numOfDays * 5000;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
                isValid = false;
        }
        if(isValid)
        System.out.println("Please see the hotel room information below: \n\tnumber of days staying: " + numOfDays + "\n\tparty size: " + numOfPeople + "\n\troom type: " + roomType + "\n\tprice: " + price);
    }
}
