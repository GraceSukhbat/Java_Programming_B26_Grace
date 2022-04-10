package Day12_if_statements;

public class PracticeTaskDiver {
/*
create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you are at 50%
 */

    public static void main(String[] args) {
        int oxygenLevel = 65;
        if(oxygenLevel > 90 && oxygenLevel <= 100){
            System.out.println("Your tank is full");
        } else if(oxygenLevel > 80){ // else if( oxygenLevel > 80 && oxygenLevel < 90) => it is redundant because this condition will be checked if the oxygenLevel is less than 90 anyway (after condition 1 is run)
            System.out.println("Still okay");
        } else if(oxygenLevel > 70){
            System.out.println("Do not go too far");
        } else if(oxygenLevel > 60){
            System.out.println("Start to head back");
        } else if(oxygenLevel > 50){
            System.out.println("Be careful now you are at 50%");
        } else{
            System.out.println("Invalid number");
        }

        System.out.println("--------------------");// another approach -> more flexible
        String message;
        if(oxygenLevel > 90 && oxygenLevel <= 100){
            message = "Your tank is full";
        } else if(oxygenLevel > 80){ // else if( oxygenLevel > 80 && oxygenLevel < 90) => it is redundant because this condition will be checked if the oxygenLevel is less than 90 anyway (after condition 1 is run)
            message = "Still okay";
        } else if(oxygenLevel > 70){
            message = "Do not go too far";
        } else if(oxygenLevel > 60){
            message = "Start to head back";
        } else if(oxygenLevel > 50){
            message = "Be careful now you are at 50%";
        } else{
            message = "Invalid number";
        }
        System.out.println(message);
    }
}
