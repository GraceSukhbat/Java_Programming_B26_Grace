package day22_loops;

import java.util.Scanner;

public class P02SecretNumber {
    /* create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game");
        int secNum = 1109;
        int guess;
        int attempt = 0;
        do{
            System.out.println("Guess a number");
            guess = input.nextInt();
            attempt++;

            if (guess > secNum){
                System.out.println("too high");
            } else if(guess < secNum){
                System.out.println("too low");
            }




        } while(secNum != guess);

        System.out.println("you guessed correctly");
        System.out.println("number of attempts: " + attempt);

    }
}
