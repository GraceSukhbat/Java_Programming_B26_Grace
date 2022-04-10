package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    /*  Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: It is a nice day
                   Go outside, but with your laptop to code java
        if the temperature is less than 70
            print: Its too cold
                   Code more java
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the outside temperature");
        int temperature = input.nextInt();
        if(temperature >= 70){
            System.out.println("It is a nice day \nGo outside, but with your laptop to code java");
        } else {
            System.out.println("It is too cold \nCode more java");
        }
    }

}
