package day15_switch_statements;

import java.util.Scanner;

public class PracticeTaskElevator {
    /* add new class Elevator
declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:
	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge
	any other floor value --> Invalid Floor Selected
     */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Select the floor number: 1 through 4");
        int floorNumber = input.nextInt();
        String information = "";
        switch (floorNumber){
            case 1:
                information = "Lobby, StarBucks, Amazon Pick Up";
                break;
            case 2:
                information = "NASA, Cydeo, Discover";
                break;
            case 3:
                information = "Uber, Lyft, Chase";
                break;
            case 4:
                information = "Rooftop, Lounge";
                break;
            default:
                information = "Invalid Floor Selected";
        }
        System.out.println(information);
    }
}
